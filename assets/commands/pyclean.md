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

**pyclean** removes Python bytecode files. Cleanup utility.

The tool deletes .pyc and __pycache__. Disk space cleanup.

pyclean removes bytecode.

# CAVEATS

Debian utility. Removes compiled Python files.

# HISTORY

pyclean is a **Debian utility** for Python bytecode cleanup.

# SEE ALSO

[python](/man/python)(1), [py3clean](/man/py3clean)(1)

