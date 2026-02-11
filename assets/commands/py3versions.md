# TAGLINE

List installed Python 3 interpreter versions

# TLDR

**List installed Python 3 versions**

```py3versions -i```

**Show supported versions**

```py3versions -s```

**Show default version**

```py3versions -d```

**Show all versions**

```py3versions -v```

# SYNOPSIS

**py3versions** [_options_]

# PARAMETERS

**-i**
> Installed versions.

**-s**
> Supported versions.

**-d**
> Default version.

**-v**
> All versions info.

**-r**
> Requested versions.

# DESCRIPTION

**py3versions** reports information about Python 3 interpreter versions available on Debian and Ubuntu systems. It distinguishes between installed versions, supported versions for the distribution, and the default version used by the system.

The tool is part of Debian's **python3-minimal** package and is primarily used by packaging tools and maintainer scripts to determine which Python versions to compile against or clean up. The **-i** flag shows installed versions, **-s** shows supported versions, and **-d** shows the default.

# CAVEATS

Debian/Ubuntu specific. Part of python3-minimal.

# HISTORY

py3versions is a **Debian utility** for Python 3 version management.

# SEE ALSO

[python3](/man/python3)(1), [pyversions](/man/pyversions)(1), [update-alternatives](/man/update-alternatives)(1)

