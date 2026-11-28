# DrivenByMoss
Bitwig Studio extensions to support several controllers

### Building and Installing the extension

Users should download and install the version from the
[main site](http://www.mossgrabers.de/Software/Bitwig/Bitwig.html).
These directions are for developers to test changes prior to release.

1. Run `merge-all-features-to-preview.sh` to merge all feature into the `integration-preview` branch and 
generate a document of all features `FEATURES.md`.
2. Install Maven and dependences, either [from here](https://maven.apache.org/install.html)
or if on Linux, using the distro package manager, e.g. `yum install maven` or
`apt-get install maven`.
3. Run the appropriate release script in the `integration-preview` branch.
4. Follow [installation instructions] in the included PDF manual for further steps.