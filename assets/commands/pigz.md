# TLDR

**Compress file using multiple processors**

```pigz [file]```

**Decompress file**

```pigz -d [file.gz]```

**Compress with specific compression level**

```pigz -[9] [file]```

**Compress keeping original file**

```pigz -k [file]```

**Compress with specific number of threads**

```pigz -p [4] [file]```

**Compress to stdout**

```pigz -c [file] > [file.gz]```

**Compress all files in directory**

```pigz [*.log]```

**Test compressed file integrity**

```pigz -t [file.gz]```

# SYNOPSIS

**pigz** [_-dkcp_] [_-# level_] [_-p threads_] [_files_]

# PARAMETERS

**-d**, **--decompress**
> Decompress.

**-k**, **--keep**
> Keep original file.

**-c**, **--stdout**
> Write to stdout.

**-p** _NUM_, **--processes** _NUM_
> Number of compression threads.

**-#** (0-9, 11)
> Compression level (6 default, 11 = zopfli).

**-f**, **--force**
> Force compression even if file exists.

**-r**, **--recursive**
> Process directories recursively.

**-t**, **--test**
> Test compressed file integrity.

**-l**, **--list**
> List compression info.

**-n**, **--no-name**
> Don't store original name/time.

**-N**, **--name**
> Store original name/time.

**-b** _SIZE_, **--blocksize** _SIZE_
> Block size for compression.

**-z**, **--zlib**
> Compress to zlib format.

**-K**, **--zip**
> Compress to single-entry zip.

**-q**, **--quiet**
> Quiet mode.

**-v**, **--verbose**
> Verbose mode.

# DESCRIPTION

**pigz** (Parallel Implementation of GZip) compresses files using multiple processors. It produces gzip-compatible output significantly faster than standard gzip on multi-core systems.

Compression is parallelized by dividing input into blocks processed by separate threads. The results are combined maintaining gzip compatibility. Decompression is less parallelizable but still benefits from parallel CRC checking.

The default thread count matches available processors. On high-core systems, diminishing returns may occur beyond 8-16 threads. Block size affects parallelism granularity.

Compression levels work like gzip: 1 (fastest) to 9 (best). Level 11 enables zopfli compression for maximum compression at much slower speed, useful for files compressed once and served many times.

The tool is a drop-in replacement for gzip in most scenarios. Output format is identical, so files can be decompressed with standard gunzip.

# CAVEATS

Decompression is not fully parallel - limited by gzip format design. Memory usage increases with thread count. Very small files may not benefit from parallelization. Zopfli mode (level 11) is extremely slow. Compressed output may differ from gzip (same content, different bytes).

# HISTORY

**pigz** was written by **Mark Adler** (co-creator of gzip and zlib) around **2007** to address the need for parallel compression. The name is a play on "pig" (parallel implementation of gzip) and the sound pigs make. It became essential for fast compression of large files on modern multi-core systems.

# SEE ALSO

[gzip](/man/gzip)(1), [zstd](/man/zstd)(1), [lz4](/man/lz4)(1), [pbzip2](/man/pbzip2)(1)
