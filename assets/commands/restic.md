# TLDR

**Initialize a repository**

```restic -r [/path/to/repo] init```

**Backup a directory**

```restic -r [/path/to/repo] backup [/path/to/data]```

**List snapshots**

```restic -r [/path/to/repo] snapshots```

**Restore from latest snapshot**

```restic -r [/path/to/repo] restore latest --target [/path/to/restore]```

**Restore specific snapshot**

```restic -r [/path/to/repo] restore [snapshot_id] --target [/path/to/restore]```

**Check repository integrity**

```restic -r [/path/to/repo] check```

**Remove old snapshots** (keep last 7 daily)

```restic -r [/path/to/repo] forget --keep-daily [7] --prune```

**Backup to S3**

```restic -r s3:s3.amazonaws.com/[bucket_name] backup [/path/to/data]```

**Mount snapshots** as filesystem

```restic -r [/path/to/repo] mount [/mnt/restic]```

# SYNOPSIS

**restic** [_global options_] _command_ [_options_] [_arguments_]

# DESCRIPTION

**restic** is a fast, secure, and efficient backup program. It creates encrypted, deduplicated snapshots of your data to local or remote repositories including local disk, SFTP, S3, Azure, Google Cloud Storage, and more.

Each backup creates a snapshot containing the state of the files at that point in time. Restic uses content-defined chunking for deduplication, meaning identical data is only stored once across all snapshots. All data is encrypted with AES-256.

Restore operations can target the entire snapshot or specific files. The mount command allows browsing snapshots as a FUSE filesystem.

# PARAMETERS

**-r** _repo_, **--repo** _repo_
> Repository location.

**-p** _file_, **--password-file** _file_
> File containing repository password.

**--verbose**
> Verbose output.

**init**
> Initialize a new repository.

**backup**
> Create a new snapshot.

**restore**
> Extract files from a snapshot.

**snapshots**
> List all snapshots.

**forget**
> Remove snapshots (needs --prune to free space).

**prune**
> Remove unreferenced data.

**check**
> Verify repository integrity.

**mount**
> Mount repository as FUSE filesystem.

**--exclude** _pattern_
> Exclude files matching pattern.

**--keep-last** _n_
> Keep last n snapshots.

**--keep-daily** _n_
> Keep n daily snapshots.

# CAVEATS

Repository password cannot be recovered if lost. Initial backup is slow (subsequent ones are fast due to deduplication). Forget without prune doesn't free space. Some backends require credentials via environment variables.

# HISTORY

**restic** was created by **Alexander Neumann** in **2014** as a modern backup solution addressing shortcomings of existing tools. Written in Go, it was designed with security, deduplication, and cloud storage support as primary goals. The project gained popularity for its simplicity and reliability, becoming a recommended alternative to tools like duplicity.

# SEE ALSO

[duplicity](/man/duplicity)(1), [borg](/man/borg)(1), [rsync](/man/rsync)(1), [rclone](/man/rclone)(1)
