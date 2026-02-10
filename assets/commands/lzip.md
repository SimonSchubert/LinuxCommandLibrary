# TAGLINE

lossless data compressor using the LZMA algorithm

# TLDR

**Compress file**

```lzip [file]```

**Decompress file**

```lzip -d [file.lz]```

**Compress with maximum compression**

```lzip -9 [file]```

**Keep original file**

```lzip -k [file]```

**Test archive integrity**

```lzip -t [file.lz]```

**Compress to stdout**

```lzip -c [file] > [output.lz]```

# SYNOPSIS

**lzip** [_options_] [_file_...]

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
> Compression level (default 6).

**-v**, **--verbose**
> Verbose mode.

# DESCRIPTION

**lzip** is a lossless data compressor using the LZMA algorithm. Provides high compression ratios similar to xz but with a simpler format. Files have .lz extension. Designed for long-term archival.

# SEE ALSO

[xz](/man/xz)(1), [gzip](/man/gzip)(1), [lzop](/man/lzop)(1)

