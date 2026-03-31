# TAGLINE

Lazygit-style TUI for SQL databases

# TLDR

**Launch the interactive TUI**

```sqlit```

**Connect to a saved connection**

```sqlit -c "[MyConnection]"```

**Run a query from the CLI**

```sqlit query -c "[MyConnection]" -q "[SELECT * FROM Users]" --format csv```

# SYNOPSIS

**sqlit** [**-c** _connection_name_]

**sqlit** **query** [**-c** _connection_name_] [**-q** _query_] [**--format** _format_]

# PARAMETERS

**-c** _CONNECTION_
> Connect using a saved connection name.

**-q** _QUERY_
> SQL query to execute (used with the **query** subcommand).

**--format** _FORMAT_
> Output format for query results: **table**, **csv**, **json** (used with the **query** subcommand).

# DESCRIPTION

**sqlit** is a lightweight, keyboard-driven TUI for connecting to and querying SQL databases from the terminal. It supports 20+ database systems including PostgreSQL, MySQL, SQLite, DuckDB, BigQuery, ClickHouse, and Snowflake. Features include query history, autocomplete, Vim-style editing, SSH tunneling, Docker container auto-discovery, and secure credential storage.

# HISTORY

**sqlit** was created by **Maxteabag** (Peter Adams) and is written in **Python**.

# SEE ALSO

[litecli](/man/litecli)(1), [harlequin](/man/harlequin)(1), [usql](/man/usql)(1), [pgcli](/man/pgcli)(1), [mycli](/man/mycli)(1)
