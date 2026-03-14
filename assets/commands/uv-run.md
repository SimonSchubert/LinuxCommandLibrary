# TAGLINE

Execute commands in project virtual environment

# TLDR

**Run command in project**

```uv run [command]```

**Run Python script**

```uv run python [script.py]```

**Run with extra dependencies**

```uv run --with [package] [command]```

**Run a standalone script with inline dependencies**

```uv run [script.py]```

**Run without syncing the environment**

```uv run --frozen [command]```

**Run with a specific Python version**

```uv run --python [3.12] python [script.py]```

**Run an installed tool** (e.g., pytest, ruff)

```uv run pytest [tests/]```

# SYNOPSIS

**uv** **run** [_options_] _command_ [_args_...]

# PARAMETERS

**--with** _package_
> Include an extra dependency for this invocation only.

**--frozen**
> Run without updating the lockfile. Fail if lockfile is missing or outdated.

**--no-sync**
> Skip syncing the environment before running.

**--isolated**
> Run in an isolated temporary environment, ignoring the project.

**--python** _version_
> Use a specific Python version or interpreter.

**--no-project**
> Avoid discovering a project or workspace.

**--package** _name_
> Run the command in a specific package within a workspace.

**--extra** _name_
> Include optional dependency group.

**--all-extras**
> Include all optional dependency groups.

# DESCRIPTION

**uv run** executes commands in the project's virtual environment. It automatically creates the virtual environment and syncs dependencies if needed, making it the primary way to run scripts and tools in uv-managed projects.

When running a `.py` file with inline script metadata (PEP 723), uv automatically resolves and installs the declared dependencies. The **--with** flag allows adding ad-hoc dependencies without modifying project configuration.

# CAVEATS

If no `pyproject.toml` is found, **uv run** operates without a project context. The **--frozen** flag requires an existing lockfile and will fail if one is not present.

# SEE ALSO

[uv](/man/uv)(1), [uv-sync](/man/uv-sync)(1), [uv-lock](/man/uv-lock)(1), [python](/man/python)(1), [pip](/man/pip)(1)

