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

**flush-privileges**
> Reload grant tables.

**extended-status**
> Show server status variables.

**--help**
> Display help information.

# DESCRIPTION

**mysqladmin** is a command-line client for performing administrative operations on MySQL servers. It can check server status, create and drop databases, reload privileges, flush logs, and shut down the server.

Common administrative tasks include checking if the server is alive (**ping**), viewing server variables and status counters (**variables**, **extended-status**), reloading grant tables after permission changes (**flush-privileges**), and monitoring active connections (**processlist**).

# CAVEATS

Requires admin privileges. Dangerous operations (drop). Use carefully in production.

# HISTORY

mysqladmin is part of the **MySQL** distribution, providing command-line administration since early versions.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqldump](/man/mysqldump)(1), [mysqlcheck](/man/mysqlcheck)(1)

