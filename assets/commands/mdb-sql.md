# TLDR

**Query database**

```mdb-sql [database.mdb]```

**Execute SQL**

```echo "[SELECT * FROM table]" | mdb-sql [database.mdb]```

**Interactive mode**

```mdb-sql -p [database.mdb]```

**Specify delimiter**

```mdb-sql -d [,] [database.mdb]```

**No headers**

```mdb-sql -H [database.mdb]```

# SYNOPSIS

**mdb-sql** [_options_] _database_

# PARAMETERS

_DATABASE_
> Microsoft Access database file.

**-p**
> Pretty print output.

**-d** _DELIM_
> Field delimiter.

**-H**
> Suppress headers.

**--help**
> Display help information.

# DESCRIPTION

**mdb-sql** executes SQL queries on Access databases. It provides SQL interface to MDB files.

The tool is part of mdbtools. It supports basic SELECT, INSERT, UPDATE operations.

mdb-sql queries Access databases.

# CAVEATS

Limited SQL support. Part of mdbtools. May not support all Access features.

# HISTORY

mdb-sql is part of **mdbtools** for accessing Microsoft Access databases on Linux/Unix.

# SEE ALSO

[mdbtools](/man/mdbtools)(1), [mdb-tables](/man/mdb-tables)(1), [mdb-export](/man/mdb-export)(1)

