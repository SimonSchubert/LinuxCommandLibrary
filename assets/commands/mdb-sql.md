# TAGLINE

SQL interface to MDB Tools for Access databases

# TLDR

**Start interactive SQL session**

```mdb-sql [database.mdb]```

**Execute SQL from stdin**

```echo "SELECT * FROM [table_name]" | mdb-sql [database.mdb]```

**Pretty print output** (ASCII table format)

```mdb-sql -p [database.mdb]```

**Execute SQL from a file**

```mdb-sql -i [query.sql] [database.mdb]```

**Specify column delimiter** and suppress headers

```mdb-sql -d [,] -H [database.mdb]```

**Write output to file**

```mdb-sql -o [output.csv] [database.mdb]```

# SYNOPSIS

**mdb-sql** [_options_] _database_

# PARAMETERS

_DATABASE_
> Microsoft Access database file (.mdb or .accdb).

**-H**, **--no-header**
> Suppress column header row.

**-F**, **--no-footer**
> Suppress footer row.

**-p**, **--no-pretty-print**
> Tab-separated output instead of ASCII table format.

**-d**, **--delimiter** _DELIM_
> Use alternative column delimiter.

**-i**, **--input** _FILE_
> Read SQL from input file.

**-o**, **--output** _FILE_
> Write results to output file.

**--version**
> Print mdbtools version and exit.

# INTERACTIVE COMMANDS

**list tables**: List available tables in the database.
**describe table** _name_: Display column information for a table.
**go**: Execute the current SQL batch.
**reset**: Clear the current SQL batch.
**connect** _database_: Connect to a database (or switch databases).
**disconnect**: Disconnect from the current database.

# DESCRIPTION

**mdb-sql** provides an SQL interface to Microsoft Access databases. It can run interactively or process SQL from stdin or files. SQL batches are terminated with the **go** command in interactive mode.

The tool is part of the **mdbtools** suite. It supports SELECT queries against MDB/ACCDB files.

# CAVEATS

Limited SQL support compared to full Access SQL. Part of mdbtools. May not support all Access features or data types.

# HISTORY

mdb-sql is part of **mdbtools** for accessing Microsoft Access databases on Linux/Unix.

# SEE ALSO

[mdbtools](/man/mdbtools)(1)

