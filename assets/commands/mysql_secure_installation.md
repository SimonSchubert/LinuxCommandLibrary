# TAGLINE

improves MySQL security after installation

# TLDR

**Run secure installation wizard**

```mysql_secure_installation```

**Run with socket**

```mysql_secure_installation --socket=[/var/run/mysqld/mysqld.sock]```

**Run with defaults file**

```mysql_secure_installation --defaults-file=[/etc/mysql/my.cnf]```

# SYNOPSIS

**mysql_secure_installation** [_options_]

# PARAMETERS

**--socket** _path_
> Unix socket file for connections to localhost.

**--host** _host_
> MySQL server hostname.

**--port** _port_
> TCP/IP port number.

**--user**, **-u** _user_
> MySQL username for connecting to the server.

**--defaults-file** _file_
> Read only the specified option file.

**--no-defaults**
> Do not read any option files.

**--use-default**
> Execute noninteractively using default answers. Useful for unattended installation.

**--password**, **-p** _password_
> The current password for connecting.

# DESCRIPTION

**mysql_secure_installation** improves MySQL security after installation. The interactive wizard performs the following steps: set or change the root password, remove anonymous users, disallow remote root login, remove the test database, and reload privilege tables. It is recommended for all new installations.

The program reads the **[mysql_secure_installation]** and **[client]** groups from option files.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqladmin](/man/mysqladmin)(1)

