# TLDR

Display contents of **files** from squashfs

```sqfscat [filesystem.squashfs] [file1] [file2]```

Use **multiple processors**

```sqfscat -p [num_processors] [filesystem.squashfs] [file]```

Set **memory limit** for cache

```sqfscat -mem [512M] [filesystem.squashfs] [file]```

Skip **offset** bytes at filesystem start

```sqfscat -o [bytes] [filesystem.squashfs] [file]```

Ignore **write errors**

```sqfscat -ig [filesystem.squashfs] [file]```

# SYNOPSIS

**sqfscat** [_OPTIONS_] _FILESYSTEM_ [_files_...]

# PARAMETERS

**-v, -version**
> Display version and copyright

**-p, -processors** _number_
> Number of processors to use for decompression

**-mem** _size_
> Cache memory size (K/M/G suffixes; default: 512MB)

**-mem-percent** _percent_
> Set cache as percentage of physical memory

**-o, -offset** _bytes_
> Skip bytes at filesystem start

**-ig, -ignore-errors**
> Treat write errors as non-fatal

**-st, -strict-errors**
> Treat all errors as fatal

**-no-exit, -no-exit-code**
> Don't set non-zero exit code on non-fatal errors

**-no-wild, -no-wildcards**
> Disable wildcard matching in filenames

**-r, -regex**
> Treat filenames as POSIX regular expressions

**-h, -help**
> Display help summary

# DESCRIPTION

**sqfscat** outputs the contents of files from a squashfs filesystem to stdout, similar to how **cat** works on regular filesystems. Squashfs is a highly compressed read-only filesystem supporting gzip, xz, lzo, lz4, zstd, and lzma compression.

The tool allows extracting file contents without mounting the filesystem, useful for inspection, scripting, and embedded systems. Multiple files can be specified and their contents will be concatenated.

# EXIT STATUS

**0**: Successful operation
**1**: Fatal errors (corruption, I/O failures)
**2**: Non-fatal errors (invalid file types, path resolution issues)

# CAVEATS

Only works with squashfs filesystems. File paths within the squashfs are relative to its root. Large files may require significant memory for decompression. Read-only access only.

# HISTORY

**sqfscat** is part of **squashfs-tools**, created by **Phillip Lougher** starting in **2002**. Squashfs was merged into the Linux kernel mainline in version **2.6.29** (2009). The tools have evolved to support multiple compression algorithms and are widely used in live CDs, container images, and embedded systems.

# SEE ALSO

[unsquashfs](/man/unsquashfs)(1), [mksquashfs](/man/mksquashfs)(1), [sqfstar](/man/sqfstar)(1)
