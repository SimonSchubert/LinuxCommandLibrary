# TLDR

**List tables**

```mdb-tables [database.mdb]```

**Export table to CSV**

```mdb-export [database.mdb] [tablename]```

**Show schema**

```mdb-schema [database.mdb]```

**Get table count**

```mdb-count [database.mdb] [tablename]```

**Describe table**

```mdb-prop [database.mdb] [tablename]```

**SQL query**

```mdb-sql [database.mdb]```

# SYNOPSIS

**mdb-*** _command_ _database_ [_options_]

# PARAMETERS

_DATABASE_
> Microsoft Access database file.

**mdb-tables**
> List tables.

**mdb-export**
> Export to CSV.

**mdb-schema**
> Show schema.

**mdb-sql**
> SQL interface.

**mdb-count**
> Row count.

**--help**
> Display help information.

# DESCRIPTION

**mdbtools** is a suite for reading Microsoft Access databases. It exports data and schema from MDB files.

The tools enable Access database access on Unix systems without Microsoft Office.

mdbtools reads Access databases.

# CAVEATS

Read-only access. Some features unsupported. .mdb format focus.

# HISTORY

mdbtools was created to provide **Microsoft Access** database access on non-Windows platforms.

# SEE ALSO

[mdb-sql](/man/mdb-sql)(1), [sqlite3](/man/sqlite3)(1), [csvtool](/man/csvtool)(1)

