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

**sdkmanager** manages Android SDK components. It installs platforms, build tools, and other packages.

Platform packages provide API versions. android-34 for Android 14, etc.

Build tools compile and package apps. Version matching is important.

System images enable emulators. Choose architecture and API level.

License acceptance is required. Run --licenses before automated installs.

# CAVEATS

Part of Android command-line tools. Requires ANDROID_HOME or --sdk_root. Downloads can be large.

# HISTORY

**sdkmanager** is part of Android's command-line tools, replacing the legacy android SDK manager. It's essential for CI/CD and headless Android development.

# SEE ALSO

[adb](/man/adb)(1), [avdmanager](/man/avdmanager)(1), [emulator](/man/emulator)(1)
