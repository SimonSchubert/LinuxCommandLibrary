# TAGLINE

Remove Python compiled bytecode files

# TLDR

**Remove bytecode files**

```pyclean [directory]```

**Clean current directory**

```pyclean .```

**Clean package**

```pyclean -p [package_name]```

**Verbose output**

```pyclean -v [directory]```

# SYNOPSIS

**pyclean** [_options_] [_directory_]

# PARAMETERS

_DIRECTORY_
> Directory to clean.

**-p** _PACKAGE_
> Clean specific package.

**-v**
> Verbose output.

**-q**
> Quiet mode.

# DESCRIPTION

**pyclean** removes Python compiled bytecode files (**.pyc**) and **__pycache__** directories from a specified directory tree or Debian package. This is useful for cleaning up stale bytecode after Python version changes, reducing disk usage, or preparing clean source distributions.

The tool is part of Debian's Python packaging infrastructure and can target specific packages with the **-p** flag or recursively clean arbitrary directories. Since Python regenerates bytecode files automatically on import, removing them has no lasting effect beyond temporarily increasing the next import time.

# CAVEATS

Debian utility. Removes compiled Python files.

# HISTORY

pyclean is a **Debian utility** for Python bytecode cleanup.

# SEE ALSO

[python](/man/python)(1), [py3clean](/man/py3clean)(1)

