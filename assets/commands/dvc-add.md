# TAGLINE

track data files with DVC

# TLDR

**Track a file**

```dvc add [data.csv]```

**Track a directory**

```dvc add [data/]```

**Track with external storage**

```dvc add --external [/external/data]```

# SYNOPSIS

**dvc** **add** [_options_] _targets_...

# PARAMETERS

**-f**, **--file** _file_
> Specify .dvc filename.

**--external**
> Track external files.

**--no-commit**
> Don't auto-commit to git.

**--glob**
> Use glob patterns.

# DESCRIPTION

**dvc add** is the fundamental command for bringing data files under DVC version control. When you add a file, DVC computes its hash, moves it to the DVC cache, and creates a lightweight .dvc metadata file in its place.

The .dvc file contains the hash and path information needed to retrieve the original file from cache or remote storage. DVC automatically adds the original filename to .gitignore so the large data file isn't committed to Git, only the small .dvc metadata file.

This two-file approach allows Git to track data versions (via .dvc file) without storing the actual large files in the repository. The cached data can then be pushed to remote storage for team sharing. Directories are tracked recursively with a single .dvc file tracking all contents.

# SEE ALSO

[dvc-push](/man/dvc-push)(1), [dvc-pull](/man/dvc-pull)(1)

