# TAGLINE

Decompress zstd files to stdout

# TLDR

**Decompress to stdout**

```zstdcat [file.zst]```

**Decompress multiple files**

```zstdcat [file1.zst] [file2.zst]```

**Decompress and pipe to another command**

```zstdcat [file.zst] | grep [pattern]```

**Decompress with verbose output**

```zstdcat -v [file.zst]```

# SYNOPSIS

**zstdcat** [_options_] [_files_...]

# PARAMETERS

**-v**, **--verbose**
> Verbose mode. Display more information.

**-q**, **--quiet**
> Suppress warnings and notifications.

**--no-progress**
> Do not display the progress bar.

**-f**, **--force**
> Force overwrite and (de)compress symbolic links.

# DESCRIPTION

**zstdcat** decompresses Zstandard (.zst) compressed files and writes the output to standard output, equivalent to running **zstd -dcf**. This makes it useful for piping compressed data into other commands without creating intermediate decompressed files on disk.

When given multiple input files, zstdcat decompresses them in sequence and concatenates the output to stdout. It is part of the zstd suite of compression utilities.

# SEE ALSO

[zstd](/man/zstd)(1), [unzstd](/man/unzstd)(1), [zstdless](/man/zstdless)(1)
