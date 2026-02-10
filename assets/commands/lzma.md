# TAGLINE

compresses files using the Lempel-Ziv-Markov chain Algorithm

# TLDR

**Compress file**

```lzma [file]```

**Decompress file**

```lzma -d [file.lzma]```

**Keep original file**

```lzma -k [file]```

**Compress to stdout**

```lzma -c [file] > [file.lzma]```

**Set compression level**

```lzma -9 [file]```

**Test archive integrity**

```lzma -t [file.lzma]```

# SYNOPSIS

**lzma** [_options_] [_files_...]

# PARAMETERS

**-d**, **--decompress**
> Decompress.

**-z**, **--compress**
> Compress (default).

**-k**, **--keep**
> Keep original files.

**-c**, **--stdout**
> Write to stdout.

**-1** to **-9**
> Compression level.

**-e**, **--extreme**
> Maximum compression.

**-t**, **--test**
> Test integrity.

**-f**, **--force**
> Force overwrite.

# DESCRIPTION

**lzma** compresses files using the Lempel-Ziv-Markov chain Algorithm. It provides high compression ratios at the cost of slower compression speed.

The lzma command is typically a symlink to xz, which supports the legacy .lzma format alongside the newer .xz format.

# COMPARISON

```
Tool     Compression  Speed
gzip     Medium       Fast
bzip2    Good         Medium
lzma/xz  Best         Slow
```

# CAVEATS

Slower compression than gzip. High memory usage at extreme levels. Legacy format; prefer xz for new files.

# HISTORY

LZMA was developed by **Igor Pavlov** for the 7-Zip archiver in **1998**. The algorithm was later standardized and the xz format created as a modern container.

# SEE ALSO

[xz](/man/xz)(1), [gzip](/man/gzip)(1), [bzip2](/man/bzip2)(1), [7z](/man/7z)(1)
