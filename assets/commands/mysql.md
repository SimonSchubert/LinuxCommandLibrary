# TLDR

**Connect to database**

```mysql -u [username] -p [database]```

**Connect to remote host**

```mysql -h [hostname] -u [username] -p [database]```

**Execute SQL command**

```mysql -u [user] -p -e "[SELECT * FROM table]" [database]```

**Execute SQL file**

```mysql -u [user] -p [database] < [script.sql]```

**Connect with specific port**

```mysql -h [host] -P [3306] -u [user] -p```

**Import database dump**

```mysql -u [user] -p [database] < [dump.sql]```

# SYNOPSIS

**mysql** [_options_] [_database_]

# PARAMETERS

_DATABASE_
> Database name.

**-h** _HOST_
> Server hostname.

**-u** _USER_
> Username.

**-p** [_PASSWORD_]
> Password (prompts if empty).

**-P** _PORT_
> Port number.

**-e** _COMMAND_
> Execute SQL and exit.

**--help**
> Display help information.

# DESCRIPTION

**mysql** is the MySQL command-line client. It connects to MySQL/MariaDB servers.

The tool executes SQL queries. Provides interactive and batch modes.

mysql is MySQL CLI client.

# CAVEATS

Requires server access. Password prompt recommended. Beware SQL injection in scripts.

# HISTORY

mysql was created as the standard CLI for **MySQL** database, maintained by Oracle and the community.

# SEE ALSO

[mysqladmin](/man/mysqladmin)(1), [mysqldump](/man/mysqldump)(1), [mycli](/man/mycli)(1)

