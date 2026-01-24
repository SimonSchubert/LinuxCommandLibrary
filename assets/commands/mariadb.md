# TLDR

**Connect to database**

```mariadb -u [user] -p [database]```

**Connect to remote server**

```mariadb -h [hostname] -u [user] -p [database]```

**Execute SQL command**

```mariadb -u [user] -p -e "[SELECT * FROM table]" [database]```

**Execute SQL file**

```mariadb -u [user] -p [database] < [script.sql]```

**Connect with socket**

```mariadb -S [/var/run/mysqld/mysqld.sock] -u [user] -p```

**Export query to file**

```mariadb -u [user] -p -e "[SELECT * FROM table]" [database] > [output.txt]```

**Connect with SSL**

```mariadb --ssl -u [user] -p [database]```

# SYNOPSIS

**mariadb** [_-u user_] [_-p_] [_-h host_] [_-e command_] [_options_] [_database_]

# PARAMETERS

**-u** _USER_, **--user** _USER_
> Username for connection.

**-p**[_PASSWORD_], **--password**[=_PASS_]
> Prompt for or specify password.

**-h** _HOST_, **--host** _HOST_
> Server hostname.

**-P** _PORT_, **--port** _PORT_
> Server port.

**-S** _SOCKET_, **--socket** _SOCKET_
> Unix socket file.

**-D** _DB_, **--database** _DB_
> Database to use.

**-e** _CMD_, **--execute** _CMD_
> Execute command and exit.

**-B**, **--batch**
> Batch mode (no formatting).

**-N**, **--skip-column-names**
> Don't show column names.

**-t**, **--table**
> Output as table.

**--ssl**
> Enable SSL.

**-A**, **--no-auto-rehash**
> Disable auto-completion.

**--safe-updates**
> Prevent accidental large updates.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**mariadb** is the command-line client for MariaDB database server. It provides an interactive SQL shell and can execute commands from files or command line.

The client connects to MariaDB or MySQL servers, as MariaDB maintains wire protocol compatibility. Interactive mode provides command history, editing, and tab completion.

Batch mode (-B) produces tab-separated output suitable for scripting. Combined with -N to skip headers, output can be processed by other tools.

Safe updates mode prevents UPDATE and DELETE without WHERE clauses, protecting against accidental data loss.

SSL connections encrypt traffic between client and server. Certificate verification can be configured for production environments.

The client supports pipelining SQL from files, enabling automated database migrations and backups restoration.

# CAVEATS

Password on command line visible in process list - use -p without argument. Large result sets may exhaust memory. Interactive features require readline.

# HISTORY

**MariaDB** was created by **Michael Widenius** (Monty) after **MySQL** was acquired by **Oracle** in **2010**. MariaDB is a community-developed fork designed to remain free and open-source. The mariadb client replaced mysql as the default client name in recent versions.

# SEE ALSO

[mariadb-dump](/man/mariadb-dump)(1), [mysql](/man/mysql)(1), [mysqldump](/man/mysqldump)(1), [mariadb-admin](/man/mariadb-admin)(1)
