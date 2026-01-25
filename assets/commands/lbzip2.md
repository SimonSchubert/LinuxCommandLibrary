# TLDR

**Compress file**

```lbzip2 [file]```

**Decompress file**

```lbzip2 -d [file.bz2]```

**Use specific thread count**

```lbzip2 -n [4] [file]```

**Keep original file**

```lbzip2 -k [file]```

**Compress to stdout**

```lbzip2 -c [file] > [file.bz2]```

**Test archive integrity**

```lbzip2 -t [file.bz2]```

# SYNOPSIS

**lbzip2** [_options_] [_files_...]

# PARAMETERS

**-d**, **--decompress**
> Decompress.

**-z**, **--compress**
> Compress (default).

**-k**, **--keep**
> Keep input files.

**-c**, **--stdout**
> Output to stdout.

**-t**, **--test**
> Test integrity.

**-n** _threads_
> Number of threads.

**-1** to **-9**
> Compression level.

**-f**, **--force**
> Force overwrite.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**lbzip2** is a parallel bzip2 compressor and decompressor. It uses multiple CPU cores to compress and decompress files faster than standard bzip2.

lbzip2 produces output compatible with bzip2/bunzip2. It automatically uses available CPU cores, making it much faster on multicore systems.

# COMPARISON

```
bzip2   - Single-threaded
pbzip2  - Parallel, different archive format
lbzip2  - Parallel, fully compatible format
```

# CAVEATS

Higher memory usage than bzip2. Thread count affects memory. Compatible with bzip2 files. Default uses all cores.

# HISTORY

lbzip2 was written by **Mikolaj Izdebski** as a drop-in parallel replacement for bzip2 that maintains full compatibility with the original format.

# SEE ALSO

[bzip2](/man/bzip2)(1), [pbzip2](/man/pbzip2)(1), [pigz](/man/pigz)(1), [xz](/man/xz)(1)
