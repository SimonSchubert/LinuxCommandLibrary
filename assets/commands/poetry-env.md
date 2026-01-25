# TLDR

**List environments**

```poetry env list```

**Show environment info**

```poetry env info```

**Use specific Python**

```poetry env use [python3.11]```

**Remove environment**

```poetry env remove [python3.11]```

**Show environment path**

```poetry env info --path```

# SYNOPSIS

**poetry env** _command_ [_options_]

# COMMANDS

**info**
> Show environment information.

**list**
> List all environments.

**use** _python_
> Activate Python version.

**remove** _envs_
> Remove environments.

# PARAMETERS

**--path**
> Show only environment path.

**--executable**
> Show only Python executable.

# DESCRIPTION

**poetry env** manages virtual environments for Poetry projects. It can create, list, and remove environments, as well as switch between Python versions.

# EXAMPLES

```bash
# Show current environment
poetry env info

# Get environment path
poetry env info --path

# List all environments
poetry env list

# Switch to Python 3.11
poetry env use python3.11

# Use specific path
poetry env use /usr/bin/python3.10

# Remove environment
poetry env remove python3.9

# Remove all environments
poetry env remove --all
```

# ENVIRONMENT LOCATION

By default, environments are in:
```
~/.cache/pypoetry/virtualenvs/
```

Or project-local with:
```
poetry config virtualenvs.in-project true
```

# CAVEATS

Python version must be installed separately. Poetry manages environments, not Python installations.

# HISTORY

poetry env is part of **Poetry** by **Sébastien Eustace**, providing virtual environment management for Python projects.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-install](/man/poetry-install)(1), [pyenv](/man/pyenv)(1)
