# TAGLINE

List, create, or delete database branches

# TLDR

**List local branches**

```dolt branch```

**List all branches** including remote-tracking branches

```dolt branch -a```

**Create a branch** from the current HEAD

```dolt branch [name]```

**Create a branch** from a specific start point

```dolt branch [name] [start_point]```

**Delete a branch**

```dolt branch -d [name]```

**Force delete** an unmerged branch

```dolt branch -D [name]```

**Rename the current branch**

```dolt branch -m [new_name]```

**Copy a branch**

```dolt branch -c [old_name] [new_name]```

**List remote-tracking branches**

```dolt branch -r```

**Show the current branch** name

```dolt branch --show-current```

**List branches with verbose** commit information

```dolt branch -v```

# SYNOPSIS

**dolt branch** [**--list**] [**-v**] [**-a**] [**-r**]
**dolt branch** [**-f**] _branchname_ [_start-point_]
**dolt branch** **-m** [**-f**] [_oldbranch_] _newbranch_
**dolt branch** **-c** [**-f**] [_oldbranch_] _newbranch_
**dolt branch** **-d** [**-f**] [**-r**] _branchname_...

# PARAMETERS

**-d**, **--delete**
> Delete a branch. The branch must be fully merged unless **-f** is also given.

**-D**
> Shortcut for **--delete --force**.

**-m**, **--move**
> Rename a branch.

**-c**, **--copy**
> Copy a branch to a new name.

**-f**, **--force**
> Reset a branch to a start point even if it already exists, force rename/copy even if the target name exists, or allow deleting an unmerged branch.

**-r**, **--remote**
> List or operate on remote-tracking branches.

**-a**, **--all**
> List both local and remote-tracking branches.

**-v**, **--verbose**
> Show commit hash and subject line for each branch. Use **-vv** to also show upstream branch name.

**-t**, **--track**
> Set up upstream tracking for a remote branch.

**--show-current**
> Print the name of the current active branch.

**--list**
> Explicitly enter list mode.

_start-point_
> A commit reference where the new branch should originate. Defaults to the current HEAD.

# DESCRIPTION

**dolt branch** lists, creates, or deletes branches in a Dolt database repository. Branches work like Git branches but for versioned databases, allowing parallel development of database schemas and data.

Without arguments, the command lists all local branches with an asterisk marking the current branch. Creating a branch captures the current database state as a starting point for divergent development. Note that creating a branch does not switch to it; use **dolt checkout** to switch branches.

Branches can be used for testing schema changes, experimenting with data transformations, or maintaining multiple versions of a dataset.

# SEE ALSO

[dolt-checkout](/man/dolt-checkout)(1), [dolt-merge](/man/dolt-merge)(1), [dolt-commit](/man/dolt-commit)(1), [dolt-status](/man/dolt-status)(1), [dolt](/man/dolt)(1)
