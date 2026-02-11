# TAGLINE

List available Python interpreter versions on Debian

# TLDR

**List installed Python versions**

```pyversions -i```

**Show supported versions**

```pyversions -s```

**Show default version**

```pyversions -d```

**Show requested versions**

```pyversions -r```

# SYNOPSIS

**pyversions** [_options_]

# PARAMETERS

**-i**
> Installed versions.

**-s**
> Supported versions.

**-d**
> Default version.

**-r**
> Requested versions.

**-v**
> All version info.

# DESCRIPTION

**pyversions** is a Debian-specific utility that reports information about Python 2 interpreter versions available on the system. It can list installed versions, supported versions, the default version, and versions requested by packages through their debian/control metadata.

The tool is primarily used by Debian packaging infrastructure and maintainer scripts to determine which Python versions to build against or depend on. It is part of the **python-minimal** package and has a Python 3 counterpart in **py3versions**.

# CAVEATS

Debian/Ubuntu specific. Part of python-minimal.

# HISTORY

pyversions is a **Debian utility** for Python version management.

# SEE ALSO

[python](/man/python)(1), [py3versions](/man/py3versions)(1), [update-alternatives](/man/update-alternatives)(1)

