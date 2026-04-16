# TAGLINE

file cache behavior control utility

# TLDR

**Suggest** a file will be needed soon (preload into cache)

```fadvise -a willneed [path/to/file]```

**Suggest dropping** a file from cache (default advice)

```fadvise [path/to/file]```

**Apply advice** to a specific byte range

```fadvise -a sequential -o [offset] -l [length] [path/to/file]```

**Apply advice** to an open file descriptor

```fadvise -a dontneed -d [fd]```

Display **help**

```fadvise -h```

# SYNOPSIS

**fadvise** [_options_] _file_

**fadvise** [_options_] **-d** _file-descriptor_

# DESCRIPTION

**fadvise** is a simple wrapper around the **posix_fadvise**(2) system call. It provides the kernel with a hint about how an application intends to access a file so that the kernel can optimize I/O behavior and page cache usage.

Useful for preloading files before heavy read workloads, or for dropping pages after a one-shot sequential read.

# PARAMETERS

**-a, --advice** _advice_
> Caching advice. One of: **normal**, **sequential**, **random**, **noreuse**, **willneed**, **dontneed**. Defaults to **dontneed**.

**-d, --fd** _fd_
> Apply advice to the given open file descriptor instead of a path.

**-o, --offset** _offset_
> Byte offset to start from (default 0).

**-l, --length** _length_
> Number of bytes to apply advice to (0 = entire file, default).

**-h, --help**
> Display help.

**-V, --version**
> Display version.

# CAVEATS

Part of util-linux. Advice is a hint to the kernel, not a command. Actual behavior depends on system memory pressure.

# SEE ALSO

[fincore](/man/fincore)(1), [vmtouch](/man/vmtouch)(1)

