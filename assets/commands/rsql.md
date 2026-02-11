# TAGLINE

Interactive SQL client for multiple databases

# TLDR

**Connect to database**

```rsql -d [database_url]```

**Execute query**

```rsql -d [database_url] -c "[SELECT * FROM users]"```

**Run SQL file**

```rsql -d [database_url] -f [query.sql]```

**Output as CSV**

```rsql -d [database_url] -c "[query]" --csv```

**Output as JSON**

```rsql -d [database_url] -c "[query]" --json```

# SYNOPSIS

**rsql** [_-d url_] [_-c query_] [_-f file_] [_options_]

# PARAMETERS

**-d** _URL_
> Database URL.

**-c** _QUERY_
> Execute query.

**-f** _FILE_
> Run SQL file.

**--csv**
> CSV output.

**--json**
> JSON output.

**-t**
> Table format.

**-v**
> Verbose mode.

# DESCRIPTION

**rsql** is a command-line SQL client written in Rust that provides a unified interface for connecting to multiple database types including PostgreSQL, MySQL, and SQLite. It supports both interactive mode for exploratory queries and batch mode for running SQL files and single commands from scripts.

Output can be formatted as CSV, JSON, or formatted tables, making it suitable for both human reading and data pipeline integration. The **-d** flag specifies a database connection URL, while **-c** executes a query directly and **-f** runs a SQL file against the specified database.

# CAVEATS

Connection string required. Database drivers needed. Rust-based tool.

# HISTORY

**rsql** is a command-line SQL client written in Rust, providing a unified interface for multiple database types.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)
