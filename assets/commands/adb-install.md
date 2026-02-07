# TAGLINE

Android application installer

# TLDR

**Install** an APK

```adb install [app.apk]```

**Replace** existing application

```adb install -r [app.apk]```

Install to **SD card** if possible

```adb install -s [app.apk]```

Install allowing **version downgrade**

```adb install -d [app.apk]```

Install **granting all permissions**

```adb install -g [app.apk]```

# SYNOPSIS

**adb install** [_-lrtsdg_] _file_

# DESCRIPTION

**adb install** pushes an Android application package (APK) to a connected device and installs it. The APK is copied to the device's temporary storage, installed by the package manager, and then the temporary file is removed.

The command provides various options to control installation behavior, including replacing existing apps, downgrading versions, and automatically granting runtime permissions.

# PARAMETERS

**-l**
> Install with forward lock (deprecated)

**-r**
> Replace existing application (keep data)

**-t**
> Allow installation of test APKs

**-s**
> Install on SD card instead of internal storage

**-d**
> Allow version code downgrade (debuggable packages only)

**-g**
> Grant all runtime permissions automatically

**--abi** _abi_
> Override platform's default ABI

**-p**
> Partial application install (install base splits)

**--instant**
> Install as instant app

# CAVEATS

Installation may fail if the APK is signed with a different key than the existing installation (requires uninstall first). Some devices restrict installation from unknown sources. Downgrade installation requires the app to be debuggable or using **-d** flag.

# HISTORY

**adb install** has been available since the initial Android SDK release in **2008**. Options have expanded over time to support split APKs, instant apps, and Android App Bundles.

# SEE ALSO

[adb](/man/adb)(1), [adb-uninstall](/man/adb-uninstall)(1), [aapt](/man/aapt)(1), [apksigner](/man/apksigner)(1)
