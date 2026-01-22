# TLDR

This command is an alias of **mkfs.fat**

Create a **FAT filesystem** inside partition Y on device X

```sudo mkfs.vfat [/dev/sdXY]```

Create a FAT filesystem with a **volume name**

```sudo mkfs.vfat -n [volume_name] [/dev/sdXY]```

Specify the **FAT type** (12, 16, or 32 bit)

```sudo mkfs.vfat -F [12|16|32] [/dev/sdXY]```

# SYNOPSIS

**mkfs.vfat** [_options_] _device_ [_block-count_]

# DESCRIPTION

**mkfs.vfat** is a symbolic link to **mkfs.fat**. It creates FAT (File Allocation Table) filesystems, commonly used for USB drives, SD cards, and EFI system partitions.

The "vfat" name refers to the Virtual FAT extension that enables long filename support (up to 255 characters) on FAT filesystems while maintaining compatibility with the original 8.3 filename format.

# SEE ALSO

[mkfs.fat](/man/mkfs.fat)(8), [mkfs](/man/mkfs)(8), [fsck.fat](/man/fsck.fat)(8), [fatlabel](/man/fatlabel)(8)
