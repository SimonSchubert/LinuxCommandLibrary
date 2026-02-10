# TAGLINE

extracts printable strings from binary files

# TLDR

**Extract strings from binary**

```llvm-strings [file]```

**Set minimum string length**

```llvm-strings -n [8] [file]```

**Print file offset with strings**

```llvm-strings -t x [file]```

**Process all sections**

```llvm-strings -a [file]```

# SYNOPSIS

**llvm-strings** [_options_] [_file_...]

# PARAMETERS

**-n** _length_
> Minimum string length (default 4).

**-t** _format_
> Print offset (d=decimal, o=octal, x=hex).

**-a**, **--all**
> Scan entire file, not just data sections.

# DESCRIPTION

**llvm-strings** extracts printable strings from binary files. Drop-in replacement for GNU strings. Useful for analyzing executables, finding embedded text, and reverse engineering.

# SEE ALSO

[strings](/man/strings)(1), [llvm-objdump](/man/llvm-objdump)(1)

