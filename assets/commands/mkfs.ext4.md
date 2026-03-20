# TAGLINE

Create an ext4 filesystem on a device

# TLDR

Create **ext4** filesystem

```sudo mkfs.ext4 /dev/sdXY```

Create with **volume label**

```sudo mkfs.ext4 -L [label] /dev/sdXY```

Create with **reduced reserved blocks** (1% instead of 5%)

```sudo mkfs.ext4 -m [1] /dev/sdXY```

Create with **specific block size**

```sudo mkfs.ext4 -b [4096] /dev/sdXY```

Create with **specific owner** and UUID

```sudo mkfs.ext4 -E root_owner=[uid]:[gid] -U [uuid] /dev/sdXY```

**Quiet** creation (for scripts)

```sudo mkfs.ext4 -q /dev/sdXY```

# SYNOPSIS

**mkfs.ext4** [_options_] _device_ [_blocks-count_]

# DESCRIPTION

**mkfs.ext4** creates an ext4 filesystem on a device. ext4 is the default Linux filesystem, offering journaling, large file support, and excellent performance. It is equivalent to **mke2fs -t ext4**.

# PARAMETERS

**-L** _LABEL_
> Set volume label (max 16 characters).

**-b** _BLOCKSIZE_
> Set block size in bytes (1024, 2048, or 4096).

**-m** _PERCENT_
> Reserved blocks percentage for super-user (default: 5%).

**-i** _BYTES_PER_INODE_
> Set bytes per inode ratio.

**-N** _INODES_
> Set number of inodes.

**-U** _UUID_
> Set filesystem UUID.

**-E** _OPTIONS_
> Extended options (comma-separated), e.g. root_owner=uid:gid, discard, stride=N, stripe-width=N.

**-O** _FEATURES_
> Set filesystem features (comma-separated), e.g. ^has_journal, extent, dir_index.

**-T** _USAGE_TYPE_
> Specify usage type (e.g. largefile, largefile4, news, small) to set default parameters.

**-c**
> Check the device for bad blocks before creating the filesystem.

**-cc**
> Perform a slower, destructive read-write bad blocks test.

**-n**
> Dry run; show what would be done without creating the filesystem.

**-F**
> Force creation even if the device is not a block special device or appears in use.

**-q**
> Quiet execution.

# CAVEATS

All data on device will be lost. Part of e2fsprogs package. Default reserved blocks (5%) can be reduced for non-root filesystems with **-m**. Use **-F** twice to force creation on a mounted device. Equivalent to **mke2fs -t ext4**.

# SEE ALSO

[mkfs](/man/mkfs)(8), [tune2fs](/man/tune2fs)(8), [e2fsck](/man/e2fsck)(8), [mke2fs](/man/mke2fs)(8)
