# TAGLINE

change ext filesystem labels

# TLDR

**Display** the current volume label

```sudo e2label [/dev/sda1]```

Change **volume label**

```sudo e2label [/dev/sda1] "[label_name]"```

**Clear** the volume label

```sudo e2label [/dev/sda1] ""```

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

Labels are limited to 16 characters and are silently truncated if longer. e2label is a thin wrapper around **tune2fs -L**, so the two are interchangeable. The filesystem may be mounted while the label is changed, but the new label is only picked up by udev and /dev/disk/by-label after the next scan. Part of the **e2fsprogs** package.

# INSTALL

```apt: sudo apt install e2fsprogs```

```dnf: sudo dnf install e2fsprogs```

```pacman: sudo pacman -S e2fsprogs```

```apk: sudo apk add e2fsprogs-extra```

```zypper: sudo zypper install e2fsprogs```

```brew: brew install e2fsprogs```

```nix: nix profile install nixpkgs#e2fsprogs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tune2fs](/man/tune2fs)(8), [blkid](/man/blkid)(8), [mount](/man/mount)(8), [e2undo](/man/e2undo)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/fs/ext2/e2fsprogs.git)```

```[Homepage](https://e2fsprogs.sourceforge.net/)```

<!-- verified: 2026-07-14 -->
