# TAGLINE

Manage Python virtual environments with pyenv

# TLDR

**Create virtualenv**

```pyenv virtualenv [3.11.0] [myproject]```

**List virtualenvs**

```pyenv virtualenvs```

**Activate virtualenv**

```pyenv activate [myproject]```

**Deactivate virtualenv**

```pyenv deactivate```

**Delete virtualenv**

```pyenv virtualenv-delete [myproject]```

**Set local virtualenv**

```pyenv local [myproject]```

**Create with current version**

```pyenv virtualenv [myproject]```

# SYNOPSIS

**pyenv virtualenv** [_version_] _name_

**pyenv activate** _name_

**pyenv deactivate**

# PARAMETERS

**virtualenv** _VERSION_ _NAME_
> Create new virtualenv.

**virtualenvs**
> List virtualenvs.

**activate** _NAME_
> Activate virtualenv.

**deactivate**
> Deactivate current.

**virtualenv-delete** _NAME_
> Delete virtualenv.

# DESCRIPTION

**pyenv-virtualenv** is a pyenv plugin that manages Python virtual environments alongside pyenv's version management. It creates isolated environments tied to specific Python versions, each with its own independent set of installed packages, and integrates them seamlessly into pyenv's version-switching workflow.

Virtual environments created with this plugin appear as regular pyenv versions and can be activated using **pyenv activate** or auto-activated by setting a local version with **pyenv local**. When a **.python-version** file references a virtualenv name, entering that directory automatically activates the environment and leaving it deactivates, providing a frictionless per-project workflow.

# CAVEATS

Requires pyenv installed. May need shell integration configured. Slower than venv in some cases.

# HISTORY

**pyenv-virtualenv** was created as a pyenv plugin by the pyenv community. It brings virtualenv management into the pyenv workflow.

# SEE ALSO

[pyenv](/man/pyenv)(1), [virtualenv](/man/virtualenv)(1), [python](/man/python)(1), [pip](/man/pip)(1)
