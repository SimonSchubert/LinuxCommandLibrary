# TAGLINE

Modern Python package and project manager built in Rust

# TLDR

**Install a specific Python** interpreter version

```pyra python install [3.12]```

**Initialize** a new project pinned to a Python version

```pyra init --python [3.12]```

**Add a dependency** to the current project

```pyra add [requests]```

**Remove a dependency** from the current project

```pyra remove [requests]```

**Sync the environment** with the lockfile

```pyra sync```

**Run a script or command** through the managed environment

```pyra run [script.py]```

**Show the dependency tree**

```pyra tree```

**Update Pyra itself**

```pyra self update```

# SYNOPSIS

**pyra** _command_ [_subcommand_] [_options_] [_args_]

# PARAMETERS

**python install** _version_
> Install a specific Python interpreter version managed by Pyra.

**init** [**--python** _version_]
> Initialize a new project, generating _pyproject.toml_ and _pylock.toml_.

**add** _package_ [_package ..._]
> Add one or more dependencies to _pyproject.toml_ and update the lockfile.

**remove** _package_ [_package ..._]
> Remove dependencies from _pyproject.toml_ and update the lockfile.

**sync**
> Reconcile the local virtual environment with _pylock.toml_.

**lock**
> Resolve dependencies and write the precise state to _pylock.toml_.

**run** _command_
> Execute a script or command inside the synchronized environment.

**tree**
> Show the resolved dependency tree for the current project.

**info**
> Show project metadata, Python version, and environment details.

**cache**
> Inspect or manage Pyra's on-disk cache.

**self update**
> Update Pyra itself to the latest version.

# DESCRIPTION

**pyra** is a modern Python package and project manager written in **Rust**. It unifies Python version management, project initialization, dependency resolution, environment synchronization, and script execution under a single deterministic pipeline.

Projects declare intent in _pyproject.toml_ and Pyra writes the fully-resolved state to _pylock.toml_. Running **pyra sync** then reconciles the local virtual environment exactly to the lockfile, so the same lockfile always yields the same environment across machines.

Compared with traditional tools like _pip_ and _venv_, Pyra replaces the chain of _pyenv_ + _virtualenv_ + _pip_ + _pip-tools_ with one binary that handles the full lifecycle — install, add, lock, sync, run — without network calls at run time beyond what is needed to fetch declared packages.

# CONFIGURATION

Project configuration lives in **pyproject.toml** (declared intent). The precise installed state is written to **pylock.toml**. Both files should be checked into version control.

# CAVEATS

Pyra is under active development; command names and flags may change before a stable release. Its lockfile format (**pylock.toml**) is Pyra-specific and not yet interchangeable with other Python tools.

# HISTORY

**pyra** was created as a Rust-based alternative to the fragmented Python tooling landscape, taking design cues from tools like **uv**, **poetry**, and **pdm** while focusing on deterministic environment reproduction through a dedicated lockfile.

# SEE ALSO

[uv](/man/uv)(1), [pip](/man/pip)(1), [poetry](/man/poetry)(1), [pdm](/man/pdm)(1), [python](/man/python)(1)
