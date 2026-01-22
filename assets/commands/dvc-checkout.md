# TLDR

**Checkout all tracked** files

```dvc checkout```

**Checkout specific file**

```dvc checkout [data/file.csv.dvc]```

**Checkout with summary**

```dvc checkout --summary```

**Force checkout** overwriting local

```dvc checkout --force```

# SYNOPSIS

**dvc checkout** [_options_] [_targets_...]

# PARAMETERS

_TARGETS_
> DVC files to checkout.

**-f**, **--force**
> Overwrite local changes.

**--summary**
> Show summary of changes.

**-d**, **--with-deps**
> Include dependencies.

**--help**
> Display help information.

# DESCRIPTION

**dvc checkout** synchronizes DVC-tracked files in the workspace with the versions specified in .dvc files. It's used after git checkout to restore data files matching the current Git commit.

When switching Git branches or commits, dvc checkout updates data files to match the .dvc metadata. Files are retrieved from the DVC cache or require dvc pull if not cached locally.

This enables working with different versions of datasets across branches.

# CAVEATS

Requires data in local cache or remote. Large files may take time. Force overwrites local changes. Works per .dvc file.

# HISTORY

dvc checkout is part of **DVC**, providing Git-like checkout semantics for versioned data files in machine learning projects.

# SEE ALSO

[dvc](/man/dvc)(1), [dvc-pull](/man/dvc-pull)(1), [git-checkout](/man/git-checkout)(1)
