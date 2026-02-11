# TAGLINE

Fast encrypted deduplicated backup tool

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

**rustic** is a fast backup tool written in Rust that is fully compatible with the restic repository format. It provides encrypted, deduplicated backups using AES-256 encryption with authenticated tags, ensuring data confidentiality and integrity at rest.

The tool uses content-defined chunking and deduplication so that only unique data chunks are stored, significantly reducing storage requirements for incremental backups. Multiple storage backends are supported including local filesystems, S3-compatible object storage, SFTP, and REST servers.

Retention policies specified through **forget** with keep rules (daily, weekly, monthly) automate snapshot cleanup. The **prune** command reclaims space by removing data chunks no longer referenced by any snapshot.

# CONFIGURATION

**~/.config/rustic/rustic.toml**
> Main configuration file defining default repository location, password source, backup paths, and retention policies.

**RUSTIC_REPOSITORY**
> Environment variable specifying the default repository location.

**RUSTIC_PASSWORD**
> Environment variable providing the repository password.

# CAVEATS

Separate implementation from restic. Repository format compatible. Some features may differ.

# HISTORY

**Rustic** was created as a Rust rewrite of **restic** for improved performance. It maintains compatibility with restic repositories.

# SEE ALSO

[restic](/man/restic)(1), [borgbackup](/man/borgbackup)(1), [duplicacy](/man/duplicacy)(1)
