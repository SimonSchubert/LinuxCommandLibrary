# TAGLINE

remove a PostgreSQL database

# TLDR

**Drop a database**

```dropdb [database_name]```

**Drop with confirmation** prompt

```dropdb -i [database_name]```

**Drop on remote** host

```dropdb -h [hostname] -p [5432] [database_name]```

**Drop as specific** user

```dropdb -U [username] [database_name]```

**Drop if exists** (no error if missing)

```dropdb --if-exists [database_name]```

**Force disconnect** active connections

```dropdb --force [database_name]```

# SYNOPSIS

**dropdb** [_options_] _dbname_

# PARAMETERS

_DBNAME_
> Database name to drop.

**-h**, **--host** _HOST_
> Server hostname.

**-p**, **--port** _PORT_
> Server port.

**-U**, **--username** _USER_
> Connect as user.

**-i**, **--interactive**
> Prompt before drop.

**--if-exists**
> Don't error if database doesn't exist.

**--force**
> Terminate existing connections.

**-e**, **--echo**
> Show SQL command executed.

**--help**
> Display help information.

# DESCRIPTION

**dropdb** is a PostgreSQL utility that removes a database. It's a wrapper around the SQL DROP DATABASE command, providing a convenient command-line interface for database deletion.

The tool connects to the postgres database to execute the drop. The --force option terminates existing connections to the target database, allowing deletion of databases with active sessions.

dropdb requires appropriate privileges - typically superuser or database owner permissions.

# CAVEATS

Irreversible operation. Cannot drop database with active connections without --force. Requires superuser or owner privileges. Cannot drop template databases.

# HISTORY

dropdb is part of the **PostgreSQL** client utilities, providing command-line database administration since PostgreSQL's early releases. It simplifies common administrative tasks without requiring direct SQL.

# SEE ALSO

[createdb](/man/createdb)(1), [psql](/man/psql)(1), [dropuser](/man/dropuser)(1), [pg_dump](/man/pg_dump)(1)
