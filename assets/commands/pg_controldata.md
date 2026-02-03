# TLDR

**Show cluster control data**

```pg_controldata [data_dir]```

**Show with PGDATA environment**

```pg_controldata```

# SYNOPSIS

**pg_controldata** [_option_] [**-D**] _datadir_

# PARAMETERS

**-D**, **--pgdata** _dir_
> Data directory.

# DESCRIPTION

**pg_controldata** displays PostgreSQL cluster control information. Shows WAL position, checkpoint info, and database state. Useful for disaster recovery and debugging.

# SEE ALSO

[pg_resetwal](/man/pg_resetwal)(1), [pg_rewind](/man/pg_rewind)(1)

