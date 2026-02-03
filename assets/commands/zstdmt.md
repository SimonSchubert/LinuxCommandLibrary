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

**-k**
> Keep source files.

# DESCRIPTION

**zstdmt** is zstd with multithreading enabled by default. Compresses using multiple CPU cores for faster throughput. Equivalent to zstd -T0. Produces compatible output.

# SEE ALSO

[zstd](/man/zstd)(1), [zstdcat](/man/zstdcat)(1)

