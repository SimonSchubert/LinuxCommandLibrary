# TLDR

**Check all tables in database**

```mysqlcheck -u [user] -p [database]```

**Check all databases**

```mysqlcheck -u [user] -p --all-databases```

**Repair tables**

```mysqlcheck -u [user] -p --repair [database]```

**Optimize tables**

```mysqlcheck -u [user] -p --optimize [database]```

**Analyze tables**

```mysqlcheck -u [user] -p --analyze [database]```

**Check specific table**

```mysqlcheck -u [user] -p [database] [table]```

**Auto repair**

```mysqlcheck -u [user] -p --auto-repair [database]```

# SYNOPSIS

**mysqlcheck** [_options_] [_database_] [_tables_]

# PARAMETERS

_DATABASE_
> Database name.

_TABLES_
> Specific tables to check.

**--all-databases**
> Check all databases.

**--repair**
> Repair corrupted tables.

**--optimize**
> Optimize tables.

**--analyze**
> Analyze tables.

**--auto-repair**
> Auto repair issues.

**--help**
> Display help information.

# DESCRIPTION

**mysqlcheck** checks, repairs, and optimizes MySQL tables. It maintains database integrity.

The tool runs CHECK, REPAIR, ANALYZE, and OPTIMIZE. Essential for database maintenance.

mysqlcheck maintains MySQL tables.

# CAVEATS

May lock tables. Backup before repair. Some engines don't support all operations.

# HISTORY

mysqlcheck is part of the **MySQL** distribution for table maintenance and repair operations.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqladmin](/man/mysqladmin)(1), [mysqldump](/man/mysqldump)(1)

