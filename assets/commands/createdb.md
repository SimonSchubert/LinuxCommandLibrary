# TAGLINE

Create a new PostgreSQL database

# TLDR

**Create a database with the default name (current user)**

```createdb```

**Create a database with a specific name**

```createdb [dbname]```

**Create a database with a specific owner**

```createdb -O [owner] [dbname]```

**Create a database with a specific encoding**

```createdb -E [UTF8] [dbname]```

**Create a clean database from template0**

```createdb -T [template0] [dbname]```

**Create a database on a remote server**

```createdb -h [hostname] -p [5432] -U [user] [dbname]```

**Show the SQL command being executed**

```createdb -e [dbname]```

# SYNOPSIS

**createdb** [_options_] [_dbname_] [_description_]

# PARAMETERS

**-D** _tablespace_, **--tablespace** _tablespace_
> Default tablespace for the database.

**-E** _encoding_, **--encoding** _encoding_
> Character encoding for the database.

**-l** _locale_, **--locale** _locale_
> Locale for the database.

**-O** _owner_, **--owner** _owner_
> Database owner user.

**-T** _template_, **--template** _template_
> Template database to copy from (default template1).

**-e**, **--echo**
> Echo the SQL commands that createdb sends to the server.

**--icu-locale** _locale_
> ICU locale for the database.

**--icu-rules** _rules_
> ICU collation rules for the database.

**--locale-provider** _provider_
> Locale provider (libc or icu).

**--strategy** _strategy_
> Database creation strategy (wal_log or file_copy).

**-V**, **--version**
> Print the createdb version and exit.

**-h** _host_, **--host** _host_
> Server hostname or socket directory.

**-p** _port_, **--port** _port_
> Server port number.

**-U** _user_, **--username** _user_
> User name to connect as.

**-w**, **--no-password**
> Never prompt for password.

**-W**, **--password**
> Force password prompt.

**--maintenance-db** _db_
> Database to connect to when creating the new database. Defaults to postgres, or template1 if postgres does not exist.

# DESCRIPTION

**createdb** creates a new PostgreSQL database. It is a convenience wrapper around the SQL **CREATE DATABASE** command, providing a command-line interface that is often more convenient than invoking psql directly.

The database name defaults to the current system user name if not specified. An optional description (comment) can be provided as the second argument.

# CAVEATS

Requires **CREATEDB** privilege or superuser role. The default template is template1; use template0 for a clean database without local additions. Connection parameters can also be set via the standard PostgreSQL environment variables (**PGHOST**, **PGPORT**, **PGUSER**, **PGDATABASE**).

# HISTORY

**createdb** has been part of the PostgreSQL distribution since its early versions, providing a simple command-line interface to the **CREATE DATABASE** SQL command.

# SEE ALSO

[dropdb](/man/dropdb)(1), [psql](/man/psql)(1), [pg_dump](/man/pg_dump)(1)
