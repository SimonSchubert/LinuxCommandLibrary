# TAGLINE

dumps files in various formats

# TLDR

**Dump file in octal**

```od [file]```

**Dump in hexadecimal**

```od -x [file]```

**Dump as ASCII**

```od -c [file]```

**Dump with addresses**

```od -A x -t x1 [file]```

**Skip bytes from start**

```od -j [bytes] [file]```

**Limit output length**

```od -N [bytes] [file]```

# SYNOPSIS

**od** [_options_] [_file_...]

# PARAMETERS

_FILE_
> File(s) to dump.

**-A** _RADIX_
> Address radix (d, o, x, n).

**-t** _TYPE_
> Output type (c, d, o, x).

**-x**
> Hexadecimal output.

**-c**
> ASCII character output.

**-j** _BYTES_
> Skip bytes at start.

**-N** _BYTES_
> Limit output bytes.

**--help**
> Display help information.

# DESCRIPTION

**od** dumps files in various formats. Shows octal, hex, or ASCII.

The tool displays file contents byte-by-byte. Useful for binary analysis.

# CAVEATS

Default is octal. Use -x for hex. Part of coreutils.

# HISTORY

od (octal dump) originated in **early Unix** for viewing file contents in octal.

# SEE ALSO

[hexdump](/man/hexdump)(1), [xxd](/man/xxd)(1), [hd](/man/hd)(1)

