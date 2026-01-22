# TLDR

**Open or create a database**

```sqlite3 [database.db]```

**Execute a SQL query**

```sqlite3 [database.db] "[SELECT * FROM table]"```

**Execute SQL from a file**

```sqlite3 [database.db] < [query.sql]```

**Export query results to CSV**

```sqlite3 -csv [database.db] "[SELECT * FROM table]" > [output.csv]```

**Show all tables**

```sqlite3 [database.db] ".tables"```

**Show table schema**

```sqlite3 [database.db] ".schema [table_name]"```

**Import CSV into table**

```sqlite3 [database.db] ".import [file.csv] [table_name]"```

**Open in-memory database**

```sqlite3 :memory:```

# SYNOPSIS

**sqlite3** [_options_] [_database_] [_sql_]

# PARAMETERS

**-csv**
> Set output mode to CSV

**-json**
> Set output mode to JSON

**-column**
> Set output mode to column format

**-header**
> Include column headers in output

**-line**
> Set output mode to one value per line

**-separator** _sep_
> Set field separator for CSV mode

**-init** _file_
> Execute SQL from file at startup

**-batch**
> Batch mode; exit on error

**-readonly**
> Open database in read-only mode

**-version**
> Show version information

# DOT COMMANDS

**.tables**: List all tables
**.schema** [_table_]: Show CREATE statements
**.headers on|off**: Toggle column headers
**.mode** _mode_: Set output mode (csv, column, json, line, etc.)
**.import** _file table_: Import data from file
**.output** _file_: Redirect output to file
**.read** _file_: Execute SQL from file
**.dump** [_table_]: Dump database as SQL
**.exit** or **.quit**: Exit sqlite3
**.help**: Show all dot commands

# DESCRIPTION

**sqlite3** is the command-line interface for SQLite, a self-contained, serverless SQL database engine. SQLite databases are single files that can be easily shared and backed up.

The tool provides both interactive and batch modes. In interactive mode, enter SQL statements ending with semicolons or dot commands for administrative functions. Batch mode processes SQL from arguments or stdin.

SQLite supports most SQL features including transactions, triggers, views, and complex queries. It's embedded in countless applications and is ideal for local storage, testing, and small-scale applications.

# CAVEATS

SQLite uses dynamic typing; any column can store any type regardless of declared type. This differs from strict SQL databases.

Concurrent writes are limited—SQLite locks the entire database during writes. For high-concurrency applications, consider client-server databases.

Dot commands are sqlite3-specific, not SQL. They don't work in SQL statements or from application code.

# SEE ALSO

[mysql](/man/mysql)(1), [psql](/man/psql)(1), [sqlite-utils](/man/sqlite-utils)(1)
