# TAGLINE

Multithreaded zstd compression

# TLDR

**Compress with multithreading**

```zstdmt [file]```

**Compress with specific threads**

```zstdmt -T[4] [file]```

**Decompress multithreaded**

```zstdmt -d [file.zst]```

**Maximum compression**

```zstdmt -19 [file]```

# SYNOPSIS

**zstdmt** [_options_] [_files_...]

# PARAMETERS

**-T** _n_
> Number of threads (0 = auto).

**-d**
> Decompress.

**-1** to **-19**
> Compression level.

**--ultra**
> Enable ultra mode (levels 20-22).

**-k**, **--keep**
> Keep source files (don't delete after compression).

**-c**, **--stdout**
> Write to standard output.

**-o** _FILE_
> Write output to FILE.

**-f**, **--force**
> Overwrite output without prompting.

**--rm**
> Remove source files after successful operation.

**-r**
> Operate recursively on directories.

**--long**[=_WINDOWLOG_]
> Enable long-range matching mode for improved compression ratio.

**-B** _SIZE_
> Set job size (each thread processes blocks of this size).

**--rsyncable**
> Produce rsync-friendly compressed output.

# DESCRIPTION

**zstdmt** is the multithreaded variant of the zstd compression utility. It automatically uses all available CPU cores for compression, equivalent to running **zstd -T0**, providing significantly faster throughput on multi-core systems.

The compressed output is fully compatible with standard zstd files and can be decompressed by any zstd-compatible tool. All standard zstd options for compression levels, decompression, and file handling are supported.

The number of threads can be set with the **ZSTD_NBTHREADS** environment variable. When **-T0** is used, the number of detected physical CPU cores is used, capped at 256 on 64-bit systems.

# SEE ALSO

[zstd](/man/zstd)(1), [zstdcat](/man/zstdcat)(1), [unzstd](/man/unzstd)(1)

