# TAGLINE

Deprecated Debian Python module manager

# TLDR

**Register Python modules (deprecated)**

```pycentral [action] [package]```

# SYNOPSIS

**pycentral** _action_ [_options_]

# PARAMETERS

_ACTION_
> Action to perform.

# DESCRIPTION

**pycentral** was a Debian tool for managing Python module installations across multiple Python interpreter versions. It handled byte-compilation and module registration for Debian packages containing Python code.

The tool has been deprecated and replaced by **dh-python** and **pybuild**, which provide more modern and maintainable approaches to Python packaging on Debian-based systems. Existing packages using pycentral should be migrated to dh-python.

# CAVEATS

Deprecated. Use dh-python instead.

# HISTORY

pycentral was a **deprecated Debian** tool for Python module management.

# SEE ALSO

[pybuild](/man/pybuild)(1), [dh-python](/man/dh-python)(1)

