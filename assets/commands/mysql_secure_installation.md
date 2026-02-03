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
> Unix socket file.

**--host** _host_
> MySQL server hostname.

**--port** _port_
> TCP/IP port number.

**--user** _user_
> MySQL username.

**--defaults-file** _file_
> Configuration file.

# DESCRIPTION

**mysql_secure_installation** improves MySQL security after installation. Interactive wizard that sets root password, removes anonymous users, disables remote root login, and removes test database. Recommended for new installations.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqladmin](/man/mysqladmin)(1)

