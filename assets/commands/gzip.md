# TLDR

**Compress a file**

```gzip [file]```

**Decompress a file**

```gzip -d [file.gz]```

**Compress keeping original file**

```gzip -k [file]```

**Compress with best compression**

```gzip -9 [file]```

**Compress with fastest speed**

```gzip -1 [file]```

**List compression information**

```gzip -l [file.gz]```

**Test compressed file integrity**

```gzip -t [file.gz]```

**Compress to stdout** (pipe)

```gzip -c [file] > [file.gz]```

**Decompress to stdout**

```gzip -dc [file.gz]```

# SYNOPSIS

**gzip** [_options_] [_files_...]

# DESCRIPTION

**gzip** compresses files using the Lempel-Ziv coding (LZ77) algorithm. Each file is replaced by a compressed version with a .gz extension, preserving ownership, modes, and timestamps.

By default, gzip removes the original file after compression. Compressed files can be restored using gzip -d (or gunzip). The tool can also compress data from stdin and write to stdout for pipeline use.

gzip is widely supported and commonly used for compressing individual files, creating archives with tar, and transferring data. The format is defined in RFC 1952.

# PARAMETERS

**-d**, **--decompress**
> Decompress files.

**-c**, **--stdout**
> Write to stdout, keep original files.

**-k**, **--keep**
> Keep original files.

**-l**, **--list**
> List compression info.

**-t**, **--test**
> Test integrity.

**-f**, **--force**
> Force compression/decompression.

**-r**, **--recursive**
> Recurse into directories.

**-n**, **--no-name**
> Don't save original name/timestamp.

**-N**, **--name**
> Save/restore original name/timestamp.

**-1** to **-9**
> Compression level (fast to best).

**--best**
> Maximum compression (-9).

**--fast**
> Fastest compression (-1).

**-v**, **--verbose**
> Verbose output.

**-q**, **--quiet**
> Suppress warnings.

# CAVEATS

Cannot compress directories directly (use tar first). Original file is removed by default unless -k is used. Links are followed (not compressed as links). gzip -r on directories compresses each file separately.

# HISTORY

**gzip** was written by **Jean-loup Gailly** and **Mark Adler** in **1992** as a free replacement for the Unix compress utility, which was encumbered by patents. The gzip format became the standard for file compression on Unix systems and is used by HTTP for content encoding. The underlying DEFLATE algorithm is also used in ZIP files and PNG images.

# SEE ALSO

[gunzip](/man/gunzip)(1), [zcat](/man/zcat)(1), [bzip2](/man/bzip2)(1), [xz](/man/xz)(1), [tar](/man/tar)(1)
