# TAGLINE

Rebuild PostgreSQL database indexes

# TLDR

**Reindex database**

```reindexdb [database_name]```

**Reindex specific table**

```reindexdb -t [table_name] [database_name]```

**Reindex specific index**

```reindexdb -i [index_name] [database_name]```

**Reindex all databases**

```reindexdb -a```

**Reindex system catalogs**

```reindexdb -s [database_name]```

**Connect as user**

```reindexdb -U [username] [database_name]```

**Concurrently reindex**

```reindexdb --concurrently [database_name]```

# SYNOPSIS

**reindexdb** [_-t table_] [_-i index_] [_-a_] [_-s_] [_options_] [_database_]

# PARAMETERS

**-t**, **--table** _NAME_
> Reindex specific table.

**-i**, **--index** _NAME_
> Reindex specific index.

**-a**, **--all**
> All databases.

**-s**, **--system**
> System catalogs only.

**--concurrently**
> Concurrent reindex.

**-U**, **--username** _USER_
> Connect as user.

**-h**, **--host** _HOST_
> Database server.

**-p**, **--port** _PORT_
> Server port.

**-j**, **--jobs** _N_
> Parallel jobs.

# DESCRIPTION

**reindexdb** rebuilds PostgreSQL indexes. It's a wrapper around SQL REINDEX.

Full database reindex rebuilds all indexes. Fixes corruption and reduces bloat.

Table-specific reindex targets problem areas. Faster than full database reindex.

Concurrent mode allows operations during reindex. Indexes remain usable but reindex is slower.

Parallel jobs speed up multi-table reindex. Each table indexed separately.

# CAVEATS

Locks tables during non-concurrent reindex. Large indexes take time. Disk space needed.

# HISTORY

**reindexdb** is part of **PostgreSQL**, providing command-line access to the REINDEX SQL command. It simplifies database maintenance operations.

# SEE ALSO

[vacuumdb](/man/vacuumdb)(1), [psql](/man/psql)(1), [pg_dump](/man/pg_dump)(1)
