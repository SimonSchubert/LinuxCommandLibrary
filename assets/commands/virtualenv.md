# TLDR

**Create a virtual environment**

```virtualenv [venv]```

**Create with specific Python**

```virtualenv -p [python3.11] [venv]```

**Create without pip**

```virtualenv --no-pip [venv]```

**Create with system packages**

```virtualenv --system-site-packages [venv]```

**Activate the environment** (bash/zsh)

```source [venv]/bin/activate```

**Activate the environment** (fish)

```source [venv]/bin/activate.fish```

**Deactivate the environment**

```deactivate```

**Create with specific seed packages**

```virtualenv --download [venv]```

# SYNOPSIS

**virtualenv** [_options_] _dest_

# DESCRIPTION

**virtualenv** creates isolated Python environments. Each environment has its own Python binary and independent set of installed packages, allowing different projects to have different dependencies without conflicts.

When activated, the virtual environment modifies PATH to use the environment's Python and pip, isolating package installations from the system Python. This is essential for reproducible development environments.

virtualenv is the original virtual environment tool for Python, predating the built-in venv module. It offers additional features like choosing Python versions and faster environment creation.

# PARAMETERS

**-p** _python_, **--python=** _python_
> Python interpreter to use.

**--system-site-packages**
> Give access to system site-packages.

**--no-pip**
> Don't install pip.

**--no-setuptools**
> Don't install setuptools.

**--no-wheel**
> Don't install wheel.

**--download**
> Download latest pip/setuptools/wheel.

**--no-download**
> Use bundled pip/setuptools/wheel.

**--clear**
> Clear existing environment.

**--copies**
> Use copies instead of symlinks.

**--activators** _list_
> Activators to generate.

**-v**, **--verbose**
> Increase verbosity.

**-q**, **--quiet**
> Decrease verbosity.

# CAVEATS

Environment must be activated in each new shell. Absolute paths are embedded in the environment, making it non-relocatable. Python version must exist on system. Consider using python -m venv for basic needs.

# HISTORY

**virtualenv** was created by **Ian Bicking** in **2007** to address Python's lack of built-in environment isolation. It became the standard tool for Python development before venv was added to the standard library in Python 3.3. virtualenv remains popular due to additional features and Python 2 support (historical).

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [pyenv](/man/pyenv)(1), [venv](/man/venv)(1)
