# Different branches
Everything is merged into the 'all-feature' branch (aside from the draft-branches).

## Branch: Improve README.md by changing a misleading statement
Improve README.md by changing a misleading statement, because the release-scripts should actually be used.
In that way there is no need for the related entry in the .gitignore.

## Branch: Ableton Push One: Touching Knob 9 (Master Volume) should not switch automatically to Master Mode View
Push One only: Touching Knob 9 (Master Volume) should not switch automatically to Master Mode View. This has the advantage that accidentally touching the button does not change the view, and that the Master Volume and, for example, the volume of a track can be adjusted at the same time.

Notice, Master View Mode will be still accessible via the Master button.

## Branch: Ableton Push One: SHIFT + DELETE toggles track de-activation
- SHIFT + DELETE toggles track de-activation, but only in Track or Volume mode. In every other mode, SHIFT + DELETE does nothing.
- Normal DELETE continues to perform its existing deletion operation.
- If no track is selected, nothing happens.
- The modification applies to Push 1 only, leaving Push 2 and Push 3 unchanged.

## Branch: Ableton Push One: feat-pan-send-button-switches-fx-track
- Pressing 'Pan-Send'-button switches to effect send volumes overview.
- Pressing the button again has no effect.
- Pressing 'Pan-Send'-button and SHIFT switches to the original pan and send settings of the the tracks.
- The feature has to be enabled via global settings.
- The modification applies to Push 1 only, leaving Push 2 and Push 3 unchanged.