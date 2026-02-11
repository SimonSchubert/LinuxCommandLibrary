# TAGLINE

Convenience wrappers for virtualenv

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

**virtualenvwrapper** is a set of shell extensions that enhance the standard virtualenv tool for managing Python virtual environments. It provides convenient wrapper commands for creating, activating, switching between, and deleting environments, all from a centralized location rather than scattered across project directories.

The core workflow revolves around the `workon` command for listing and switching environments, `mkvirtualenv` for creation, and `rmvirtualenv` for deletion. All environments are stored in a single configurable directory (typically `~/.virtualenvs`), making them easy to find and manage regardless of where project code resides.

The tool also supports project directory association, allowing automatic directory changes when activating an environment, and provides hook scripts that run at key lifecycle events such as environment creation, activation, and deactivation for custom automation.

# CAVEATS

Shell configuration needed. Source wrapper script. Python-based.

# HISTORY

**virtualenvwrapper** was created by **Doug Hellmann** to make managing Python virtual environments easier.

# SEE ALSO

[virtualenv](/man/virtualenv)(1), [venv](/man/venv)(1), [pip](/man/pip)(1)
