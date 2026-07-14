# TAGLINE

execute SQL queries on versioned database

# TLDR

**Run SQL query**

```dolt sql -q "[SELECT * FROM table]"```

**Start interactive** SQL shell

```dolt sql```

**Execute a SQL file**

```dolt sql --file [script.sql]```

**Run a query** and choose the result format

```dolt sql -q "[SELECT * FROM table]" -r [csv]```

**Query a table as of another branch** or commit

```dolt sql -q "[SELECT * FROM table AS OF 'main']"```

**Keep going** after a failing statement

```dolt sql --continue --file [script.sql]```

**Save a query** to the catalog and run it later by name

```dolt sql -q "[SELECT * FROM table]" -s [my_query]```

```dolt sql -x [my_query]```

# SYNOPSIS

**dolt sql**

**dolt sql** < _script.sql_

**dolt sql** **-q** _query_ [**-r** _format_] [**-s** _name_ **-m** _message_]

**dolt sql** **-x** _name_

**dolt sql** **--list-saved**

# PARAMETERS

**-q**, **--query** _QUERY_
> Run a single query and exit.

**-r**, **--result-format** _FORMAT_
> How to format the output: `tabular` (default), `csv`, `json`, `vertical`, or `parquet`.

**-f**, **--file** _FILE_
> Execute the statements in _FILE_.

**-c**, **--continue**
> Keep running the remaining queries after one fails.

**-s**, **--save** _NAME_
> Save the query to the query catalog under _NAME_.

**-m**, **--message** _MSG_
> Store a descriptive message alongside a saved query.

**-x**, **--execute** _NAME_
> Execute the saved query with the given name.

**-l**, **--list-saved**
> List all saved queries.

**--binary-as-hex** / **--skip-binary-as-hex**
> Print binary data as hex, or do not. Enabled by default on interactive terminals.

**--disable-auto-gc**
> Do not run automatic garbage collection for this invocation.

**-b**, **--batch**
> Retained as a no-op for compatibility; batch processing is no longer a separate mode.

# DESCRIPTION

**dolt sql** is the primary way to read and write a Dolt database. It speaks MySQL-compatible SQL, so most existing queries, clients, and ORMs work unchanged.

With no arguments it opens an interactive shell with history and tab completion. With **-q** it runs one statement and exits, which is the form used in scripts. Results can be rendered as a table, or as CSV, JSON, or Parquet for piping into other tools.

Dolt's version control is exposed through SQL rather than through extra commands. `AS OF` reads a table at any branch, tag, or commit; `dolt_diff_<table>` and `dolt_history_<table>` expose per-row change history; and system tables such as `dolt_log`, `dolt_branches`, and `dolt_status` mirror the CLI. Stored procedures like `CALL DOLT_COMMIT(...)` and `CALL DOLT_MERGE(...)` let an application commit and merge without ever leaving SQL.

Writes made here land in the working set, exactly as if you had edited files in a Git checkout: they are not part of the history until they are staged and committed.

# CAVEATS

Compatibility with MySQL is high but not total: some functions, storage engines, and edge-case behaviours differ, and triggers, views, and stored procedures are supported to varying degrees depending on version. **-b**/**--batch** still parses but does nothing. A separate `dolt sql-server` process holds a lock on the database, so running the CLI shell against the same database while a server is up connects to that server rather than opening the files directly.

# HISTORY

Dolt's SQL engine is **go-mysql-server**, a MySQL-compatible engine that DoltHub took over and heavily extended. Making SQL the interface, rather than a bespoke query language, is what allowed Dolt to slot into existing tooling, and the version-control surface was subsequently pushed into SQL as system tables and stored procedures so that applications could branch, diff, and merge data without shelling out.

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-commit](/man/dolt-commit)(1), [dolt-merge](/man/dolt-merge)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/dolthub/dolt)```

```[Documentation](https://www.dolthub.com/docs/cli-reference/cli/)```

<!-- verified: 2026-07-14 -->

