# TAGLINE

Remove Python 3 compiled bytecode files

# TLDR

**Clean Python 3 bytecode**

```py3clean [directory]```

**Clean entire system**

```sudo py3clean -p [package]```

**Dry run**

```py3clean -n [directory]```

**Verbose output**

```py3clean -v [directory]```

# SYNOPSIS

**py3clean** [_options_] _directory_|**-p** _package_

# PARAMETERS

**-p**, **--package** _package_
> Clean specific Debian package.

**-v**, **--verbose**
> Verbose output.

**-n**, **--dry-run**
> Show what would be deleted.

**-q**, **--quiet**
> Quiet mode.

# DESCRIPTION

**py3clean** removes Python 3 compiled bytecode files (.pyc) and __pycache__ directories. Part of Debian's python3-minimal package for system cleanup.

# EXAMPLES

```bash
# Clean project directory
py3clean /path/to/project

# Clean installed package
sudo py3clean -p python3-requests

# Dry run first
py3clean -n /usr/lib/python3

# Verbose cleaning
py3clean -v ~/myproject

# Clean current directory
py3clean .
```

# WHAT IT REMOVES

```
*.pyc files
__pycache__/ directories
```

# CAVEATS

Debian/Ubuntu specific tool. Alternative: find . -name '*.pyc' -delete. Bytecode regenerates on next import.

# HISTORY

py3clean is part of Debian's **dh-python** package for Python 3 packaging and cleanup.

# SEE ALSO

[pyclean](/man/pyclean)(1), [py3compile](/man/py3compile)(1), [python3](/man/python3)(1)
