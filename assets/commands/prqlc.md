# TAGLINE

Compile PRQL queries to SQL

# TLDR

**Compile PRQL to SQL**

```prqlc compile [query.prql]```

**Compile from stdin**

```echo "from employees | select name" | prqlc compile```

**Format PRQL**

```prqlc fmt [query.prql]```

**Output to file**

```prqlc compile [query.prql] -o [output.sql]```

# SYNOPSIS

**prqlc** _command_ [_options_] [_file_]

# PARAMETERS

**compile**
> Compile PRQL to SQL.

**fmt**
> Format PRQL code.

**-o** _FILE_
> Output file.

**--target** _DB_
> Target database.

# DESCRIPTION

**prqlc** is the compiler for PRQL (Pipelined Relational Query Language), a modern query language designed as a more readable and composable alternative to SQL. It transpiles PRQL source code into standard SQL that can be executed against any supported database.

PRQL uses a pipeline syntax where data transformations are chained with the pipe operator, making complex queries easier to read and write than equivalent nested SQL. The compiler supports multiple SQL dialects through the **--target** option, generating database-specific SQL for PostgreSQL, MySQL, SQLite, BigQuery, and others.

The **fmt** subcommand formats PRQL source code for consistent style, and the compiler accepts input from files or stdin for use in build pipelines.

# CAVEATS

PRQL is experimental. Supports multiple SQL dialects.

# HISTORY

PRQL was created as a **modern alternative** to SQL syntax.

# SEE ALSO

[psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1)

