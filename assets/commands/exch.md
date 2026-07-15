# TAGLINE

utility to swap two file paths

# TLDR

**Swap** filepaths of two files

```exch [path/to/file1] [path/to/file2]```

# SYNOPSIS

**exch** _file1_ _file2_

# PARAMETERS

_file1_
> First file to swap

_file2_
> Second file to swap

# DESCRIPTION

**exch** atomically exchanges two paths. After the operation, file1 refers to what was at file2's path and vice versa. It is a thin wrapper around the **RENAME_EXCHANGE** flag of the **renameat2**(2) system call.

Part of the **util-linux** package. Useful for quickly swapping configuration files, symlinks, or backups without an intermediate temporary name.

# CAVEATS

Both files must exist. The exchange is atomic (no window where either name is missing), unlike a three-step mv dance. Requires **renameat2**(2) with RENAME_EXCHANGE, so it is Linux-only and both paths must reside on the same filesystem. Added in util-linux 2.41.

# SEE ALSO

[mv](/man/mv)(1), [cp](/man/cp)(1), [rename](/man/rename)(1)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

```[Documentation](https://man7.org/linux/man-pages/man1/exch.1.html)```

<!-- verified: 2026-07-15 -->
