# TAGLINE

Interactive file-level Time Machine for ZFS, btrfs, and nilfs2

# TLDR

**Show all available versions** of a file

```httm [path/to/file]```

**Browse snapshots interactively**

```httm -i [path/to/file]```

**Restore a file** from a snapshot

```httm -r [path/to/file]```

**List deleted files** in a directory

```httm -d [path/to/directory]```

**Recursively list deleted files**

```httm -R [path/to/directory]```

**Prune snapshots interactively**

```httm --prune```

# SYNOPSIS

**httm** [**-i**|**-r**|**-d**|**-R**] [_options_] [_path_]

# DESCRIPTION

**httm** prints the size, date, and corresponding locations of available unique versions of files residing on filesystem snapshots. It works with **ZFS**, **btrfs**, **nilfs2** snapshots, as well as **Restic** and **Time Machine** backups.

The tool has four native interactive modes: **browse** for navigating snapshot versions, **select** for choosing a specific version, **prune** for removing old snapshots, and **restore** for recovering files. It can search for and recursively list deleted files, including files hidden behind deleted directories.

# CAVEATS

Requires a filesystem with snapshot support (ZFS, btrfs, or nilfs2) or compatible backup system. Performance depends on the number of snapshots. Restoration overwrites the current file version.

# HISTORY

**httm** was created by **kimono-koans** and is written in **Rust**. It was designed to bring the intuitive file-level browsing experience of macOS Time Machine to Linux snapshot-capable filesystems.

# SEE ALSO

[zfs](/man/zfs)(8), [btrfs](/man/btrfs)(8), [restic](/man/restic)(1)
