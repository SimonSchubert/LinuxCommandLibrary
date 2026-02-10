# TAGLINE

utility for backing up PostgreSQL databases

# TLDR

**Dump a database**

```pg_dump [database_name] > [backup.sql]```

**Dump with compression**

```pg_dump -Fc [database_name] > [backup.dump]```

**Dump specific table**

```pg_dump -t [table_name] [database_name] > [table.sql]```

**Dump schema only**

```pg_dump -s [database_name] > [schema.sql]```

**Dump data only**

```pg_dump -a [database_name] > [data.sql]```

**Dump with connection parameters**

```pg_dump -h [host] -p [5432] -U [username] [database_name] > [backup.sql]```

**Dump in directory format** (parallel)

```pg_dump -Fd -j [4] [database_name] -f [backup_dir]```

**Dump excluding table**

```pg_dump --exclude-table=[pattern] [database_name] > [backup.sql]```

# SYNOPSIS

**pg_dump** [_options_] [_dbname_]

# DESCRIPTION

**pg_dump** is a utility for backing up PostgreSQL databases. It creates a consistent snapshot of the database at the time the dump begins, even while the database is being used.

The output can be in SQL script format (plain text) or custom archive formats that support compression and parallel restore. SQL scripts can be restored with psql, while archive formats use pg_restore.

pg_dump does not block readers or writers during the dump, making it suitable for production backups.

# PARAMETERS

**-F** _format_
> Output format (p=plain, c=custom, d=directory, t=tar).

**-f** _file_
> Output file or directory.

**-t** _table_
> Dump specific table(s).

**-T** _table_
> Exclude table(s).

**-n** _schema_
> Dump specific schema(s).

**-N** _schema_
> Exclude schema(s).

**-s**, **--schema-only**
> Dump schema only, no data.

**-a**, **--data-only**
> Dump data only, no schema.

**-c**, **--clean**
> Include DROP commands.

**-C**, **--create**
> Include CREATE DATABASE command.

**-j** _jobs_
> Parallel dump jobs (directory format).

**-h** _host_
> Database server host.

**-p** _port_
> Database server port.

**-U** _user_
> Connect as user.

**-W**
> Force password prompt.

**-Z** _level_
> Compression level (0-9).

# CAVEATS

Does not dump roles and tablespaces (use pg_dumpall). Plain format cannot be restored in parallel. Custom format recommended for large databases. May require significant disk space for large databases.

# HISTORY

**pg_dump** has been part of PostgreSQL since its earliest releases, evolving from the original **POSTGRES** project at **UC Berkeley** in the **1980s**. It has gained features like parallel dump, custom archive format, and selective backup options as PostgreSQL evolved into a major database system.

# SEE ALSO

[pg_restore](/man/pg_restore)(1), [pg_dumpall](/man/pg_dumpall)(1), [psql](/man/psql)(1), [createdb](/man/createdb)(1)
