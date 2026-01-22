# TLDR

**Clean unused cache** files

```dvc gc```

**Clean keeping workspace** files

```dvc gc -w```

**Clean keeping all** branches

```dvc gc -a```

**Clean with cloud** remote

```dvc gc -c```

**Force clean without** confirmation

```dvc gc -f```

**Dry run** (show what would be deleted)

```dvc gc --dry```

# SYNOPSIS

**dvc gc** [_options_]

# PARAMETERS

**-w**, **--workspace**
> Keep files used in current workspace.

**-a**, **--all-branches**
> Keep files used in all Git branches.

**-T**, **--all-tags**
> Keep files used in all Git tags.

**-c**, **--cloud**
> Also garbage collect in cloud remote.

**-f**, **--force**
> Force without confirmation.

**--dry**
> Show what would be deleted.

**--help**
> Display help information.

# DESCRIPTION

**dvc gc** removes unused files from the DVC cache, freeing disk space. By default, it keeps only files used in the current Git commit; options expand what's preserved.

The cache accumulates files from all tracked versions. Garbage collection identifies and removes files no longer referenced by any specified commits, branches, or tags.

Cloud option extends cleaning to remote storage, removing files not needed by the specified scope.

# CAVEATS

Irreversible operation - removed cache files need re-download. Consider keeping all branches for collaboration. Cloud gc may affect other users' access to data.

# HISTORY

dvc gc implements garbage collection for **DVC** caches, similar to git gc but for versioned data files, enabling storage management in ML projects.

# SEE ALSO

[dvc](/man/dvc)(1), [git-gc](/man/git-gc)(1)
