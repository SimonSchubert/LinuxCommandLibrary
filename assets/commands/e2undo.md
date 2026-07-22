# TAGLINE

replay ext filesystem undo logs

# TLDR

Display **undo file info**

```e2undo -h [path/to/undo_file] [/dev/sdXN]```

**Dry run** showing candidate blocks

```e2undo -nv [path/to/undo_file] [/dev/sdXN]```

Perform **undo operation**

```e2undo [path/to/undo_file] [/dev/sdXN]```

Perform undo with **verbose output**

```e2undo -v [path/to/undo_file] [/dev/sdXN]```

Create **backup undo file** before overwriting

```e2undo -z [path/to/file.e2undo] [path/to/undo_file] [/dev/sdXN]```

# SYNOPSIS

**e2undo** [_options_] _undo-file_ _device_

# DESCRIPTION

**e2undo** replays undo logs for ext2/ext3/ext4 filesystems. This can reverse a failed or unwanted operation by e2fsprogs tools like e2fsck, resize2fs, or tune2fs, providing a safety mechanism for filesystem modifications.

Undo files are created when these tools are run with the -z option. The undo file records all blocks modified during the operation, allowing precise rollback to the pre-operation state. This is particularly valuable when testing filesystem modifications or recovering from interrupted operations.

# PARAMETERS

**-f**
> Force the undo even when the filesystem UUID or superblock does not match the undo file

**-h**
> Display information about the undo file without applying it

**-n**
> Dry run: show what would be replayed without modifying the filesystem

**-o** _offset_
> Byte offset of the filesystem within the device or image file

**-v**
> Verbose output

**-z** _file_
> Write a new undo file recording the blocks this undo operation overwrites

# CAVEATS

Requires an undo file, which the e2fsprogs tools only create when run with their own **-z** option (for example `e2fsck -z undo.e2undo /dev/sda1`). The filesystem must be unmounted. e2undo refuses to run if the filesystem has changed since the undo file was written, unless **-f** is given, which risks corrupting the filesystem. Part of the **e2fsprogs** package.

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

[e2fsck](/man/e2fsck)(8), [tune2fs](/man/tune2fs)(8), [resize2fs](/man/resize2fs)(8), [mke2fs](/man/mke2fs)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/fs/ext2/e2fsprogs.git)```

```[Homepage](https://e2fsprogs.sourceforge.net/)```

<!-- verified: 2026-07-14 -->
