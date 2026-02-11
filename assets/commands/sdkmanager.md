# TAGLINE

Install and manage Android SDK packages

# TLDR

**List available packages**

```sdkmanager --list```

**Install package**

```sdkmanager "[platforms;android-34]"```

**Install multiple packages**

```sdkmanager "[platforms;android-34]" "[build-tools;34.0.0]"```

**Update all packages**

```sdkmanager --update```

**Uninstall package**

```sdkmanager --uninstall "[package-name]"```

**Accept licenses**

```sdkmanager --licenses```

**Show installed packages**

```sdkmanager --list_installed```

# SYNOPSIS

**sdkmanager** [_--list_] [_--update_] [_options_] [_packages_]

# PARAMETERS

**--list**
> List available packages.

**--list_installed**
> List installed packages.

**--update**
> Update installed packages.

**--uninstall** _PACKAGES_
> Remove packages.

**--licenses**
> Review and accept licenses.

**--sdk_root** _PATH_
> SDK location.

**--channel** _N_
> Update channel (0-3).

**--no_https**
> Disable HTTPS.

# DESCRIPTION

**sdkmanager** manages Android SDK components from the command line, installing, updating, and removing platform packages, build tools, system images, and other SDK components. It is the headless counterpart to Android Studio's SDK Manager.

Packages are identified by string paths like **platforms;android-34** for platform APIs, **build-tools;34.0.0** for compilation tools, and **system-images;android-34;google_apis;x86_64** for emulator images. Multiple packages can be installed in a single command.

License acceptance is required before installing packages. Running **--licenses** interactively accepts all pending licenses, which is essential for automated CI/CD setups where the SDK needs to be provisioned non-interactively.

# CONFIGURATION

**ANDROID_HOME**
> Environment variable specifying the root directory of the Android SDK installation.

**ANDROID_SDK_ROOT**
> Alternative to ANDROID_HOME for specifying the SDK location (deprecated in favor of ANDROID_HOME).

# CAVEATS

Part of Android command-line tools. Requires ANDROID_HOME or --sdk_root. Downloads can be large.

# HISTORY

**sdkmanager** is part of Android's command-line tools, replacing the legacy android SDK manager. It's essential for CI/CD and headless Android development.

# SEE ALSO

[adb](/man/adb)(1), [avdmanager](/man/avdmanager)(1), [emulator](/man/emulator)(1)
