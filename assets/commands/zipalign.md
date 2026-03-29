# TAGLINE

Optimize Android APK file alignment

# TLDR

**Align an APK file** with 4-byte alignment and 16 KiB page alignment for shared libraries

```zipalign -P 16 -f -v 4 [input.apk] [output.apk]```

**Verify alignment** of an APK

```zipalign -c -P 16 -v 4 [path/to/file.apk]```

**Align with basic 4-byte alignment** only

```zipalign -v 4 [input.apk] [output.apk]```

**Force overwrite** existing output file

```zipalign -f 4 [input.apk] [output.apk]```

**Check alignment without verbose output**

```zipalign -c 4 [path/to/file.apk]```

# SYNOPSIS

**zipalign** [_-c_] [_-f_] [_-P_ _pagesize_kb_] [_-v_] [_-z_] _alignment_ _input.apk_ [_output.apk_]

# PARAMETERS

**-c**
> Check alignment only (confirm mode). Does not modify the file.

**-f**
> Force overwrite of existing output file.

**-P** _pagesize_kb_
> Page-align uncompressed .so files to the specified page size in KiB. Valid values are **4**, **16**, or **64**. Use **-P 16** for compatibility with both 4 KiB and 16 KiB page size devices.

**-p**
> Deprecated. Legacy 4 KiB page alignment for .so files. Use **-P 16** instead.

**-v**
> Verbose output, showing alignment status for each file in the archive.

**-z**
> Recompress using Zopfli for smaller file size (slower).

**-h**
> Display help information.

_alignment_
> Byte alignment boundary. Always use **4** for APK files.

_input.apk_
> The input APK file to process.

_output.apk_
> The output aligned APK file (required unless using -c).

# DESCRIPTION

**zipalign** is an archive alignment tool from the Android SDK that optimizes APK files by ensuring all uncompressed data starts at a particular byte alignment relative to the file start. This optimization allows Android to memory-map files directly from the APK, reducing RAM usage and improving app launch performance.

The tool works by adjusting the extra field padding in ZIP entries so that file data boundaries align to the specified value (always 4 bytes for APKs). This allows the Android runtime to access uncompressed resources with **mmap()** instead of copying them into the heap.

The correct order of operations depends on the signing tool used. When using **apksigner**, run zipalign **before** signing. When using **jarsigner**, run zipalign **after** signing. For Android App Bundles (AAB), zipalign is not needed as Google Play handles optimization during APK generation.

The tool is located in the **build-tools** directory of the Android SDK (e.g., `$ANDROID_HOME/build-tools/34.0.0/zipalign`).

# CAVEATS

The order relative to signing depends on the tool: run zipalign **before** apksigner but **after** jarsigner. Using **-P 16** is required for apps targeting Android 15+ to properly align native libraries for 16 KiB page size devices. Does not work with Android App Bundles (AAB). The alignment value should always be 4 for APKs. Zipalign does not perform signing. The lowercase **-p** flag is deprecated in favor of **-P**.

# HISTORY

**zipalign** was introduced by Google as part of the Android SDK tools. It became part of the standard Android build process to ensure optimal runtime performance. Starting November **2025**, Google Play requires all apps targeting Android 15+ on 64-bit devices to support 16 KiB page sizes, making the **-P 16** flag essential for apps with native libraries.

# SEE ALSO

[apksigner](/man/apksigner)(1), [aapt](/man/aapt)(1), [aapt2](/man/aapt2)(1), [adb](/man/adb)(1), [bundletool](/man/bundletool)(1)
