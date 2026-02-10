# TAGLINE

command-line interface for Hugging Face Hub

# TLDR

**Login to Hugging Face**

```huggingface-cli login```

**Download a model**

```huggingface-cli download [model-name]```

**Download to specific directory**

```huggingface-cli download [model-name] --cache-dir [path]```

**Download specific files**

```huggingface-cli download [model-name] [config.json] [model.safetensors]```

**Upload a file**

```huggingface-cli upload [repo-id] [file]```

**Logout**

```huggingface-cli logout```

# SYNOPSIS

**huggingface-cli** _command_ [_options_]

# SUBCOMMANDS

**login**
> Authenticate with Hugging Face Hub.

**logout**
> Log out of Hugging Face Hub.

**download** _repo_ [_files_]
> Download files from the Hub.

**upload** _repo_ _files_
> Upload files to a repository.

**repo**
> Manage repositories.

**env**
> Display environment info.

# PARAMETERS

**--token** _token_
> Use specific access token.

**--cache-dir** _path_
> Download destination directory.

# DESCRIPTION

**huggingface-cli** (also **hf**) is the command-line interface for Hugging Face Hub. Download models and datasets, manage repositories, and authenticate your machine. Part of the huggingface_hub Python package. Default cache location is ~/.cache/huggingface or HF_HOME environment variable.

# SEE ALSO

[pip](/man/pip)(1), [transformers-cli](/man/transformers-cli)(1)

