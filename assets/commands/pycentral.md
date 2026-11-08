# TAGLINE

Deprecated Debian Python module manager

# TLDR

**Register Python modules (deprecated)**

```pycentral [action] [package]```

# SYNOPSIS

**pycentral** _action_ [_options_]

# PARAMETERS

**bccompile**
> Byte compile .py files in a package.

**bcremove**
> Remove the byte compiled .py files.

**-v**, **--version**
> Limit output to the version numbers of the Python versions.

**-h**, **--help**
> Print help text.

# DESCRIPTION

**pycentral** was a Debian tool for managing Python module installations across multiple Python interpreter versions. It handled byte-compilation and module registration for Debian packages containing Python code.

The tool has been deprecated and replaced by **dh-python** and **pybuild**, which provide more modern and maintainable approaches to Python packaging on Debian-based systems. Existing packages using pycentral should be migrated to dh-python.

# CAVEATS

Deprecated. Use dh-python instead.

# HISTORY

pycentral shipped in the Debian **python-central** package, which was removed from the archive after wheezy (bug #717091).

# SEE ALSO

[pybuild](/man/pybuild)(1), [dh-python](/man/dh-python)(1)

# RESOURCES

```[Documentation](https://manpages.debian.org/wheezy/python-central/pycentral.1.en.html)```

```[Homepage](https://tracker.debian.org/pkg/python-central)```

<!-- verified: 2026-11-08 -->
