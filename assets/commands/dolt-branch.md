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

**dolt branch** lists, creates, or deletes branches. Dolt branches work like Git branches but for versioned databases.

# SEE ALSO

[dolt-checkout](/man/dolt-checkout)(1), [dolt-merge](/man/dolt-merge)(1)

