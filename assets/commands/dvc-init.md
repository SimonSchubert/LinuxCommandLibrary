# TAGLINE

Initialize Data Version Control in a repository

# TLDR

**Initialize DVC** in a Git repository

```dvc init```

**Initialize without Git** integration

```dvc init --no-scm```

**Initialize in a subdirectory** of a Git repo

```dvc init --subdir```

**Force re-initialization** of DVC

```dvc init -f```

# SYNOPSIS

**dvc** **init** [_options_]

# PARAMETERS

**--no-scm**
> Initialize DVC without Git integration. DVC will not create or modify any Git-related files.

**--subdir**
> Initialize DVC in a subdirectory of a Git repository, instead of the repository root.

**-f**, **--force**
> Force re-initialization, overwriting any existing .dvc directory.

**-q**, **--quiet**
> Suppress all output except errors.

**-v**, **--verbose**
> Display detailed tracing information.

# DESCRIPTION

**dvc init** initializes Data Version Control in a directory, creating the `.dvc/` directory structure. This sets up DVC for tracking large files, datasets, and machine learning models alongside Git version control.

Should be run in a Git repository for full functionality, though the `--no-scm` option allows standalone operation. The command creates configuration files, a cache directory, and integrates with Git by updating `.gitignore` and staging the new `.dvc/` directory.

The created `.dvc/` directory contains `config` (repository configuration), `.gitignore` (to exclude cache and temporary files), and a `tmp/` directory for internal use.

# CONFIGURATION

**.dvc/config**
> Local repository configuration including remotes, cache settings, and execution parameters.

**.dvc/config.local**
> Local machine-specific settings not tracked in Git, such as credentials and cache locations.

# SEE ALSO

[dvc](/man/dvc)(1), [dvc-config](/man/dvc-config)(1), [dvc-destroy](/man/dvc-destroy)(1), [git-init](/man/git-init)(1)

