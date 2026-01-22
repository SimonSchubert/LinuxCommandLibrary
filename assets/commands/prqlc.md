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

**prqlc** compiles PRQL query language to SQL. Query transpiler.

The tool converts PRQL syntax. Modern query language.

prqlc generates SQL.

# CAVEATS

PRQL is experimental. Supports multiple SQL dialects.

# HISTORY

PRQL was created as a **modern alternative** to SQL syntax.

# SEE ALSO

[psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1)

