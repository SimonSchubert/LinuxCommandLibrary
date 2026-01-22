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

**poetry** is Python dependency management and packaging tool. Uses pyproject.toml.

The tool manages virtual environments. Handles dependency resolution.

poetry manages Python projects.

# CAVEATS

Requires Python 3.8+. Uses its own virtual environments.

# HISTORY

Poetry was created as a **modern Python** dependency management solution.

# SEE ALSO

[pip](/man/pip)(1), [pipenv](/man/pipenv)(1), [python](/man/python)(1)

