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

**-e** _xid_
> Set next transaction ID.

**-l** _walfile_
> Force minimum WAL starting location.

# DESCRIPTION

**pg_resetwal** resets write-ahead log and control information. Last resort recovery when WAL is corrupted. May cause data loss. Server must be stopped.

# CAVEATS

Use only as last resort. May cause data loss. Server must be stopped.

# SEE ALSO

[pg_controldata](/man/pg_controldata)(1), [pg_rewind](/man/pg_rewind)(1)

