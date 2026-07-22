# TAGLINE

Initialize a new pyproject.toml file

# TLDR

**Initialize interactively** in the current directory

```poetry init```

**Non-interactive with defaults**

```poetry init -n```

**Specify name and description**

```poetry init --name [myproject] --description "[A cool project]"```

**Add dependencies during init**

```poetry init --dependency [requests] --dev-dependency [pytest]```

**Pin a Python version**

```poetry init -n --python "[^3.11]"```

# SYNOPSIS

**poetry init** [_options_]

# PARAMETERS

**-n**, **--no-interaction**
> Skip the interactive prompts; uses defaults for any value not provided.

**--name** _name_
> Package name (defaults to the current directory name).

**--description** _text_
> Package description.

**--author** _author_
> Author in **"Name <email>"** format. Repeatable.

**--license** _spdx_
> SPDX license identifier (e.g. **MIT**, **Apache-2.0**).

**--python** _constraint_
> Python version constraint (e.g. **^3.11**, **>=3.10,<4**).

**--dependency** _name[@version]_
> Add a runtime dependency. Repeatable.

**--dev-dependency** _name[@version]_
> Add a development dependency. Repeatable.

**--directory** _path_
> Run init in a different directory.

**--help**
> Display help.

# DESCRIPTION

**poetry init** creates a new **pyproject.toml** in the target directory describing the project's metadata and dependencies. The interactive flow walks through the project name, version, author, license, Python constraint, and any initial runtime/dev dependencies, validating package names against PyPI as you go.

It does not create a virtual environment, install dependencies, or write a lock file — run **poetry install** afterwards for that.

# CAVEATS

Poetry 2.0 (2025) writes pyproject.toml using the standard **[project]** table per PEP 621, while older versions use the legacy **[tool.poetry]** table. The exact layout depends on your installed Poetry version. Run **poetry --version** to check.

# HISTORY

**poetry** was created by **Sébastien Eustace** in **2018** as a dependency manager and packaging tool for Python projects. The **init** subcommand has been part of Poetry since the early releases.

# INSTALL

```dnf: sudo dnf install poetry```

```apk: sudo apk add poetry```

```brew: brew install poetry```

```nix: nix profile install nixpkgs#poetry```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[poetry-install](/man/poetry-install)(1), [poetry-new](/man/poetry-new)(1), [poetry](/man/poetry)(1), [pip](/man/pip)(1)
