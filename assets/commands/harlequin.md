# TLDR

**Connect to DuckDB database**

```harlequin [database.db]```

**Connect to SQLite database**

```harlequin -a sqlite [database.sqlite]```

**Connect to PostgreSQL**

```harlequin -a postgres -h [localhost] -p [5432] -U [user] -d [database]```

**Connect to MySQL**

```harlequin -a mysql -h [localhost] -u [user] -p [database]```

**Open in-memory DuckDB**

```harlequin```

**Query Parquet files**

```harlequin [data.parquet]```

**Connect with connection string**

```harlequin "postgresql://[user]:[pass]@[host]/[db]"```

**Set read-only mode**

```harlequin --read-only [database.db]```

# SYNOPSIS

**harlequin** [_options_] [_connection_]

# PARAMETERS

**-a**, **--adapter** _name_
> Database adapter: duckdb (default), sqlite, postgres, mysql, bigquery.

**-h**, **--host** _host_
> Database host.

**-p**, **--port** _port_
> Database port.

**-U**, **--user** _user_
> Database username.

**-d**, **--database** _name_
> Database name.

**--read-only**
> Open connection in read-only mode.

**-t**, **--theme** _theme_
> Color theme name.

**--limit** _rows_
> Default result row limit.

**--help**
> Display help information.

**--version**
> Display version information.

# KEYBOARD COMMANDS

**Ctrl+Enter**
> Execute query.

**Ctrl+j**
> Execute query (alternative).

**Ctrl+o**
> Open query file.

**Ctrl+s**
> Save query to file.

**F1-F10**
> Switch between query tabs.

**Ctrl+n**
> New query tab.

**Ctrl+w**
> Close current tab.

**Ctrl+e**
> Export results.

**Ctrl+q**
> Quit.

# DESCRIPTION

**harlequin** is a terminal-based SQL IDE supporting multiple database backends. It provides a rich interface for writing queries, exploring schemas, and viewing results.

The interface shows a schema browser, query editor with syntax highlighting, and results pane. Multiple query tabs enable working on several queries simultaneously.

DuckDB is the default adapter, enabling direct querying of Parquet, CSV, and JSON files. Other adapters connect to traditional databases like PostgreSQL, MySQL, and SQLite.

Query results display in a scrollable table with export options. History and autocomplete assist query writing. The schema browser shows tables, columns, and types.

Configuration via config file or environment variables sets defaults for themes, limits, and connection preferences.

# CAVEATS

Some adapters require additional packages. Large result sets may impact terminal performance. Keyboard shortcuts may conflict with terminal emulator bindings. Features vary by adapter.

# HISTORY

Harlequin was created by **Ted Conbeer** and first released in **2023**. Built with Textual framework, it provides a modern terminal SQL experience. The project grew from frustration with CLI database tools lacking visual feedback. It emphasizes the DuckDB ecosystem while supporting traditional databases. Active development continues with new adapters and features.

# SEE ALSO

[duckdb](/man/duckdb)(1), [psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)
