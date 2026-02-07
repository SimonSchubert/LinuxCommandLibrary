# TAGLINE

download tracked files to local cache

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

**dvc fetch** downloads DVC-tracked data from remote storage into the local DVC cache without affecting the workspace. This is useful for preparing data for later use without immediately populating the working directory.

The two-stage process (fetch then checkout) provides control over disk space and timing. Fetching brings data into cache (usually .dvc/cache) where it's stored efficiently with deduplication. A subsequent dvc checkout creates links or copies from cache to workspace when you actually need the files.

This separation is particularly valuable in CI/CD pipelines or when switching between branches: you can fetch all necessary data upfront, then quickly checkout different versions as needed without repeated downloads. The --all-commits, --all-branches, and --all-tags options help prefetch data for multiple revisions in bulk.

# SEE ALSO

[dvc-pull](/man/dvc-pull)(1), [dvc-push](/man/dvc-push)(1)

