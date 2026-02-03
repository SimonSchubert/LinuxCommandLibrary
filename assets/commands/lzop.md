# TLDR

**Compress file**

```lzop [file]```

**Decompress file**

```lzop -d [file.lzo]```

**Keep original file**

```lzop -k [file]```

**Compress with maximum compression**

```lzop -9 [file]```

**Test archive integrity**

```lzop -t [file.lzo]```

**Compress to stdout**

```lzop -c [file]```

# SYNOPSIS

**lzop** [_options_] [_file_...]

# PARAMETERS

**-d**, **--decompress**
> Decompress files.

**-k**, **--keep**
> Keep input files.

**-c**, **--stdout**
> Write to standard output.

**-t**, **--test**
> Test archive integrity.

**-1** to **-9**
> Compression level.

**-f**, **--force**
> Force overwrite.

# DESCRIPTION

**lzop** compresses files using the LZO library. Emphasizes speed over compression ratio. Very fast compression and decompression, suitable for real-time applications. Files have .lzo extension.

# SEE ALSO

[lzip](/man/lzip)(1), [gzip](/man/gzip)(1)

