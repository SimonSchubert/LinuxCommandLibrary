# TLDR

**List** all packages

```adb shell pm list packages```

Show packages with **APK paths**

```adb shell pm list packages -f```

List **system apps** only

```adb shell pm list packages -s```

List **user-installed apps** only

```adb shell pm list packages -3```

**Search** for a package

```adb shell pm list packages | grep [keyword]```

# SYNOPSIS

**adb shell pm list packages** [_options_] [_filter_]

# DESCRIPTION

**pm list packages** enumerates installed applications on an Android device. This is the same command as **adb shell pm list** but specifically for listing packages.

Output is in the format **package:com.example.app** with one package per line. Use grep or other tools to filter results.

# PARAMETERS

**-f**
> Include APK file path

**-d**
> Only disabled packages

**-e**
> Only enabled packages

**-s**
> Only system packages

**-3**
> Only third-party (user-installed) packages

**-i**
> Show package installer

**-u**
> Include uninstalled packages with data

# CAVEATS

The output format is consistent but verbose. Pipe through **cut -d: -f2** to get just package names. Results may differ between device users on multi-user devices.

# HISTORY

Part of the Android Package Manager since the platform's initial release in **2008**, this command remains one of the most commonly used adb shell operations for device management and debugging.

# SEE ALSO

[adb-shell-pm](/man/adb-shell-pm)(1), [adb-shell-pm-list](/man/adb-shell-pm-list)(1), [adb](/man/adb)(1)
