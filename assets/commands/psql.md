# TAGLINE

PostgreSQL interactive terminal client

# TLDR

**Connect to database**

```psql -d [database]```

**Connect to remote server**

```psql -h [host] -U [user] -d [database]```

**Execute SQL command**

```psql -c "SELECT * FROM [table]" [database]```

**Execute SQL file**

```psql -f [script.sql] [database]```

**List databases**

```psql -l```

**Interactive mode**

```psql [database]```

# SYNOPSIS

**psql** [_options_] [_dbname_]

# PARAMETERS

_DBNAME_
> Database name.

**-h** _HOST_
> Server hostname.

**-p** _PORT_
> Port number.

**-U** _USER_
> Username.

**-d** _DBNAME_
> Database name.

**-c** _COMMAND_
> Execute command.

**-f** _FILE_
> Execute file.

**-l**
> List databases.

# DESCRIPTION

**psql** is the official interactive terminal for PostgreSQL. It provides a command-line interface for connecting to databases, executing SQL queries, and managing database objects. In interactive mode, it offers features like tab completion, command history, and formatted output for query results.

Beyond interactive use, psql can execute SQL files with **-f** and run individual commands with **-c**, making it suitable for scripting and automation. Built-in backslash commands (like **\dt** for tables, **\d** for describing objects, and **\l** for listing databases) provide quick access to database metadata without writing SQL.

Connection parameters can be specified via command-line flags, environment variables (**PGHOST**, **PGUSER**, **PGDATABASE**, **PGPORT**), or the **~/.pgpass** file for password-free authentication.

# CONFIGURATION

**~/.pgpass**
> Password file for automatic authentication, containing lines in the format `hostname:port:database:username:password`.

**~/.psqlrc**
> Startup file executed when psql launches, used to set formatting options, custom prompts, and default settings.

**PGHOST**, **PGUSER**, **PGDATABASE**, **PGPORT**
> Environment variables for default connection parameters.

# CAVEATS

PostgreSQL specific. Requires server connection.

# HISTORY

psql is the **official PostgreSQL** command-line client.

# SEE ALSO

[pg_dump](/man/pg_dump)(1), [createdb](/man/createdb)(1), [mysql](/man/mysql)(1)

