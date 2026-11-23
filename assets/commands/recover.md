# TAGLINE

interactively undelete files on ext2 filesystems

# TLDR

**Start the interactive recovery** (asks for device, deletion date, size, owner, ...)

```sudo recover```

**Recover from a specific device**

```sudo recover [/dev/sdXN]```

**Dump all deleted inodes** without filtering

```sudo recover [/dev/sdXN] --all```

**Show help**

```recover --help```

**List deleted inodes manually** with the underlying tool

```sudo debugfs -R lsdel [/dev/sdXN]```

# SYNOPSIS

**recover** [_device_] [_options_]

# PARAMETERS

_device_
> The ext2 block device (any argument starting with `/dev/`). If omitted, recover scans for ext2 partitions and asks for one.

**-a**, **--all**
> No filtering: dump all deleted inodes on the device.

**-h**, **--help**
> Print help and exit.

# DESCRIPTION

**recover** automates the steps of the Ext2fs-Undeletion mini-HOWTO by Aaron Crane. It uses `debugfs -R lsdel` to list every deleted inode on an ext2 filesystem, then narrows the list down by asking questions about the lost file:

- year, month, and weekday of deletion, and the possible range of days
- minimum and maximum file size
- earliest and latest possible deletion hour and minute
- user ID of the file's owner
- a text string the file contained (optional, `*` to skip)

The matching inodes are then dumped with `debugfs` into a directory you choose, as files named `dump<inode>`. The original file names are not recovered, so the results have to be identified by content.

# CAVEATS

Only works on **ext2**. ext3 and ext4 clear the block pointers of deleted inodes, so the data cannot be found this way; use **extundelete**, **ext4magic**, or a file carver such as **photorec** instead. Unmount the filesystem (or remount it read-only) before trying, and write the recovered files to a different filesystem, otherwise the deleted blocks may be overwritten. Must run as root to read the raw device.

The program has not been maintained since 2002 and was dropped from Debian after version 7 (wheezy). Other unrelated programs share the name: the `recover` client of Dell EMC NetWorker restores files from a NetWorker backup server, and the `restore` command from the dump package (not `recover`) restores **dump**(8) archives.

# HISTORY

**recover** was written by **Tom Pycke** in **1999**; the last version, 1.3c, dates from 2002. It was packaged in Debian from woody to wheezy.

# SEE ALSO

[debugfs](/man/debugfs)(8), [extundelete](/man/extundelete)(1), [testdisk](/man/testdisk)(8), [photorec](/man/photorec)(8), [dump](/man/dump)(8)
