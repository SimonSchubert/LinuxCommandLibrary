# TAGLINE

manages Kaggle datasets from the command line

# TLDR

**Search** datasets

```kaggle datasets list -s "[search term]"```

List **your own** datasets

```kaggle datasets list -m```

**List files** in a dataset

```kaggle datasets files [owner/dataset-name]```

**Download** and unzip a dataset into a folder

```kaggle datasets download [owner/dataset-name] -p [path] --unzip```

Download a **single file**

```kaggle datasets download [owner/dataset-name] -f [file.csv]```

**Generate** a metadata template for a new dataset

```kaggle datasets init -p [path]```

**Create** a new public dataset from a folder

```kaggle datasets create -p [path] --public```

Upload a **new version**

```kaggle datasets version -p [path] -m "[version notes]"```

# SYNOPSIS

**kaggle** **datasets** _subcommand_ [_options_]

# COMMANDS

**list**
> Search and list datasets.

**files** _DATASET_
> List files in a dataset.

**download** _DATASET_
> Download dataset files as a zip archive, or a single file with **-f**.

**init**
> Create a **dataset-metadata.json** template in a folder.

**create**
> Create a new dataset from a folder containing data files and **dataset-metadata.json**.

**version**
> Upload a new version of an existing dataset.

**metadata** _DATASET_
> Download metadata to **dataset-metadata.json**, or push local edits with **--update**.

**status** _DATASET_
> Show the processing status of a dataset.

**delete** _DATASET_
> Delete a dataset.

**topics** list|show
> Browse discussion topics of a dataset.

# PARAMETERS

**-s**, **--search** _TERM_
> Search term (list).

**-m**, **--mine**
> Show only your datasets (list).

**--user** _USER_
> Filter by user or organization (list).

**--sort-by** _FIELD_
> Sort by hottest, votes, updated or active (list).

**--file-type** _TYPE_
> Filter by all, csv, sqlite, json or bigQuery (list).

**--min-size**, **--max-size** _BYTES_
> Filter by dataset size (list).

**-v**, **--csv**
> Print results in CSV format.

**-f**, **--file** _NAME_
> Download only this file (download).

**-p**, **--path** _PATH_
> Download destination, or folder with data and metadata (default: current directory).

**--unzip**
> Unzip the downloaded archive and delete the zip (download).

**-o**, **--force**
> Overwrite existing files (download).

**-u**, **--public**
> Make a new dataset public; the default is private (create).

**-m**, **--message** _NOTES_
> Version notes, required (version).

**-r**, **--dir-mode** _MODE_
> Handle subdirectories: skip, zip or tar (create, version).

**-t**, **--keep-tabular**
> Do not convert tabular files to CSV (create, version).

**-d**, **--delete-old-versions**
> Delete previous versions (version).

**-q**, **--quiet**
> Suppress verbose output.

# DESCRIPTION

**kaggle datasets** manages Kaggle datasets from the command line. Part of the official Kaggle CLI, it allows browsing, downloading, and publishing datasets for machine learning projects.

Datasets are referenced as **owner/dataset-name**, the suffix of the dataset URL on kaggle.com. Publishing requires a **dataset-metadata.json** file (created by **init**) with a title, slug and license.

# CAVEATS

Requires Kaggle API credentials (see **kaggle config**). Older releases took the dataset with **-d**; current versions accept it as a positional argument. By default subdirectories are skipped on upload unless **-r zip** or **-r tar** is given.

# INSTALL

```nix: nix profile install nixpkgs#kaggle```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[kaggle](/man/kaggle)(1), [kaggle-competitions](/man/kaggle-competitions)(1), [kaggle-kernels](/man/kaggle-kernels)(1), [kaggle-models](/man/kaggle-models)(1)

# RESOURCES

```[Source code](https://github.com/Kaggle/kaggle-cli)```

```[Documentation](https://github.com/Kaggle/kaggle-cli/blob/main/docs/datasets.md)```

<!-- verified: 2026-09-29 -->
