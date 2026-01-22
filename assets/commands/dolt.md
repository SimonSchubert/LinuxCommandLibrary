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

# SYNOPSIS

**dolt** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Git-like command: init, clone, add, commit, push, sql, etc.

**init**
> Initialize new repository.

**clone** _REPO_
> Clone remote repository.

**status**
> Show working tree status.

**add** _TABLE_
> Stage table changes.

**commit** **-m** _MSG_
> Commit staged changes.

**sql** **-q** _QUERY_
> Execute SQL query.

**sql-server**
> Start MySQL-compatible server.

**push** _REMOTE_ _BRANCH_
> Push to remote.

**--help**
> Display help information.

# DESCRIPTION

**Dolt** is a SQL database with Git-like version control. It combines a fully-functional relational database with branch, merge, diff, and clone operations familiar from Git.

Data is stored in tables queryable via standard SQL (MySQL-compatible). Changes can be staged, committed, and pushed to remotes like DoltHub. Branches allow parallel development with merge capabilities including conflict resolution.

Dolt enables use cases like data versioning, collaborative data editing, reproducible data pipelines, and auditable data changes with complete history.

# CAVEATS

Performance differs from traditional databases for some workloads. Some MySQL features not fully supported. Large repositories may have performance implications. Merge conflicts require resolution.

# HISTORY

Dolt was created by **DoltHub** (formerly Liquidata) and released in **2019**. It was designed to bring Git's version control model to databases, addressing the lack of data versioning in traditional database systems.

# SEE ALSO

[git](/man/git)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)
