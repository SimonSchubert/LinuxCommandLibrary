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

**venv** creates virtual environments. It isolates Python.

Standard library. No installation needed.

Project isolation. Separate dependencies.

Activation scripts. Shell integration.

Pip included. Package management.

# CAVEATS

Python 3.3+. Use virtualenv for older. Path specific.

# HISTORY

**venv** was added to Python 3.3 standard library as the recommended way to create virtual environments.

# SEE ALSO

[virtualenv](/man/virtualenv)(1), [pip](/man/pip)(1), [python](/man/python)(1)
