# TAGLINE

Create Python virtual environments

# TLDR

**Create virtual environment**

```python -m venv [venv]```

**Create with system packages**

```python -m venv --system-site-packages [venv]```

**Activate (bash/zsh)**

```source [venv]/bin/activate```

**Activate (fish)**

```source [venv]/bin/activate.fish```

**Deactivate**

```deactivate```

**Clear environment**

```python -m venv --clear [venv]```

**Create and upgrade pip** to the latest version

```python -m venv --upgrade-deps [venv]```

**Use the current directory name** as the prompt

```python -m venv --prompt . [venv]```

# SYNOPSIS

**python -m venv** [_options_] _ENV_DIR_ [_ENV_DIR_...]

# PARAMETERS

**--system-site-packages**
> Give the environment access to system packages.

**--symlinks**
> Try to use symlinks rather than copies.

**--copies**
> Try to use copies rather than symlinks.

**--clear**
> Delete the contents of the environment directory first.

**--upgrade**
> Upgrade the environment to the current Python, assuming it was upgraded in place.

**--without-pip**
> Don't install pip.

**--prompt** _TEXT_
> Alternative prompt prefix. **.** uses the current directory name.

**--upgrade-deps**
> Upgrade core dependencies (pip) to the latest version on PyPI (Python 3.9+).

**--without-scm-ignore-files**
> Skip creating the .gitignore file (Python 3.13+).

# DESCRIPTION

**venv** creates lightweight Python virtual environments that isolate project dependencies from the system Python installation. Each virtual environment has its own site-packages directory and can have different versions of packages installed without conflicts.

The module is part of the Python standard library. Activation scripts modify the shell's PATH to use the virtual environment's Python and pip, and **deactivate** returns to the system environment.

# CAVEATS

Python 3.3+. Environments are not movable or copyable because scripts contain absolute interpreter paths: recreate them at the new location instead. Some Linux distributions package venv separately from Python.

# HISTORY

**venv** was added to Python 3.3 standard library as the recommended way to create virtual environments.

# SEE ALSO

[virtualenv](/man/virtualenv)(1), [pip](/man/pip)(1), [python](/man/python)(1)

# RESOURCES

```[Documentation](https://docs.python.org/3/library/venv.html)```

```[Source code](https://github.com/python/cpython)```

<!-- verified: 2026-11-09 -->
