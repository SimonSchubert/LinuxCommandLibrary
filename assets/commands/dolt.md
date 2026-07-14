# TAGLINE

SQL database with Git-like version control

# TLDR

**Initialize a repository**

```dolt init```

**Clone a repository**

```dolt clone [owner/repo]```

**Check status**

```dolt status```

**Add changes**

```dolt add [table_name]```

**Commit changes**

```dolt commit -m "[message]"```

**Run SQL query**

```dolt sql -q "[SELECT * FROM table]"```

**Start SQL server**

```dolt sql-server```

**Push to remote**

```dolt push origin main```

**Diff two commits** or branches

```dolt diff [main] [feature_branch]```

**Import a CSV** into a table

```dolt table import -c --pk=[id] [table_name] [data.csv]```

# SYNOPSIS

**dolt** _command_ [_arguments_] [_flags_]

# COMMANDS

**init** / **clone** _owner_/_repo_
> Create a new database in the current directory, or clone one from a remote such as DoltHub.

**status** / **diff** / **log** / **blame**
> Inspect the working set, compare commits or branches, browse history, and see which commit last changed a row.

**add** _table_ / **reset** / **commit** **-m** _msg_
> Stage, unstage, and commit table changes.

**branch** / **checkout** / **merge** / **tag**
> Manage branches, switch between them, join histories, and mark releases.

**remote** / **fetch** / **pull** / **push**
> Manage remotes and exchange commits with them.

**sql** [**-q** _query_]
> Open the SQL shell or run a single query.

**sql-server**
> Start a MySQL-compatible server so ordinary clients and ORMs can connect.

**table import** / **table export**
> Load a CSV, JSON, or Parquet file into a table, or dump one out.

**dump**
> Export the whole database to SQL, CSV, JSON, or Parquet.

**gc**
> Reclaim disk space from unreachable data.

**version**
> Print the installed Dolt version.

# DESCRIPTION

**Dolt** is a SQL database with Git-like version control. It is a real MySQL-compatible relational database, and every one of Git's core operations, `clone`, `branch`, `diff`, `merge`, `commit`, `push`, `pull`, works on the data and the schema inside it.

The version-control surface is available two ways. The CLI mirrors Git command for command, which is how most people first use it. Everything is also reachable from SQL: `AS OF` queries read a table at any commit or branch, system tables such as `dolt_log`, `dolt_diff_<table>`, and `dolt_status` expose history, and stored procedures like `CALL DOLT_COMMIT()` and `CALL DOLT_MERGE()` let an application version its own data without shelling out.

Because merges happen cell by cell rather than line by line, two branches that touch different columns of the same row merge cleanly, and genuine conflicts are surfaced as rows in the `dolt_conflicts` tables to be resolved with SQL. **DoltHub** and **DoltLab** provide hosted and self-hosted remotes, in the same relationship GitHub has to Git.

Typical uses are data versioning and auditing, collaborative curation of shared datasets, reproducible pipelines that can be rolled back to any past state, and test fixtures that can be branched per test run.

# CONFIGURATION

**~/.dolt/config_global.json**
> Global configuration for user name, email, and default remotes.

**.dolt/config.json**
> Repository-specific configuration for remotes and branch settings.

# CAVEATS

Keeping every historical version is not free: a Dolt database is larger and generally slower than the equivalent MySQL instance, and heavy write workloads need periodic **dolt gc**. MySQL compatibility is high but not complete, so an application that leans on exotic functions or storage-engine behaviour may need adjustment. Data written through `dolt sql` or `sql-server` lands in the working set and is not history until it is committed, which surprises people who expect an ordinary database. Conflicts are not resolved with text markers but through the `dolt_conflicts` system tables.

# HISTORY

Dolt was created by **Liquidata**, now DoltHub, and released in **2019**. Its storage engine descends from **Noms**, an earlier content-addressed, versioned database from Attic Labs, which is what makes cheap branching and structural diffing possible. Early versions had their own query dialect; the pivot to MySQL compatibility, built on the **go-mysql-server** engine that DoltHub adopted and now maintains, is what turned Dolt from an interesting data-sharing tool into a database you can point an existing application at.

# SEE ALSO

[git](/man/git)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1), [dolt-sql](/man/dolt-sql)(1), [dolt-merge](/man/dolt-merge)(1), [dolt-clone](/man/dolt-clone)(1)

# RESOURCES

```[Source code](https://github.com/dolthub/dolt)```

```[Homepage](https://www.dolthub.com)```

```[Documentation](https://www.dolthub.com/docs/)```

<!-- verified: 2026-07-14 -->

