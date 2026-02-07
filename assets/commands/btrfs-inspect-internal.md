# TAGLINE

Debug and inspect btrfs filesystem internals

# TLDR

Print **superblock** information

```sudo btrfs inspect-internal dump-super [path/to/partition]```

Print **all superblock copies**

```sudo btrfs inspect-internal dump-super -a [path/to/partition]```

Print filesystem **metadata** information

```sudo btrfs inspect-internal dump-tree [path/to/partition]```

Print list of files in **inode** n

```sudo btrfs inspect-internal inode-resolve [n] [path/to/btrfs_mount]```

Print list of files at a **logical address**

```sudo btrfs inspect-internal logical-resolve [logical_address] [path/to/btrfs_mount]```

Print **tree stats**

```sudo btrfs inspect-internal tree-stats [path/to/partition]```

# SYNOPSIS

**btrfs inspect-internal** _subcommand_ [_options_] _device_|_path_

# DESCRIPTION

**btrfs inspect-internal** provides low-level access to btrfs filesystem internal structures. It is primarily used for debugging, forensics, and advanced troubleshooting.

The command can dump superblock data, metadata trees, and resolve inodes to file paths or logical addresses to physical locations.

# SUBCOMMANDS

**dump-super**
> Print superblock information

**dump-tree**
> Print metadata tree structure

**inode-resolve**
> Find file paths from inode number

**logical-resolve**
> Find files at logical address

**tree-stats**
> Print tree statistics

**min-dev-size**
> Calculate minimum device size for shrinking

# PARAMETERS

**-a, --all**
> Dump all superblock copies

**-f**
> Force output even with warnings

# CAVEATS

Output is technical and intended for developers or advanced users. Some commands require unmounted filesystem while others need mounted. Incorrect use won't damage data but output interpretation requires btrfs internals knowledge.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-check](/man/btrfs-check)(8)
