# TLDR

**Receive WAL to directory**

```pg_receivewal -D [wal_dir] -h [host]```

**Receive with slot**

```pg_receivewal -D [wal_dir] -S [slot_name]```

**Receive with compression**

```pg_receivewal -D [wal_dir] -Z [level]```

# SYNOPSIS

**pg_receivewal** [_options_]

# PARAMETERS

**-D**, **--directory** _dir_
> WAL destination.

**-h**, **--host** _host_
> Server hostname.

**-S**, **--slot** _name_
> Replication slot.

**-Z**, **--compress** _level_
> Compression level.

**--create-slot**
> Create replication slot.

**--synchronous**
> Flush WAL synchronously.

# DESCRIPTION

**pg_receivewal** streams WAL from server to archive. Creates continuous WAL archive for point-in-time recovery. Alternative to archive_command for WAL archiving.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_archivecleanup](/man/pg_archivecleanup)(1)

