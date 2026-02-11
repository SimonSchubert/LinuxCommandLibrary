# TAGLINE

Shrink or extend file size

# TLDR

**Set a file to a specific size** (creates if doesn't exist)

```truncate -s [100M] [file]```

**Empty a file** (set size to zero)

```truncate -s 0 [file]```

**Shrink a file by** a specific amount

```truncate -s -[10K] [file]```

**Extend a file by** a specific amount

```truncate -s +[50M] [file]```

**Set file to same size** as another file

```truncate -r [reference_file] [target_file]```

**Create a sparse file** of a specific size

```truncate -s [1G] [sparse_file]```

# SYNOPSIS

**truncate** [_-c_] [_-o_] **-s** _SIZE_ _FILE..._

**truncate** [_-c_] [_-o_] **-r** _RFILE_ _FILE..._

# PARAMETERS

**-s** _SIZE_, **--size**=_SIZE_
> Set or adjust file size to SIZE bytes

**-c**, **--no-create**
> Do not create files that don't exist

**-o**, **--io-blocks**
> Treat SIZE as number of IO blocks instead of bytes

**-r** _RFILE_, **--reference**=_RFILE_
> Use RFILE's size as the reference size

**--help**
> Display help information

**--version**
> Display version information

# SIZE SUFFIXES

SIZE may be specified with the following suffixes:

**K** - Kilobytes (1024 bytes)

**M** - Megabytes (1024 K)

**G** - Gigabytes (1024 M)

**T** - Terabytes (1024 G)

**KB** - 1000 bytes

**MB** - 1000 KB

**GB** - 1000 MB

SIZE may also be prefixed with **+** to extend or **-** to shrink by that amount.

# DESCRIPTION

**truncate** shrinks or extends the size of each FILE to the specified size. If a FILE does not exist, it is created. If a FILE is larger than the specified size, the extra data is lost. If a FILE is shorter, it is extended with zero bytes (creating a sparse file on most filesystems).

The command is useful for creating test files of specific sizes, clearing log files without deleting them (preserving permissions and ownership), and creating sparse files for disk image allocation or database pre-allocation.

When truncating a file, data beyond the new size is permanently lost. When extending, the file becomes a sparse file where the extended portion doesn't actually consume disk space until data is written to it.

# CAVEATS

Truncating a file being written to by another process can cause data corruption or application errors. The **-s 0** operation is faster than **rm** followed by **touch** for clearing files while maintaining ownership and permissions. Sparse file behavior depends on the filesystem; not all filesystems support sparse files. Extended regions read as zeros but may consume actual space on copy to non-sparse-aware systems.

# HISTORY

The **truncate** command is part of **GNU Coreutils** and has been available on Linux systems for many years. The underlying **ftruncate()** system call has been part of POSIX since the beginning, but the command-line utility provides convenient access to this functionality. On BSD systems, a similar **truncate** command exists with slightly different syntax. The GNU version became the standard on most Linux distributions.

# SEE ALSO

[dd](/man/dd)(1), [fallocate](/man/fallocate)(1), [touch](/man/touch)(1), [stat](/man/stat)(1), [rm](/man/rm)(1)
