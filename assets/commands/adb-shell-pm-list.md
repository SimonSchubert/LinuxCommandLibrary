# TLDR

**List** all installed packages

```adb shell pm list packages```

List with **APK paths**

```adb shell pm list packages -f```

List **system** packages only

```adb shell pm list packages -s```

List **third-party** packages only

```adb shell pm list packages -3```

List **disabled** packages

```adb shell pm list packages -d```

**Filter** packages by name

```adb shell pm list packages [google]```

# SYNOPSIS

**adb shell pm list packages** [_-f_] [_-d_] [_-e_] [_-s_] [_-3_] [_-i_] [_-u_] [_--user user_id_] [_filter_]

# DESCRIPTION

**pm list packages** displays installed applications on an Android device. The output can be filtered by package type (system, third-party, enabled, disabled) and optionally include APK file paths.

The filter argument performs a substring match on package names, useful for finding packages from a specific vendor or with a specific component.

# PARAMETERS

**-f**
> Show associated APK file path

**-d**
> Show only disabled packages

**-e**
> Show only enabled packages

**-s**
> Show only system packages

**-3**
> Show only third-party packages

**-i**
> Show installer for each package

**-u**
> Include uninstalled packages

**--user** _user_id_
> List packages for specific user

# CAVEATS

Output format may vary slightly between Android versions. System packages include both true system apps and apps installed in the system partition. Some packages may be hidden and not appear in standard listings.

# HISTORY

The package listing functionality has been available since Android 1.0 in **2008**, with filtering options added in subsequent versions to accommodate the growing number of installed applications.

# SEE ALSO

[adb-shell-pm](/man/adb-shell-pm)(1), [adb](/man/adb)(1)
