# TLDR

**Create backup**

```pg_basebackup -D [backup_dir] -h [host] -U [user]```

**Backup with progress**

```pg_basebackup -D [backup_dir] -P```

**Backup as tar**

```pg_basebackup -D [backup_dir] -Ft```

**Backup with WAL streaming**

```pg_basebackup -D [backup_dir] -X stream```

# SYNOPSIS

**pg_basebackup** [_options_]

# PARAMETERS

**-D**, **--pgdata** _dir_
> Backup destination.

**-h**, **--host** _host_
> Database server host.

**-U**, **--username** _user_
> Database user.

**-P**, **--progress**
> Show progress.

**-F**, **--format** _fmt_
> Output format (p=plain, t=tar).

**-X**, **--wal-method** _method_
> WAL inclusion (fetch, stream, none).

**-z**
> Compress tar output.

**-Z** _level_
> Compression level.

# DESCRIPTION

**pg_basebackup** creates a base backup of a PostgreSQL cluster. Foundation for point-in-time recovery and streaming replication setup. Includes all database files.

# SEE ALSO

[pg_dump](/man/pg_dump)(1), [pg_restore](/man/pg_restore)(1)

