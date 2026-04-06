# TAGLINE

report on file fragmentation

# TLDR

Display **fragmentation report** for files

```filefrag [path/to/file1] [path/to/file2]```

Report using **1024 byte** blocksize

```filefrag -k [path/to/file]```

Report using **specific** blocksize

```filefrag -b[1024|1K|1M|1G] [path/to/file]```

**Sync** file before requesting mapping

```filefrag -s [path/to/file1] [path/to/file2]```

Display **verbose** report with extent details

```filefrag -v [path/to/file1] [path/to/file2]```

Display mapping of **extended attributes**

```filefrag -x [path/to/file1] [path/to/file2]```

Display extent block numbers in **hexadecimal**

```filefrag -X [path/to/file]```

Print **version** number

```filefrag -V```

# SYNOPSIS

**filefrag** [**-b** _blocksize_] [**-BeEkPsvVxX**] [_files..._]

# DESCRIPTION

**filefrag** reports on how badly fragmented a particular file might be. It shows the number of extents (contiguous blocks) for each file, which indicates fragmentation level. A file with 1 extent is not fragmented; more extents indicate higher fragmentation.

Useful for identifying files that may benefit from defragmentation.

# PARAMETERS

**-b** _blocksize_
> Use blocksize in bytes, or with [KMG] suffix, up to 1GB for output instead of the filesystem blocksize. If blocksize is unspecified it defaults to 1024 bytes. Must be added without any space after -b.

**-B**
> Force use of the older FIBMAP ioctl instead of the FIEMAP ioctl for testing purposes.

**-e**
> Print output in extent format, even for block-mapped files.

**-E**
> Display the contents of ext4's extent status cache. Only supported on ext4 filesystems.

**-k**
> Use 1024-byte blocksize for output (identical to '-b1024').

**-P**
> Pre-load the ext4 extent status cache for the file. Only supported on ext4 filesystems.

**-s**
> Sync the file before requesting the mapping.

**-v**
> Be verbose when checking for file fragmentation.

**-V**
> Print version number of program and library. If given twice, also print the FIEMAP flags understood by the current version.

**-x**
> Display mapping of extended attributes.

**-X**
> Display extent block numbers in hexadecimal format.

# CAVEATS

Part of e2fsprogs. Works best on ext2/ext3/ext4 but supports other filesystems via FIEMAP ioctl. The -E and -P options are ext4-specific and not supported on all kernels.

# SEE ALSO

[e4defrag](/man/e4defrag)(8), [debugfs](/man/debugfs)(8), [fsck](/man/fsck)(8)
