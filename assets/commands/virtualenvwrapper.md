# TLDR

**Create virtual environment**

```mkvirtualenv [envname]```

**Activate environment**

```workon [envname]```

**List environments**

```workon```

**Deactivate**

```deactivate```

**Remove environment**

```rmvirtualenv [envname]```

**Change directory to project**

```cdproject```

# SYNOPSIS

**mkvirtualenv** _envname_

**workon** [_envname_]

**rmvirtualenv** _envname_

# COMMANDS

**mkvirtualenv**
> Create environment.

**workon**
> Activate/list.

**deactivate**
> Exit environment.

**rmvirtualenv**
> Delete environment.

**cdproject**
> Go to project.

**setvirtualenvproject**
> Associate project.

# DESCRIPTION

**virtualenvwrapper** enhances virtualenv. It adds convenience.

Centralized location. All envs in one place.

Easy switching. workon command.

Project association. Link to directories.

Hooks support. Custom scripts.

# CAVEATS

Shell configuration needed. Source wrapper script. Python-based.

# HISTORY

**virtualenvwrapper** was created by **Doug Hellmann** to make managing Python virtual environments easier.

# SEE ALSO

[virtualenv](/man/virtualenv)(1), [venv](/man/venv)(1), [pip](/man/pip)(1)
