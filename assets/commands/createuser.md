# TAGLINE

PostgreSQL user creation utility

# TLDR

**Create a user interactively**

```createuser [username]```

**Create superuser**

```createuser -s [username]```

**Create user with password prompt**

```createuser -P [username]```

**Create user that can create databases**

```createuser -d [username]```

**Create user with connection options**

```createuser -h [localhost] -p [5432] -U [admin] [username]```

**Create user that can create roles**

```createuser -r [username]```

# SYNOPSIS

**createuser** [_options_] [_username_]

# DESCRIPTION

**createuser** is a PostgreSQL utility that creates new database users (roles). It's a wrapper around the SQL CREATE ROLE command, providing a convenient command-line interface.

The tool can create users with various privileges including superuser status, database creation rights, and role creation abilities. It connects to the database server and executes the appropriate SQL.

# PARAMETERS

**-s**, **--superuser**
> Create superuser.

**-d**, **--createdb**
> Allow creating databases.

**-r**, **--createrole**
> Allow creating roles.

**-l**, **--login**
> Allow login (default).

**-P**, **--pwprompt**
> Prompt for password.

**-e**, **--echo**
> Show generated SQL.

**-h** _host_
> Database server host.

**-p** _port_
> Database server port.

**-U** _user_
> Connect as user.

**-W**
> Force password prompt.

**-i**, **--inherit**
> Role inherits privileges.

**--replication**
> Allow replication connections.

# CAVEATS

Requires appropriate privileges to create roles. Superuser creation requires superuser connection. Password set via -P is entered interactively.

# HISTORY

**createuser** has been part of PostgreSQL since early versions, providing a shell interface to role management. PostgreSQL evolved from the **POSTGRES** project at **UC Berkeley** in the **1980s**. The distinction between users and roles was unified in PostgreSQL 8.1.

# SEE ALSO

[dropuser](/man/dropuser)(1), [psql](/man/psql)(1), [createdb](/man/createdb)(1), [pg_dump](/man/pg_dump)(1)
