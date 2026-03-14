# TAGLINE

resets write-ahead log and control information

# TLDR

**Reset WAL (dry run)**

```pg_resetwal -n [data_dir]```

**Reset WAL**

```pg_resetwal [data_dir]```

**Force reset**

```pg_resetwal -f [data_dir]```

# SYNOPSIS

**pg_resetwal** [_options_] [**-D**] _datadir_

# PARAMETERS

**-D**, **--pgdata** _dir_
> Data directory.

**-n**, **--dry-run**
> Show what would be done.

**-f**, **--force**
> Force reset.

**-e**, **--epoch** _epoch_
> Set next transaction ID epoch.

**-x**, **--next-transaction-id** _xid_
> Set next transaction ID.

**-o**, **--next-oid** _oid_
> Set next OID.

**-m**, **--multixact-ids** _mxid,mxid_
> Set next and oldest multitransaction ID.

**-O**, **--multixact-offset** _mxoff_
> Set next multitransaction offset.

**-c**, **--commit-timestamp-ids** _xid,xid_
> Set oldest and newest transaction IDs for commit timestamps.

**-u**, **--oldest-transaction-id** _xid_
> Set oldest unfrozen transaction ID.

**-l**, **--next-wal-file** _walfile_
> Force minimum WAL starting location.

**--wal-segsize** _size_
> Set WAL segment size in megabytes.

# DESCRIPTION

**pg_resetwal** resets write-ahead log and control information. Last resort recovery when WAL is corrupted. May cause data loss. Server must be stopped.

# CAVEATS

Use only as a last resort when WAL is corrupted or pg_controldata shows inconsistencies. May cause data loss and transaction integrity issues. The PostgreSQL server must be stopped before running.

# SEE ALSO

[pg_controldata](/man/pg_controldata)(1), [pg_rewind](/man/pg_rewind)(1)

