# TAGLINE

Reverse differential backup with file history

# TLDR

**Backup** a local directory to a local destination

```rdiff-backup [source/] [backup/]```

**Backup** a local directory to a **remote** host over SSH

```rdiff-backup [source/] [user@host::backup/]```

**Restore** the latest version from a backup

```rdiff-backup -r now [backup/] [restore/]```

**Restore** files from a **specific time** ago

```rdiff-backup -r [3D] [backup/] [restore/]```

**List** all backup increments and their dates

```rdiff-backup --list-increments [backup/]```

**Remove** backup increments **older** than a given period

```rdiff-backup --remove-older-than [2W] [backup/]```

**Verify** the integrity of a backup repository

```rdiff-backup --verify [backup/]```

**Backup** excluding specific patterns

```rdiff-backup --exclude '[**/*.tmp]' [source/] [backup/]```

# SYNOPSIS

**rdiff-backup** [_-r time_] [_options_] _source_ _destination_

# PARAMETERS

**-r**, **--restore-as-of** _TIME_
> Restore from time.

**--list-increments**
> Show backup history.

**--remove-older-than** _TIME_
> Delete old increments.

**--verify**
> Verify backup integrity.

**--include** _PATTERN_
> Include files.

**--exclude** _PATTERN_
> Exclude files.

**-v**, **--verbosity** _N_
> Verbosity level.

**--force**
> Force operation, even if destination is not empty or increments are corrupt.

**--print-statistics**
> Print file transfer statistics after backup.

# TIME FORMATS

**now** - Current
**3D** - 3 days ago
**2W** - 2 weeks ago
**1M** - 1 month ago
**2025-01-15** - Specific date
**2025-01-15T14:30:00** - Specific date and time

# DESCRIPTION

**rdiff-backup** creates incremental backups using reverse diffs. The destination mirrors current state while storing history.

Each backup stores only differences from previous. Space-efficient for frequent backups.

Restoration from any point in history is possible. Diffs are applied to reconstruct old states.

Remote backup works over SSH. No special server needed, just rdiff-backup on both ends.

Retention policies remove old increments. Balance history depth against storage.

# CAVEATS

Requires rdiff-backup installed on both local and remote machines for remote backups. The initial full backup can be large and time-consuming. Metadata changes (permissions, ownership) trigger incremental updates even if file contents are unchanged.

# HISTORY

**rdiff-backup** combines rsync-style mirroring with reverse-diff versioning. It provides space-efficient incremental backup while maintaining easy restoration.

# SEE ALSO

[rsync](/man/rsync)(1), [borgbackup](/man/borgbackup)(1), [duplicity](/man/duplicity)(1), [restic](/man/restic)(1), [tar](/man/tar)(1)
