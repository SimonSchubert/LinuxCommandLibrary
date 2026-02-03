# TLDR

**Initialize DVC in repository**

```dvc init```

**Initialize without Git integration**

```dvc init --no-scm```

**Initialize in subdirectory**

```dvc init --subdir```

# SYNOPSIS

**dvc** **init** [_options_]

# PARAMETERS

**--no-scm**
> Initialize without Git.

**--subdir**
> Initialize in subdirectory of Git repo.

**-f**, **--force**
> Force re-initialization.

# DESCRIPTION

**dvc init** initializes DVC in a directory, creating the .dvc directory structure. Should be run in a Git repository for full functionality.

# SEE ALSO

[dvc-destroy](/man/dvc-destroy)(1), [git-init](/man/git-init)(1)

