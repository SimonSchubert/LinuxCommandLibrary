# TAGLINE

List installed Python 3 interpreter versions

# TLDR

**List installed Python 3 versions**

```py3versions -i```

**Show supported versions**

```py3versions -s```

**Show default version**

```py3versions -d```

**Show version numbers only** (combine with -i, -s, or -d)

```py3versions -v -i```

# SYNOPSIS

**py3versions** [_options_]

# PARAMETERS

**-i**, **--installed**
> Show installed supported python3 versions.

**-s**, **--supported**
> Show supported python3 versions for this distribution.

**-d**, **--default**
> Show the default python3 version.

**-r**, **--requested**
> Read the X-Python3-Version field from debian/control and show matching versions.

**-v**, **--version**
> Limit output to version numbers only (e.g., 3.10 instead of python3.10).

# DESCRIPTION

**py3versions** reports information about Python 3 interpreter versions available on Debian and Ubuntu systems. It distinguishes between installed versions, supported versions for the distribution, and the default version used by the system.

The tool is part of Debian's **python3-minimal** package and is primarily used by packaging tools and maintainer scripts to determine which Python versions to compile against or clean up. The **-i** flag shows installed versions, **-s** shows supported versions, and **-d** shows the default. The supported list is ordered lowest to highest with the default version last.

# CAVEATS

Debian/Ubuntu specific. Part of python3-minimal.

# HISTORY

py3versions is a **Debian utility** for Python 3 version management.

# SEE ALSO

[python3](/man/python3)(1), [pyversions](/man/pyversions)(1), [update-alternatives](/man/update-alternatives)(1)

