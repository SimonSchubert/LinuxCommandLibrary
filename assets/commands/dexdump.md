# TAGLINE

Android DEX file analysis and disassembly tool

# TLDR

**Dump a DEX file**

```dexdump [classes.dex]```

**Dump with disassembly**

```dexdump -d [classes.dex]```

**Dump headers only**

```dexdump -f [classes.dex]```

**Output to file**

```dexdump [classes.dex] -o [output.txt]```

# SYNOPSIS

**dexdump** [_options_] _dexfile_

# PARAMETERS

**-d**
> Disassemble code sections.

**-f**
> Display file header details.

**-h**
> Display file header summary.

**-l** _layout_
> Output layout: plain, xml.

**-o** _file_
> Output to file instead of stdout.

# DESCRIPTION

**dexdump** displays detailed information about Android DEX (Dalvik Executable) files. It can dump class definitions, method signatures, field information, and disassemble bytecode into human-readable format.

The tool is part of the Android SDK build tools and provides insight into the structure of compiled Android applications. It can output information in plain text or XML format for further processing.

DEX files contain compiled Java bytecode for the Dalvik VM or Android Runtime (ART). dexdump helps developers and security researchers understand app internals, debug compilation issues, and perform reverse engineering analysis.

# SEE ALSO

[apktool](/man/apktool)(1), [jadx](/man/jadx)(1), [dex2jar](/man/dex2jar)(1)
