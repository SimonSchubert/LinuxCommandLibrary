# TLDR

**Decompress to stdout**

```zstdcat [file.zst]```

**Decompress multiple files**

```zstdcat [file1.zst] [file2.zst]```

# SYNOPSIS

**zstdcat** [_options_] [_files_...]

# DESCRIPTION

**zstdcat** decompresses zstd files to stdout. Equivalent to zstd -dc. Useful for piping compressed data without creating files. Supports multiple input files concatenated to stdout.

# SEE ALSO

[zstd](/man/zstd)(1), [zstdless](/man/zstdless)(1)

