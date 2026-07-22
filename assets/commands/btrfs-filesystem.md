# TAGLINE

Manage btrfs filesystem properties and operations

# TLDR

Show **usage** statistics

```btrfs filesystem usage path/to/mount```

Show **device** usage

```sudo btrfs filesystem show path/to/mount```

**Defragment** a file

```sudo btrfs filesystem defragment -v path/to/file```

**Defragment** directory recursively

```sudo btrfs filesystem defragment -v -r path/to/dir```

**Sync** to disk

```sudo btrfs filesystem sync path/to/mount```

Show **disk usage** for directory

```sudo btrfs filesystem du -s path/to/dir```

Create **swap file**

```sudo btrfs filesystem mkswapfile --size 8g path/to/swapfile```

# SYNOPSIS

**btrfs filesystem** _command_ [_OPTIONS_] [_path_]

# DESCRIPTION

**btrfs filesystem** manages btrfs filesystem properties and operations including usage statistics, defragmentation, synchronization, and device information display.

# PARAMETERS

**usage**
> Show detailed filesystem space usage

**show**
> Display filesystem information and device usage

**df**
> Show disk space usage similar to df command

**defragment**
> Defragment files or directories

**sync**
> Force sync unwritten data to disk

**du**
> Calculate disk usage for files and directories

**mkswapfile**
> Create a swap file properly formatted for btrfs

**-v, --verbose**
> Enable verbose output

**-r**
> Recursive operation for defragment and du

**-s, --summarize**
> Show only summary for du command

# CAVEATS

Defragmentation may break reflinks and reduce deduplication benefits. Running defragment while deduplication is active can cause issues. The df command may show different values than standard df due to btrfs's space accounting.

# HISTORY

**btrfs filesystem** is part of the **btrfs-progs** package for managing btrfs filesystems on Linux.

# INSTALL

```apt: sudo apt install btrfs-progs```

```dnf: sudo dnf install btrfs-progs```

```pacman: sudo pacman -S btrfs-progs```

```apk: sudo apk add btrfs-progs```

```brew: brew install btrfs-progs```

```nix: nix profile install nixpkgs#btrfs-progs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-device](/man/btrfs-device)(8), [df](/man/df)(1)

# RESOURCES

```[Source code](https://github.com/kdave/btrfs-progs)```

```[Documentation](https://btrfs.readthedocs.io/)```

<!-- verified: 2026-06-22 -->
