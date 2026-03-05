# TAGLINE

TUI for viewing and editing database files

# TLDR

**Open a SQLite database**

```termdbms [mydata.db]```

**Convert and open a CSV file as SQLite**

```termdbms --csv [data.csv]```

**Connect to a MySQL database**

```termdbms --url "[mysql://user:pass@host/db]"```

# SYNOPSIS

**termdbms** [_options_] [_database-file_]

# PARAMETERS

**--csv** _FILE_
> Convert a CSV file to SQLite and open it.

**--url** _URL_
> Connect to a MySQL database via URL.

# DESCRIPTION

**termdbms** is a terminal UI for viewing and editing SQLite and MySQL databases. It supports SQL queries with undo/redo, CSV-to-SQLite conversion, CSV/SQLite export, and automatic JSON formatting in selection mode.

# HISTORY

**termdbms** was created by **mathaou** and is written in **Go**.

# SEE ALSO

[litecli](/man/litecli)(1), [harlequin](/man/harlequin)(1), [sqlit](/man/sqlit)(1)
