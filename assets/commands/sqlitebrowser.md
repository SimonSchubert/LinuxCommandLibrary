# TAGLINE

GUI editor for SQLite databases

# TLDR

**Open a database file**

```sqlitebrowser [database.db]```

**Open a database in read-only mode**

```sqlitebrowser -R [database.db]```

**Execute a SQL file after opening**

```sqlitebrowser -s [script.sql] [database.db]```

**Import a CSV file**

```sqlitebrowser --import-csv [data.csv] [database.db]```

**Open to a specific table**

```sqlitebrowser -t [tablename] [database.db]```

# SYNOPSIS

**sqlitebrowser** [_options_] [_database_]

# PARAMETERS

**-h**, **--help**
> Show command-line options.

**-v**, **--version**
> Display version.

**-q**, **--quit**
> Exit after executing scripts.

**-s** _FILE_, **--sql** _FILE_
> Execute SQL file after opening database.

**--import-csv** _FILE_
> Import CSV file into database.

**-t** _TABLE_, **--table** _TABLE_
> Browse a specific table on startup.

**-R**, **--read-only**
> Open database in read-only mode.

**-S** _FILE_, **--settings** _FILE_
> Use specified settings file.

**-o** _SETTING_, **--option** _SETTING_
> Temporarily set a setting (group/setting=value).

**--in-memory**
> Start with an in-memory database.

# DESCRIPTION

**sqlitebrowser** (DB Browser for SQLite) is a visual, open-source tool for creating, designing, and editing SQLite database files. It provides a spreadsheet-like interface for browsing data, an SQL editor for running queries, and tools for managing tables, indexes, and triggers.

Despite being a graphical application, it supports useful command-line options for automation, such as importing CSV files, executing SQL scripts, and opening specific tables.

# CAVEATS

This is a GUI application that requires a display server. The command-line options configure how the graphical window launches. Not a replacement for the **sqlite3** command-line shell.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [mdb-sql](/man/mdb-sql)(1)

