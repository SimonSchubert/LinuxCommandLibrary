# TLDR

**Initialize repository**

```rustic init```

**Create backup**

```rustic backup [path/to/backup]```

**List snapshots**

```rustic snapshots```

**Restore snapshot**

```rustic restore [snapshot_id] [target/]```

**Forget old snapshots**

```rustic forget --keep-daily [7] --keep-weekly [4]```

**Prune unused data**

```rustic prune```

**Check repository**

```rustic check```

**Mount repository**

```rustic mount [mountpoint/]```

# SYNOPSIS

**rustic** [_-r repository_] [_options_] _command_ [_args_]

# PARAMETERS

**-r**, **--repo** _PATH_
> Repository location.

**-p**, **--password** _PASS_
> Repository password.

**--password-file** _FILE_
> Password file.

**-v**, **--verbose**
> Verbose output.

**--dry-run**
> Simulate only.

# COMMANDS

**init**
> Create repository.

**backup**
> Create backup.

**snapshots**
> List snapshots.

**restore**
> Restore data.

**forget**
> Remove snapshots.

**prune**
> Remove unused data.

**check**
> Verify integrity.

# DESCRIPTION

**rustic** is a Rust implementation of restic backup. It provides fast, encrypted backups.

Encryption protects data at rest. AES-256 encryption with authenticated tags.

Deduplication saves storage space. Only unique chunks are stored.

Multiple backends support various storage. Local, S3, SFTP, and REST servers.

Retention policies automate cleanup. Keep rules specify what to preserve.

# CAVEATS

Separate implementation from restic. Repository format compatible. Some features may differ.

# HISTORY

**Rustic** was created as a Rust rewrite of **restic** for improved performance. It maintains compatibility with restic repositories.

# SEE ALSO

[restic](/man/restic)(1), [borgbackup](/man/borgbackup)(1), [duplicacy](/man/duplicacy)(1)
