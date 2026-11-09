# TAGLINE

Continuous integration for Smalltalk projects

# TLDR

**Run tests** using a config file

```smalltalkci [path/to/.smalltalk.ston]```

**Choose the Smalltalk image**

```smalltalkci -s [Squeak64-trunk] [path/to/.smalltalk.ston]```

**Open the VM with a GUI** and keep the image open

```smalltalkci -s [Pharo64-stable] --headful [path/to/.smalltalk.ston]```

**Debug mode**

```smalltalkci -d [path/to/.smalltalk.ston]```

**Clear the cache** and delete builds

```smalltalkci --clean```

**Install a symlink** to this smalltalkCI checkout

```bin/smalltalkci --install```

# SYNOPSIS

**smalltalkci** [_options_] [_path/to/project.ston_]

# PARAMETERS

**-s**, **--smalltalk** _IMAGE_
> Overwrite the image selection (e.g., Squeak64-trunk, Pharo64-stable, GemStone64-3.7.x, Moose64-trunk).

**-d**, **--debug**
> Enable debug mode.

**--headful**
> Open the VM in headful mode and do not close the image.

**--image** _FILE_
> Use a custom image for the build (Squeak/Pharo).

**--vm** _FILE_
> Use a custom VM for the build (Squeak/Pharo).

**--clean**
> Clear the cache and delete builds.

**--force-cache**
> Force use of the cache for all images (overrides **--overwrite-cache**).

**--overwrite-cache**
> Download the newest image and cache it.

**--install**
> Install a symlink to this smalltalkCI instance.

**--uninstall**
> Remove a symlink to any smalltalkCI instance.

**--print-env**
> Print all environment variables used by smalltalkCI.

**--no-color**
> Disable colored output.

**--no-tracking**
> Disable collection of anonymous build metrics (Travis CI and AppVeyor only).

**-v**, **--verbose**
> Enable **set -x**.

**-h**, **--help**
> Show help.

# DESCRIPTION

**smalltalkci** provides continuous integration testing for Smalltalk projects across dialects including Squeak, Pharo, GemStone/S, Moose and GToolkit. It automates the process of downloading the appropriate Smalltalk virtual machine, loading project code, running tests, and reporting results.

Configuration is defined in a **.smalltalk.ston** file using STON (Smalltalk Object Notation) format, specifying packages to load and tests to run. The tool integrates with GitHub Actions, Travis CI, and other CI/CD platforms. Without a path, it tries to locate a STON file itself.

Tests run headless by default, requiring no graphical display. GemStone builds accept further **--gs-** options such as **--gs-PRODUCTS=** and **--gs-REPOS=**.

# CAVEATS

The launcher is **bin/smalltalkci** inside a clone of the repository; use **--install** to get it on the PATH. VM download may be slow on first run; images are cached. On Windows it must run from a Bash shell.

# SEE ALSO

[pharo](/man/pharo)(1), [squeak](/man/squeak)(1)

# RESOURCES

```[Source code](https://github.com/hpi-swa/smalltalkCI)```

<!-- verified: 2026-11-09 -->
