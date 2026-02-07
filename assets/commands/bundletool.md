# TAGLINE

Manipulate Android App Bundles and APKs

# TLDR

**Build APK set from app bundle**

```bundletool build-apks --bundle=[app.aab] --output=[app.apks]```

**Build APKs with signing**

```bundletool build-apks --bundle=[app.aab] --output=[app.apks] --ks=[keystore.jks] --ks-key-alias=[alias]```

**Install APKs to connected device**

```bundletool install-apks --apks=[app.apks]```

**Extract APKs for specific device**

```bundletool extract-apks --apks=[app.apks] --output-dir=[output] --device-spec=[device.json]```

**Get device specification**

```bundletool get-device-spec --output=[device.json]```

**Validate app bundle**

```bundletool validate --bundle=[app.aab]```

**Print bundle info**

```bundletool dump manifest --bundle=[app.aab]```

**Get APK size estimates**

```bundletool get-size total --apks=[app.apks]```

# SYNOPSIS

**bundletool** _command_ [_options_]

# DESCRIPTION

**bundletool** is the command-line tool for manipulating Android App Bundles. It builds app bundles, generates APK sets for various device configurations, and installs APKs to connected devices.

The tool is used by Android Studio, the Android Gradle plugin, and Google Play to build and process Android App Bundles.

# COMMANDS

**build-bundle**
> Build Android App Bundle from module zip files

**build-apks**
> Generate APK set from app bundle

**extract-apks**
> Extract APKs for specific device configuration

**install-apks**
> Install APKs to connected device

**get-device-spec**
> Write device specification to JSON file

**validate**
> Verify app bundle validity

**dump**
> Print bundle information in human-readable form

**get-size**
> Compute download size estimates

**version**
> Print bundletool version

# PARAMETERS

**--bundle** _file_
> Path to Android App Bundle (.aab)

**--output** _file_
> Output file path

**--apks** _file_
> Path to APK set archive

**--device-spec** _file_
> Device specification JSON file

**--ks** _file_
> Path to keystore for signing

**--ks-key-alias** _alias_
> Key alias in keystore

**--connected-device**
> Use specification from connected device

# CAVEATS

Requires Java Runtime Environment. Device installation requires ADB and a connected Android device. Signed APKs require keystore credentials. App bundles must be valid according to Android App Bundle specification.

# SEE ALSO

[adb](/man/adb)(1), [apksigner](/man/apksigner)(1), [zipalign](/man/zipalign)(1)
