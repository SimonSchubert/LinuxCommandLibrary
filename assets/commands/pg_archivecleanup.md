# TAGLINE

removes old WAL archive files no longer needed by standby servers

# TLDR

**Clean old WAL files**

```pg_archivecleanup [archive_dir] [oldest_kept_wal]```

**Dry run**

```pg_archivecleanup -n [archive_dir] [oldest_kept_wal]```

**Clean with extension**

```pg_archivecleanup -x .gz [archive_dir] [oldest_kept_wal]```

# SYNOPSIS

**pg_archivecleanup** [_options_] _archivelocation_ _oldestkeptwalfile_

# PARAMETERS

**-b**, **--clean-backup-history**
> Remove backup history files as well.

**-d**, **--debug**
> Print debug logging output on stderr.

**-n**, **--dry-run**
> Print the names of files that would be removed (dry run).

**-V**, **--version**
> Print version and exit.

**-x**, **--strip-extension** _extension_
> Strip this extension from filenames before deciding if they should be deleted. Useful for compressed archives (e.g., .gz, .bz2).

**-?**, **--help**
> Show help and exit.

# DESCRIPTION

**pg_archivecleanup** removes old WAL archive files no longer needed by standby servers. It is typically used as **archive_cleanup_command** in **postgresql.conf** (or recovery.conf in older versions). It removes all WAL files older than the specified _oldestkeptwalfile_.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_receivewal](/man/pg_receivewal)(1)

