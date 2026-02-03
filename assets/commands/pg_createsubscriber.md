# TLDR

**Create subscriber from standby**

```pg_createsubscriber -d [dbname] -D [data_dir] -P [conninfo]```

# SYNOPSIS

**pg_createsubscriber** [_options_]

# PARAMETERS

**-d**, **--database** _name_
> Database name.

**-D**, **--pgdata** _dir_
> Data directory.

**-P**, **--publisher-server** _conninfo_
> Publisher connection string.

**-n**, **--dry-run**
> Show what would be done.

# DESCRIPTION

**pg_createsubscriber** converts a physical standby to logical replication subscriber. Transforms streaming replication to logical replication. Part of PostgreSQL 17+.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1)

