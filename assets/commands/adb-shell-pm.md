# TLDR

**List** all installed packages

```adb shell pm list packages```

List only **system** packages

```adb shell pm list packages -s```

List only **third-party** packages

```adb shell pm list packages -3```

**Uninstall** a package

```adb shell pm uninstall [com.example.app]```

**Clear** app data and cache

```adb shell pm clear [com.example.app]```

Get **path** to APK

```adb shell pm path [com.example.app]```

# SYNOPSIS

**adb shell pm** _command_ [_options_]

# DESCRIPTION

**pm** (Package Manager) is an Android shell command for managing installed applications. It provides functionality for listing, installing, uninstalling, and querying information about packages on the device.

This tool is more powerful than the standard adb install/uninstall commands, offering options to manage permissions, disable packages, and query detailed package information.

# PARAMETERS

**list packages** [_-f_] [_-d_] [_-e_] [_-s_] [_-3_] [_-i_] [_-u_] [_filter_]
> List packages (-f: with APK path, -d: disabled, -e: enabled, -s: system, -3: third-party, -i: with installer, -u: include uninstalled)

**path** _package_
> Print path to the APK

**install** [_-r_] [_-t_] [_-d_] _path_
> Install package from device path

**uninstall** [_-k_] _package_
> Remove package (-k: keep data)

**clear** _package_
> Delete all data associated with package

**enable** _package_
> Enable a disabled package

**disable** _package_
> Disable a package

**grant** _package_ _permission_
> Grant a permission to a package

**revoke** _package_ _permission_
> Revoke a permission from a package

**dump** _package_
> Print package information

# CAVEATS

Some operations require system or root privileges. Disabling system packages may cause instability. Package names are case-sensitive. Uninstalling system apps may require root.

# HISTORY

The package manager command has been part of Android since its initial release in **2008**, providing command-line access to the PackageManager system service.

# SEE ALSO

[adb](/man/adb)(1), [adb-shell](/man/adb-shell)(1), [adb-install](/man/adb-install)(1), [adb-uninstall](/man/adb-uninstall)(1)
