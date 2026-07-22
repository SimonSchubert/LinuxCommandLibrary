# TAGLINE

analyze ext filesystem free space fragmentation

# TLDR

Check **free space fragmentation**

```e2freefrag [/dev/sdXN]```

Check with specific **chunk size**

```e2freefrag -c [chunk_size_in_kb] [/dev/sdXN]```

# SYNOPSIS

**e2freefrag** [_options_] _device_

# DESCRIPTION

**e2freefrag** prints free space fragmentation information for ext2/ext3/ext4 filesystems. It shows how many free blocks are available as contiguous and aligned free space in histogram format.

The tool analyzes the filesystem's free space distribution, reporting statistics about chunk sizes and their frequency. This information helps assess filesystem health and determine if defragmentation might improve performance.

Useful for identifying fragmentation patterns that could impact sequential I/O performance, particularly on systems with large files or database workloads.

# PARAMETERS

**-c** _chunk_kb_
> Report the number of free chunks of the given size (in KB). Must be a power of two and larger than the filesystem block size.

**-h**
> Display usage information.

_device_
> Filesystem device (e.g. **/dev/sda1**) to analyze.

# CAVEATS

Filesystem should be unmounted or mounted read-only for accurate results. Part of e2fsprogs package.

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

[e4defrag](/man/e4defrag)(8), [dumpe2fs](/man/dumpe2fs)(8), [e2fsck](/man/e2fsck)(8), [debugfs](/man/debugfs)(8), [tune2fs](/man/tune2fs)(8)
