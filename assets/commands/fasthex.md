# TAGLINE

High-performance hexadecimal file dumper

# TLDR

**Dump a file** in canonical hex + ASCII format

```fasthex [path/to/file]```

**Skip the first 1 KiB** and read only 512 bytes

```fasthex -s 1KiB -n 512 [path/to/file]```

**Force colored output**

```fasthex --color=always [path/to/file]```

**Show binary bits** per byte instead of hex

```fasthex -b [path/to/file]```

**Convert a hex dump back** to binary

```fasthex -r [hexdump.txt]```

**Install** from the GitHub repository

```cargo install --git https://github.com/CallMeAlphabet/fasthex```

# SYNOPSIS

**fasthex** [_options_] [_file_ ...]

# PARAMETERS

**-s**, **--skip** _size_
> Skip the first _size_ bytes; negative values count from end of file.

**-n**, **--length** _size_
> Read at most _size_ bytes.

**-x**, **--hex**
> One-byte hexadecimal display.

**-X**, **--hex-wide**
> Two-byte hexadecimal display.

**-o**, **--octal** / **-O**, **--octal-wide**
> Octal display (one- or two-byte mode).

**-d**, **--decimal** / **-D**, **--decimal-wide**
> Decimal display (one- or two-byte mode).

**-b**, **--binary**
> Binary display (8 bits per byte).

**-p**, **--plain**
> Plain hex string without offset or ASCII panel.

**-r**, **--reverse**
> Convert a hex dump back to binary.

**-i**, **--include**
> C include-file style output.

**-W**, **--width** _N_
> Bytes per row (default: 16).

**-g**, **--group** _N_
> Bytes per group: 1, 2, 4, or 8.

**-A**, **--no-ascii**
> Hide the ASCII panel.

**-w**, **--squeeze**
> Replace consecutive identical rows with **\***.

**-L**, **--color** _WHEN_
> Color mode: **auto**, **always**, or **never**.

**-h**, **--help**
> Show help and exit.

**-v**, **--version**
> Print version and exit.

# DESCRIPTION

**fasthex** is a Rust hex dumper optimized for throughput on large files. It uses memory mapping, SIMD formatting (AVX2 with SSE4.1/SSSE3 and scalar fallbacks), parallel chunk processing via rayon, and zero-copy kernel pipe output when possible.

With no file argument, fasthex reads from standard input. Multiple files are concatenated into one stream. Size suffixes such as **KiB**, **MiB**, and **GiB** are accepted for skip and length options.

# CAVEATS

fasthex is distributed via **cargo install** and is not typically packaged by Linux distributions. SIMD paths depend on CPU features; very old hardware may use slower scalar formatting. Reverse mode expects input compatible with the selected output format.

# HISTORY

**fasthex** was written in **Rust** by **CallMeAlphabet** and published in **2026** as a performance-focused alternative to **xxd**, **hexdump**, and **hexyl** for inspecting large binaries and disk images.

# SEE ALSO

[xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1), [hexyl](/man/hexyl)(1), [od](/man/od)(1)

# RESOURCES

```[Source code](https://github.com/CallMeAlphabet/fasthex)```

<!-- verified: 2026-07-02 -->