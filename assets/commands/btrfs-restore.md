# TLDR

**Restore** all files from a btrfs device

```sudo btrfs restore [path/to/btrfs_device] [path/to/target_directory]```

**List files** (dry run) without writing

```sudo btrfs restore -D [path/to/btrfs_device] [path/to/target_directory]```

Restore files matching a **regex pattern**

```sudo btrfs restore --path-regex [regex] -c [path/to/btrfs_device] [path/to/target_directory]```

Restore using a specific **root tree**

```sudo btrfs restore -t [bytenr] [path/to/btrfs_device] [path/to/target_directory]```

Restore with **metadata, xattrs, and symlinks**

```sudo btrfs restore -m -x -S -o [path/to/btrfs_device] [path/to/target_directory]```

# SYNOPSIS

**btrfs restore** [_options_] _device_ _target_

# DESCRIPTION

**btrfs restore** attempts to salvage files from a damaged btrfs filesystem that cannot be mounted normally. It reads filesystem structures directly from the device and copies recoverable files to a target directory.

This is a data recovery tool for when other methods fail. It does not repair the filesystem; it extracts data to a healthy location.

# PARAMETERS

**-D, --dry-run**
> List files without extracting

**--path-regex** _regex_
> Only restore files matching pattern

**-c**
> Case-insensitive regex matching

**-t** _bytenr_
> Use specific root tree (see btrfs-find-root)

**-m, --metadata**
> Restore metadata (permissions, times)

**-x, --xattr**
> Restore extended attributes

**-S, --symlinks**
> Restore symbolic links

**-o, --overwrite**
> Overwrite existing files in target

**-v**
> Verbose output

# CAVEATS

Does not fix the filesystem; only extracts data. May not recover all files from severely damaged filesystems. Regex must match full path including parent directories. Target directory should be on a different filesystem.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-rescue](/man/btrfs-rescue)(8), [btrfs-check](/man/btrfs-check)(8)
