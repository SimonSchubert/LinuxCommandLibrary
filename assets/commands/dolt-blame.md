# TAGLINE

show the commit, author, and timestamp that last modified each row of a Dolt table

# TLDR

**Blame every row** of a table

```dolt blame [table_name]```

**Show blame by primary-key value** (filter after the fact)

```dolt blame [table_name] | grep "[key_value]"```

**Query blame via SQL** for custom columns/filtering

```dolt sql -q "SELECT * FROM dolt_blame_[table_name]"```

**Show only rows modified by an author**

```dolt sql -q "SELECT * FROM dolt_blame_[table_name] WHERE committer = '[alice]'"```

# SYNOPSIS

**dolt blame** _table_

# PARAMETERS

_TABLE_
> The table to blame. Rows are identified by their primary key.

# DESCRIPTION

**dolt blame** prints a row-per-primary-key table showing the timestamp, author, commit message, and commit hash of the last commit that modified that row. It is the row-level equivalent of `git blame`, adapted to a database.

The CLI form shows a fixed set of columns. For more flexible queries (joins with other system tables, filtering by commit range, custom projections) use the equivalent SQL system view `dolt_blame_$tablename` — its columns include every primary key of the table plus `commit_hash`, `committer`, `email`, `date`, and `message`.

# CAVEATS

Only reports the **most recent** modification per row — no full history. Schema changes are currently counted as a change to every row, so a single `ALTER TABLE` blames every row to that commit. Large tables with deep history can take a while; prefer the SQL view with `LIMIT`/`WHERE` in those cases.

# HISTORY

**dolt blame** is part of **Dolt**, the versioned SQL database ("Git for data") by **DoltHub**. It brings Git-style per-row provenance to relational tables.

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-sql](/man/dolt-sql)(1), [git-blame](/man/git-blame)(1)
