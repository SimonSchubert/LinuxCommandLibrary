# TLDR

**Switch to branch**

```dolt checkout [branch_name]```

**Create and switch** to new branch

```dolt checkout -b [new_branch]```

**Restore table** to HEAD version

```dolt checkout [table_name]```

**Checkout specific commit**

```dolt checkout [commit_hash]```

# SYNOPSIS

**dolt checkout** [_options_] [_branch_|_table_|_commit_]

# PARAMETERS

_BRANCH_
> Branch name to switch to.

_TABLE_
> Table to restore from HEAD.

_COMMIT_
> Commit hash to checkout.

**-b** _BRANCH_
> Create new branch and switch to it.

**-B** _BRANCH_
> Create/reset branch and switch to it.

**--help**
> Display help information.

# DESCRIPTION

**dolt checkout** switches branches or restores working tree tables. Like git checkout, it serves multiple purposes: switching between branches, creating new branches, and discarding local changes.

When given a branch name, it switches the working database to that branch. With -b, it creates a new branch and switches to it. When given a table name, it restores that table to match HEAD, discarding uncommitted changes.

This command is fundamental for working with Dolt's branching model, enabling parallel development workflows on database data.

# CAVEATS

Uncommitted changes may block checkout. Detached HEAD state possible with commit checkout. Table checkout discards changes irreversibly.

# HISTORY

dolt checkout mirrors **git checkout** functionality for Dolt's versioned database system, providing familiar branch management operations for database version control.

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-branch](/man/dolt-branch)(1), [git-checkout](/man/git-checkout)(1)
