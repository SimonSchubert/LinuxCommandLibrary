# TLDR

**Fetch all tracked data**

```dvc fetch```

**Fetch specific file**

```dvc fetch [data.csv.dvc]```

**Fetch from specific remote**

```dvc fetch -r [remote_name]```

**Fetch all revisions**

```dvc fetch --all-commits```

**Fetch with jobs**

```dvc fetch -j [4]```

# SYNOPSIS

**dvc** **fetch** [_options_] [_targets_...]

# PARAMETERS

**-r**, **--remote** _name_
> Remote storage name.

**-j**, **--jobs** _number_
> Parallel download jobs.

**--all-commits**
> Fetch for all Git commits.

**--all-branches**
> Fetch for all branches.

**--all-tags**
> Fetch for all tags.

**-R**, **--recursive**
> Fetch recursively.

# DESCRIPTION

**dvc fetch** downloads tracked files from remote storage to the local cache without placing them in the workspace. Use dvc checkout to restore files after fetching.

# SEE ALSO

[dvc-pull](/man/dvc-pull)(1), [dvc-push](/man/dvc-push)(1)

