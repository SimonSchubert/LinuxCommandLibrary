# TAGLINE

Fast incremental file transfer and synchronization

# TLDR

**Sync a local directory to another location**

```rsync -av [source/] [destination/]```

**Sync to a remote server via SSH**

```rsync -av [source/] [user]@[host]:[destination/]```

**Sync from a remote server**

```rsync -av [user]@[host]:[source/] [destination/]```

**Delete files in destination** not in source

```rsync -av --delete [source/] [destination/]```

**Dry run** to preview changes

```rsync -avn [source/] [destination/]```

**Show progress** during transfer

```rsync -av --progress [source/] [destination/]```

**Exclude files matching a pattern**

```rsync -av --exclude="*.log" [source/] [destination/]```

**Compress during transfer** (for slow networks)

```rsync -avz [source/] [user]@[host]:[destination/]```

# SYNOPSIS

**rsync** [_options_] _source_... _destination_

# PARAMETERS

**-a**, **--archive**
> Archive mode; equals -rlptgoD (recursive, links, perms, times, group, owner, devices)

**-v**, **--verbose**
> Increase verbosity

**-z**, **--compress**
> Compress file data during transfer

**-n**, **--dry-run**
> Show what would be transferred without making changes

**--delete**
> Delete files in destination that don't exist in source

**--exclude**=_pattern_
> Exclude files matching pattern

**--include**=_pattern_
> Include files matching pattern (after excludes)

**--progress**
> Show progress during transfer

**-P**
> Same as --partial --progress

**--partial**
> Keep partially transferred files

**-r**, **--recursive**
> Recurse into directories

**-u**, **--update**
> Skip files newer on destination

**-c**, **--checksum**
> Compare by checksum, not mod-time & size

**-e** _command_
> Specify remote shell to use (e.g., -e ssh)

**--bwlimit**=_KBPS_
> Limit bandwidth in KB/s

**-h**, **--human-readable**
> Output numbers in human-readable format

# DESCRIPTION

**rsync** is a fast, versatile file copying tool that synchronizes files between locations. It uses a delta-transfer algorithm, transmitting only differences between source and destination, making it efficient for incremental backups and mirrors.

The trailing slash on source paths is significant: **source/** copies contents, while **source** copies the directory itself. This is a common source of confusion.

Rsync can operate locally or over a network using SSH (default), RSH, or its own daemon protocol. For remote transfers, format is **user@host:path** or **rsync://user@host/path** for daemon mode.

The **-a** (archive) flag is commonly used as it preserves permissions, timestamps, symbolic links, and recurses into directories—suitable for most backup scenarios.

# CAVEATS

**Trailing slash matters**: **rsync -a source/ dest/** copies contents; **rsync -a source dest/** copies the directory into dest.

**--delete** removes files from destination. Always use **-n** (dry run) first to verify what will be deleted.

Symbolic links are copied as symlinks by default. Use **-L** to follow symlinks and copy their targets.

For large transfers over unreliable connections, use **-P** (--partial --progress) to enable resumption of interrupted transfers.

# HISTORY

Rsync was created by **Andrew Tridgell** and **Paul Mackerras** in **1996**. The name comes from "remote sync." The delta-transfer algorithm was based on Tridgell's PhD thesis. Rsync became a fundamental tool for Unix system administration, backups, and mirroring.

# SEE ALSO

[scp](/man/scp)(1), [cp](/man/cp)(1), [rclone](/man/rclone)(1), [tar](/man/tar)(1)
