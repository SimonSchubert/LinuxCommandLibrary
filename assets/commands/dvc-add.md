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

**dvc add** tracks data files and directories with DVC. Creates a .dvc file that stores the file hash and adds the original file to .gitignore.

# SEE ALSO

[dvc-push](/man/dvc-push)(1), [dvc-pull](/man/dvc-pull)(1)

