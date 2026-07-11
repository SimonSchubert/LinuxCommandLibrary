# TAGLINE

High-performance hex dumper

# TLDR

**Display a file as a hex dump**

```fasthex [path/to/file]```

**Pipe output to a file**

```fasthex [path/to/file] > [output.txt]```

**Skip bytes and read a limited length**

```fasthex -s 1KiB -n 512 [path/to/file]```

**Display with colors**

```fasthex --color=always [path/to/file]```

**Show binary representation**

```fasthex -b [path/to/file]```

# SYNOPSIS

**fasthex** [_options_] [_file_...]

# PARAMETERS

**-s**, **--skip** _N_
> Skip first N bytes (negative counts from end). Supports KiB, MiB, GiB suffixes.

**-n**, **--length** _N_
> Read only N bytes.

**-W**, **--width** _N_
> Bytes per row. Default: 16.

**-g**, **--group** _N_
> Bytes per group: 1, 2, 4, or 8.

**-x**, **--hex**
> One-byte hexadecimal display.

**-b**, **--binary**
> Binary display (8 bits per byte).

**-A**, **--no-ascii**
> Hide the ASCII panel.

**-L**, **--color** _WHEN_
> Color mode: auto, always, or never.

**-w**, **--squeeze**
> Replace identical consecutive rows with **\***.

**-r**, **--reverse**
> Convert a hex dump back to binary.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# DESCRIPTION

**fasthex** is a Rust hex dumper optimized for speed on large files. It memory-maps input and formats output in parallel using SIMD (AVX2, SSE4.1, or scalar fallback), with double-buffered I/O and zero-copy kernel pipe transfers when possible.

Multiple files are concatenated as one stream. With no file argument, **fasthex** reads from stdin. Output follows the classic offset / hex bytes / ASCII layout familiar from **xxd** and **hexdump**, with additional format modes (octal, decimal, plain hex string, C include style) and configurable endianness, borders, and color schemes.

# CAVEATS

Install via **cargo install --git**; there are no published crate releases yet. Color output to a TTY may use a slower path than piping to a file or **/dev/null**.

# SEE ALSO

[xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1), [hexyl](/man/hexyl)(1)

# RESOURCES

```[Source code](https://github.com/CallMeAlphabet/fasthex)```

<!-- verified: 2026-07-11 -->