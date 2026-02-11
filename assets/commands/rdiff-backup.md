# TAGLINE

Reverse differential backup with file history

# TLDR

**Backup directory**

```rdiff-backup [source/] [backup/]```

**Backup to remote**

```rdiff-backup [source/] [user@host::backup/]```

**Restore latest**

```rdiff-backup -r now [backup/] [restore/]```

**Restore from specific time**

```rdiff-backup -r [3D] [backup/] [restore/]```

**List increments**

```rdiff-backup --list-increments [backup/]```

**Remove old backups**

```rdiff-backup --remove-older-than [2W] [backup/]```

**Verify backup**

```rdiff-backup --verify [backup/]```

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
> Force operation.

# TIME FORMATS

**now** - Current
**3D** - 3 days ago
**2W** - 2 weeks ago
**1M** - 1 month ago
**2024-01-15** - Specific date

# DESCRIPTION

**rdiff-backup** creates incremental backups using reverse diffs. The destination mirrors current state while storing history.

Each backup stores only differences from previous. Space-efficient for frequent backups.

Restoration from any point in history is possible. Diffs are applied to reconstruct old states.

Remote backup works over SSH. No special server needed, just rdiff-backup on both ends.

Retention policies remove old increments. Balance history depth against storage.

# CAVEATS

Requires rdiff-backup on remote. Large initial backup. Metadata changes trigger updates.

# HISTORY

**rdiff-backup** combines rsync-style mirroring with reverse-diff versioning. It provides space-efficient incremental backup while maintaining easy restoration.

# SEE ALSO

[rsync](/man/rsync)(1), [borgbackup](/man/borgbackup)(1), [duplicity](/man/duplicity)(1)
