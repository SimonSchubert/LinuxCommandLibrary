# TAGLINE

Universal command-line database client

# TLDR

**Connect to PostgreSQL**

```usql postgres://[user]:[pass]@[host]/[database]```

**Connect to MySQL**

```usql mysql://[user]:[pass]@[host]/[database]```

**Connect to SQLite**

```usql sqlite:[database.db]```

**Execute query**

```usql [connection_url] -c "[SELECT * FROM table]"```

**Execute file**

```usql [connection_url] -f [script.sql]```

**List databases**

```usql [connection_url] -c "\\l"```

**Describe table**

```usql [connection_url] -c "\\d [table_name]"```

# SYNOPSIS

**usql** [_-c command_] [_-f file_] [_options_] _connection_url_

# PARAMETERS

**-c** _CMD_
> Execute command and exit.

**-f** _FILE_
> Execute file.

**-o** _FILE_
> Output to file.

**-w**, **--no-password**
> Never prompt for password.

**-W**, **--password**
> Always prompt for password.

**-X**, **--no-rc**
> Don't read rc file.

**-t**, **--tuples-only**
> Only print rows.

**-q**, **--quiet**
> Quiet mode.

**-v** _NAME=VALUE_
> Set variable.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**usql** is a universal database CLI. It connects to PostgreSQL, MySQL, SQLite, SQL Server, Oracle, and many other databases with a consistent interface.

Connection strings follow URL format. The scheme identifies the database type: postgres://, mysql://, sqlite:, mssql://, oracle://, etc.

The interface mirrors psql. Backslash commands work across databases: \\l lists databases, \\dt lists tables, \\d describes objects.

Multiple databases can be managed from one tool. This simplifies workflows involving different database systems.

Query output can be formatted as tables, CSV, JSON, or other formats. This enables data export and processing.

Tab completion assists with table and column names. History persists across sessions.

# CAVEATS

Not all features available on all databases. Some drivers need installation. Complex queries may have database-specific syntax.

# HISTORY

**usql** was created by **Kenneth Shaw** around **2017** to provide a universal SQL client. It addresses the fragmentation of database CLIs with a single, consistent tool.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1), [sqlcmd](/man/sqlcmd)(1)
