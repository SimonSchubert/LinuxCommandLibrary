# TAGLINE

extracts all PostgreSQL databases including cluster-wide objects like roles

# TLDR

**Dump all databases**

```pg_dumpall > [backup.sql]```

**Dump only roles and tablespaces**

```pg_dumpall --globals-only > [globals.sql]```

**Dump specific host**

```pg_dumpall -h [hostname] -U [username] > [backup.sql]```

**Compressed backup**

```pg_dumpall | gzip > [backup.sql.gz]```

# SYNOPSIS

**pg_dumpall** [_options_]

# PARAMETERS

**-h**, **--host** _host_
> Database server host.

**-U**, **--username** _name_
> Connect as user.

**-p**, **--port** _port_
> Server port.

**-g**, **--globals-only**
> Only roles and tablespaces.

**-r**, **--roles-only**
> Only roles.

**-t**, **--tablespaces-only**
> Only tablespaces.

**--clean**
> Add DROP statements.

**-f** _file_
> Output file.

# DESCRIPTION

**pg_dumpall** extracts all PostgreSQL databases including cluster-wide objects like roles and tablespaces. Unlike pg_dump, it handles the entire cluster.

Output is a SQL script that can be restored with psql.
# Full cluster backup
pg_dumpall -U postgres > all_databases.sql

# Backup globals for restore prep
pg_dumpall -g > globals.sql

# Restore from backup
psql -U postgres -f all_databases.sql

# Specific encoding
pg_dumpall -E UTF8 > backup.sql
```

# CAVEATS

Output is plain SQL only (no custom format). For large databases, consider pg_dump per database. Requires superuser for complete backup.

# HISTORY

pg_dumpall is part of **PostgreSQL**, providing cluster-wide backup since early PostgreSQL versions.

# SEE ALSO

[pg_dump](/man/pg_dump)(1), [pg_restore](/man/pg_restore)(1), [psql](/man/psql)(1), [postgres](/man/postgres)(1)
