# TAGLINE

verifies pg_basebackup integrity

# TLDR

**Verify backup**

```pg_verifybackup [backup_dir]```

**Verify with progress**

```pg_verifybackup -P [backup_dir]```

**Skip WAL verification**

```pg_verifybackup -n [backup_dir]```

# SYNOPSIS

**pg_verifybackup** [_options_] _backupdir_

# PARAMETERS

**-n**, **--no-parse-wal**
> Skip WAL verification.

**-P**, **--progress**
> Show progress.

**-q**, **--quiet**
> Quiet output.

**-e**, **--exit-on-error**
> Exit on first error.

# DESCRIPTION

**pg_verifybackup** verifies pg_basebackup integrity. Checks backup manifest and file checksums. Run after backup to ensure recoverability.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1)

