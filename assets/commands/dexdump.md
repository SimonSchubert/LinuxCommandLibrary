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

**dexdump** displays information about Android DEX (Dalvik Executable) files. It can dump class definitions, method signatures, and disassemble bytecode.

Part of the Android SDK build tools, useful for analyzing Android applications.

# SEE ALSO

[apktool](/man/apktool)(1), [jadx](/man/jadx)(1), [dex2jar](/man/dex2jar)(1)
