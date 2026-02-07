# TAGLINE

Remove an application from an Android device

# TLDR

**Uninstall** an application

```adb uninstall [com.example.app]```

Uninstall but **keep data** and cache

```adb uninstall -k [com.example.app]```

# SYNOPSIS

**adb uninstall** [_-k_] _package_

# DESCRIPTION

**adb uninstall** removes an installed Android application from the device. The package is specified by its full package name (e.g., com.example.app), not the APK filename.

By default, uninstalling removes the app along with all its data, cache, and associated files. Use the -k flag to preserve application data.

# PARAMETERS

**-k**
> Keep data and cache directories after uninstallation

**package**
> Full package name of the application to remove

# CAVEATS

System applications cannot be uninstalled without root access or using **adb shell pm uninstall -k --user 0**. The package name is case-sensitive. Pre-installed apps may be disabled instead of fully removed.

# HISTORY

**adb uninstall** has been available since the initial Android SDK release in **2008**, providing a simple way to remove applications during development and testing.

# SEE ALSO

[adb](/man/adb)(1), [adb-install](/man/adb-install)(1), [adb-shell-pm](/man/adb-shell-pm)(1)
