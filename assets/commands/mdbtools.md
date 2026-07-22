# TAGLINE

read Microsoft Access (.mdb, .accdb) databases on Unix

# TLDR

**List the tables** in a database

```mdb-tables [database.mdb]```

**Export a table** to CSV on stdout

```mdb-export [database.mdb] [tablename]```

**Dump the entire schema** as SQL DDL

```mdb-schema [database.mdb]```

**Count rows** in a table

```mdb-count [database.mdb] [tablename]```

**Open an interactive SQL** prompt

```mdb-sql [database.mdb]```

**Dump every table** to a directory of CSVs

```for t in $(mdb-tables -1 [database.mdb]); do mdb-export [database.mdb] "$t" > "$t.csv"; done```

**Convert to a SQLite database**

```mdb-schema [database.mdb] sqlite | sqlite3 [out.db] && for t in $(mdb-tables -1 [database.mdb]); do mdb-export -I sqlite [database.mdb] "$t" | sqlite3 [out.db]; done```

# SYNOPSIS

**mdb-tables** [_-1_] _database_

**mdb-schema** [_options_] _database_ [_backend_]

**mdb-export** [_options_] _database_ _tablename_

**mdb-sql** [_options_] _database_

**mdb-count** _database_ _tablename_

# PARAMETERS

_DATABASE_
> Microsoft Access database file (.mdb for Jet/Access 97-2003, .accdb for Access 2007+).

**mdb-tables** [**-1**]
> List tables; **-1** prints one name per line for shell iteration.

**mdb-schema** _backend_
> Dump SQL CREATE statements; backend selects dialect (access, sybase, oracle, sqlite, postgres, mysql).

**mdb-export** [**-I** _backend_] [**-d** _delim_] [**-q** _quote_]
> Export a single table. **-I** emits INSERT statements for the given backend; otherwise CSV.

**mdb-sql**
> Open an interactive SQL prompt supporting a subset of SQL92.

**mdb-count**
> Print the number of rows in a table.

# DESCRIPTION

**mdbtools** is a suite of utilities for reading Microsoft Access databases on Unix-like systems without requiring the Microsoft Jet or ACE engine. Each tool is a separate binary that operates on a single **.mdb** or **.accdb** file: **mdb-tables** lists tables, **mdb-schema** prints DDL, **mdb-export** dumps rows, **mdb-sql** runs queries, **mdb-count** counts rows, **mdb-prop** lists object properties, and **mdb-ver** shows the Access version stored in the file.

Typical workflows are migration (export every table to CSV or to another RDBMS using **-I** _backend_) and inspection (running SELECTs from **mdb-sql**). The suite also ships a libmdb library that GUI tools and the **mdb-export** ODBC driver use under the hood.

# CAVEATS

**Read-only**: mdbtools cannot create or modify Access databases. Some advanced features (encrypted files, certain index types, complex linked tables, attachment columns, multi-value fields) are partially or not supported. Older releases struggled with .accdb files; **mdbtools 1.0** (2021) added robust .accdb support, so always prefer recent versions.

# HISTORY

**mdbtools** was started by **Brian Bruns** in **2000** and stalled until **Evan Miller** revived the project in **2014**. The **1.0** release in **2021** brought up-to-date .accdb support, a packaged libmdb API, and an actively maintained ODBC driver.

# INSTALL

```dnf: sudo dnf install mdbtools```

```zypper: sudo zypper install mdbtools```

```brew: brew install mdbtools```

```nix: nix profile install nixpkgs#mdbtools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mdb-sql](/man/mdb-sql)(1), [sqlite3](/man/sqlite3)(1), [csvtool](/man/csvtool)(1)
