# TAGLINE

mount filesystems using GRUB's drivers via FUSE

# TLDR

**Mount** a block device or file system image to a mount point

```grub-mount [/dev/sdXY] [/mnt]```

Mount a **specific partition** from a disk image

```grub-mount -r [2] [disk.img] [/mnt]```

Mount an **encrypted** device with passphrase prompt

```grub-mount -C [/dev/sdXY] [/mnt]```

Load a **ZFS encryption key** from a file

```grub-mount -K [path/to/zfs.key] [/dev/sdX] [/mnt]```

Enable **verbose** output

```grub-mount -v [image] [/mnt]```

# SYNOPSIS

**grub-mount** [_options_] _device_ _mountpoint_

# PARAMETERS

**-r**, **--root** _PARTITION_
> Specify partition number to mount from a disk image

**-C**, **--crypto**
> Enable cryptographic device support, prompts for passphrase

**-K**, **--zfs-key** _FILE_
> Load ZFS encryption key from specified file

**-d**, **--debug** _STRING_
> Show debugging output for matching category

**-v**, **--verbose**
> Enable verbose output

**--version**
> Display version information

# DESCRIPTION

**grub-mount** mounts file systems or disk images read-only using GRUB's built-in file system drivers via FUSE. This is useful for accessing file systems that GRUB supports but the host operating system might not, or for inspecting boot images.

The tool supports various file systems including ext2/3/4, XFS, Btrfs, ZFS, FAT, NTFS, and ISO9660. It can also handle encrypted volumes with the appropriate options.

# CAVEATS

All mounts are read-only. Requires FUSE support on the host system. Some advanced file system features may not be fully supported. Encrypted volumes require appropriate keys or passphrases.

# HISTORY

grub-mount is part of GRUB 2, providing a FUSE-based mounting interface using GRUB's file system drivers. This allows administrators to access and verify boot environments without requiring kernel support for all file system types.

# SEE ALSO

[grub-probe](/man/grub-probe)(8), [mount](/man/mount)(8), [fusermount](/man/fusermount)(1)
