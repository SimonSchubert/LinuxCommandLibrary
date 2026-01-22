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

**psql** is PostgreSQL interactive terminal. Database client.

The tool executes SQL queries. Manages PostgreSQL databases.

psql queries PostgreSQL.

# CAVEATS

PostgreSQL specific. Requires server connection.

# HISTORY

psql is the **official PostgreSQL** command-line client.

# SEE ALSO

[pg_dump](/man/pg_dump)(1), [createdb](/man/createdb)(1), [mysql](/man/mysql)(1)

