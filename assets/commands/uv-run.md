# TLDR

**Run command in project**

```uv run [command]```

**Run Python script**

```uv run python [script.py]```

**Run with extra dependencies**

```uv run --with [package] [command]```

**Run without syncing**

```uv run --frozen [command]```

# SYNOPSIS

**uv** **run** [_options_] _command_ [_args_...]

# PARAMETERS

**--with** _package_
> Include extra dependency.

**--frozen**
> Don't update lockfile.

**--no-sync**
> Don't sync environment.

**--isolated**
> Run in isolated environment.

# DESCRIPTION

**uv run** executes commands in the project's virtual environment. Automatically creates venv and syncs dependencies if needed. The primary way to run scripts and tools in uv projects.

# SEE ALSO

[uv](/man/uv)(1), [uv-sync](/man/uv-sync)(1)

