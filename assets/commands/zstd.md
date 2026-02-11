# TAGLINE

Fast lossless compression algorithm

# TLDR

**Compress a file**

```zstd [file]```

**Decompress a file**

```zstd -d [file.zst]```

**Compress keeping original file**

```zstd -k [file]```

**Compress with maximum compression**

```zstd -19 [file]```

**Compress ultra** (highest compression)

```zstd --ultra -22 [file]```

**Compress with fastest speed**

```zstd -1 [file]```

**Compress to stdout**

```zstd -c [file] > [file.zst]```

**Decompress to stdout**

```zstd -dc [file.zst]```

**Compress with multiple threads**

```zstd -T0 [file]```

**Test archive integrity**

```zstd -t [file.zst]```

# SYNOPSIS

**zstd** [_options_] [_files_...]

# DESCRIPTION

**Zstandard** (zstd) is a fast lossless compression algorithm providing high compression ratios. It offers a wide range of compression/speed trade-offs, from ultra-fast to ultra-compression modes.

At similar compression ratios, zstd is typically faster than zlib/gzip and significantly faster than xz/lzma. Higher compression levels approach xz ratios while maintaining faster decompression.

zstd supports dictionary compression for small files, parallel compression, and can serve as a drop-in replacement for gzip in many workflows. The format is defined in RFC 8478.

# PARAMETERS

**-d**, **--decompress**
> Decompress files.

**-k**, **--keep**
> Keep source files.

**-c**, **--stdout**
> Write to stdout.

**-1** to **-19**
> Compression level (default 3).

**--ultra**
> Enable ultra compression (levels 20-22).

**-T** _n_, **--threads=** _n_
> Number of threads (0=auto).

**-t**, **--test**
> Test compressed file integrity.

**-l**, **--list**
> List compressed file information.

**-f**, **--force**
> Force overwrite/compression.

**-r**
> Recurse into directories.

**--rm**
> Remove source file after compression.

**-D** _dict_
> Use dictionary for compression.

**--train**
> Create dictionary from samples.

**-q**, **--quiet**
> Suppress output.

**-v**, **--verbose**
> Verbose mode.

# CAVEATS

Higher compression levels use more memory. Ultra levels (20-22) require significantly more memory. Dictionary compression requires same dictionary for decompression. Not all tools support .zst format yet.

# HISTORY

**Zstandard** was developed by **Yann Collet** at **Facebook** starting in **2015**, building on his earlier LZ4 work. It was released publicly in **2016** and became RFC 8478 in **2018**. Zstd has been adopted by the Linux kernel for compression, and is supported by tar, HTTP content-encoding, and numerous other tools.

# SEE ALSO

[gzip](/man/gzip)(1), [xz](/man/xz)(1), [lz4](/man/lz4)(1), [bzip2](/man/bzip2)(1)
