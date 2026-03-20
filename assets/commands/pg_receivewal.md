# TAGLINE

streams WAL from server to archive

# TLDR

**Receive WAL** to a directory from a remote server

```pg_receivewal -D [wal_dir] -h [host] -U [username]```

**Receive using a replication slot**

```pg_receivewal -D [wal_dir] -S [slot_name] -h [host]```

**Create a replication slot** and exit

```pg_receivewal -D [wal_dir] -S [slot_name] --create-slot -h [host]```

**Receive with gzip compression**

```pg_receivewal -D [wal_dir] -Z [gzip:5] -h [host]```

**Receive without looping** on connection errors

```pg_receivewal -D [wal_dir] -n -h [host]```

# SYNOPSIS

**pg_receivewal** [_options_]

# PARAMETERS

**-D**, **--directory** _dir_
> WAL destination directory (required).

**-h**, **--host** _host_
> Server hostname or socket directory.

**-p**, **--port** _port_
> Server port number.

**-U**, **--username** _name_
> Username to connect as.

**-S**, **--slot** _name_
> Use a replication slot.

**-Z**, **--compress** _method[:detail]_
> Compression method and optional level (gzip, lz4, or none).

**-n**, **--no-loop**
> Don't retry on connection errors; exit immediately.

**-s**, **--status-interval** _seconds_
> Seconds between status packets (default: 10).

**-E**, **--endpos** _lsn_
> Stop replication at the specified LSN.

**--create-slot**
> Create a new physical replication slot, then exit.

**--drop-slot**
> Drop the named replication slot, then exit.

**--if-not-exists**
> Don't error if slot already exists with --create-slot.

**--synchronous**
> Flush WAL data to disk immediately after receipt.

**--no-sync**
> Don't force WAL data to be flushed to disk.

# DESCRIPTION

**pg_receivewal** streams WAL from server to archive. Creates continuous WAL archive for point-in-time recovery. Alternative to archive_command for WAL archiving.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_archivecleanup](/man/pg_archivecleanup)(1), [pg_recvlogical](/man/pg_recvlogical)(1)

