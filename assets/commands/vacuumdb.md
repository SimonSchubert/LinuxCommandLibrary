# TLDR

**Vacuum database**

```vacuumdb [database]```

**Vacuum all databases**

```vacuumdb --all```

**Vacuum with analyze**

```vacuumdb --analyze [database]```

**Full vacuum** (reclaims space)

```vacuumdb --full [database]```

**Vacuum specific table**

```vacuumdb -t [table_name] [database]```

**Parallel vacuum**

```vacuumdb -j [4] [database]```

**Vacuum with verbose**

```vacuumdb -v [database]```

# SYNOPSIS

**vacuumdb** [_-a_] [_-z_] [_-f_] [_-t table_] [_-j jobs_] [_options_] [_database_]

# PARAMETERS

**-a**, **--all**
> Vacuum all databases.

**-z**, **--analyze**
> Update statistics.

**-Z**, **--analyze-only**
> Only analyze, no vacuum.

**-f**, **--full**
> Full vacuum.

**-t** _TABLE_
> Vacuum specific table.

**-j** _N_, **--jobs** _N_
> Parallel jobs.

**-e**, **--echo**
> Echo commands.

**-q**, **--quiet**
> Quiet mode.

**-v**, **--verbose**
> Verbose output.

**-h** _HOST_
> Database server host.

**-p** _PORT_
> Server port.

**-U** _USER_
> Username.

**-W**
> Prompt for password.

**--min-mxid-age** _AGE_
> Min age for MXID vacuum.

# DESCRIPTION

**vacuumdb** cleans and analyzes PostgreSQL databases. It reclaims storage and updates query planner statistics.

Regular vacuum marks dead tuples for reuse. It doesn't reclaim disk space but prevents table bloat from growing indefinitely.

Full vacuum rewrites tables, reclaiming disk space. It requires exclusive lock and more time than regular vacuum.

Analyze updates statistics used by the query planner. Accurate statistics lead to better query plans and performance.

Parallel vacuuming processes multiple tables simultaneously. This speeds up vacuum on databases with many tables.

The tool wraps the SQL VACUUM command with convenient options for scripting and cron jobs.

# CAVEATS

Full vacuum locks tables exclusively. Regular vacuum should run frequently. Large tables take time. Disk space needed for full vacuum.

# HISTORY

**vacuumdb** has been part of **PostgreSQL** since early versions. It provides command-line access to vacuum operations essential for database maintenance.

# SEE ALSO

[psql](/man/psql)(1), [pg_dump](/man/pg_dump)(1), [reindexdb](/man/reindexdb)(1), [clusterdb](/man/clusterdb)(1)
