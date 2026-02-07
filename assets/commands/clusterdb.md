# TAGLINE

PostgreSQL table reclustering utility

# TLDR

**Cluster all tables** in a database

```clusterdb [database_name]```

**Cluster a specific table**

```clusterdb --table [table_name] [database_name]```

**Cluster all databases** on the server

```clusterdb --all```

**Cluster with connection options**

```clusterdb --host [hostname] --port [5432] --username [user] [database]```

**Cluster with verbose output**

```clusterdb --verbose [database_name]```

**Cluster using a specific index**

```clusterdb --table [table_name] --index [index_name] [database_name]```

**Echo commands being executed**

```clusterdb --echo [database_name]```

# SYNOPSIS

**clusterdb** [_-a_] [_-d dbname_] [_-t table_] [_-i index_] [_-v_] [_-e_] [_connection-options_] [_dbname_]

# PARAMETERS

**-a**, **--all**
> Cluster all databases on the server.

**-d**, **--dbname** _dbname_
> Database to cluster.

**-t**, **--table** _table_
> Cluster only the specified table.

**-i**, **--index** _index_
> Use the specified index for clustering the table.

**-v**, **--verbose**
> Print detailed information during processing.

**-e**, **--echo**
> Echo the commands being sent to the server.

**-q**, **--quiet**
> Do not display progress messages.

**-h**, **--host** _hostname_
> Database server host (default: local socket or localhost).

**-p**, **--port** _port_
> Database server port (default: 5432).

**-U**, **--username** _username_
> Username to connect as.

**-w**, **--no-password**
> Never prompt for password.

**-W**, **--password**
> Force password prompt.

**--maintenance-db** _dbname_
> Database to connect to for discovering other databases.

# DESCRIPTION

**clusterdb** is a PostgreSQL utility for reclustering tables in a database. Clustering physically reorders a table's data rows to match the order of an index, which can significantly improve performance for range queries that use that index.

When a table is clustered on an index, data rows are physically sorted in index order on disk. This reduces disk I/O for queries that scan ranges of index values, as sequential disk access is faster than random access. However, the cluster ordering degrades over time as rows are inserted, updated, or deleted.

The command is a wrapper around the SQL **CLUSTER** command, providing a convenient way to cluster tables from the command line. Without the **-t** option, it clusters all previously-clustered tables in the database.

Clustering is a one-time operation that does not maintain physical order over time. Regular reclustering may be needed for tables with frequent updates. The operation requires exclusive access to the table and can be resource-intensive for large tables.

# CAVEATS

Requires exclusive lock on the table during operation, blocking all other access. Large tables may take significant time and temporary disk space. Does not maintain cluster order after subsequent modifications. Only one index can define the cluster order for a table.

# HISTORY

**clusterdb** has been part of the PostgreSQL distribution since early versions, providing command-line access to the CLUSTER functionality. The CLUSTER command itself dates back to PostgreSQL's origins as a research database at UC Berkeley. The utility follows PostgreSQL's pattern of providing command-line wrappers for common administrative tasks.

# SEE ALSO

[psql](/man/psql)(1), [vacuumdb](/man/vacuumdb)(1), [reindexdb](/man/reindexdb)(1), [pg_repack](/man/pg_repack)(1)
