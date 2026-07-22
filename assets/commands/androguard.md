# TAGLINE

Reverse engineer and analyze Android applications

# TLDR

**Analyze** an APK file

```androguard analyze [app.apk]```

**Decompile** to Java source

```androguard decompile -o [output_dir] [app.apk]```

Show **manifest permissions** in an APK

```androguard axml [app.apk] | grep permission```

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
> Open an IPython shell to start reverse engineering interactively

**decompile**
> Decompile an APK to Java source and create control flow graphs

**disassemble**
> Disassemble Dalvik (DEX) bytecode

**axml**
> Parse and display the AndroidManifest.xml or other AXML files

**arsc**
> Decode resources.arsc

**apkid**
> Print the package name, version code, and version name of an APK

**sign**
> Print the fingerprints of all certificates inside an APK

**cg**
> Generate a call graph and export it to a graph format

**-o** _dir_
> Output directory (required for decompile)

**-i** _file_
> Input APK (legacy; the APK is usually given as a positional argument)

**-f** _format_
> Control flow graph format (png, jpg, raw)

**-d** _name_
> Decompiler to use (default: DAD)

**-l** _regex_
> Limit processing to methods matching a regex

# CAVEATS

Decompilation is not always perfect; obfuscated code may be difficult to read. Some native code cannot be analyzed. Analysis of large APKs may consume significant memory.

# HISTORY

**androguard** was developed by Anthony Desnos starting around **2012**. It became one of the primary open-source tools for Android application security analysis.

# INSTALL

```aur: yay -S androguard```

```nix: nix profile install nixpkgs#androguard```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apktool](/man/apktool)(1), [jadx](/man/jadx)(1), [dex2jar](/man/dex2jar)(1)

# RESOURCES

```[Source code](https://github.com/androguard/androguard)```

```[Documentation](https://androguard.readthedocs.io)```

<!-- verified: 2026-06-11 -->
