# TAGLINE

lists symbols from object files

# TLDR

**List symbols**

```nm [binary]```

**Show only external symbols**

```nm -g [binary]```

**Show undefined symbols**

```nm -u [binary]```

**Show defined symbols**

```nm -U [binary]```

**Demangle C++ symbols**

```nm -C [binary]```

**Sort by address**

```nm -n [binary]```

**Show symbol sizes**

```nm -S [binary]```

# SYNOPSIS

**nm** [_options_] _files_

# PARAMETERS

_FILES_
> Object files or libraries.

**-g**
> External symbols only.

**-u**
> Undefined symbols only.

**-U**
> Defined symbols only.

**-C**
> Demangle C++ names.

**-n**
> Sort by address.

**-S**
> Print symbol sizes.

**--help**
> Display help information.

# DESCRIPTION

**nm** lists symbols from object files. Shows function and variable names.

The tool inspects binaries. Essential for debugging and reverse engineering.

# CAVEATS

Requires debug symbols for best results. Part of binutils. Platform variations.

# HISTORY

nm is a classic **Unix** utility from early Unix systems for examining object file symbols.

# SEE ALSO

[objdump](/man/objdump)(1), [readelf](/man/readelf)(1), [strings](/man/strings)(1)

