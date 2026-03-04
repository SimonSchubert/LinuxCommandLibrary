# TAGLINE

MySQL/MariaDB/ProxySQL real-time monitoring TUI

# TLDR

**Connect** to MySQL server and monitor

```dolphie -u [username] -p [password] -h [host]```

**Connect** with configuration file

```dolphie -c [config.ini]```

**Monitor** ProxySQL instance

```dolphie --proxysql -u [user] -p [pass] -h [host]```

**Auto-refresh** every 2 seconds

```dolphie --refresh-interval 2 [connection_options]```

# SYNOPSIS

**dolphie** [_options_]

# PARAMETERS

**-u, --user** _USERNAME_
> Database username

**-p, --password** _PASSWORD_
> Database password

**-h, --host** _HOST_
> Database host (default: localhost)

**-P, --port** _PORT_
> Database port (default: 3306)

**-S, --socket** _SOCKET_
> Unix socket file path

**-c, --config** _FILE_
> Configuration file path

**--proxysql**
> Connect to ProxySQL instead of MySQL/MariaDB

**--refresh-interval** _SECONDS_
> Dashboard refresh interval (default: 1)

**--show-processlist**
> Show processlist by default

**--use-certificates**
> Use SSL certificates for connection

**--ssl-ca** _FILE_
> SSL CA certificate file

**--ssl-cert** _FILE_
> SSL client certificate file

**--ssl-key** _FILE_
> SSL client key file

**-v, --version**
> Display version and exit

**--help**
> Display help and exit

# DESCRIPTION

**dolphie** is a real-time monitoring tool for MySQL, MariaDB, and ProxySQL databases. It provides a terminal user interface (TUI) dashboard showing key performance metrics, process lists, replication status, and query statistics.

The tool displays information similar to top or htop but specifically designed for database monitoring, including active connections, slow queries, lock waits, and resource usage.

# KEYBINDINGS

**q**
> Quit

**p**
> Toggle processlist view

**l**
> Toggle lock view

**r**
> Toggle replication view

**s**
> Change sort column in processlist

**k**
> Kill a process (enter PID)

**?**
> Show help

# CAVEATS

Requires appropriate database privileges (PROCESS, SUPER, REPLICATION CLIENT). Connection credentials must be kept secure. Continuous querying may impact database performance. SSL certificates must be properly configured for secure connections.

# HISTORY

**dolphie** was created to provide a MySQL-focused monitoring solution similar to tools like mytop and innotop, but with a modern TUI interface and support for newer database versions and ProxySQL.

# SEE ALSO

[mysql](/man/mysql)(1), [mytop](/man/mytop)(1), [innotop](/man/innotop)(1), [htop](/man/htop)(1)