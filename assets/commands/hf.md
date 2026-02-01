# TLDR

**Log in to Hugging Face** Hub

```hf auth login```

**Download a model** from the Hub

```hf download [gpt2]```

**Download specific files** from a model

```hf download [meta-llama/Llama-2-7b] [config.json] [model.safetensors]```

**Upload a folder** to the Hub

```hf upload [username/my-model] [./models] [.]```

**List trending models**

```hf models ls```

**Run a job on GPU** infrastructure

```hf jobs run --flavor [a10g-small] [pytorch/pytorch:2.6.0-cuda12.4-cudnn9-devel] [python train.py]```

**View cache usage**

```hf cache ls```

# SYNOPSIS

**hf** _command_ [_subcommand_] [_options_]

# COMMANDS

**auth login**
> Log in to Hugging Face Hub with access token.

**auth logout**
> Log out and remove stored tokens.

**auth whoami**
> Display current user and organizations.

**download** _repo_id_ [_files_]
> Download files from the Hub to local cache.

**upload** _repo_id_ _local_path_ _path_in_repo_
> Upload files or folders to a repository.

**repo create** _repo_id_
> Create a new repository on the Hub.

**repo delete** _repo_id_
> Delete a repository.

**cache ls**
> List cached repositories and their sizes.

**cache rm** _repo_id_
> Remove cached files.

**jobs run** _image_ _command_
> Run compute jobs on Hugging Face infrastructure.

**models ls**
> List and search models on the Hub.

**datasets ls**
> List and search datasets.

**spaces ls**
> List and search Spaces.

**env**
> Print environment information for debugging.

# PARAMETERS

**--repo-type** _type_
> Repository type: model, dataset, or space.

**--revision** _ref_
> Specific revision (branch, tag, or commit hash).

**--local-dir** _path_
> Download to specific local directory instead of cache.

**--include** _pattern_
> Include files matching glob pattern.

**--exclude** _pattern_
> Exclude files matching glob pattern.

**--token** _token_
> Authentication token for private repos.

**--quiet**
> Suppress verbose output, print only final result.

**--flavor** _hardware_
> Hardware for jobs: cpu-basic, t4-small, a10g-small, a100-large, etc.

**--timeout** _duration_
> Job timeout with units: 30m, 2h, 1d.

**--help**
> Display help for any command.

# DESCRIPTION

**hf** (formerly **huggingface-cli**) is the official command-line interface for Hugging Face Hub. It provides direct terminal access to download models and datasets, upload files, manage repositories, run compute jobs, and interact with the ML community platform.

The CLI follows a consistent **hf resource action** pattern. Files are cached locally in **~/.cache/huggingface/hub/** with smart deduplication. The **download** command supports partial downloads with **--include/--exclude** patterns and resumable transfers.

**hf jobs** enables running code on Hugging Face infrastructure including GPUs (T4, A10G, A100) and TPUs, with Docker-like commands. Jobs support environment variables, secrets, scheduled execution, and UV scripts for self-contained Python tasks.

Authentication is managed via **hf auth login** which stores tokens locally. Tokens can also be set via the **HF_TOKEN** environment variable for scripting.

# CAVEATS

Some features require a Hugging Face Pro subscription or organization membership, including **hf jobs** for compute access. Large model downloads may require significant disk space and bandwidth. Private repositories require authentication.

# HISTORY

The Hugging Face Hub CLI was introduced as part of the **huggingface_hub** Python package to provide programmatic access to the model repository. In **July 2025**, the CLI was renamed from **huggingface-cli** to **hf** for brevity, with commands reorganized into a clearer **resource action** structure. The legacy command remains functional with deprecation warnings.

# SEE ALSO

[ollama](/man/ollama)(1), [git-lfs](/man/git-lfs)(1), [docker](/man/docker)(1)
