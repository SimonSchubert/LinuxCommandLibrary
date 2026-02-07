# TAGLINE

create isolated conda environments

# TLDR

**Create a new environment** with Python

```conda create --name [env_name] python=[3.11]```

**Create with specific packages**

```conda create --name [env_name] [numpy] [pandas]```

**Create from environment file**

```conda create --name [env_name] --file [requirements.txt]```

**Create environment at specific path**

```conda create --prefix [/path/to/env] python=[3.11]```

**Clone an existing environment**

```conda create --name [new_env] --clone [existing_env]```

# SYNOPSIS

**conda** **create** [_options_] [_packages..._]

# PARAMETERS

**-n**, **--name** _name_
> Name of the new environment.

**-p**, **--prefix** _path_
> Full path to environment location.

**--file** _file_
> Read package versions from file.

**--clone** _env_
> Clone an existing environment.

**-c**, **--channel** _channel_
> Additional channel to search for packages.

**-y**, **--yes**
> Don't ask for confirmation.

# DESCRIPTION

**conda create** initializes a new isolated conda environment, which is a self-contained directory structure containing a specific collection of packages and their dependencies. Environments are conda's fundamental mechanism for managing multiple projects with potentially conflicting package requirements on the same system.

The creation process involves specifying the environment name (or prefix path), the desired Python version, and any initial packages to install. Conda performs dependency resolution to ensure all specified packages and their dependencies are compatible, then downloads and installs the required packages into the new environment directory. Environments can be created with minimal packages and later extended, or fully specified upfront with a complete package set.

The --clone option provides a way to duplicate existing environments, which is useful for experimentation or creating backup environments. The --file option allows reading package specifications from a file, enabling reproducible environment creation. Environments created with --prefix can exist anywhere on the filesystem, while named environments (--name) are stored in conda's default envs directory. Once created, environments must be activated before their packages become available to the shell.

# CAVEATS

Environment names cannot contain spaces. Use **--prefix** for environments outside the default envs directory.

# SEE ALSO

[conda](/man/conda)(1), [conda-activate](/man/conda-activate)(1), [conda-remove](/man/conda-remove)(1)
