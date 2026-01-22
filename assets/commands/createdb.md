# TLDR

**Create database**

```createdb [dbname]```

**Create with owner**

```createdb -O [owner] [dbname]```

**Create with encoding**

```createdb -E [UTF8] [dbname]```

**Create from template**

```createdb -T [template0] [dbname]```

**Create on remote server**

```createdb -h [hostname] -p [5432] -U [user] [dbname]```

**Create with tablespace**

```createdb -D [tablespace] [dbname]```

**Show executed SQL**

```createdb -e [dbname]```

# SYNOPSIS

**createdb** [_options_] [_dbname_] [_description_]

# DESCRIPTION

**createdb** creates a PostgreSQL database. Wrapper around SQL CREATE DATABASE command. Connects to postgres database to issue the command.

# PARAMETERS

**-D** _tablespace_, **--tablespace** _tablespace_
> Default tablespace

**-E** _encoding_, **--encoding** _encoding_
> Character encoding

**-l** _locale_, **--locale** _locale_
> Locale for database

**-O** _owner_, **--owner** _owner_
> Database owner

**-T** _template_, **--template** _template_
> Template database

**-e**, **--echo**
> Show commands sent to server

**--strategy** _strategy_
> Database creation strategy

# CONNECTION OPTIONS

**-h** _host_, **--host** _host_
> Server hostname

**-p** _port_, **--port** _port_
> Server port

**-U** _user_, **--username** _user_
> Connect as user

**-w**, **--no-password**
> Never prompt for password

**-W**, **--password**
> Force password prompt

**--maintenance-db** _db_
> Connection database

# DEFAULTS

Database name defaults to current system user. Connects to postgres database (or template1) to create new database.

# CAVEATS

Requires CREATEDB privilege or superuser role. Default template is template1. Use template0 for clean database without local additions.

# SEE ALSO

[dropdb](/man/dropdb)(1), [psql](/man/psql)(1), [pg_dump](/man/pg_dump)(1)
