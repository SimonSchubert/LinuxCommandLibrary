# TAGLINE

Resize ext2/ext3/ext4 filesystems

# TLDR

Resize to **maximum** possible size

```sudo resize2fs /dev/sdXN```

Resize to **specific size** with progress

```sudo resize2fs -p /dev/sdXN 40G```

**Shrink** to minimum possible size

```sudo resize2fs -M /dev/sdXN```

**Force** resize even if errors detected

```sudo resize2fs -f /dev/sdXN```

# SYNOPSIS

**resize2fs** [_-fFpPMbs_] [_-d debug-flags_] [_-S RAID-stride_] _device_ [_size_]

# DESCRIPTION

**resize2fs** resizes ext2, ext3, or ext4 filesystems. It can grow or shrink the filesystem. Note that it does not resize the underlying partition; use a partitioning tool for that.

# PARAMETERS

**-b**
> Enable 64-bit block numbers

**-d DEBUG-FLAGS**
> Enable debugging output

**-f**
> Force resize even with errors

**-F**
> Flush buffer cache before resize

**-M**
> Shrink to minimum size

**-p**
> Show progress bar

**-P**
> Print minimum size and exit

**-s**
> Disable 64-bit block numbers

**-S STRIDE**
> Specify RAID stride for optimal placement

# SIZE UNITS

Size can be specified as number of blocks, or with suffixes:
**s**: 512-byte sectors
**K**: Kilobytes
**M**: Megabytes
**G**: Gigabytes

# CAVEATS

Shrinking a filesystem requires it to be unmounted. Growing a filesystem can often be done while mounted (online resize) for ext3/ext4. Always resize the partition before growing or after shrinking the filesystem.

# HISTORY

**resize2fs** is part of **e2fsprogs**. Online resize capability was added in ext3 and improved in ext4.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [tune2fs](/man/tune2fs)(8), [fdisk](/man/fdisk)(8), [parted](/man/parted)(8)
