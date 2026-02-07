# TAGLINE

activate a conda environment

# TLDR

**Activate an environment**

```conda activate [env_name]```

**Activate environment** at specific path

```conda activate [/path/to/env]```

**Activate the base environment**

```conda activate base```

# SYNOPSIS

**conda** **activate** [_env_name_|_path_]

# DESCRIPTION

**conda activate** switches the current shell session to use a specified conda environment, modifying the PATH environment variable and other shell variables to prioritize that environment's binaries, libraries, and packages. This is the primary mechanism for working with isolated conda environments.

When an environment is activated, the shell prompt is typically modified to show the active environment name in parentheses, providing a visual indicator of which environment is currently in use. The activation process prepends the environment's bin directory to PATH, sets environment-specific variables like CONDA_PREFIX and CONDA_DEFAULT_ENV, and may execute activation scripts included with certain packages.

Conda environments can be activated by name (if stored in the default envs directory) or by full path to the environment directory. The base environment is conda's root environment and is activated by default unless auto_activate_base is disabled in conda configuration. Shell integration must be initialized via conda init for activation to work properly in bash, zsh, fish, or PowerShell.

# CAVEATS

Requires conda init to have been run for shell integration. Some shells may need sourcing the activation script manually.

# SEE ALSO

[conda](/man/conda)(1), [conda-deactivate](/man/conda-deactivate)(1), [conda-create](/man/conda-create)(1)
