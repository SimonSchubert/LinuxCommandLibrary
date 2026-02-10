# TAGLINE

administers MySQL servers

# TLDR

**Check server status**

```mysqladmin -u [user] -p status```

**Create database**

```mysqladmin -u [user] -p create [database_name]```

**Drop database**

```mysqladmin -u [user] -p drop [database_name]```

**Change password**

```mysqladmin -u [user] -p password "[newpassword]"```

**Show variables**

```mysqladmin -u [user] -p variables```

**Show process list**

```mysqladmin -u [user] -p processlist```

**Shutdown server**

```mysqladmin -u [root] -p shutdown```

**Ping server**

```mysqladmin -u [user] -p ping```

# SYNOPSIS

**mysqladmin** [_options_] _command_

# PARAMETERS

_COMMAND_
> Administration command.

**-u** _USER_
> Username.

**-p** [_PASSWORD_]
> Password.

**-h** _HOST_
> Server hostname.

**status**
> Show server status.

**create** _DB_
> Create database.

**drop** _DB_
> Drop database.

**--help**
> Display help information.

# DESCRIPTION

**mysqladmin** administers MySQL servers. It performs administrative operations.

The tool manages databases, users, and server state. Essential for DBA tasks.

# CAVEATS

Requires admin privileges. Dangerous operations (drop). Use carefully in production.

# HISTORY

mysqladmin is part of the **MySQL** distribution, providing command-line administration since early versions.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqldump](/man/mysqldump)(1), [mysqlcheck](/man/mysqlcheck)(1)

