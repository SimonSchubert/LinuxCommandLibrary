# TAGLINE

Dump files in octal and other formats

# TLDR

**Dump file in octal** (default)

```od [file]```

**Dump in hexadecimal** (two-byte units)

```od -x [file]```

**Dump as ASCII characters** and backslash escapes

```od -c [file]```

**Dump with hex addresses** and single-byte hex output

```od -A x -t x1 [file]```

**Skip bytes from start**

```od -j [bytes] [file]```

**Limit output** to a specific number of bytes

```od -N [bytes] [file]```

**Show all data** without duplicate suppression

```od -v [file]```

**Dump as named characters** (ignoring high-order bit)

```od -a [file]```

# SYNOPSIS

**od** [_options_] [_file_...]

# PARAMETERS

_FILE_
> File(s) to dump. With no FILE, or when FILE is -, read standard input.

**-A** _RADIX_, **--address-radix**=_RADIX_
> Address radix: d (decimal), o (octal), x (hex), n (none)

**-t** _TYPE_, **--format**=_TYPE_
> Output type (a, c, d, f, o, u, x with optional size suffix)

**-a**
> Named characters, same as -t a

**-b**
> Octal bytes, same as -t o1

**-c**
> ASCII characters or backslash escapes, same as -t c

**-x**
> Two-byte hexadecimal, same as -t x2

**-j** _BYTES_, **--skip-bytes**=_BYTES_
> Skip BYTES input bytes first

**-N** _BYTES_, **--read-bytes**=_BYTES_
> Limit dump to BYTES input bytes

**-v**, **--output-duplicates**
> Do not use * to mark line suppression

**-w**[_BYTES_], **--width**[=_BYTES_]
> Output BYTES bytes per output line (default 32)

**-S** _BYTES_, **--strings**[=_BYTES_]
> Show only NUL-terminated strings of at least BYTES printable characters

**--endian**={big|little}
> Swap input bytes according to the specified byte order

# DESCRIPTION

**od** (octal dump) writes an unambiguous representation of its input to standard output. By default it displays data in octal, with each line showing an offset and the data values. The tool is useful for inspecting binary files, examining non-printable characters, and debugging data formats.

Duplicate lines in the output are replaced by a single **\*** character unless **-v** is used.

# CAVEATS

Default output is octal, which is less intuitive than hex for most modern use cases. BYTES arguments may be followed by size suffixes: b (512), KB (1000), K (1024), MB, M, etc. Part of GNU coreutils.

# HISTORY

od (octal dump) originated in **early Unix** (Version 1, 1971) for viewing file contents in octal representation.

# SEE ALSO

[hexdump](/man/hexdump)(1), [xxd](/man/xxd)(1), [hd](/man/hd)(1)

