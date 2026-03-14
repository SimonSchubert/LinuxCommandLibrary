# TAGLINE

Decompress bzip2 compressed files

# TLDR

**Decompress** a file (removes the .bz2 original)

```bunzip2 [file.txt.bz2]```

**Decompress** keeping the compressed file

```bunzip2 -k [file.txt.bz2]```

**Decompress** to stdout (useful for piping)

```bunzip2 -c [file.txt.bz2] > [file.txt]```

**Test** file integrity without decompressing

```bunzip2 -t [file.txt.bz2]```

**Force** overwrite of existing output files

```bunzip2 -f [file.txt.bz2]```

# SYNOPSIS

**bunzip2** [_options_] [_file_...]

# DESCRIPTION

**bunzip2** decompresses files compressed with bzip2. It's equivalent to `bzip2 -d` and removes the .bz2 file after successful decompression.

The tool is a companion to bzip2 for extracting compressed files.

# PARAMETERS

**-k**, **--keep**
> Keep compressed file

**-f**, **--force**
> Overwrite existing files

**-c**, **--stdout**
> Write to standard output

**-t**, **--test**
> Test file integrity

**-v**, **--verbose**
> Verbose mode

**-q**, **--quiet**
> Suppress warnings

**-s**, **--small**
> Reduce memory usage at the cost of speed (uses about 2.5 MB per file)

# CAVEATS

Removes original .bz2 file unless -k used. Requires memory proportional to compression block size. Cannot decompress corrupted files.

# HISTORY

**bunzip2** was included with bzip2 since its creation by Julian Seward in **1996**.

# SEE ALSO

[bzip2](/man/bzip2)(1), [bzcat](/man/bzcat)(1), [gunzip](/man/gunzip)(1), [xz](/man/xz)(1)
