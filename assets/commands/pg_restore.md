# TLDR

**Restore from custom format**

```pg_restore -d [database] [backup.dump]```

**Restore specific table**

```pg_restore -d [database] -t [tablename] [backup.dump]```

**List contents of backup**

```pg_restore -l [backup.dump]```

**Restore with parallelism**

```pg_restore -d [database] -j [4] [backup.dump]```

**Clean before restore**

```pg_restore -d [database] -c [backup.dump]```

# SYNOPSIS

**pg_restore** [_options_] [_file_]

# PARAMETERS

**-d**, **--dbname** _name_
> Database to restore to.

**-t**, **--table** _name_
> Restore specific table.

**-n**, **--schema** _name_
> Restore specific schema.

**-j**, **--jobs** _num_
> Parallel jobs.

**-c**, **--clean**
> Drop objects before creating.

**-C**, **--create**
> Create the database.

**-l**, **--list**
> List archive contents.

**-L** _file_
> Use table of contents file.

# DESCRIPTION

**pg_restore** restores PostgreSQL databases from archives created by pg_dump in custom, directory, or tar format. It cannot restore plain SQL dumps (use psql for those).

# EXAMPLES

```bash
# Basic restore
pg_restore -d mydb backup.dump

# Create database and restore
pg_restore -C -d postgres backup.dump

# Selective restore
pg_restore -l backup.dump > toc.txt
# Edit toc.txt to comment out unwanted items
pg_restore -d mydb -L toc.txt backup.dump

# Parallel restore
pg_restore -d mydb -j 4 backup.dump
```

# CAVEATS

Cannot restore plain SQL dumps. Parallel restore requires directory format. May need superuser for some objects.

# HISTORY

pg_restore is part of **PostgreSQL**, complementing pg_dump for custom format backup restoration.

# SEE ALSO

[pg_dump](/man/pg_dump)(1), [pg_dumpall](/man/pg_dumpall)(1), [psql](/man/psql)(1)
