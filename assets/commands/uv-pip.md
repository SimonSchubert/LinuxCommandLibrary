# TAGLINE

Fast pip-compatible package management interface

# TLDR

**Install a package** into the active environment

```uv pip install [package]```

**Install** from a requirements file

```uv pip install -r requirements.txt```

**Install into the system Python** (no virtualenv)

```uv pip install --system [package]```

**Uninstall** a package

```uv pip uninstall [package]```

**List installed** packages

```uv pip list```

**Freeze** environment to requirements format

```uv pip freeze```

**Compile** a `pyproject.toml` or `requirements.in` to a pinned `requirements.txt`

```uv pip compile [requirements.in] -o requirements.txt```

**Sync** environment to exactly match a requirements file

```uv pip sync requirements.txt```

# SYNOPSIS

**uv pip** _subcommand_ [_options_] [_arguments_]

# SUBCOMMANDS

**install** _packages_
> Install packages into the environment.

**uninstall** _packages_
> Remove packages from the environment.

**list**
> List installed packages.

**freeze**
> Output installed packages in requirements format.

**show** _package_
> Show package metadata and location.

**check**
> Verify the environment has compatible dependencies.

**compile** _input_
> Resolve and pin dependencies to a lockfile-style requirements.txt.

**sync** _requirements_
> Install/uninstall packages so the environment matches the file exactly.

**tree**
> Display the dependency tree of installed packages.

# PARAMETERS

**-r**, **--requirement** _FILE_
> Install from the given requirements file (repeatable).

**-e**, **--editable** _PATH_
> Install a project in editable mode.

**-U**, **--upgrade**
> Allow upgrading already-installed packages.

**--system**
> Operate on the system Python rather than a virtual environment.

**--python** _PATH_
> Use the specified Python interpreter.

**--index-url** _URL_
> Override the package index URL.

**--no-deps**
> Skip installing dependencies.

**--reinstall**
> Reinstall all packages even if already installed.

**--dry-run**
> Resolve without modifying the environment.

# DESCRIPTION

**uv pip** provides pip-compatible commands powered by **uv**'s Rust-based resolver and installer. It is a drop-in replacement for `pip`, `pip-tools`, and `virtualenv` for non-project workflows, typically 10-100x faster.

Unlike `pip`, `uv pip` does not automatically create or activate a virtual environment. It either uses the active `.venv` / `VIRTUAL_ENV` or requires `--system` to operate on the system Python.

# CAVEATS

`uv pip` is intended for ad-hoc package management. For project-based workflows with a lockfile, prefer `uv add`/`uv sync`/`uv lock` which manage `pyproject.toml` and `uv.lock` directly.

# INSTALL

```dnf: sudo dnf install uv```

```pacman: sudo pacman -S uv```

```apk: sudo apk add uv```

```brew: brew install uv```

```nix: nix profile install nixpkgs#uv```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[uv](/man/uv)(1), [pip](/man/pip)(1), [pipx](/man/pipx)(1), [poetry](/man/poetry)(1)

