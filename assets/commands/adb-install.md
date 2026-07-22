# TAGLINE

Android application installer

# TLDR

**Install** an APK

```adb install [app.apk]```

**Reinstall** existing application, keeping its data

```adb install -r [app.apk]```

Allow installation of a **test APK**

```adb install -t [app.apk]```

Install allowing **version downgrade**

```adb install -d [app.apk]```

Install **granting all permissions**

```adb install -g [app.apk]```

# SYNOPSIS

**adb install** [_-rtdgf_] [_options_] _file_

# DESCRIPTION

**adb install** pushes an Android application package (APK) to a connected device and installs it. The APK is copied to the device's temporary storage, installed by the package manager, and then the temporary file is removed.

The command provides various options to control installation behavior, including replacing existing apps, downgrading versions, and automatically granting runtime permissions.

# PARAMETERS

**-r**
> Reinstall an existing app, keeping its data

**-t**
> Allow installation of test APKs

**-d**
> Allow version code downgrade

**-g**
> Grant all runtime permissions listed in the manifest

**-f**
> Install package on the internal system memory

**-i** _installer_package_name_
> Specify the installer package name

**--user** _user_id_
> Install the package for a specific user (default: all users)

**--install-location** _location_
> Set install location: 0 (default), 1 (internal), 2 (external media)

**--fastdeploy**
> Update only the changed parts of an already installed package

**--incremental**
> Stream the APK in the background; launch before fully installed (requires APK Signature Scheme v4). Append **--wait** to block until done, or use **--no-incremental** to disable

# CAVEATS

Installation may fail if the APK is signed with a different key than the existing installation (requires uninstall first). Some devices restrict installation from unknown sources. Downgrading an installed version requires the **-d** flag. To install an app split into multiple APKs, use **adb install-multiple** instead.

# HISTORY

**adb install** has been available since the initial Android SDK release in **2008**. Options have expanded over time to support split APKs, instant apps, and Android App Bundles.

# INSTALL

```apt: sudo apt install adb```

```dnf: sudo dnf install android-tools```

```pacman: sudo pacman -S android-tools```

```apk: sudo apk add android-tools-adb```

```zypper: sudo zypper install android-tools```

```nix: nix profile install nixpkgs#android-tools```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[adb](/man/adb)(1), [adb-uninstall](/man/adb-uninstall)(1), [adb-shell-pm](/man/adb-shell-pm)(1), [aapt](/man/aapt)(1), [apksigner](/man/apksigner)(1)

# RESOURCES

```[Source code](https://android.googlesource.com/platform/packages/modules/adb/)```

```[Documentation](https://developer.android.com/tools/adb)```

<!-- verified: 2026-06-11 -->
