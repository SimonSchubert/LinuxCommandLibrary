# TAGLINE

switch branches or restore working tables

# TLDR

**Switch to branch**

```dolt checkout [branch_name]```

**Create and switch** to new branch

```dolt checkout -b [new_branch]```

**Restore a table** to its HEAD version, discarding changes

```dolt checkout [table_name]```

**Restore a table** as it was at a given commit

```dolt checkout [commit_hash] -- [table_name]```

**Create a branch tracking** a remote branch

```dolt checkout --track [origin]/[branch_name]```

**Discard local changes** and force the switch

```dolt checkout --force [branch_name]```

# SYNOPSIS

**dolt checkout** _branch_

**dolt checkout** _table_...

**dolt checkout** _commit_ [--] _table_...

**dolt checkout** **-b** _new-branch_ [_start-point_]

**dolt checkout** **--track** _remote_/_branch_

# PARAMETERS

**-b** _new-branch_ [_start-point_]
> Create a branch named _new-branch_ starting at _start-point_ (defaults to HEAD) and switch to it.

**-B** _new-branch_ [_start-point_]
> Like **-b**, but forcibly resets the branch to _start-point_ if it already exists.

**-f**, **--force**
> Wipe out the current changes and check out the new branch anyway.

**-t**, **--track**
> When creating a branch, set up upstream tracking configuration.

**--overwrite-ignore**
> Silently overwrite ignored tables when switching branches.

**--no-overwrite-ignore**
> Abort the checkout if ignored tables would be overwritten.

# DESCRIPTION

**dolt checkout** switches branches or restores tables in the working set. Like `git checkout` it serves several purposes: moving between branches, creating branches, and discarding uncommitted changes.

Given a branch name, it points the working database at that branch. With **-b** it creates the branch first. Given one or more table names, it restores those tables to match HEAD, throwing away uncommitted changes; adding a commit before `--` restores them as of that commit instead.

Dolt's branches are cheap, since they are pointers into the same content-addressed storage, so branching per feature, per import, or per experiment is a normal workflow on data as well as schema.

# CAVEATS

Restoring a table discards its uncommitted changes with no way back: there is no reflog for the working set. Unlike Git, **dolt checkout** does not accept a bare commit hash to enter a detached HEAD; use `dolt checkout -b <branch> <commit>` to work from an old commit. When a `dolt sql-server` is running against the database, the CLI shares the server's session state, so checkouts made from the shell are visible to connected clients.

# HISTORY

dolt checkout mirrors **git checkout** for Dolt's versioned database, giving Git users a familiar way to move between branches of data. Dolt has since also grown Git's newer split of the command into `dolt branch` for branch management and `dolt reset`/`dolt revert` for undoing work, but `checkout` remains the everyday entry point.

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-branch](/man/dolt-branch)(1), [dolt-merge](/man/dolt-merge)(1), [git-checkout](/man/git-checkout)(1)

# RESOURCES

```[Source code](https://github.com/dolthub/dolt)```

```[Documentation](https://www.dolthub.com/docs/cli-reference/cli/)```

<!-- verified: 2026-07-14 -->

