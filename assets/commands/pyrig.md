# TAGLINE

Python project scaffolding and maintenance tool

# TLDR

**Initialize** a new project after adding pyrig as a dev dependency

```uv add pyrig --dev && uv run pyrig init```

**Sync** all managed config files and test skeletons

```uv run pyrig sync```

**Scaffold a new CLI command** for the project

```uv run pyrig mk cmd [command_name]```

**Scaffold a shared CLI command** (available across pyrig-runtime projects)

```uv run pyrig mk cmd [command_name] --shared```

**Interactively create a subclass** to override pyrig behavior

```uv run pyrig mk subcls```

**Create missing** `__init__.py` files

```uv run pyrig mk inits```

**Remove all** `__pycache__` directories

```uv run pyrig rm pyc```

**Remove pyrig** and its footprint from the project

```uv run pyrig rm pyrig```

# SYNOPSIS

**pyrig** _command_ [_options_] [_arguments_]

# DESCRIPTION

**pyrig** is an opinionated command-line tool that **rigs up** a Python project: it scaffolds a complete, working layout and keeps configuration, CLI entry points, tests, and CI/CD in sync as the project evolves. It is designed to sit on top of **uv** as the package manager and build tool, and requires **Python 3.12+** and **Git**.

Typical workflow: create a project with **uv init**, add pyrig as a development dependency (**uv add pyrig --dev**), then run **pyrig init**. That command regenerates managed project files (leaving **pyproject.toml**), sets up linters, formatters, type checkers, git hooks, GitHub Actions workflows, a working CLI, and related tooling, then creates an initial commit. After that, **pyrig sync** keeps config files and mirror-test skeletons aligned with the source tree, and **pyrig mk** helpers scaffold new commands, subclasses, and local ignore files.

Customization is inheritance-based: every managed config and tool is backed by a Python class. Subclass and override methods (or generate stubs with **pyrig mk subcls**); pyrig discovers custom classes automatically. Optional plugins (for example PyPI publishing, Codecov, standalone executables) are ordinary packages added as dependencies and picked up by **init** and **sync**.

The CLI entry point is the console script **pyrig** (registered via **pyproject.toml**). In a uv-managed project you usually invoke it with **uv run pyrig**. Projects scaffolded by pyrig also get their own project CLI (for example **my-project version**).

# COMMANDS

**init**
> Full project initialization: delete existing managed config files (except **pyproject.toml**), regenerate the scaffold, and create an initial commit. Prefer an empty GitHub repo (no README/license commits) when integrating remote CI/CD.

**sync**
> Create or update all managed project files and mirror-test skeletons to match the current source tree and installed plugins.

**scratch**
> Run the project's **.scratch.py** file.

**rm pyc**
> Remove all **__pycache__** directories under the project.

**rm pyrig**
> Remove pyrig and its managed footprint from the project entirely.

**mk cmd** _name_
> Scaffold a new CLI command stub in the project's subcommands module. Use **--shared** to register a command available in every pyrig-runtime-based project in the environment.

**mk inits**
> Create any missing **__init__.py** files in the package tree.

**mk local**
> Create or update version-control-ignored local config files.

**mk subcls**
> Interactively scaffold a subclass of any pyrig class for overrides.

# PARAMETERS

**-h**, **--help**
> Show help for pyrig or a subcommand (**pyrig** _command_ **--help**).

**--shared**
> With **mk cmd**: place the stub in shared subcommands so it is discovered across projects using pyrig-runtime in the same environment.

# CAVEATS

Requires **Python 3.12+**, **Git**, and **uv**. Installation is typically via **uv add pyrig --dev** (or **pip install pyrig** / **uv tool** / **pipx** for a global CLI); distro packages may not ship it.

**pyrig init** is opinionated and destructive toward managed files other than **pyproject.toml** (including placeholders from **uv init**). Undoing the scaffold is more involved than dropping a dependency; use **pyrig rm pyrig** and see upstream drawbacks docs if you need a full exit path.

For full GitHub CI/CD, the remote repo should start empty and a fine-grained **REPO_TOKEN** (and any plugin-specific secrets) must be configured before the first push. Empty projects may fail health-check workflows until tests exist.

# SEE ALSO

[uv](/man/uv)(1), [poetry](/man/poetry)(1), [cookiecutter](/man/cookiecutter)(1), [copier](/man/copier)(1), [git](/man/git)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/Winipedia/pyrig)```

```[Documentation](https://Winipedia.github.io/pyrig)```

<!-- verified: 2026-08-11 -->
