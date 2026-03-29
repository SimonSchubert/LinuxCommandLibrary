# TAGLINE

MySQL client with autocompletion and syntax highlighting

# TLDR

**Connect to database**

```mycli -u [username] [database]```

**Connect to remote host**

```mycli -h [hostname] -u [username] [database]```

**Connect with password prompt**

```mycli -u [username] -p [database]```

**Execute SQL file**

```mycli -u [user] [database] < [script.sql]```

**Connect via socket**

```mycli -S [/var/run/mysqld/mysqld.sock] -u [user]```

**Use specific port**

```mycli -h [host] -P [3306] -u [user] [database]```

**Execute a query and exit**

```mycli -u [user] -e "SELECT * FROM [table]" [database]```

**Output results as CSV**

```mycli -u [user] -e "SELECT * FROM [table]" --csv [database]```

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

**-D** _DATABASE_
> Database name to connect to.

**-e** _COMMAND_
> Execute command and quit.

**-R** _PROMPT_
> Customize the prompt format.

**--csv**
> Output results in CSV format (batch mode).

**--table**
> Output results in table format (batch mode).

**--auto-vertical-output**
> Automatically switch to vertical output when result is wider than terminal.

**-d** _DSN_
> Use DSN configured in the [alias_dsn] section of myclirc file.

**-l** _FILE_
> Log every query and its results to a file.

**-v**, **--verbose**
> Verbose output.

**--myclirc** _FILE_
> Path to configuration file (default: ~/.myclirc).

**--defaults-file** _FILE_
> Only read MySQL options from the given file.

**--warn** / **--no-warn**
> Warn before running a destructive query.

**--ssh-host** _HOST_
> Host name to connect to ssh server.

**--ssh-port** _PORT_
> Port to connect to ssh server.

**--ssh-user** _USER_
> User name to connect to ssh server.

**--ssh-key-filename** _FILE_
> Private key filename for the ssh connection.

**--ssl-ca** _PATH_
> CA file in PEM format.

**--ssl-cert** _PATH_
> X509 cert in PEM format.

**--ssl-key** _PATH_
> X509 key in PEM format.

**-V**, **--version**
> Display version information.

**--help**
> Display help information.

# DESCRIPTION

**mycli** is a command-line client for MySQL, MariaDB, and Percona with smart autocompletion and syntax highlighting. It provides context-aware completion for SQL keywords, table names, column names, and functions as you type.

# CAVEATS

Python-based; requires a running MySQL/MariaDB/Percona server to connect to. Configuration is stored in ~/.myclirc.

# HISTORY

mycli was created by **Amjith Ramanujam** as a user-friendly MySQL CLI with autocompletion, inspired by **pgcli**.

# SEE ALSO

[mysql](/man/mysql)(1), [mariadb](/man/mariadb)(1), [mysqldump](/man/mysqldump)(1), [pgcli](/man/pgcli)(1), [litecli](/man/litecli)(1)

