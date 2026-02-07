# TAGLINE

list, create, or delete database branches

# TLDR

**List branches**

```dolt branch```

**Create a branch**

```dolt branch [name]```

**Delete a branch**

```dolt branch -d [name]```

**Rename current branch**

```dolt branch -m [new_name]```

**List remote branches**

```dolt branch -r```

# SYNOPSIS

**dolt** **branch** [_options_] [_branch_name_]

# PARAMETERS

**-d**, **--delete**
> Delete a branch.

**-D**
> Force delete branch.

**-m**, **--move**
> Rename branch.

**-r**, **--remotes**
> List remote branches.

**-a**, **--all**
> List all branches.

**-c**, **--copy**
> Copy branch.

# DESCRIPTION

**dolt branch** lists, creates, or deletes branches in a Dolt database repository. Branches work like Git branches but for versioned databases, allowing parallel development of database schemas and data.

Without arguments, the command lists all local branches with an asterisk marking the current branch. Creating a branch captures the current database state as a starting point for divergent development. Branches can be used for testing schema changes, experimenting with data transformations, or maintaining multiple versions of a dataset.

Branch management enables sophisticated workflows like feature branches for schema migrations, hotfix branches for data corrections, and release branches for versioned datasets.

# SEE ALSO

[dolt-checkout](/man/dolt-checkout)(1), [dolt-merge](/man/dolt-merge)(1)
