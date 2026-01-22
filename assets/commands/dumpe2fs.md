# TLDR

Display **filesystem information**

```sudo dumpe2fs /dev/sdXN```

Display **bad blocks** only

```sudo dumpe2fs -b /dev/sdXN```

**Force** display with unrecognized features

```sudo dumpe2fs -f /dev/sdXN```

Display **superblock** info only

```sudo dumpe2fs -h /dev/sdXN```

Display block numbers in **hexadecimal**

```sudo dumpe2fs -x /dev/sdXN```

# SYNOPSIS

**dumpe2fs** [_-bfghixV_] [_-o superblock=superblock_] [_-o blocksize=blocksize_] _device_

# DESCRIPTION

**dumpe2fs** prints the superblock and block group information for ext2, ext3, and ext4 filesystems. It displays detailed filesystem metadata including features, block counts, and allocation information.

# PARAMETERS

**-b**
> Print only the blocks marked as bad

**-f**
> Force display even with unrecognized feature flags

**-g**
> Display block group descriptor information in colon-separated format

**-h**
> Display superblock info only, not block group details

**-i**
> Display filesystem data from image file

**-o superblock=NUM**
> Use alternative superblock at block NUM

**-o blocksize=SIZE**
> Specify block size when searching for superblock

**-x**
> Display block numbers in hexadecimal format

**-V**
> Display version information

# CAVEATS

For best results, unmount the filesystem before running dumpe2fs. Some information may be stale on mounted filesystems.

# HISTORY

**dumpe2fs** is part of **e2fsprogs**, providing diagnostic information about ext2/3/4 filesystems since the early days of Linux.

# SEE ALSO

[tune2fs](/man/tune2fs)(8), [e2fsck](/man/e2fsck)(8), [mke2fs](/man/mke2fs)(8), [debugfs](/man/debugfs)(8)
