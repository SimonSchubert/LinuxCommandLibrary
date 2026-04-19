# TAGLINE

Interactive SQL client for multiple databases

# TLDR

**Connect to database**

```rsql --url [postgres://user:pass@host/db]```

**Execute query**

```rsql --url [postgres://user:pass@host/db] -c "[SELECT * FROM users]"```

**Run SQL file**

```rsql --url [postgres://user:pass@host/db] -f [query.sql]```

**Output as CSV**

```rsql --url [postgres://user:pass@host/db] -c "[query]" --csv```

**Output as JSON**

```rsql --url [postgres://user:pass@host/db] -c "[query]" --json```

# SYNOPSIS

**rsql** [**--url** _url_] [_-c query_ | _-f file_] [_options_]

# PARAMETERS

**--url** _URL_
> Database connection URL (e.g. `postgres://user:pass@host/db`, `mysql://...`, `sqlite://path`).

**-c**, **--commands** _QUERY_
> Execute one or more semicolon-separated SQL commands and exit.

**-f**, **--file** _FILE_
> Execute commands from an SQL script file and exit.

**--format** _FORMAT_
> Output format: ascii, csv, expanded, html, json, jsonl, markdown, plain, psql, sqlite, tsv, unicode, xml, yaml.

**--csv**
> Shorthand for `--format csv`.

**--json**
> Shorthand for `--format json`.

**--color** _WHEN_
> Colorize output: always, auto, or never.

**--theme** _THEME_
> Syntax highlighting theme (e.g. solarized-dark, base16-ocean.dark).

**--echo** _MODE_
> Echo commands before execution: on, off, prompt.

**--timer**
> Print the elapsed time for each command.

**--history**
> Enable command history.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**rsql** is a command-line SQL client written in Rust that provides a unified interface for connecting to many database engines, including PostgreSQL, MySQL, MariaDB, SQLite, DuckDB, Redshift, Snowflake, SQL Server, and others. It supports both interactive mode for exploratory queries and batch mode for running SQL files and single commands from scripts.

Output can be formatted as CSV, JSON, Markdown, HTML, or formatted tables, making it suitable for both human reading and data pipeline integration. The **--url** flag specifies a database connection URL, while **-c** executes a query directly and **-f** runs a SQL file against the specified database.

# CAVEATS

Connection string required. Database drivers needed. Rust-based tool.

# HISTORY

**rsql** is a command-line SQL client written in Rust, providing a unified interface for multiple database types.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)
