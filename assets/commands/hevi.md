# TAGLINE

Hex viewer with syntax highlighting

# TLDR

**View a file** in hex

```hevi [path/to/file]```

**Read from stdin**

```cat [path/to/file] | hevi```

**Disable colored output**

```hevi --no-color [path/to/file]```

**Use uppercase hex digits**

```hevi --uppercase [path/to/file]```

**Force a specific parser** (e.g. elf, pe)

```hevi --parser [elf] [path/to/file]```

**Raw mode** (disable size, offset, ASCII columns)

```hevi --raw [path/to/file]```

**Show the active color palette**

```hevi --show-palette```

# SYNOPSIS

**hevi** _file_ [_flags_]

# DESCRIPTION

**hevi** (pronounced like "heavy") is a hex viewer similar to **xxd** or **hexdump**, with the added ability to parse structured file formats like **ELF** and **PE** executables and provide **syntax highlighting** for recognized sections. This makes it easier to visually identify headers, sections, and data regions in binary files.

Custom color palettes can be specified using standard ANSI colors or truecolor. The viewer displays offset addresses, hexadecimal values, and ASCII representation in a clean, colored layout. Behavior can be controlled via flags, a config file, or environment variables (including **NO_COLOR**), with flags taking precedence.

# PARAMETERS

**-h**, **--help**
> Show help

**-v**, **--version**
> Print version

**--color**, **--no-color**
> Enable or disable colored output

**--lowercase**, **--uppercase**
> Choose the case of hex digits

**--size**, **--no-size**
> Show or hide the size column

**--offset**, **--no-offset**
> Show or hide the offset column

**--ascii**, **--no-ascii**
> Show or hide the ASCII representation

**--skip-lines**, **--no-skip-lines**
> Collapse or keep repeated identical lines

**--raw**
> Raw output, disabling most decorations

**--parser** _NAME_
> Force the specified file-format parser (e.g. elf, pe)

**--show-palette**
> Print the active color palette and exit

# CAVEATS

Read-only viewer; cannot edit files. Format parsing is limited to supported file types (ELF, PE). Custom color palettes require a terminal with truecolor support for full fidelity.

# HISTORY

**hevi** was created by **Arnau478** and is written in **Zig**. It was designed to improve upon traditional hex viewers by adding structural awareness of common binary formats.

# SEE ALSO

[hexyl](/man/hexyl)(1), [xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1), [readelf](/man/readelf)(1)
