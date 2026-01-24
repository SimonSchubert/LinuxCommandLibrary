# TLDR

**Compress file**

```lz4 [file]```

**Decompress file**

```lz4 -d [file.lz4]```

**Compress with high compression**

```lz4 -9 [file]```

**Compress keeping original**

```lz4 -k [file]```

**Compress to stdout**

```lz4 -c [file] > [file.lz4]```

**Test compressed file**

```lz4 -t [file.lz4]```

**Compress with fastest speed**

```lz4 -1 [file]```

**Decompress to stdout**

```lz4 -dc [file.lz4]```

# SYNOPSIS

**lz4** [_-d_] [_-k_] [_-# level_] [_-c_] [_options_] [_input_] [_output_]

# PARAMETERS

**-d**, **--decompress**
> Decompress.

**-z**, **--compress**
> Compress (default).

**-k**, **--keep**
> Keep source file.

**-c**, **--stdout**
> Write to stdout.

**-#** (1-12)
> Compression level (1=fastest, 12=best).

**-f**, **--force**
> Overwrite without prompt.

**-t**, **--test**
> Test compressed file integrity.

**-l**, **--list**
> List information about .lz4 files.

**-m**
> Multiple files mode.

**-r**
> Recursive mode.

**-B#**
> Block size (4-7, default 7=4MB).

**--content-size**
> Store original size in header.

**-v**, **--verbose**
> Verbose mode.

**-q**, **--quiet**
> Suppress warnings.

**--rm**
> Remove source file after operation.

# DESCRIPTION

**LZ4** is an extremely fast lossless compression algorithm. It prioritizes speed over compression ratio, making it ideal for real-time compression scenarios.

Compression speeds can exceed 500 MB/s per core, with decompression even faster at over 1 GB/s. This makes LZ4 suitable for scenarios where speed matters more than file size.

Higher compression levels (up to 12) trade speed for better ratios. Level 1 is fastest, default is 1. The HC (high compression) mode provides better ratios at slower speeds.

Block size affects both speed and ratio. Larger blocks improve compression but use more memory. The default 4MB block balances performance and memory usage.

LZ4 is widely used in databases (MySQL, PostgreSQL), filesystems (ZFS, Btrfs), and real-time applications. The frame format includes checksums for integrity verification.

# CAVEATS

Lower compression ratio than gzip/zstd. Not suitable when size is critical. Large blocks use more memory. Not all systems have lz4 installed by default. Frame format differs from raw LZ4 blocks.

# HISTORY

**LZ4** was developed by **Yann Collet** starting around **2011**. It was designed to be the fastest compression algorithm available while maintaining reasonable compression ratios. The algorithm and implementation are BSD-licensed, enabling widespread adoption in various projects.

# SEE ALSO

[zstd](/man/zstd)(1), [gzip](/man/gzip)(1), [pigz](/man/pigz)(1), [lzop](/man/lzop)(1)
