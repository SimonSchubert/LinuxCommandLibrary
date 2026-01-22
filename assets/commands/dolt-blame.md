# TLDR

**Show blame for table**

```dolt blame [table_name]```

**Blame specific column**

```dolt blame [table_name] [column_name]```

# SYNOPSIS

**dolt blame** [_options_] _table_ [_column_]

# PARAMETERS

_TABLE_
> Table name to examine.

_COLUMN_
> Optional specific column.

**--help**
> Display help information.

# DESCRIPTION

**dolt blame** shows what revision and author last modified each row in a table. Similar to git blame for code, it traces data changes back to their source commits.

The output shows the commit hash, author, and timestamp for the last modification of each row. This helps track when and by whom specific data changes were made.

dolt blame is valuable for auditing data changes and understanding the history of specific records in version-controlled databases.

# CAVEATS

Large tables may produce extensive output. Only shows last modification, not full history. Performance depends on table size and history depth.

# HISTORY

dolt blame is part of **Dolt**, bringing Git's blame functionality to database tables. It supports the data auditing and accountability features that version-controlled databases enable.

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-log](/man/dolt-log)(1), [git-blame](/man/git-blame)(1)
