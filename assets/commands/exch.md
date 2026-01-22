# TLDR

**Swap** filepaths of two files

```exch [path/to/file1] [path/to/file2]```

# SYNOPSIS

**exch** _file1_ _file2_

# DESCRIPTION

**exch** swaps the filepaths and filenames of two files. After the operation, file1 will have the contents that were at file2's path and vice versa.

Useful for quickly swapping configuration files or backups.

# PARAMETERS

_file1_
> First file to swap

_file2_
> Second file to swap

# CAVEATS

Both files must exist. Atomic operation using rename(). Files must be on the same filesystem.

# SEE ALSO

[mv](/man/mv)(1), [cp](/man/cp)(1)
