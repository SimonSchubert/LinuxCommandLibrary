# TAGLINE

change ext filesystem labels

# TLDR

Change **volume label**

```sudo e2label [/dev/sda1] "[label_name]"```

# SYNOPSIS

**e2label** _device_ [_new-label_]

# DESCRIPTION

**e2label** changes or displays the filesystem label on an ext2/ext3/ext4 filesystem. Labels provide human-readable names for filesystems and can be used to mount filesystems by label instead of device name, which improves portability when device names change.

If no label is specified, the current label is displayed. Labels are particularly useful in /etc/fstab entries, making system configuration more resilient to device renaming after hardware changes.

# PARAMETERS

_device_
> The filesystem device

_new-label_
> New label (max 16 characters)

# CAVEATS

Labels are limited to 16 characters. For longer labels, use tune2fs. Part of e2fsprogs. Filesystem should be unmounted when changing labels.

# SEE ALSO

[tune2fs](/man/tune2fs)(8), [blkid](/man/blkid)(8), [mount](/man/mount)(8)
