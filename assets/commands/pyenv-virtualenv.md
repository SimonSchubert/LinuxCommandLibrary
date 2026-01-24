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

**pyenv-virtualenv** extends pyenv with virtualenv management. It creates isolated Python environments.

Virtualenvs are created from specific Python versions. Each has independent package installations.

Activation sets the environment. Deactivation returns to the previous state.

Local setting auto-activates when entering directories. The .python-version file controls this.

Integration with pyenv means seamless version switching. Virtualenvs appear as pyenv versions.

# CAVEATS

Requires pyenv installed. May need shell integration configured. Slower than venv in some cases.

# HISTORY

**pyenv-virtualenv** was created as a pyenv plugin by the pyenv community. It brings virtualenv management into the pyenv workflow.

# SEE ALSO

[pyenv](/man/pyenv)(1), [virtualenv](/man/virtualenv)(1), [python](/man/python)(1), [pip](/man/pip)(1)
