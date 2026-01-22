# TLDR

Create **ext4** filesystem

```sudo mkfs.ext4 /dev/sdXY```

Create with **volume label**

```sudo mkfs.ext4 -L [label] /dev/sdXY```

Create with **specific owner**

```sudo mkfs.ext4 -E root_owner=[uid]:[gid] /dev/sdXY```

# SYNOPSIS

**mkfs.ext4** [_options_] _device_

# DESCRIPTION

**mkfs.ext4** creates an ext4 filesystem on a device. ext4 is the default Linux filesystem, offering journaling, large file support, and excellent performance.

# PARAMETERS

**-L LABEL**
> Set volume label (max 16 characters)

**-E OPTIONS**
> Extended options (root_owner=uid:gid)

**-b BLOCKSIZE**
> Set block size (1024, 2048, 4096)

**-j**
> Create journal (default for ext4)

**-i BYTES_PER_INODE**
> Set bytes per inode ratio

**-N INODES**
> Set number of inodes

**-m PERCENT**
> Reserved blocks percentage (default: 5)

**-U UUID**
> Set filesystem UUID

# CAVEATS

All data on device will be lost. Part of e2fsprogs package. Default reserved blocks (5%) can be reduced for non-root filesystems.

# SEE ALSO

[mkfs](/man/mkfs)(8), [tune2fs](/man/tune2fs)(8), [e2fsck](/man/e2fsck)(8)
