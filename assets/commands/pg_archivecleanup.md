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

**-d**
> Debug output.

**-n**
> Dry run (show what would be removed).

**-x** _extension_
> File extension for compressed files.

# DESCRIPTION

**pg_archivecleanup** removes old WAL archive files no longer needed by standby servers. Typically used as archive_cleanup_command in recovery.conf. Maintains WAL archive size.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_receivewal](/man/pg_receivewal)(1)

