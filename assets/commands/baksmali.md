# TLDR

**Disassemble** DEX file

```baksmali [classes.dex]```

Disassemble to **specific directory**

```baksmali -o [output/] [classes.dex]```

**Specify** API level

```baksmali -a [28] [classes.dex]```

**Disassemble** APK

```baksmali -x [app.apk]```

# SYNOPSIS

**baksmali** [_options_] _dex-file_

# DESCRIPTION

**baksmali** is a disassembler for Android DEX (Dalvik Executable) files. It converts DEX bytecode into smali assembly language, enabling analysis, modification, and reverse engineering of Android applications.

The tool is the counterpart to smali, together forming a complete assembler/disassembler suite for Android.

# PARAMETERS

**-o**, **--output** _dir_
> Output directory (default: out/)

**-a**, **--api-level** _level_
> API level for disassembly

**-x**, **--extract**
> Extract and disassemble APK

**-j**, **--jobs** _num_
> Number of threads

**-d**, **--bootclasspath** _jar_
> Bootclasspath for analysis

**-c**, **--bootclasspath-dir** _dir_
> Directory containing framework files

**--no-debug-info**
> Don't write debug information

**--use-locals**
> Output local variable information

# FEATURES

- DEX to smali conversion
- Multi-DEX support
- API level awareness
- Parallel processing
- Debug info preservation
- Local variable names

# WORKFLOW

```bash
# Disassemble DEX
baksmali classes.dex

# Disassemble APK
baksmali -x app.apk

# Reassemble with smali
smali out/ -o new-classes.dex
```

# CAVEATS

Requires Java runtime. Obfuscated code produces hard-to-read output. API level affects instruction interpretation. For research and educational purposes only. Respect software licenses and terms of service.

# HISTORY

**baksmali** (Icelandic for "disassembler") was created by Ben Gruver (JesusFreke) around **2010** as part of the smali project for Android reverse engineering.

# SEE ALSO

[smali](/man/smali)(1), [apktool](/man/apktool)(1), [dex2jar](/man/dex2jar)(1)
