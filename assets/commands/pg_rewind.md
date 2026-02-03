# TLDR

**Rewind target to source**

```pg_rewind -D [target_dir] --source-server="host=[host] dbname=[db]"```

**Rewind from local source**

```pg_rewind -D [target_dir] --source-pgdata=[source_dir]```

**Dry run**

```pg_rewind -n -D [target_dir] --source-server="[conninfo]"```

# SYNOPSIS

**pg_rewind** [_options_]

# PARAMETERS

**-D**, **--target-pgdata** _dir_
> Target data directory.

**--source-pgdata** _dir_
> Source data directory.

**--source-server** _conninfo_
> Source connection string.

**-n**, **--dry-run**
> Show what would be done.

**-P**, **--progress**
> Show progress.

# DESCRIPTION

**pg_rewind** synchronizes a PostgreSQL cluster with another copy. Resynchronizes diverged clusters after failover. Faster than full backup for failed primary recovery.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_resetwal](/man/pg_resetwal)(1)

