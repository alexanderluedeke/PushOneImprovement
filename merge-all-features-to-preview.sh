#!/usr/bin/env bash

# What it does:
  #1. Fetches the latest remote branches.
  #2. Checks out and resets integration-preview.
  #3. Finds all remote branches under origin/features/.
  #4. Merges them alphabetically (your 01.0–11.0 naming makes this convenient).
  #5. Generate markdown docs.
  #6. Prints the final message.
  #A couple of details:
  #- No stacked/* branches or unrelated branches are included.
  #- No automatic push.
  #- If a merge fails or produces conflicts, the script stops immediately. You can resolve the conflict and continue manually.
  #After successful testing. You have to (manually):
  #git push origin integration-preview

#!/usr/bin/env bash
set -e

# Terminal colors
BOLD_GREEN='\033[1;32m'
BOLD_RED='\033[1;31m'
BOLD_YELLOW='\033[1;33m'
BOLD_BLUE='\033[1;34m'
BOLD_CYAN='\033[1;36m'
RESET='\033[0m'

PREVIEW_BRANCH="integration-preview"
BASE_BRANCH="origin/master"

# --------------------------------------------------
# Generate combined Markdown documentation
# --------------------------------------------------
generate_markdown_docs() {

    local source_dir="docs/features"
    local output="docs/FEATURES.md"
    local tmp
    local found=0

    if [[ ! -d "$source_dir" ]]; then
        echo "No feature documentation directory found. Skipping."
        return 0
    fi

    tmp=$(mktemp)
    {
        echo "# Feature Documentation"
        echo

        while IFS= read -r file; do
            [[ -f "$file" ]] || continue

            found=$((found + 1))

            echo
            echo "---"
            echo

            cat "$file"
            echo

        done < <(find "$source_dir" -type f -name '*.md' | LC_ALL=C sort)

    } > "$tmp"

    if [[ "$found" -eq 0 ]]; then
        rm "$tmp"
        echo "No Markdown files found. Skipping."
        return 0
    fi

    if ! cmp -s "$tmp" "$output"; then

        mkdir -p "$(dirname "$output")"
        mv "$tmp" "$output"

        git add "$output"

        git commit --only "$output" \
            -m "docs: regenerate combined feature documentation"

        printf "${BOLD_GREEN}Generated $output (${found} files).${RESET}\n"

    else
        rm "$tmp"
        echo "Feature documentation unchanged."
    fi
}

# --------------------------------------------------
# Fetch remote branches
# --------------------------------------------------
git fetch --prune origin

# Do not risk losing work on another branch when switching to the preview branch.
CURRENT_BRANCH="$(git branch --show-current)"

if [[ "$CURRENT_BRANCH" != "$PREVIEW_BRANCH" ]] &&
   [[ -n "$(git status --porcelain --untracked-files=no)" ]]; then
    echo "ERROR: You have uncommitted changes on '$CURRENT_BRANCH'."
    echo "Commit or otherwise save them before running this script."
    exit 1
fi

# --------------------------------------------------
# Rebuild integration-preview
# --------------------------------------------------
git checkout "$PREVIEW_BRANCH"
git reset --hard "$BASE_BRANCH"

# --------------------------------------------------
# Merge all feature branches
# --------------------------------------------------
for branch in $(git for-each-ref \
    --sort=refname \
    --format='%(refname:short)' \
    refs/remotes/origin/features/); do

    printf "${BOLD_GREEN}Merging $branch ...${RESET}"

    if ! git merge --no-edit "$branch"; then
        echo
        printf "${BOLD_RED}ERROR: Could not merge '$branch'.${RESET}\n"
        echo "Resetting '$PREVIEW_BRANCH' to '$BASE_BRANCH'..."

        git merge --abort 2>/dev/null || true
        git reset --hard "$BASE_BRANCH"

        echo "Fix the problem in the feature branch, push it, and run this script again."
        exit 1
    fi
done

# --------------------------------------------------
# Generate combined Markdown documentation
# --------------------------------------------------
generate_markdown_docs

# --------------------------------------------------
# Finished
# --------------------------------------------------

echo
printf "${BOLD_GREEN}Done!${RESET} Build the Bitwig extension and test the features on '$PREVIEW_BRANCH'.\n"
printf "After successful testing, push the integration-preview with:\n"
printf "  git push --force-with-lease -u origin $PREVIEW_BRANCH\n"
