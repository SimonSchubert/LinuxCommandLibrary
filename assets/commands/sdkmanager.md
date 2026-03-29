# TAGLINE

Install and manage Android SDK packages

# TLDR

**List** available and installed packages

```sdkmanager --list```

**List** only installed packages

```sdkmanager --list_installed```

**Install** a platform package

```sdkmanager "platforms;android-35"```

**Install** multiple packages at once

```sdkmanager "platforms;android-35" "build-tools;35.0.0"```

**Update** all installed packages

```sdkmanager --update```

**Uninstall** a package

```sdkmanager --uninstall "build-tools;34.0.0"```

**Accept** all pending licenses non-interactively

```yes | sdkmanager --licenses```

**Install** packages using a specific SDK root and channel

```sdkmanager --sdk_root=[path] --channel=1 "platform-tools"```

# SYNOPSIS

**sdkmanager** [_--list_|_--list_installed_|_--update_|_--licenses_|_--uninstall_] [_options_] [_packages..._]

# PARAMETERS

**--list**
> List all available and installed packages.

**--list_installed**
> List only installed packages.

**--update**
> Update all installed packages to the latest versions.

**--uninstall** _PACKAGES_
> Remove specified packages.

**--licenses**
> Review and accept SDK licenses. Required before installing packages.

**--sdk_root** _PATH_
> Specify the SDK installation directory (overrides ANDROID_HOME).

**--channel** _N_
> Include packages from the specified channel: 0 (stable, default), 1 (beta), 2 (dev), 3 (canary).

**--no_https**
> Use HTTP instead of HTTPS for downloads.

**--verbose**
> Enable verbose output showing errors, warnings, and all messages.

**--proxy** _TYPE_
> Connect via a proxy of the given type (http or socks).

**--proxy_host** _HOST_
> IP or DNS address of the proxy.

**--proxy_port** _PORT_
> Proxy port number.

# DESCRIPTION

**sdkmanager** manages Android SDK components from the command line, installing, updating, and removing platform packages, build tools, system images, and other SDK components. It is the headless counterpart to Android Studio's SDK Manager and is provided in the Android SDK Command-Line Tools package.

Packages are identified by string paths like **platforms;android-35** for platform APIs, **build-tools;35.0.0** for compilation tools, and **system-images;android-35;google_apis;x86_64** for emulator images. Multiple packages can be installed in a single command by separating them with spaces, each wrapped in quotes.

License acceptance is required before installing packages. Running **--licenses** interactively accepts all pending licenses, which is essential for automated CI/CD setups where the SDK needs to be provisioned non-interactively.

# CONFIGURATION

**ANDROID_HOME**
> Environment variable specifying the root directory of the Android SDK installation.

**ANDROID_SDK_ROOT**
> Alternative to ANDROID_HOME for specifying the SDK location (deprecated in favor of ANDROID_HOME).

# CAVEATS

Part of Android SDK Command-Line Tools, which must be downloaded separately. Requires ANDROID_HOME or --sdk_root to be set. Package downloads can be large. If Android Studio is installed, the IDE's built-in SDK Manager can be used instead.

# SEE ALSO

[adb](/man/adb)(1), [avdmanager](/man/avdmanager)(1), [emulator](/man/emulator)(1), [gradle](/man/gradle)(1)
