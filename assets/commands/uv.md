# TLDR

**Create a new Python project**

```uv init [project_name]```

**Add a dependency**

```uv add [package]```

**Remove a dependency**

```uv remove [package]```

**Sync dependencies** from pyproject.toml

```uv sync```

**Run a command** in the project environment

```uv run [command]```

**Install a Python version**

```uv python install [3.12]```

**Create a virtual environment**

```uv venv```

**Install a tool globally**

```uv tool install [ruff]```

# SYNOPSIS

**uv** _command_ [_options_] [_arguments_]

# PARAMETERS

**init** [_name_]
> Create a new Python project

**add** _package_
> Add a dependency to pyproject.toml

**remove** _package_
> Remove a dependency

**sync**
> Sync dependencies with lock file

**lock**
> Generate/update uv.lock file

**run** _command_
> Run command in project environment

**python install** _version_
> Install a Python version

**python list**
> List installed Python versions

**venv** [_path_]
> Create a virtual environment

**pip install** _package_
> Install package (pip-compatible interface)

**tool install** _tool_
> Install a CLI tool globally

**tool run** _tool_
> Run a tool without installing

**--help**, **-h**
> Show help

**--version**, **-V**
> Show version

# DESCRIPTION

**uv** is an extremely fast Python package and project manager written in Rust. It replaces pip, pip-tools, pipx, poetry, pyenv, and virtualenv with a single unified tool.

Projects are managed through **pyproject.toml** with dependencies locked in **uv.lock**. The **uv sync** command installs exact versions from the lock file, ensuring reproducible environments.

UV manages Python versions directly—no need for pyenv. Use **uv python install** to download and manage multiple Python versions.

The tool provides a pip-compatible interface (**uv pip**) for drop-in replacement in existing workflows, while offering project-based workflows for new projects.

# CAVEATS

UV is relatively new (2024) and rapidly evolving. Some edge cases may differ from pip behavior.

Lock files should be committed to version control for reproducibility. Run **uv lock** after modifying dependencies.

For CI/CD, use **uv sync --frozen** to fail if lock file is outdated rather than regenerating it.

# HISTORY

UV was created by **Astral** (makers of Ruff) and released in **2024**. It achieved 10-100x faster performance than pip by leveraging Rust and parallel downloads. The tool quickly gained adoption as a modern Python toolchain replacement.

# SEE ALSO

[pip](/man/pip)(1), [poetry](/man/poetry)(1), [pipx](/man/pipx)(1), [python](/man/python)(1)
