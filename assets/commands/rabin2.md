# TAGLINE

Extract information from binary files

# TLDR

**Show binary info**

```rabin2 -I [binary]```

**List symbols**

```rabin2 -s [binary]```

**List imports**

```rabin2 -i [binary]```

**List exports**

```rabin2 -E [binary]```

**List strings**

```rabin2 -z [binary]```

**List sections**

```rabin2 -S [binary]```

**Show entry point**

```rabin2 -e [binary]```

**List libraries**

```rabin2 -l [binary]```

# SYNOPSIS

**rabin2** [_-I_] [_-s_] [_-i_] [_-z_] [_-S_] [_options_] _binary_

# PARAMETERS

**-I**
> Binary info.

**-s**
> Symbols.

**-i**
> Imports.

**-E**
> Exports.

**-z**
> Strings.

**-S**
> Sections.

**-e**
> Entry points.

**-l**
> Libraries.

**-H**
> Header fields.

**-c**
> Classes (ObjC/Java).

**-j**
> JSON output.

# DESCRIPTION

**rabin2** extracts information from binary files. It's part of the radare2 reverse engineering framework.

Binary info shows format, architecture, and protections. PIE, canaries, and NX are detected.

Symbol tables reveal function and variable names. Both debug and dynamic symbols listed.

String extraction finds embedded text. Useful for finding hardcoded data.

Section listing shows memory layout. Permissions and sizes are displayed.

# CAVEATS

Part of radare2. Large binaries may be slow. Stripped binaries have limited info.

# HISTORY

**rabin2** is part of **radare2**, created by **pancake** (Sergi Alvarez) around **2006**. It provides binary analysis without full disassembly.

# SEE ALSO

[r2](/man/r2)(1), [objdump](/man/objdump)(1), [readelf](/man/readelf)(1), [nm](/man/nm)(1)
