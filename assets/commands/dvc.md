# TAGLINE

version control system for machine learning projects

# TLDR

**Initialize DVC repository**

```dvc init```

**Track a data file or directory**

```dvc add [data/dataset.csv]```

**Push tracked data to remote storage**

```dvc push```

**Pull tracked data from remote storage**

```dvc pull```

**Reproduce a pipeline**

```dvc repro```

**Show pipeline DAG**

```dvc dag```

**Configure remote storage**

```dvc remote add -d [myremote] [s3://bucket/path]```

**Show differences in tracked data**

```dvc diff```

# SYNOPSIS

**dvc** [**--cd** _dir_] _command_ [_options_]

# PARAMETERS

_COMMAND_
> DVC operation to perform.

**init**
> Initialize DVC in a Git repository.

**add** _FILE_
> Track a file or directory with DVC.

**push**
> Upload tracked data to remote storage.

**pull**
> Download tracked data from remote storage.

**repro**
> Reproduce pipeline stages.

**diff**
> Show changes in tracked data between commits.

**fetch**
> Download tracked data from remote without checkout.

**checkout**
> Checkout data files matching current .dvc files.

**gc**
> Garbage-collect unused cache files.

**remote add** _NAME_ _URL_
> Add remote storage.

**config** _OPTION_ [_VALUE_]
> Get or set DVC configuration options.

**dag**
> Visualize pipeline stages as a directed acyclic graph.

**destroy**
> Remove all DVC files and directories from the project.

**--cd** _dir_
> Change to directory before executing the command.

**-v**, **--verbose**
> Increase output verbosity.

**-q**, **--quiet**
> Suppress output.

**--version**
> Show DVC version.

**-h**, **--help**
> Display help information.

# CONFIGURATION

**.dvc/config**
> Repository-level DVC configuration including remote storage settings.

**~/.config/dvc/config**
> Global user configuration for DVC defaults and preferences.

**.dvc/config.local**
> Local repository config for machine-specific settings not committed to Git.

# DESCRIPTION

**DVC** (Data Version Control) is a version control system for machine learning projects. It tracks large files, datasets, and models alongside Git, without storing them in the Git repository.

DVC stores file metadata (.dvc files) in Git while the actual data goes to configurable remote storage (S3, GCS, Azure, SSH, etc.). This enables versioning large files and sharing datasets across teams.

The pipeline feature defines reproducible ML workflows, tracking dependencies and outputs for experiment management.

# CAVEATS

Requires Git repository. Large data transfers depend on network speed. Remote storage may incur costs. Pipeline reproduction needs matching environment.

# HISTORY

DVC was created by **iterative.ai** and released in **2017**. It addresses the challenge of versioning large datasets and ML models that don't fit well in Git, enabling reproducible machine learning workflows. In **2025**, DVC was acquired by **lakeFS**.

# SEE ALSO

[git](/man/git)(1), [dvc-init](/man/dvc-init)(1), [dvc-add](/man/dvc-add)(1), [dvc-diff](/man/dvc-diff)(1), [dvc-fetch](/man/dvc-fetch)(1), [dvc-dag](/man/dvc-dag)(1), [dvc-gc](/man/dvc-gc)(1), [mlflow](/man/mlflow)(1)
