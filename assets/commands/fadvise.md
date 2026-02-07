# TAGLINE

file cache behavior control utility

# TLDR

**Preload** a file or directory into cache

```fadvise [-a|--advice] willneeded [path/to/file_or_directory]```

**Suggest dropping** a file from cache

```fadvise [path/to/file]```

Display **help**

```fadvise [-h|--help]```

# SYNOPSIS

**fadvise** [_options_] _files_

# DESCRIPTION

**fadvise** controls Linux file caching behavior using the posix_fadvise() system call. It can preload files into cache or suggest the kernel drop files from cache.

Useful for optimizing I/O performance and managing memory usage.

# PARAMETERS

**-a, --advice** _advice_
> Caching advice: willneeded, dontneed, noreuse

**-h, --help**
> Display help

# CAVEATS

Part of util-linux. Advice is a hint to the kernel, not a command. Actual behavior depends on system memory pressure.

# SEE ALSO

[fincore](/man/fincore)(1), [vmtouch](/man/vmtouch)(1)
