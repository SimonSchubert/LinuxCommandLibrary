# TAGLINE

Hexadecimal dump and reverse tool

# TLDR

**Create a hex dump** of a file

```xxd [file]```

**Create a plain hex dump** (no line numbers or ASCII)

```xxd -p [file]```

**Create a binary dump** instead of hex

```xxd -b [file]```

**Dump only first N bytes**

```xxd -l [16] [file]```

**Start at a specific offset**

```xxd -s [0x100] [file]```

**Output as C include** array

```xxd -i [file]```

**Convert hex dump back to binary**

```xxd -r [hexdump.txt] [output.bin]```

**Convert plain hex** to binary

```echo "[48656c6c6f]" | xxd -r -p```

# SYNOPSIS

**xxd** [_options_] [_infile_ [_outfile_]]

# PARAMETERS

**-b**
> Binary digit dump instead of hexadecimal

**-c** _cols_
> Format output with specified columns per line (default: 16)

**-g** _bytes_
> Number of bytes per group (default: 2)

**-i**
> Output as C include file (array definition)

**-l** _len_
> Stop after outputting len bytes

**-p**, **-ps**, **-plain**
> Plain hexdump style (continuous hex without addresses)

**-r**, **-revert**
> Reverse operation: convert hexdump to binary

**-s** _seek_
> Start at specified offset in file

**-u**
> Use uppercase hexadecimal letters

**-e**
> Little-endian dump (group bytes are reversed)

# DESCRIPTION

**xxd** creates a hexadecimal dump of a file or standard input. The output shows the offset, hexadecimal values, and ASCII representation of the data. It can also reverse a hex dump back to the original binary.

The default output format shows 16 bytes per line with the file offset, hex values in groups of 2 bytes, and printable ASCII characters. The **-p** option produces a continuous hex string without formatting.

The **-i** option generates C source code with the data as an unsigned char array, useful for embedding binary data in programs.

The **-r** option reverses the process, converting a hex dump back to binary. Combined with **-p**, it can convert plain hex strings to binary data.

# VIM INTEGRATION

xxd integrates with vim for hex editing. In vim, use **:%!xxd** to convert buffer to hex dump, edit the hex values, then **:%!xxd -r** to convert back to binary.

# CAVEATS

When using **-r**, xxd is tolerant of missing or out-of-order lines if the output is seekable. Non-hex characters in the hex column are ignored during revert. The **-r** option requires properly formatted input matching xxd's output format (or plain hex with **-p**).

# HISTORY

**xxd** was written by **Juergen Weigert** and is distributed with **vim**. It was created as a more versatile alternative to traditional hex dump utilities like **od**. The tool has been part of the vim distribution since the mid-1990s and is commonly available on Unix-like systems.

# SEE ALSO

[od](/man/od)(1), [hexdump](/man/hexdump)(1), [hd](/man/hd)(1), [vim](/man/vim)(1)
