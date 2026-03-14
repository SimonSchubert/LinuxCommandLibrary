# TAGLINE

Long-range compression for large files

# TLDR

**Compress a file (removes original)**

```rzip [file]```

**Compress keeping original**

```rzip -k [file]```

**Decompress a file**

```rzip -d [file.rz]```

**Set maximum compression level**

```rzip -9 [file]```

**Compress with progress display**

```rzip -P [file]```

**Compress to a specific output file**

```rzip -o [output.rz] [file]```

**Force overwrite of existing files**

```rzip -f [file]```

# SYNOPSIS

**rzip** [_options_] _files_...

# PARAMETERS

**-d**
> Decompress. Automatically set if the program is invoked as `runzip`.

**-k**
> Keep input files after compression or decompression.

**-f**
> Force overwrite of existing output files.

**-o** _filename_
> Specify output file name. Cannot be used with multiple input files.

**-S** _suffix_
> Set the compression suffix. Default is `.rz`.

**-P**
> Show percentage progress while compressing.

**-0** to **-9**
> Compression level from fastest (0) to best (9). Default is 6.

**-V**
> Show version number.

**-h**
> Print a help summary.

# DESCRIPTION

**rzip** is a compression program designed for large files. It operates in two stages: first, it finds and encodes large chunks of duplicated data over potentially very long distances (up to nearly a gigabyte) using a rolling-checksum algorithm similar to rsync. Second, it uses bzip2 to compress the output of the first stage.

The long-range matching makes rzip particularly effective on files with repeated content spread far apart, which standard compressors cannot exploit.

# CAVEATS

High memory usage proportional to file size. Cannot compress or decompress from standard input or standard output due to the nature of the algorithm. Best suited for files larger than 10 MB. Deletes the source file by default after successful compression or decompression (use -k to keep).

# HISTORY

rzip was written by **Andrew Tridgell** (author of rsync and Samba) to efficiently compress large files with long-distance redundancy.

# SEE ALSO

[lrzip](/man/lrzip)(1), [bzip2](/man/bzip2)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1), [rsync](/man/rsync)(1)
