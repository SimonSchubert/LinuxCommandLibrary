# TAGLINE

stage table changes for commit

# TLDR

**Stage all changes**

```dolt add .```

**Stage specific table**

```dolt add [table_name]```

**Stage multiple tables**

```dolt add [table1] [table2]```

# SYNOPSIS

**dolt** **add** [_options_] _table_...

# PARAMETERS

**-A**, **--all**
> Stage all tables.

# DESCRIPTION

**dolt add** stages table changes for the next commit. Unlike git add which operates on files, dolt add stages database tables that have been modified, added, or deleted.

The command marks tables with pending changes (inserts, updates, deletes) to be included in the next commit. Staging allows selective committing of changes across multiple tables, similar to Git's index concept but applied to database schema and data modifications.

Using dolt add with specific table names stages only those tables, while using `.` or `-A` stages all modified tables in the working set.

# SEE ALSO

[dolt-commit](/man/dolt-commit)(1), [dolt-status](/man/dolt-status)(1)
