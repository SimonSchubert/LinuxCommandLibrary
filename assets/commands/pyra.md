# TAGLINE

Modern Python package and project manager built in Rust

# TLDR

**Install a Python** interpreter (partial versions resolve to the latest patch)

```pyra python install [3.13]```

**List installable** Python versions

```pyra python search [3.13]```

**Initialize** a new project pinned to a Python version

```pyra init --python [3.13]```

**Add a dependency** (PEP 508 requirement) to the project

```pyra add "[requests>=2.31]"```

**Add a development** dependency to a group

```pyra add --group [dev] [pytest]```

**Remove a dependency**

```pyra remove [requests]```

**Sync the environment** with the lockfile, failing if it is stale (for CI)

```pyra sync --locked```

**Run a script or command** through the managed environment

```pyra run [main.py]```

**Check** the project for interpreter, lock, and environment problems

```pyra doctor```

**Update Pyra itself**

```pyra self update```

# SYNOPSIS

**pyra** [**--json**] [**-v**] _command_ [_subcommand_] [_options_] [_args_]

# PARAMETERS

**python list**|**search** [_version_]|**install** _version_|**uninstall** _version_
> Manage Pyra-owned Python interpreters.

**init** [**--python** _version_]
> Create _pyproject.toml_ and an empty _pylock.toml_ in the current directory, optionally pinning an installed Python version.

**use** _version_
> Pin a managed Python version for the project and refresh the environment.

**add** _requirement_ [**--group** _name_ | **--extra** _name_]
> Add a dependency to the base dependencies, a dependency group, or an optional extra, then sync.

**remove** _package_ [**--group** _name_ | **--extra** _name_]
> Remove a dependency from the selected scope, then sync.

**sync** [_options_]
> Reconcile the environment exactly to _pyproject.toml_ and _pylock.toml_. By default includes base dependencies plus the **dev** group.

**sync --locked**, **--frozen**
> Require an up-to-date lock; never resolve or rewrite it.

**sync --group** _name_, **--extra** _name_, **--all-groups**, **--all-extras**
> Include additional groups or extras.

**sync --no-dev**, **--no-group** _name_, **--only-dev**, **--only-group** _name_
> Exclude groups, or select only the named groups without base dependencies.

**lock** [**--target** _triple_]
> Resolve dependencies and write _pylock.toml_ without touching the environment.

**run** _target_ [_args_]
> Sync, then run a project script, an installed console script, or a _.py_ file with the managed interpreter. Returns the child's exit code.

**doctor**
> Read-only health check for interpreter mismatches, missing or stale locks, and environment drift.

**outdated**
> List locked packages that have newer versions available.

**update** [**--dry-run**]
> Re-resolve the lock to newer versions allowed by current specifiers, without changing _pyproject.toml_.

**self update**
> Update the Pyra binary itself.

**--json**
> Machine-readable output.

**-v**
> Increase verbosity.

**-V**, **--version**
> Print the version.

# DESCRIPTION

**pyra** is a modern Python package and project manager written in **Rust**. It unifies Python version management, project initialization, dependency resolution, environment synchronization, and script execution under a single deterministic pipeline.

Projects declare intent in _pyproject.toml_ and Pyra writes the fully-resolved state to _pylock.toml_. Running **pyra sync** then reconciles a centralized environment exactly to the lockfile, so the same lockfile always yields the same environment across machines. If the project has a **[build-system]** table, it is installed in editable mode.

Pyra replaces the chain of _pyenv_ + _virtualenv_ + _pip_ + _pip-tools_ with one binary that handles the full lifecycle: install Python, add, lock, sync, and run. Inside **pyra run**, **pip install** and **pip uninstall** are blocked with a pointer to **pyra add** / **pyra remove**.

# CONFIGURATION

Project configuration lives in **pyproject.toml** (declared intent); the pinned interpreter is stored in **[tool.pyra].python**. The precise installed state is written to **pylock.toml**. Both files should be checked into version control.

# CAVEATS

Pyra is under active development; command names and flags may change before a stable release. Its **pylock.toml** follows the PEP 751 shape but adds Pyra-specific metadata, and full cross-tool lock compatibility is not claimed. A pinned Python version is required before **pyra sync** will run. Exit codes: **0** success, **2** user error, **3** system/IO error, **4** internal error.

Not to be confused with the unrelated **pyra** package on PyPI (a GCL region algebra library).

# HISTORY

**pyra** was created by **Trey Orr** in **2026**; the first release, **v0.1.0**, was published in April 2026 under the MIT license.

# SEE ALSO

[uv](/man/uv)(1), [pip](/man/pip)(1), [poetry](/man/poetry)(1), [pdm](/man/pdm)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/treyorr/pyra)```

```[Documentation](https://treyorr.github.io/pyra/)```

<!-- verified: 2026-11-23 -->
