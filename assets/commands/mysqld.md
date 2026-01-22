# TLDR

**Start MySQL server**

```mysqld```

**Start with specific config**

```mysqld --defaults-file=[/etc/mysql/my.cnf]```

**Start with data directory**

```mysqld --datadir=[/var/lib/mysql]```

**Run in safe mode**

```mysqld_safe```

**Initialize data directory**

```mysqld --initialize```

**Run with specific user**

```mysqld --user=[mysql]```

**Verbose logging**

```mysqld --verbose```

# SYNOPSIS

**mysqld** [_options_]

# PARAMETERS

**--defaults-file** _FILE_
> Configuration file.

**--datadir** _DIR_
> Data directory path.

**--user** _USER_
> Run as user.

**--initialize**
> Initialize data directory.

**--port** _PORT_
> Listen port.

**--verbose**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**mysqld** is the MySQL server daemon. It handles database storage and query processing.

The tool is the core database engine. Manages connections, queries, and data.

mysqld is MySQL server daemon.

# CAVEATS

Requires proper configuration. Resource intensive. Security setup critical.

# HISTORY

mysqld is the **MySQL** database server, originally developed by MySQL AB and now maintained by Oracle.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqladmin](/man/mysqladmin)(1), [mysqld_safe](/man/mysqld_safe)(1)

