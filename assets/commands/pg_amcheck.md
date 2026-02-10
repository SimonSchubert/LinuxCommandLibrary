# TAGLINE

checks PostgreSQL database corruption using Access Method verification

# TLDR

**Check all databases**

```pg_amcheck --all```

**Check specific database**

```pg_amcheck -d [database]```

**Check with verbose output**

```pg_amcheck -v -d [database]```

# SYNOPSIS

**pg_amcheck** [_options_] [_dbname_]

# PARAMETERS

**-a**, **--all**
> Check all databases.

**-d**, **--database** _name_
> Database to check.

**-t**, **--table** _table_
> Check specific table.

**-i**, **--index** _index_
> Check specific index.

**-v**, **--verbose**
> Verbose output.

**--heapallindexed**
> Check heap for indexed values.

# DESCRIPTION

**pg_amcheck** checks PostgreSQL database corruption using Access Method verification. Detects physical corruption in tables and indexes. Run for database integrity verification.

# SEE ALSO

[pg_checksums](/man/pg_checksums)(1), [pg_verify_checksums](/man/pg_verify_checksums)(1)

