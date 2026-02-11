# TAGLINE

Python dependency management and packaging tool

# TLDR

**Create new project**

```poetry new [project-name]```

**Initialize in existing directory**

```poetry init```

**Install dependencies**

```poetry install```

**Add a package**

```poetry add [package]```

**Remove a package**

```poetry remove [package]```

**Run a command**

```poetry run [command]```

**Activate virtual environment**

```poetry shell```

# SYNOPSIS

**poetry** [_command_] [_options_]

# PARAMETERS

**new** _NAME_
> Create new project.

**init**
> Initialize interactively.

**install**
> Install dependencies.

**add** _PKG_
> Add dependency.

**remove** _PKG_
> Remove dependency.

**run** _CMD_
> Run command in venv.

**shell**
> Spawn shell in venv.

**update**
> Update dependencies.

# DESCRIPTION

**poetry** is a Python dependency management and packaging tool that uses **pyproject.toml** as its single configuration file. It handles dependency resolution, virtual environment management, building, and publishing packages to PyPI.

Poetry creates isolated virtual environments for each project and uses a lock file (**poetry.lock**) to ensure reproducible installations across different machines. Key commands include **install** (install dependencies), **add**/**remove** (manage dependencies), **run** (execute in venv), and **shell** (activate venv).

# CONFIGURATION

**pyproject.toml**
> Project configuration file containing dependencies, metadata, build system settings, and Poetry-specific settings under `[tool.poetry]`.

**poetry.lock**
> Lock file ensuring reproducible dependency resolution across installations.

**~/.config/pypoetry/config.toml**
> Global Poetry configuration including virtualenv settings, repository credentials, and cache paths.

# CAVEATS

Requires Python 3.8+. Uses its own virtual environments.

# HISTORY

Poetry was created as a **modern Python** dependency management solution.

# SEE ALSO

[pip](/man/pip)(1), [pipenv](/man/pipenv)(1), [python](/man/python)(1)

