# TAGLINE

initialize data version control

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

**dvc init** initializes Data Version Control in a directory, creating the .dvc directory structure. This sets up DVC for tracking large files, datasets, and machine learning models alongside Git version control.

Should be run in a Git repository for full functionality, though the --no-scm option allows standalone operation. The command creates configuration files, cache directory, and integrates with Git by adding .dvc files to .gitignore.

# CONFIGURATION

**.dvc/config**
> Local repository configuration including remotes, cache settings, and execution parameters.

**.dvc/config.local**
> Local machine-specific settings not tracked in Git, such as credentials and cache locations.

# SEE ALSO

[dvc-destroy](/man/dvc-destroy)(1), [git-init](/man/git-init)(1)

