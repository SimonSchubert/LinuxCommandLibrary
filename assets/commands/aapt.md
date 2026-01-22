# TLDR

**List contents** of an APK file

```aapt list [app.apk]```

**Dump** the AndroidManifest.xml from an APK

```aapt dump xmltree [app.apk] AndroidManifest.xml```

**Extract package name** and version from an APK

```aapt dump badging [app.apk]```

**Package** resources into an APK

```aapt package -f -M [AndroidManifest.xml] -S [res/] -I [android.jar] -F [output.apk]```

# SYNOPSIS

**aapt** _command_ [_options_] [_file_]

# DESCRIPTION

**aapt** (Android Asset Packaging Tool) is a build tool used in Android development to package application resources into APK files. It compiles resources, generates the R.java file containing resource identifiers, and can inspect existing APK files.

The tool handles resource compilation, XML processing, asset packaging, and APK creation. It reads AndroidManifest.xml, processes drawable, layout, and other resource files, and bundles them into the final application package. While largely superseded by aapt2 in modern Android development, aapt remains useful for APK inspection and legacy projects.

# PARAMETERS

**list**
> List contents of a ZIP-compatible archive (APK)

**dump**
> Dump specific information from an APK: badging, permissions, resources, configurations, xmltree, xmlstrings

**package**
> Package resources and assets into an APK

**-f**
> Force overwrite of existing files

**-M** _file_
> Specify AndroidManifest.xml location

**-S** _dir_
> Specify resource directory

**-I** _jar_
> Add an existing package to base include set (usually android.jar)

**-F** _file_
> Specify output APK file

**-v**
> Verbose output

# CAVEATS

**aapt** has been superseded by **aapt2** in Android Gradle Plugin 3.0+. The older tool lacks incremental compilation support and has slower performance on large projects. Resource processing differences may cause issues when mixing tools.

# HISTORY

**aapt** was introduced as part of the Android SDK in **2008** with the initial public release of Android. It served as the primary resource packaging tool until **2017** when Google introduced aapt2 with improved performance and incremental build support. The original aapt remains included in the SDK for compatibility.

# SEE ALSO

[apksigner](/man/apksigner)(1), [apktool](/man/apktool)(1), [adb](/man/adb)(1)
