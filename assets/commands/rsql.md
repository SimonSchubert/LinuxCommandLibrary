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

**rsql** is a SQL client. It connects to various databases.

Multi-database support. PostgreSQL, MySQL, SQLite.

Formatted output options. CSV, JSON, tables.

Interactive and batch modes. Query or script.

Written in Rust. Fast and efficient.

# CAVEATS

Connection string required. Database drivers needed. Rust-based tool.

# HISTORY

**rsql** is a command-line SQL client written in Rust, providing a unified interface for multiple database types.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)
