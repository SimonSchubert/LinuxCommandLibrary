# TAGLINE

execute SQL queries on versioned database

# TLDR

**Run SQL query**

```dolt sql -q "[SELECT * FROM table]"```

**Start interactive** SQL shell

```dolt sql```

**Execute SQL file**

```dolt sql < [script.sql]```

**Run query with** result format

```dolt sql -q "[SELECT * FROM table]" -r [csv]```

**Start MySQL-compatible** server

```dolt sql-server```

**Batch mode** execution

```dolt sql -b -q "[INSERT INTO table VALUES (1, 'a')]"```

# SYNOPSIS

**dolt sql** [_options_] [-q _query_]

# PARAMETERS

**-q** _QUERY_
> SQL query to execute.

**-r** _FORMAT_
> Result format: tabular, csv, json, null.

**-b**, **--batch**
> Batch mode (no formatting).

**-x**, **--result-format**
> Vertical result format.

**--continue**
> Continue on error in batch mode.

**--help**
> Display help information.

# DESCRIPTION

**dolt sql** provides SQL access to Dolt repositories. It supports MySQL-compatible SQL syntax for querying and modifying data in versioned tables.

The interactive shell offers tab completion and command history. Queries can read from any branch or commit using Dolt's SQL extensions, enabling time-travel queries across the repository history.

dolt sql-server starts a MySQL-compatible server allowing connections from standard MySQL clients, ORMs, and applications.

# CAVEATS

Some MySQL features not fully supported. Write queries modify working set (need commit). Large result sets may be slow to render. Server mode requires port availability.

# HISTORY

dolt sql provides the primary data interaction interface for **Dolt**, implementing MySQL compatibility to enable use with existing SQL tools and knowledge.

# SEE ALSO

[dolt](/man/dolt)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)
