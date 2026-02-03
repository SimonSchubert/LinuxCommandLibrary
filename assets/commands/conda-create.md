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

**conda create** creates a new conda environment with specified packages. Environments provide isolated spaces for different projects with different dependencies.

# CAVEATS

Environment names cannot contain spaces. Use **--prefix** for environments outside the default envs directory.

# SEE ALSO

[conda](/man/conda)(1), [conda-activate](/man/conda-activate)(1), [conda-remove](/man/conda-remove)(1)
