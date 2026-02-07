# TAGLINE

LVM filesystem management utility

# TLDR

**Check** filesystem for errors

```fsadm check /dev/vg_name/lv_name```

**Dry-run** resize to specific size

```fsadm -n resize /dev/vg_name/lv_name 10G```

**Grow** filesystem to fill device

```fsadm resize /dev/vg_name/lv_name```

Resize filesystem **and logical volume** together

```fsadm -l resize /dev/vg_name/lv_name 100G```

Resize ext2/3/4 **offline**

```fsadm -e resize /dev/vg_name/lv_name 20G```

# SYNOPSIS

**fsadm** [_options_] **check** _device_

**fsadm** [_options_] **resize** _device_ [_newsize_]

# DESCRIPTION

**fsadm** checks or resizes filesystems on LVM logical volumes. It is a helper script that wraps filesystem-specific tools like resize2fs, xfs_growfs, and fsck.

# PARAMETERS

**check**
> Check filesystem for errors

**resize**
> Resize filesystem (grow or shrink)

**-n, --dry-run**
> Print what would be done without making changes

**-l, --lvresize**
> Resize the underlying logical volume as well

**-e, --ext-offline**
> Unmount ext2/3/4 filesystem and resize offline

**-f, --force**
> Force operation without confirmation

**-v, --verbose**
> Verbose mode

**-y, --yes**
> Answer yes to all prompts

# CAVEATS

If no size is specified with resize, the filesystem will be grown to fill the entire device. Shrinking filesystems requires careful planning and may require unmounting. Not all filesystems support shrinking (e.g., XFS).

# HISTORY

**fsadm** is part of **LVM2**, providing a unified interface for filesystem operations on logical volumes regardless of the underlying filesystem type.

# SEE ALSO

[lvresize](/man/lvresize)(8), [resize2fs](/man/resize2fs)(8), [xfs_growfs](/man/xfs_growfs)(8), [fsck](/man/fsck)(8)
