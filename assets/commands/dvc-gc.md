# TAGLINE

Clean unused DVC cache files

# TLDR

**Clean cache keeping** workspace files

```dvc gc -w```

**Clean keeping all** branches

```dvc gc -a```

**Clean keeping all** tags and branches

```dvc gc -a -T```

**Dry run** (show what would be deleted)

```dvc gc -w --dry```

**Force clean** in cloud remote without confirmation

```dvc gc -w -c -f```

**Clean keeping data from the last** N commits

```dvc gc -n [5]```

# SYNOPSIS

**dvc gc** [_options_]

# PARAMETERS

**-w**, **--workspace**
> Keep files used in current workspace.

**-a**, **--all-branches**
> Keep files used in all Git branch tips.

**-T**, **--all-tags**
> Keep files used in all Git tags.

**-A**, **--all-commits**
> Keep files used in all Git commits.

**--all-experiments**
> Keep files used in all experiments.

**-c**, **--cloud**
> Also garbage collect in remote storage in addition to local cache.

**-r** _NAME_, **--remote** _NAME_
> Target a specific remote for garbage collection.

**-n** _NUM_, **--num** _NUM_
> Keep data from the last NUM commits (default: 1).

**--rev** _COMMIT_
> Keep data files from a specified Git commit.

**--date** _YYYY-MM-DD_
> Keep cached data from commits after the specified date.

**--not-in-remote**
> Keep data not present in remote storage.

**-f**, **--force**
> Skip confirmation prompts.

**-j** _NUM_, **--jobs** _NUM_
> Number of concurrent jobs for cloud operations.

**--dry**
> Preview what would be deleted without executing.

**-p** _PATHS_, **--projects** _PATHS_
> Include specified projects when sharing a cache directory.

# DESCRIPTION

**dvc gc** removes unused files from the DVC cache, freeing disk space. At least one scope option (**-w**, **-a**, **-T**, **-A**, **--all-experiments**, **-n**, **--rev**, or **--date**) must be specified to define which data to keep.

The cache accumulates files from all tracked versions. Garbage collection identifies and removes files no longer referenced by any specified commits, branches, or tags.

The cloud option (**-c**) extends cleaning to remote storage, removing files not needed by the specified scope.

# CAVEATS

Irreversible operation - removed cache files must be re-downloaded or re-computed. Consider keeping all branches for collaboration. Cloud gc may affect other users' access to data. A scope option is required; running without one produces an error.

# HISTORY

dvc gc implements garbage collection for **DVC** caches, similar to git gc but for versioned data files, enabling storage management in ML projects.

# SEE ALSO

[dvc](/man/dvc)(1), [dvc-init](/man/dvc-init)(1), [dvc-add](/man/dvc-add)(1), [git-gc](/man/git-gc)(1)
