# TAGLINE

LZMA2 compression utility

# TLDR

**Compress a file**

```xz [file]```

**Decompress a file**

```xz -d [file.xz]```

**Compress with maximum compression**

```xz -9 [file]```

**Compress keeping the original file**

```xz -k [file]```

**Compress to stdout** (for piping)

```xz -c [file] > [file.xz]```

**Decompress to stdout**

```xz -dc [file.xz]```

**List compressed file info**

```xz -l [file.xz]```

**Test compressed file integrity**

```xz -t [file.xz]```

# SYNOPSIS

**xz** [_options_] [_file_...]

# PARAMETERS

**-d**, **--decompress**
> Decompress files

**-z**, **--compress**
> Compress files (default)

**-k**, **--keep**
> Keep original file

**-c**, **--stdout**
> Write to stdout, keep original file

**-f**, **--force**
> Force compression/decompression

**-t**, **--test**
> Test compressed file integrity

**-l**, **--list**
> List information about compressed files

**-0** to **-9**
> Compression level (0=fast, 9=best compression)

**-e**, **--extreme**
> More compression (slower)

**-T** _N_, **--threads**=_N_
> Use N threads (0 = auto-detect cores)

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress warnings

# DESCRIPTION

**xz** is a general-purpose compression tool using the LZMA2 algorithm. It provides high compression ratios, often better than gzip and bzip2, though compression is slower.

By default, xz compresses files and replaces them with .xz versions. Use **-k** to keep originals or **-c** to write to stdout for pipelines.

Multi-threading support (**-T**) significantly speeds up compression on multi-core systems. Decompression is single-threaded but fast.

The compression level affects both ratio and memory usage. Level 9 requires significantly more memory than lower levels, both for compression and decompression.

# CAVEATS

High compression levels (7-9) use substantial memory. Level 9 may require over 600MB for compression and 65MB for decompression.

For archive distribution, consider xz's memory requirements on target systems. Lower compression levels are more universally usable.

xz format is not compatible with gzip or bzip2. Use appropriate tools (**gzip**, **bzip2**) for those formats.

# SEE ALSO

[gzip](/man/gzip)(1), [bzip2](/man/bzip2)(1), [zstd](/man/zstd)(1), [tar](/man/tar)(1), [xzcat](/man/xzcat)(1)
