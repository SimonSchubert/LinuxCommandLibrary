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

# SYNOPSIS

**python -m venv** [_--system-site-packages_] [_--clear_] _path_

# PARAMETERS

**--system-site-packages**
> Include system packages.

**--clear**
> Clear existing.

**--without-pip**
> Don't install pip.

**--upgrade**
> Upgrade scripts.

**--prompt** _TEXT_
> Custom prompt.

# DESCRIPTION

**venv** creates lightweight Python virtual environments that isolate project dependencies from the system Python installation. Each virtual environment has its own site-packages directory and can have different versions of packages installed without conflicts.

The module is part of the Python standard library and requires no additional installation. Activation scripts modify the shell's PATH to use the virtual environment's Python and pip, and **deactivate** returns to the system environment.

# CAVEATS

Python 3.3+. Use virtualenv for older. Path specific.

# HISTORY

**venv** was added to Python 3.3 standard library as the recommended way to create virtual environments.

# SEE ALSO

[virtualenv](/man/virtualenv)(1), [pip](/man/pip)(1), [python](/man/python)(1)
