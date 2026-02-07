# TAGLINE

Reverse engineer and analyze Android applications

# TLDR

**Analyze** an APK file

```androguard analyze [app.apk]```

**Decompile** to Java source

```androguard decompile -o [output_dir] [app.apk]```

Show **permissions** in APK

```androguard axml -i [app.apk] | grep permission```

**Disassemble** DEX to smali

```androguard disassemble [app.apk]```

Check for **signing** issues

```androguard sign [app.apk]```

# SYNOPSIS

**androguard** _command_ [_options_] _apk_file_

# DESCRIPTION

**androguard** is a Python tool for reverse engineering, malware analysis, and security assessment of Android applications. It can analyze APK files, decompile DEX code, parse Android manifests, and extract permissions and components.

The tool provides both command-line utilities and a Python API for programmatic analysis, making it useful for both manual review and automated security scanning.

# PARAMETERS

**analyze**
> Interactive analysis session

**decompile**
> Decompile APK to Java source code

**disassemble**
> Disassemble DEX to smali

**axml**
> Parse and display Android XML files

**sign**
> Analyze APK signatures

**cg**
> Generate call graph

**-o** _dir_
> Output directory

**-i** _file_
> Input file

**-f** _format_
> Output format

# CAVEATS

Decompilation is not always perfect; obfuscated code may be difficult to read. Some native code cannot be analyzed. Analysis of large APKs may consume significant memory.

# HISTORY

**androguard** was developed by Anthony Desnos starting around **2012**. It became one of the primary open-source tools for Android application security analysis.

# SEE ALSO

[apktool](/man/apktool)(1), [jadx](/man/jadx)(1), [dex2jar](/man/dex2jar)(1)
