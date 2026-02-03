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

**dolt add** stages table changes for the next commit. Similar to git add but operates on database tables instead of files.

# SEE ALSO

[dolt-commit](/man/dolt-commit)(1), [dolt-status](/man/dolt-status)(1)

