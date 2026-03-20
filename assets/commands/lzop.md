# TAGLINE

compresses files using the LZO library

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

**Compress and delete original file**

```lzop -U [file]```

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
> Compression level (default: -3).

**-f**, **--force**
> Force overwrite of existing files.

**-U**
> Delete input files after successful compression or decompression.

**-v**, **--verbose**
> Display the name for each file compressed or decompressed.

**-o** _FILE_, **--output=**_FILE_
> Write output to the specified file.

**-p** _DIR_, **--path=**_DIR_
> Write output files into the specified directory.

**-F**, **--no-checksum**
> Do not store or verify a checksum of the uncompressed data.

# DESCRIPTION

**lzop** compresses files using the LZO library. Emphasizes speed over compression ratio. Very fast compression and decompression, suitable for real-time applications. Files have .lzo extension.

# SEE ALSO

[gzip](/man/gzip)(1), [bzip2](/man/bzip2)(1), [lzip](/man/lzip)(1), [xz](/man/xz)(1), [zstd](/man/zstd)(1)

