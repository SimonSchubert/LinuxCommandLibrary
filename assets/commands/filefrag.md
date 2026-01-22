# TLDR

Display **fragmentation report** for files

```filefrag [path/to/file1] [path/to/file2]```

Report using **1024 byte** blocksize

```filefrag -k [path/to/file]```

Report using **specific** blocksize

```filefrag -b[1024|1K|1M|1G] [path/to/file]```

**Sync** file before requesting mapping

```filefrag -s [path/to/file1] [path/to/file2]```

Display mapping of **extended attributes**

```filefrag -x [path/to/file1] [path/to/file2]```

Display **verbose** report

```filefrag -v [path/to/file1] [path/to/file2]```

# SYNOPSIS

**filefrag** [_options_] _files_

# DESCRIPTION

**filefrag** reports how badly fragmented files are on the filesystem. It shows the number of extents (contiguous blocks) for each file, which indicates fragmentation level.

Useful for identifying files that may benefit from defragmentation.

# PARAMETERS

**-b** _blocksize_
> Use specified block size

**-k**
> Use 1024-byte blocksize

**-s**
> Sync file before mapping

**-v**
> Verbose output with details

**-x**
> Show extended attribute mappings

# CAVEATS

Part of e2fsprogs. Works best on ext2/ext3/ext4 but supports other filesystems. Number of extents indicates fragmentation level.

# SEE ALSO

[e4defrag](/man/e4defrag)(8), [xfs_bmap](/man/xfs_bmap)(8)
