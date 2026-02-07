# TAGLINE

version control system for machine learning projects

# TLDR

**Initialize DVC** repository

```dvc init```

**Track data file**

```dvc add [data/dataset.csv]```

**Push data to** remote

```dvc push```

**Pull data from** remote

```dvc pull```

**Run pipeline**

```dvc repro```

**Show pipeline DAG**

```dvc dag```

**Configure remote** storage

```dvc remote add -d [myremote] [s3://bucket/path]```

# SYNOPSIS

**dvc** _command_ [_options_]

# PARAMETERS

_COMMAND_
> DVC operation to perform.

**init**
> Initialize DVC in repository.

**add** _FILE_
> Track file or directory.

**push**
> Upload tracked data to remote.

**pull**
> Download tracked data from remote.

**repro**
> Reproduce pipeline.

**remote add** _NAME_ _URL_
> Add remote storage.

**--help**
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

DVC was created by **iterative.ai** and released in **2017**. It addresses the challenge of versioning large datasets and ML models that don't fit well in Git, enabling reproducible machine learning workflows.

# SEE ALSO

[git](/man/git)(1), [mlflow](/man/mlflow)(1)
