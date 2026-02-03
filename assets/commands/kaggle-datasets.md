# TLDR

**List datasets**

```kaggle datasets list```

**Search datasets**

```kaggle datasets list -s "[search term]"```

**Download dataset**

```kaggle datasets download -d [owner/dataset-name]```

**Create new dataset**

```kaggle datasets create -p [path]```

**Get dataset metadata**

```kaggle datasets metadata -d [owner/dataset-name]```

# SYNOPSIS

**kaggle** **datasets** _subcommand_ [_options_]

# PARAMETERS

**list**
> List available datasets.

**download** **-d** _dataset_
> Download dataset files.

**create** **-p** _path_
> Create new dataset.

**version** **-p** _path_
> Create new dataset version.

**metadata** **-d** _dataset_
> Get dataset metadata.

**-s** _term_
> Search filter.

# DESCRIPTION

**kaggle datasets** manages Kaggle datasets from the command line. Part of the Kaggle CLI, it allows browsing, downloading, and publishing datasets for machine learning projects.

# SEE ALSO

[kaggle](/man/kaggle)(1), [kaggle-competitions](/man/kaggle-competitions)(1)

