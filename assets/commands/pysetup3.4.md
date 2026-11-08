# TAGLINE

Deprecated Python 3.4 package installer

# TLDR

**Install package (deprecated)**

```pysetup3.4 install [package]```

**List installed projects (deprecated)**

```pysetup3.4 list```

**Run setup command**

```pysetup3.4 run [command]```

# SYNOPSIS

**pysetup3.4** [_command_] [_options_]

# PARAMETERS

**run**
> Run one or several commands.

**metadata**
> Display the metadata of a project.

**install**
> Install a project.

**remove**
> Remove a project.

**search**
> Search for a project in the indexes.

**list**
> List installed projects.

**graph**
> Display a graph.

**create**
> Create a project.

**generate-setup**
> Generate a backward-compatible setup.py.

**-n**, **--dry-run**
> Do not actually do anything.

# DESCRIPTION

**pysetup** was the command-line tool of the distutils2 / packaging effort. Upstream CPython 3.4 does not install it, but a pysetup3.4 man page was shipped in Debian's python3.4 package. It provided commands for installing, removing, and managing Python packages before pip became the standard package manager.

The tool has been deprecated and replaced entirely by **pip**. It should not be used for new projects, and legacy systems still relying on it should migrate to pip for package management.

# CAVEATS

Deprecated. Use pip instead.

# HISTORY

pysetup came from the **distutils2** effort. Its packaging module was removed from CPython before the 3.3 final release.

# SEE ALSO

[pip](/man/pip)(1), [python3.4](/man/python3.4)(1)

# RESOURCES

```[Documentation](https://manpages.debian.org/jessie/python3.4/pysetup3.4.1.en.html)```

```[Source code](https://github.com/python/cpython)```

<!-- verified: 2026-11-08 -->
