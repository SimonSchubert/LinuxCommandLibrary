# TAGLINE

checks PostgreSQL database corruption using Access Method verification

# TLDR

**Check all databases**

```pg_amcheck --all```

**Check a specific database**

```pg_amcheck -d [database]```

**Check a specific table with verbose output**

```pg_amcheck -d [database] -t [table] -v```

**Check with heap verification for all indexed values**

```pg_amcheck -d [database] --heapallindexed```

**Check using multiple parallel connections**

```pg_amcheck --all --jobs [4]```

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

**-s**, **--schema** _schema_
> Check tables and indexes in the specified schema only.

**-v**, **--verbose**
> Print a message for each relation being checked and increase detail for errors.

**--heapallindexed**
> Verify the presence of all heap tuples as index tuples in each checked index.

**--parent-check**
> Use bt_index_parent_check for additional parent/child relationship verification.

**--checkunique**
> For indexes with unique constraints, verify no duplicate visible entries exist.

**--rootdescend**
> Re-find tuples on leaf level via root page search for each tuple. Implies --parent-check.

**--install**
> Install any missing extensions required to check the database (currently amcheck).

**-j**, **--jobs** _num_
> Use num concurrent connections to the server.

**--progress**
> Show progress information including completed relations and sizes.

**-w**, **--no-password**
> Never prompt for a password.

**-W**, **--password**
> Force a password prompt before connecting.

# DESCRIPTION

**pg_amcheck** checks for corruption in one or more PostgreSQL databases by running amcheck's verification functions against all relations in the target databases. It detects physical corruption in tables and B-tree indexes, such as pages with invalid headers, missing or duplicate tuples, and broken internal links. Available since PostgreSQL 14.

# SEE ALSO

[pg_checksums](/man/pg_checksums)(1)

