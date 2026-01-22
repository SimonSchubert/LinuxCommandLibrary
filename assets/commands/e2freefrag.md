# TLDR

Check **free space fragmentation**

```e2freefrag [/dev/sdXN]```

Check with specific **chunk size**

```e2freefrag -c [chunk_size_in_kb] [/dev/sdXN]```

# SYNOPSIS

**e2freefrag** [_options_] _device_

# DESCRIPTION

**e2freefrag** prints free space fragmentation information for ext2/ext3/ext4 filesystems. It shows how many free blocks are available as contiguous and aligned free space.

Useful for analyzing filesystem health and determining if defragmentation might help.

# PARAMETERS

**-c** _size_
> Chunk size in KB for histogram

_device_
> Filesystem device to analyze

# CAVEATS

Filesystem should be unmounted or mounted read-only for accurate results. Part of e2fsprogs package.

# SEE ALSO

[e4defrag](/man/e4defrag)(8), [dumpe2fs](/man/dumpe2fs)(8), [e2fsck](/man/e2fsck)(8)
