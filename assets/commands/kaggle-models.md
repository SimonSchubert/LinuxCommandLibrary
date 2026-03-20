# TAGLINE

manages Kaggle machine learning models from the command line

# TLDR

**List models**

```kaggle models list```

**Get model details**

```kaggle models get -m [owner/model-name]```

**Initialize model metadata**

```kaggle models init -p [path]```

**Create a new model**

```kaggle models create -p [path]```

**Download model instance version**

```kaggle models instances versions download -m [owner/model/framework/instance] -v [version]```

# SYNOPSIS

**kaggle** **models** _subcommand_ [_options_]

# PARAMETERS

**list**
> List available models.

**get** **-m** _model_
> Get model details.

**init**
> Initialize model metadata.

**create**
> Create new model.

**update**
> Update an existing model.

**delete**
> Delete a model.

**instances**
> Manage model instances (get, init, create, update, delete, files).

**instances versions**
> Manage model instance versions (create, download, delete, files).

# DESCRIPTION

**kaggle models** manages Kaggle machine learning models from the command line. Part of the Kaggle CLI, it provides access to pre-trained models and allows publishing custom models for the community.

The command hierarchy has three levels: **models** (top-level repositories), **instances** (specific framework implementations), and **instance versions** (versioned snapshots). The shorthand **kaggle m** can be used instead of **kaggle models**.

# SEE ALSO

[kaggle](/man/kaggle)(1), [kaggle-datasets](/man/kaggle-datasets)(1), [kaggle-competitions](/man/kaggle-competitions)(1), [kaggle-kernels](/man/kaggle-kernels)(1)

