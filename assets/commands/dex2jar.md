# TLDR

**Convert DEX to JAR**

```d2j-dex2jar [classes.dex]```

**Convert APK to JAR**

```d2j-dex2jar [app.apk]```

**Specify output file**

```d2j-dex2jar -o [output.jar] [classes.dex]```

**Force overwrite**

```d2j-dex2jar -f [classes.dex]```

**Convert JAR to DEX**

```d2j-jar2dex [file.jar]```

# SYNOPSIS

**d2j-dex2jar** [_options_] _dex-file_

# DESCRIPTION

**dex2jar** converts Android DEX (Dalvik Executable) files to Java JAR files. This enables analysis of Android applications using standard Java decompilers.

The tool is commonly used for Android reverse engineering, security analysis, and studying app behavior. It handles the differences between Dalvik bytecode and JVM bytecode.

# PARAMETERS

**-o** _file_
> Output JAR file name.

**-f**, **--force**
> Overwrite existing output.

**-e** _file_
> Output exception details to file.

**-n**, **--not-handle-exception**
> Don't handle exceptions.

**-nc**, **--no-code**
> Don't convert code.

**-d**, **--debug-info**
> Include debug information.

**-r**, **--reuse-reg**
> Reuse registers.

# RELATED TOOLS

**d2j-jar2dex**: Convert JAR to DEX
**d2j-apk-sign**: Sign APK files
**d2j-asm-verify**: Verify ASM code
**d2j-dex-recompute-checksum**: Fix DEX checksums

# CAVEATS

Conversion may not be perfect. Obfuscated code remains obfuscated. Some Dalvik features have no JVM equivalent. Legal restrictions may apply to reverse engineering.

# HISTORY

**dex2jar** was created by **Bob Pan** (pxb1988) for Android reverse engineering. It became a standard tool in the Android security research community, often used alongside jd-gui for decompiling the resulting JAR files.

# SEE ALSO

[apktool](/man/apktool)(1), [jadx](/man/jadx)(1), [jd-gui](/man/jd-gui)(1), [smali](/man/smali)(1)
