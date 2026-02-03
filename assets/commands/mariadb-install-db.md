# TLDR

**Initialize MariaDB data directory**

```mariadb-install-db```

**Initialize with specific user**

```mariadb-install-db --user=[mysql]```

**Initialize with custom data directory**

```mariadb-install-db --datadir=[/var/lib/mysql]```

**Initialize with specific base directory**

```mariadb-install-db --basedir=[/usr]```

# SYNOPSIS

**mariadb-install-db** [_options_]

# PARAMETERS

**--user** _user_
> User for database files.

**--datadir** _dir_
> Data directory path.

**--basedir** _dir_
> MariaDB base directory.

**--defaults-file** _file_
> Configuration file.

**--auth-root-authentication-method** _method_
> Root authentication method.

**--skip-test-db**
> Don't create test database.

# DESCRIPTION

**mariadb-install-db** initializes the MariaDB data directory and system tables. Required before first server start. Creates privilege tables and default databases. Replaces mysql_install_db in MariaDB.

# SEE ALSO

[mariadb](/man/mariadb)(1), [mariadbd](/man/mariadbd)(1)

