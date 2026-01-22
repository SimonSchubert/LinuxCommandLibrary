# TLDR

Print the **hexadecimal representation** of a file

```hexdump [path/to/file]```

Display offset and **ASCII representation** in canonical format

```hexdump -C [path/to/file]```

Display hex but interpret only **n bytes**

```hexdump -C -n [number_of_bytes] [path/to/file]```

**Don't replace** duplicate lines with '*'

```hexdump -v [path/to/file]```

# SYNOPSIS

**hexdump** [_options_] _file_...

# PARAMETERS

**-C**, **--canonical**
> Canonical hex+ASCII display (most common format)

**-n**, **--length** _LENGTH_
> Interpret only _LENGTH_ bytes of input

**-s**, **--skip** _OFFSET_
> Skip _OFFSET_ bytes from the beginning

**-v**, **--no-squeezing**
> Display all lines (don't compress identical lines)

**-e** _FORMAT_
> Specify custom format string

**-b**
> One-byte octal display

**-c**
> One-byte character display

**-d**
> Two-byte decimal display

**-o**
> Two-byte octal display

**-x**
> Two-byte hexadecimal display

# DESCRIPTION

**hexdump** displays file contents in hexadecimal, decimal, octal, or ASCII formats. It's essential for examining binary files, debugging data formats, and analyzing file structures.

The **-C** (canonical) format is most commonly used, showing offset, hex bytes, and ASCII representation side by side. By default, repeated identical lines are replaced with '*' to save space.

Custom format strings (**-e**) allow precise control over output format for scripting and automation.

# CAVEATS

Large files produce enormous output; use **-n** to limit. The default format isn't the most readable; use **-C** for practical inspection. For editing hex, consider tools like xxd or hexedit.

# HISTORY

hexdump originated in BSD Unix and is part of the util-linux package on Linux systems. It provides functionality similar to the older od (octal dump) command but with more flexible formatting options.

# SEE ALSO

[xxd](/man/xxd)(1), [od](/man/od)(1), [hexyl](/man/hexyl)(1), [strings](/man/strings)(1)
