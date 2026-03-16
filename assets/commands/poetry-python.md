# TAGLINE

Manage Python versions for Poetry projects

# TLDR

**List Python versions** available in the environment

```poetry python list```

**List all versions** including those available for download

```poetry python list --all```

**List only Poetry-managed** Python versions

```poetry python list --managed```

**Install a specific** Python version

```poetry python install [3.12]```

**Install a free-threaded** Python version

```poetry python install --free-threaded [3.13]```

**Install a specific implementation** (cpython or pypy)

```poetry python install --implementation [pypy] [3.10]```

**Remove a Poetry-managed** Python version

```poetry python remove [3.12]```

# SYNOPSIS

**poetry python** _command_ [_options_]

# PARAMETERS

**install** _VERSION_
> Install the specified Python version from the Python Standalone Builds project.

**list**
> Show Python versions available in the environment, including system and Poetry-managed installations.

**remove** _VERSION_
> Remove a Poetry-managed Python installation.

## install options

**--clean** (**-c**)
> Clean up installation if check fails.

**--free-threaded** (**-t**)
> Use free-threaded version if available (same as requesting a version with trailing "t").

**--implementation** (**-i**) _IMPL_
> Python implementation to use (cpython, pypy).

**--reinstall** (**-r**)
> Reinstall if installation already exists.

## list options

**--all** (**-a**)
> List all versions, including those available for download.

**--free-threaded** (**-t**)
> List only free-threaded Python versions.

**--implementation** (**-i**) _IMPL_
> Filter by Python implementation to search for.

**--managed** (**-m**)
> List only Poetry-managed Python versions.

## remove options

**--free-threaded** (**-t**)
> Remove the free-threaded version.

**--implementation** (**-i**) _IMPL_
> Python implementation to remove (cpython, pypy).

# DESCRIPTION

**poetry python** groups subcommands to manage Python versions. The **install** subcommand downloads and installs Python versions from the Python Standalone Builds project. The **list** subcommand shows all discovered Python versions including system-managed and Poetry-managed installations. The **remove** subcommand removes Poetry-managed Python installations.

This is an experimental feature introduced in Poetry 2.1.0 and behavior may change in upcoming releases.

# CAVEATS

Requires Poetry 2.1.0 or later. This is an experimental feature. The install subcommand downloads from the Python Standalone Builds project and only manages versions installed by Poetry itself.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-env](/man/poetry-env)(1), [python](/man/python)(1), [python3](/man/python3)(1), [pip](/man/pip)(1)

