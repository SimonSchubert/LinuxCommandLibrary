# TAGLINE

Optimize Android APK file alignment

# TLDR

**Align an APK file** with 4-byte alignment

```zipalign -v 4 [input.apk] [output.apk]```

**Verify alignment** of an APK

```zipalign -c -v 4 [path/to/file.apk]```

**Align with page alignment** (required for Android 11+)

```zipalign -p -v 4 [input.apk] [output.apk]```

**Force overwrite** existing output file

```zipalign -f 4 [input.apk] [output.apk]```

**Align with zip-align** for shared libraries

```zipalign -p -f -v 4 [input.apk] [output.apk]```

**Check alignment without verbose output**

```zipalign -c 4 [path/to/file.apk]```

# SYNOPSIS

**zipalign** [_-c_] [_-f_] [_-p_] [_-v_] [_-z_] _alignment_ _input.apk_ [_output.apk_]

# PARAMETERS

**-c**
> Check alignment only (confirm mode). Does not modify the file.

**-f**
> Force overwrite of existing output file.

**-p**
> Page-align uncompressed .so files. Required for Android 11 (API 30) and higher for optimal memory mapping.

**-v**
> Verbose output, showing alignment status for each file in the archive.

**-z**
> Recompress using Zopfli for smaller file size (slower).

_alignment_
> Byte alignment boundary. Always use **4** for APK files.

_input.apk_
> The input APK file to process.

_output.apk_
> The output aligned APK file (required unless using -c).

# DESCRIPTION

**zipalign** is an archive alignment tool from the Android SDK that optimizes APK files by ensuring all uncompressed data starts at a particular byte alignment relative to the file start. This optimization allows Android to memory-map files directly from the APK, reducing RAM usage and improving app launch performance.

The tool works by adjusting the extra field padding in ZIP entries so that file data boundaries align to the specified value (always 4 bytes for APKs). This allows the Android runtime to access uncompressed resources with **mmap()** instead of copying them into the heap.

Zipalign must be run **after** signing the APK with apksigner or jarsigner. Running zipalign before signing would invalidate the signature since it modifies the ZIP structure. For Android App Bundles (AAB), zipalign is not needed as Google Play handles optimization during APK generation.

The tool is located in the **build-tools** directory of the Android SDK (e.g., `$ANDROID_HOME/build-tools/34.0.0/zipalign`).

# CAVEATS

Must be run after APK signing, not before. Using -p flag is required for apps targeting Android 11+ to properly align native libraries for memory mapping. Does not work with Android App Bundles (AAB). The alignment value should always be 4 for APKs. Zipalign does not perform signing.

# HISTORY

**zipalign** was introduced by Google as part of the Android SDK tools. It became part of the standard Android build process to ensure optimal runtime performance. With Android 11 in **2020**, Google added the requirement for page-aligned native libraries (-p flag) to support more efficient memory mapping on newer devices.

# SEE ALSO

[apksigner](/man/apksigner)(1), [aapt](/man/aapt)(1), [aapt2](/man/aapt2)(1), [adb](/man/adb)(1), [bundletool](/man/bundletool)(1)
