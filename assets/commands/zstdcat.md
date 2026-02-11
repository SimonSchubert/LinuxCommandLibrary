# TAGLINE

Decompress zstd files to stdout

# TLDR

**Decompress to stdout**

```zstdcat [file.zst]```

**Decompress multiple files**

```zstdcat [file1.zst] [file2.zst]```

# SYNOPSIS

**zstdcat** [_options_] [_files_...]

# DESCRIPTION

**zstdcat** decompresses Zstandard (.zst) compressed files and writes the output to standard output, equivalent to running **zstd -dc**. This makes it useful for piping compressed data into other commands without creating intermediate decompressed files on disk.

When given multiple input files, zstdcat decompresses them in sequence and concatenates the output to stdout. It is part of the zstd suite of compression utilities.

# SEE ALSO

[zstd](/man/zstd)(1), [zstdless](/man/zstdless)(1)

