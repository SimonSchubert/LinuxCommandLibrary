# TAGLINE

verify the integrity of a base backup of a PostgreSQL cluster

# TLDR

**Verify a backup**

```pg_verifybackup [backup_dir]```

**Verify with progress reporting**

```pg_verifybackup -P [backup_dir]```

**Skip WAL verification**

```pg_verifybackup -n [backup_dir]```

**Skip data file checksum verification (faster)**

```pg_verifybackup -s [backup_dir]```

**Use a manifest file from a different location**

```pg_verifybackup -m [/path/to/backup_manifest] [backup_dir]```

**Verify with WAL files from a separate directory**

```pg_verifybackup -w [/path/to/wal_dir] [backup_dir]```

# SYNOPSIS

**pg_verifybackup** [_options_] _backupdir_

# PARAMETERS

**-e**, **--exit-on-error**
> Exit as soon as a problem is detected, instead of continuing to report all errors.

**--ignore**=_path_
> Ignore the specified file or directory (relative path) when comparing against the manifest.

**-m** _path_, **--manifest-path**=_path_
> Use the manifest file at the specified path instead of one in the backup root.

**-n**, **--no-parse-wal**
> Skip parsing write-ahead log data needed for recovery.

**-P**, **--progress**
> Show progress while verifying checksums. Cannot be used with `--quiet`.

**-q**, **--quiet**
> Do not print anything when a backup is successfully verified.

**-s**, **--skip-checksums**
> Skip data file checksum verification. File presence and sizes are still checked.

**-w** _dir_, **--wal-directory**=_dir_
> Parse WAL files from the specified directory instead of `pg_wal` in the backup.

# DESCRIPTION

**pg_verifybackup** verifies the integrity of a backup taken with **pg_basebackup**. It checks the backup manifest for completeness and verifies file checksums. Running this after a backup helps ensure recoverability.

By default, it also parses any WAL files required to restore from the backup to verify they are present and uncorrupted.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_dump](/man/pg_dump)(1)

