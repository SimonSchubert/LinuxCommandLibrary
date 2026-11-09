# TAGLINE

Android DEX file disassembler

# TLDR

**Disassemble** a DEX file

```baksmali disassemble [classes.dex]```

Disassemble to a **specific directory**

```baksmali disassemble -o [output/] [classes.dex]```

**Specify** API level for disassembly

```baksmali disassemble -a [28] [classes.dex]```

**List** available subcommands

```baksmali --help```

**List DEX classes** without disassembling

```baksmali list classes [classes.dex]```

**Disassemble** with code offset comments

```baksmali disassemble --code-offsets [classes.dex]```

# SYNOPSIS

**baksmali** _command_ [_options_] _dex-file_

# DESCRIPTION

**baksmali** is a disassembler for Android DEX (Dalvik Executable) files. It converts DEX bytecode into smali assembly language, enabling analysis, modification, and reverse engineering of Android applications.

The tool is the counterpart to smali, together forming a complete assembler/disassembler suite for Android. Since version 2.0, baksmali uses a subcommand-based interface.

# PARAMETERS

**disassemble** (or **d**)
> Disassemble a DEX file into smali files.

**list** (or **l**) _type_
> List items (classes, methods, fields, etc.) from a DEX file.

**deodex** (or **x**)
> Deodex an odex/oat file.

**-o**, **--output** _dir_
> Output directory (default: out/).

**-a**, **--api** _level_
> Numeric API level of the file being disassembled.

**-j**, **--jobs** _num_
> Number of threads for parallel processing.

**-b**, **--bootclasspath**, **--bcp** _classpath_
> Colon-separated files to include in the bootclasspath when analyzing the dex file.

**-c**, **--classpath**, **--cp** _classpath_
> Colon-separated additional files for the classpath.

**-d**, **--classpath-dir**, **--cpd**, **--dir** _dir_
> Directory to search for classpath files. May be repeated.

**--debug-info**, **--di**
> Include debug metadata in output (default: true).

**-l**, **--use-locals**
> Use .locals directive instead of .registers.

**--code-offsets**, **--offsets**, **--off**
> Add a comment before each instruction with its code offset.

**--accessor-comments**, **--ac**
> Generate helper comments for synthetic accessors (default: true).

**--sequential-labels**, **--seq**, **--sl**
> Use sequential numbering for labels.

**--classes** _LIST_
> Comma-separated list of classes to disassemble.

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
baksmali disassemble classes.dex

# Reassemble with smali
smali assemble out/ -o new-classes.dex
```

# CAVEATS

Requires Java runtime. Obfuscated code produces hard-to-read output. API level affects instruction interpretation. For research and educational purposes only. Respect software licenses and terms of service.

# HISTORY

**baksmali** (Icelandic for "disassembler") was created by Ben Gruver (JesusFreke) around **2010** as part of the smali project for Android reverse engineering. The original repository is archived; Google maintains a fork, released from version 3.0.0 under the com.android.tools.smali namespace.

# SEE ALSO

[apktool](/man/apktool)(1), [dex2jar](/man/dex2jar)(1), [jadx](/man/jadx)(1)

# RESOURCES

```[Source code](https://github.com/google/smali)```

<!-- verified: 2026-11-09 -->
