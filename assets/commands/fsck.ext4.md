# TAGLINE

Check an ext4 filesystem by calling e2fsck

# TLDR

This command is a name of **e2fsck** used for ext4 filesystems.

**Check** an ext4 device

```sudo fsck.ext4 [/dev/sdXY]```

Check **without writing** repairs

```sudo fsck.ext4 -n [/dev/sdXY]```

**Repair** automatically

```sudo fsck.ext4 -p [/dev/sdXY]```

# SYNOPSIS

**fsck.ext4** [_options_] _device_

# DESCRIPTION

**fsck.ext4** is the program [fsck](/man/fsck)(8) runs for an ext4 filesystem. On a normal e2fsprogs install it is a link to [e2fsck](/man/e2fsck)(8), and it accepts the same options. Unmount the filesystem first, or check it read-only.

The ext2 name is [fsck.ext2](/man/fsck.ext2)(8). Both names are the same program. [fsck.exfat](/man/fsck.exfat)(8) is a different tool, for exFAT.

# INSTALL

```apt: sudo apt install e2fsprogs```

```dnf: sudo dnf install e2fsprogs```

```pacman: sudo pacman -S e2fsprogs```

```apk: sudo apk add e2fsprogs```

```zypper: sudo zypper install e2fsprogs```

```brew: brew install e2fsprogs```

```nix: nix profile install nixpkgs#e2fsprogs```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [fsck](/man/fsck)(8), [fsck.ext2](/man/fsck.ext2)(8), [tune2fs](/man/tune2fs)(8), [dumpe2fs](/man/dumpe2fs)(8), [mkfs.ext4](/man/mkfs.ext4)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/fs/ext2/e2fsprogs.git)```

```[Homepage](http://e2fsprogs.sourceforge.net/)```

```[Documentation](https://man7.org/linux/man-pages/man8/e2fsck.8.html)```

<!-- verified: 2026-11-17 -->
