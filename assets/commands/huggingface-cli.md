# TAGLINE

command-line interface for Hugging Face Hub

# TLDR

**Login to Hugging Face**

```huggingface-cli login```

**Download a model**

```huggingface-cli download [model-name]```

**Download specific files from a model**

```huggingface-cli download [model-name] [config.json] [model.safetensors]```

**Download to a local directory**

```huggingface-cli download [model-name] --local-dir [path]```

**Download a dataset**

```huggingface-cli download [dataset-name] --repo-type dataset```

**Upload a folder to a repo**

```huggingface-cli upload [repo-id] [local_path] [path_in_repo]```

**Scan the local cache**

```huggingface-cli scan-cache```

**Show current logged-in user**

```huggingface-cli whoami```

# SYNOPSIS

**huggingface-cli** _command_ [_options_]

# SUBCOMMANDS

**login**
> Authenticate with Hugging Face Hub.

**logout**
> Log out of Hugging Face Hub.

**whoami**
> Show current logged-in user and organizations.

**download** _repo_ [_files_]
> Download files from the Hub.

**upload** _repo_ [_local_path_] [_path_in_repo_]
> Upload files or folders to a repository.

**upload-large-folder** _repo_ _local_path_
> Upload a large folder with resumable chunked uploads.

**repo create** _repo_
> Create a new repository on the Hub.

**scan-cache**
> Scan and report on the local cache directory.

**delete-cache**
> Interactively delete unused cache revisions.

**tag** _repo_ _tag_
> Tag a repository with a version.

**env**
> Display environment and library info.

# PARAMETERS

**--token** _token_
> Use specific access token.

**--repo-type** _type_
> Repository type: model, dataset, or space (default: model).

**--local-dir** _path_
> Download to a specific local directory instead of cache.

**--include** _pattern_
> Glob pattern for files to include in download.

**--exclude** _pattern_
> Glob pattern for files to exclude from download.

**--revision** _rev_
> Specific revision to download (branch, tag, or commit hash).

**--quiet**
> Suppress progress output.

# DESCRIPTION

**huggingface-cli** is the command-line interface for Hugging Face Hub, also available as the **hf** command. Download models and datasets, manage repositories, and authenticate your machine. Part of the huggingface_hub Python package. The newer **hf** CLI uses a resource-action pattern (e.g. `hf auth login`, `hf download`). Default cache location is ~/.cache/huggingface or HF_HOME environment variable.

# SEE ALSO

[pip](/man/pip)(1)

