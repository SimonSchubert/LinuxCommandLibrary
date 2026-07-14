# TAGLINE

stage table changes for commit

# TLDR

**Stage all changes**

```dolt add .```

**Stage a specific table**

```dolt add [table_name]```

**Stage multiple tables**

```dolt add [table1] [table2]```

**Stage everything**, equivalent to `.`

```dolt add -A```

**Stage a table that is ignored** by `dolt_ignore`

```dolt add --force [table_name]```

# SYNOPSIS

**dolt** **add** [_table_...]

# PARAMETERS

**-A**, **--all**
> Stage any and all changes (adds, deletes, and modifications), except for ignored tables.

**-f**, **--force**
> Allow adding otherwise ignored tables.

# DESCRIPTION

**dolt add** stages table changes for the next commit. Where `git add` operates on files, `dolt add` stages database tables whose rows or schema have been modified, added, or dropped.

The command marks tables with pending changes to be included in the next commit. Staging allows selective committing across multiple tables, the same index concept as Git's, applied to schema and data modifications instead of file contents.

Naming tables explicitly stages only those; `.` or **-A** stages every modified table in the working set.

# CAVEATS

Tables matched by the `dolt_ignore` system table are skipped even by **-A**; use **--force** to stage one anyway. Staging is only meaningful for the CLI workflow: writes made through `dolt sql-server` land directly in the working set, and depending on the session's `@@dolt_transaction_commit` setting they may be committed without ever passing through the staging area.

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-commit](/man/dolt-commit)(1), [dolt-status](/man/dolt-status)(1), [git-add](/man/git-add)(1)

# RESOURCES

```[Source code](https://github.com/dolthub/dolt)```

```[Documentation](https://www.dolthub.com/docs/cli-reference/cli/)```

<!-- verified: 2026-07-14 -->

