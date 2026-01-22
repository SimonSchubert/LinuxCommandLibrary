# TLDR

**Connect to database**

```mycli -u [username] -p [database]```

**Connect to remote host**

```mycli -h [hostname] -u [username] [database]```

**Connect with password prompt**

```mycli -u [username] -p```

**Execute SQL file**

```mycli -u [user] [database] < [script.sql]```

**Connect via socket**

```mycli -S [/var/run/mysqld/mysqld.sock] -u [user]```

**Use specific port**

```mycli -h [host] -P [3306] -u [user] [database]```

# SYNOPSIS

**mycli** [_options_] [_database_]

# PARAMETERS

_DATABASE_
> Database name to connect.

**-h** _HOST_
> MySQL server hostname.

**-u** _USER_
> Username.

**-p** [_PASSWORD_]
> Password (prompt if no value).

**-P** _PORT_
> Port number.

**-S** _SOCKET_
> Unix socket path.

**--help**
> Display help information.

# DESCRIPTION

**mycli** is a MySQL client with autocompletion. It provides syntax highlighting and smart completion.

The tool enhances MySQL CLI experience. Shows completion suggestions as you type.

mycli is enhanced MySQL client.

# CAVEATS

Python-based. Requires MySQL connection. Tab completion for tables/columns.

# HISTORY

mycli was created as a **user-friendly** MySQL CLI with autocompletion, inspired by pgcli.

# SEE ALSO

[mysql](/man/mysql)(1), [pgcli](/man/pgcli)(1), [litecli](/man/litecli)(1)

