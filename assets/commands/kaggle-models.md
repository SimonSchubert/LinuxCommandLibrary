# TAGLINE

manages Kaggle machine learning models from the command line

# TLDR

**List models matching a search term**

```kaggle models list -s [search_term]```

**List models of an owner**

```kaggle models list --owner [owner]```

**Download a model's metadata**

```kaggle models get [owner/model-slug] -p [path]```

**Initialize a model metadata file**

```kaggle models init -p [path]```

**Create a new model**

```kaggle models create -p [path]```

**Update a model from its metadata file**

```kaggle models update -p [path]```

**Delete a model without prompting**

```kaggle models delete [owner/model-slug] -y```

**Download a model variation version**

```kaggle models variations versions download [owner/model-slug/framework/variation-slug/version] -p [path] --untar```

# SYNOPSIS

**kaggle** **models** _subcommand_ [_options_]

# PARAMETERS

**list**
> List available models. Options: **--owner** _OWNER_, **--sort-by** _SORT_BY_, **-s**, **--search** _TERM_, **--page-size** _SIZE_, **--page-token** _TOKEN_, **-v**, **--csv**.

**get** _MODEL_ **-p** _FOLDER_
> Download the model-metadata.json file of an existing model.

**init** **-p** _FOLDER_
> Create a template model-metadata.json file.

**create** **-p** _FOLDER_
> Create a new model from a model-metadata.json file.

**update** **-p** _FOLDER_
> Update an existing model from a model-metadata.json file.

**delete** _MODEL_ [**-y**]
> Delete a model and all its variations and versions. **-y** skips the confirmation prompt.

**topics list** _MODEL_
> List discussion topics for a model.

**topics show** _TOPIC_REF_
> Show a discussion topic with its comments.

**variations**
> Manage model variations (get, files, init, create, update, delete). **instances** is an equivalent name.

**variations versions**
> Manage model variation versions (create, download, files, delete).

# DESCRIPTION

**kaggle models** manages Kaggle machine learning models from the command line. Part of the Kaggle CLI, it provides access to pre-trained models and allows publishing custom models for the community.

The command hierarchy has three levels: **models** (top-level repositories), **variations** (specific framework implementations, also called instances), and **versions** (versioned snapshots). The shorthand **kaggle m** can be used instead of **kaggle models**.

# CAVEATS

Requires a Kaggle account and API credentials. The metadata file must be edited with owner, title and slug before **create** works. **update** on a variation changes its metadata only; upload new files by creating a new version.

# SEE ALSO

[kaggle](/man/kaggle)(1), [kaggle-datasets](/man/kaggle-datasets)(1), [kaggle-competitions](/man/kaggle-competitions)(1), [kaggle-kernels](/man/kaggle-kernels)(1)

# RESOURCES

```[Source code](https://github.com/Kaggle/kaggle-cli)```

```[Documentation](https://github.com/Kaggle/kaggle-cli/blob/main/docs/models.md)```

<!-- verified: 2026-11-09 -->
