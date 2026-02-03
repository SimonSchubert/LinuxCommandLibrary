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

**conda activate** activates a conda environment, modifying the shell PATH and environment variables to use the packages installed in that environment.

When activated, the environment name appears in the shell prompt. Without arguments, activates the base environment.

# CAVEATS

Requires conda init to have been run for shell integration. Some shells may need sourcing the activation script manually.

# SEE ALSO

[conda](/man/conda)(1), [conda-deactivate](/man/conda-deactivate)(1), [conda-create](/man/conda-create)(1)
