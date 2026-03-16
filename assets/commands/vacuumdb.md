# TAGLINE

Garbage-collect and analyze a PostgreSQL database

# TLDR

**Vacuum a database**

```vacuumdb [database]```

**Vacuum all databases**

```vacuumdb --all```

**Vacuum and update optimizer statistics**

```vacuumdb --analyze [database]```

**Full vacuum** (rewrites tables and reclaims disk space)

```vacuumdb --full [database]```

**Vacuum a specific table**

```vacuumdb -t [table_name] [database]```

**Run vacuum in parallel** with multiple jobs

```vacuumdb -j [4] [database]```

**Freeze tuples aggressively** to prevent transaction ID wraparound

```vacuumdb --freeze [database]```

**Only update statistics** without vacuuming

```vacuumdb --analyze-only [database]```

**Vacuum on a remote server** with authentication

```vacuumdb -h [hostname] -p [5432] -U [username] [database]```

# SYNOPSIS

**vacuumdb** [_-a_] [_-z_] [_-f_] [_-F_] [_-t table_] [_-j jobs_] [_options_] [_dbname_]

# PARAMETERS

**-a**, **--all**
> Vacuum all databases.

**-d** _DBNAME_, **--dbname** _DBNAME_
> Database to clean or analyze.

**-z**, **--analyze**
> Also calculate statistics for use by the optimizer.

**-Z**, **--analyze-only**
> Only calculate statistics, do not vacuum.

**--analyze-in-stages**
> Analyze in three stages with increasing statistics targets. Useful for databases with no or wholly incorrect statistics.

**-f**, **--full**
> Perform full vacuuming (rewrites tables, reclaims disk space).

**-F**, **--freeze**
> Aggressively freeze tuples to prevent transaction ID wraparound.

**-t** _TABLE_, **--table** _TABLE_
> Vacuum specific table only. Can be specified multiple times.

**-n** _SCHEMA_, **--schema** _SCHEMA_
> Clean or analyze all tables in the specified schema only. Can be specified multiple times.

**-N** _SCHEMA_, **--exclude-schema** _SCHEMA_
> Exclude tables in the specified schema.

**-j** _N_, **--jobs** _N_
> Run vacuum or analyze commands in parallel by running N jobs simultaneously.

**-P** _N_, **--parallel** _N_
> Specify the number of parallel workers for each vacuum operation.

**--skip-locked**
> Skip relations that cannot be immediately locked for processing.

**--no-index-cleanup**
> Do not remove index entries pointing to dead tuples.

**--no-truncate**
> Do not truncate empty pages at the end of the table.

**--disable-page-skipping**
> Disable skipping pages based on the visibility map.

**--min-xid-age** _AGE_
> Only process tables with a transaction ID age of at least AGE.

**--min-mxid-age** _AGE_
> Only process tables with a multixact ID age of at least AGE.

**-e**, **--echo**
> Echo the commands sent to the server.

**-q**, **--quiet**
> Do not display progress messages.

**-v**, **--verbose**
> Print detailed information during processing.

**-h** _HOST_, **--host** _HOST_
> Database server host.

**-p** _PORT_, **--port** _PORT_
> Server port.

**-U** _USER_, **--username** _USER_
> Username to connect as.

**-w**, **--no-password**
> Never prompt for password.

**-W**, **--password**
> Force password prompt.

**--maintenance-db** _DBNAME_
> Database to connect to when using --all.

# DESCRIPTION

**vacuumdb** cleans and analyzes PostgreSQL databases. It is a wrapper around the SQL VACUUM and ANALYZE commands, providing convenient options for scripting and cron jobs.

Regular vacuum marks dead tuples for reuse. It doesn't reclaim disk space but prevents table bloat from growing indefinitely.

Full vacuum rewrites tables, reclaiming disk space. It requires an exclusive lock on the table and more time than regular vacuum.

Analyze updates statistics used by the query planner. Accurate statistics lead to better query plans and performance.

Parallel vacuuming with **-j** processes multiple tables simultaneously. The **-P** option controls the number of parallel workers within each vacuum operation.

# CAVEATS

Full vacuum locks tables exclusively and requires extra disk space for the rewrite. Regular vacuum should run frequently. The **--freeze** option is important for preventing transaction ID wraparound on busy databases.

# HISTORY

**vacuumdb** has been part of **PostgreSQL** since early versions. It provides command-line access to vacuum operations essential for database maintenance.

# SEE ALSO

[psql](/man/psql)(1), [pg_dump](/man/pg_dump)(1), [reindexdb](/man/reindexdb)(1), [clusterdb](/man/clusterdb)(1), [createdb](/man/createdb)(1)
