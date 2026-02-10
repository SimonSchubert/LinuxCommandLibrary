# TAGLINE

creates logical backups of MySQL databases

# TLDR

**Dump database**

```mysqldump -u [user] -p [database] > [backup.sql]```

**Dump specific tables**

```mysqldump -u [user] -p [database] [table1] [table2] > [backup.sql]```

**Dump all databases**

```mysqldump -u [user] -p --all-databases > [all.sql]```

**Dump with compression**

```mysqldump -u [user] -p [database] | gzip > [backup.sql.gz]```

**Dump structure only** (no data)

```mysqldump -u [user] -p --no-data [database] > [schema.sql]```

**Dump data only** (no structure)

```mysqldump -u [user] -p --no-create-info [database] > [data.sql]```

**Dump with routines and triggers**

```mysqldump -u [user] -p --routines --triggers [database] > [backup.sql]```

**Dump for replication**

```mysqldump -u [user] -p --single-transaction --master-data [database] > [backup.sql]```

# SYNOPSIS

**mysqldump** [_-u user_] [_-p_] [_--all-databases_] [_--single-transaction_] [_options_] [_database_] [_tables_]

# PARAMETERS

**-u** _USER_, **--user** _USER_
> MySQL username.

**-p**[_PASSWORD_], **--password**[=_PASS_]
> Prompt for or specify password.

**-h** _HOST_, **--host** _HOST_
> Server hostname.

**-P** _PORT_, **--port** _PORT_
> Server port.

**--all-databases**, **-A**
> Dump all databases.

**--databases**, **-B**
> Dump multiple named databases.

**--no-data**, **-d**
> Don't dump table data.

**--no-create-info**, **-t**
> Don't dump CREATE TABLE.

**--single-transaction**
> Consistent snapshot for InnoDB.

**--routines**, **-R**
> Include stored procedures/functions.

**--triggers**
> Include triggers (default on).

**--events**, **-E**
> Include events.

**--add-drop-table**
> Add DROP TABLE before CREATE.

**--add-drop-database**
> Add DROP DATABASE before CREATE.

**--master-data**[=_VALUE_]
> Include binary log position.

**--quick**, **-q**
> Don't buffer, write directly.

**--lock-tables**, **-l**
> Lock tables during dump.

# DESCRIPTION

**mysqldump** creates logical backups of MySQL databases. Output is SQL statements that can recreate the database structure and data when executed.

The --single-transaction option provides consistent backups for InnoDB tables without locking. It starts a transaction and dumps data at that point in time, allowing other operations to continue.

For MyISAM or mixed storage engines, --lock-tables prevents writes during dump. This ensures consistency but blocks writes.

Routines (stored procedures, functions) and events are not included by default. Use --routines and --events explicitly to back up these objects.

The --master-data option records binary log coordinates, essential for setting up replication slaves or point-in-time recovery.

Output is plain SQL text, easily compressed with gzip. For very large databases, consider mysqlpump (parallel) or physical backup tools like Percona XtraBackup.

# CAVEATS

Not suitable for very large databases - consider physical backups. Memory usage can be high without --quick. Restore time can be long. Character set issues possible. Binary data encoding in SQL. Locking may affect production.

# HISTORY

**mysqldump** has been part of MySQL since early versions, developed at MySQL AB and later Oracle. It remains the standard logical backup tool for MySQL and MariaDB. While physical backup tools are preferred for large databases, mysqldump remains popular for its simplicity and portability.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqlpump](/man/mysqlpump)(1), [mariadb-dump](/man/mariadb-dump)(1), [pg_dump](/man/pg_dump)(1)
