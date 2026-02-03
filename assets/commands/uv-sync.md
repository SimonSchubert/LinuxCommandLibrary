# TLDR

**Sync environment**

```uv sync```

**Sync without dev dependencies**

```uv sync --no-dev```

**Sync specific extra**

```uv sync --extra [name]```

**Sync from frozen lock**

```uv sync --frozen```

# SYNOPSIS

**uv** **sync** [_options_]

# PARAMETERS

**--frozen**
> Error if lock needs update.

**--locked**
> Assert lockfile is current.

**--no-dev**
> Skip dev dependencies.

**--extra** _name_
> Include optional extra.

**--all-extras**
> Include all extras.

# DESCRIPTION

**uv sync** synchronizes the virtual environment with project dependencies. Creates venv if needed, installs/removes packages to match lockfile. Core command for environment management.

# SEE ALSO

[uv](/man/uv)(1), [uv-lock](/man/uv-lock)(1), [uv-add](/man/uv-add)(1)

