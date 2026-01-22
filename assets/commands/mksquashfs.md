# TLDR

Create a **squashfs filesystem** from files and directories

```mksquashfs [path/to/source1] [path/to/source2] [filesystem.squashfs]```

Create squashfs using a specific **compression algorithm**

```mksquashfs [path/to/source] [filesystem.squashfs] -comp [gzip|lzo|lz4|xz|zstd]```

**Exclude** specific files or directories

```mksquashfs [path/to/source] [filesystem.squashfs] -e [file_or_dir1] [file_or_dir2]```

Exclude files matching **wildcard pattern**

```mksquashfs [path/to/source] [filesystem.squashfs] -wildcards -e "[*.gz]"```

Exclude files matching **regex pattern**

```mksquashfs [path/to/source] [filesystem.squashfs] -regex -e "[pattern]"```

Set custom **block size** (default 128KB, max 1MB)

```mksquashfs [path/to/source] [filesystem.squashfs] -b [256K]```

# SYNOPSIS

**mksquashfs** _source1_ [_source2_...] _filesystem_ [**-comp** _method_] [**-b** _blocksize_] [**-e** _excludes_] [_options_]

# PARAMETERS

**-comp _method_**
> Compression algorithm: gzip (default), lzo, lz4, xz, zstd, lzma

**-b _size_**
> Data block size; default 128KB, maximum 1MB

**-e _items_**
> Exclude specified files and directories

**-wildcards**
> Enable glob pattern matching for exclusions

**-regex**
> Use POSIX regular expressions for exclusions

**-all-root**
> Make all files owned by root

**-force-uid _user_**
> Override file owner user

**-force-gid _group_**
> Override file owner group

**-processors _num_**
> Number of compression threads

**-mem _size_**
> Set cache memory size

**-noI**
> Disable inode compression

**-noD**
> Disable data compression

**-noF**
> Disable fragment compression

**-xattrs**
> Store extended attributes (default)

**-no-xattrs**
> Do not store extended attributes

**-tar**
> Read uncompressed tar archive from stdin

**-quiet**
> Suppress verbose output

**-progress**
> Display progress bar

# DESCRIPTION

**mksquashfs** creates and appends to squashfs filesystems. Squashfs is a highly compressed, read-only filesystem commonly used for live CDs, embedded systems, and application packaging (AppImage, snap).

The tool compresses files, inodes, and directories using configurable algorithms. It supports deduplication, extended attributes, and efficient storage of sparse files. Block compression allows random access to compressed data.

# CAVEATS

Squashfs filesystems are read-only and require the squashfs kernel module. Appending to existing archives may increase fragmentation. Very high compression levels significantly increase creation time. Maximum file size depends on block size configuration.

# HISTORY

**Squashfs** was created by **Phillip Lougher** and first released in **2002**. It was merged into the Linux kernel mainline in version **2.6.29 (2009)**. The filesystem is widely used in Linux distributions for live media, container images, and read-only root filesystems.

# SEE ALSO

[unsquashfs](/man/unsquashfs)(1), [sqfscat](/man/sqfscat)(1), [mount](/man/mount)(8)
