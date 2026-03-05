# TAGLINE

Hex viewer with syntax highlighting

# TLDR

**View a file** in hex

```hevi [path/to/file]```

**View with a specific number of columns**

```hevi -c [16] [path/to/file]```

**Read from stdin**

```cat [path/to/file] | hevi```

# SYNOPSIS

**hevi** [_options_] [_file_]

# DESCRIPTION

**hevi** (pronounced like "heavy") is a hex viewer similar to **xxd** or **hexdump**, with the added ability to parse structured file formats like **ELF** and **PE** executables and provide **syntax highlighting** for recognized sections. This makes it easier to visually identify headers, sections, and data regions in binary files.

Custom color palettes can be specified using standard ANSI colors or truecolor. The viewer displays offset addresses, hexadecimal values, and ASCII representation in a clean, colored layout.

# CAVEATS

Read-only viewer; cannot edit files. Format parsing is limited to supported file types (ELF, PE). Custom color palettes require a terminal with truecolor support for full fidelity.

# HISTORY

**hevi** was created by **Arnau478** and is written in **Zig**. It was designed to improve upon traditional hex viewers by adding structural awareness of common binary formats.

# SEE ALSO

[hexyl](/man/hexyl)(1), [xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1), [readelf](/man/readelf)(1)
