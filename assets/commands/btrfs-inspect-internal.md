# TAGLINE

Debug and inspect btrfs filesystem internals

# TLDR

Print **superblock** information

```sudo btrfs inspect-internal dump-super [path/to/partition]```

Print **all superblock copies**

```sudo btrfs inspect-internal dump-super -a [path/to/partition]```

Print **full superblock** details including backup roots

```sudo btrfs inspect-internal dump-super -f [path/to/partition]```

Print filesystem **metadata** information

```sudo btrfs inspect-internal dump-tree [path/to/partition]```

Print list of files in **inode** number

```sudo btrfs inspect-internal inode-resolve [inode_number] [path/to/btrfs_mount]```

Print list of files at a **logical address**

```sudo btrfs inspect-internal logical-resolve [logical_address] [path/to/btrfs_mount]```

Print **tree stats** for a filesystem

```sudo btrfs inspect-internal tree-stats [path/to/partition]```

Calculate **minimum device size** for shrinking

```sudo btrfs inspect-internal min-dev-size [path/to/btrfs_mount]```

**List chunks** sorted by usage

```sudo btrfs inspect-internal list-chunks --sort usage [path/to/btrfs_mount]```

Print the **resume offset** of a swapfile for hibernation

```sudo btrfs inspect-internal map-swapfile -r [path/to/swapfile]```

Print the **subvolume ID** containing a path

```btrfs inspect-internal rootid [path]```

Resolve a **subvolume ID** to its path

```sudo btrfs inspect-internal subvolid-resolve [subvolume_id] [path/to/btrfs_mount]```

# SYNOPSIS

**btrfs inspect-internal** _subcommand_ _args_

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

**list-chunks**
> Enumerate chunks on all devices

**map-swapfile**
> Find the physical offset of a swapfile for hibernation and verify it is suitable

**tree-stats**
> Print tree statistics (takes a device, not a mount point)

**min-dev-size**
> Calculate minimum device size for shrinking

**rootid**
> Print the tree root ID containing a file, or the subvolume's own ID

**subvolid-resolve**
> Print the absolute path of a subvolume ID

# PARAMETERS

**-a, --all**
> **dump-super**: print all superblock copies

**-f, --full**
> **dump-super**: print full information, including the system chunk array and backup roots

**-F, --force**
> **dump-super**: attempt to print the superblock even without a valid signature

**-s, --super** _copy_
> **dump-super**: select the superblock mirror (0, 1 or 2)

**--bfs, --dfs**
> **dump-tree**: walk trees breadth-first (default) or depth-first

**-t** _tree_id_
> **dump-tree**, **tree-stats**: print only the given tree

**--hide-names**
> **dump-tree**: replace names with a placeholder before sharing a dump

**--id** _id_
> **min-dev-size**: device ID to query (default 1)

**-r, --resume-offset**
> **map-swapfile**: print only the value for /sys/power/resume_offset

**--sort** _mode_
> **list-chunks**: sort by devid, pstart, lstart, usage, length, type or profile

# CAVEATS

Output is technical and intended for developers or advanced users. Device-based subcommands (**dump-super**, **dump-tree**, **tree-stats**) can run on a mounted filesystem, but results may be inaccurate during ongoing writes; path-based ones need it mounted. Most need root privileges. **dump-tree** output contains file names, so use **--hide-names** before sharing it. These commands are read-only.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-check](/man/btrfs-check)(8), [btrfs-rescue](/man/btrfs-rescue)(8), [btrfs-restore](/man/btrfs-restore)(8)

# RESOURCES

```[Source code](https://github.com/kdave/btrfs-progs)```

```[Documentation](https://btrfs.readthedocs.io/en/latest/btrfs-inspect-internal.html)```

<!-- verified: 2026-11-09 -->
