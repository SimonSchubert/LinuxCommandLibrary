# TAGLINE

View zstd compressed files with pager

# TLDR

**View zstd compressed file**

```zstdless [file.zst]```

# SYNOPSIS

**zstdless** [_files_...]

# DESCRIPTION

**zstdless** allows viewing of Zstandard (.zst) compressed files using the **less** pager. It decompresses the file on the fly and pipes the output to less, providing the full interactive navigation experience including forward and backward scrolling, searching, and line jumping.

This is particularly useful for browsing compressed log files and data without needing to decompress them to disk first. It is part of the zstd suite of compression utilities.

# SEE ALSO

[zstd](/man/zstd)(1), [zstdcat](/man/zstdcat)(1), [less](/man/less)(1)

