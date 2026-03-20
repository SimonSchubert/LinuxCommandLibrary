# TAGLINE

low-level conda package utility (experimental)

# TLDR

**Find which conda package** a file belongs to

```conda package --which [path/to/file]```

**List all untracked files** in the current environment

```conda package --untracked```

**Remove all untracked files** from the current environment

```conda package --reset```

**Create a package** with a specific name and version

```conda package --pkg-name [mypackage] --pkg-version [1.0]```

**Create a package** in a named environment

```conda package --pkg-name [mypackage] -n [env_name]```

# SYNOPSIS

**conda** **package** [_options_]

# PARAMETERS

**-w**, **--which** _PATH_
> Given a file path, identify which conda package the file came from.

**-u**, **--untracked**
> Display all untracked files and exit.

**-r**, **--reset**
> Remove all untracked files and exit.

**--pkg-name** _PKG_NAME_
> Designate package name of the package being created.

**--pkg-version** _PKG_VERSION_
> Designate package version of the package being created.

**--pkg-build** _PKG_BUILD_
> Designate package build number of the package being created.

**-n**, **--name** _name_
> Name of environment.

**-p**, **--prefix** _path_
> Full path to environment location (prefix).

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda package** is an experimental low-level utility for creating conda packages and inspecting package contents within environments. It can identify which package a file belongs to, list or remove untracked files, and create simple packages from the current environment state.

# CAVEATS

This command is marked as experimental and may change or be removed. For standard package building, use **conda-build** instead. For environment sharing, consider using **conda env export** to create environment.yml files.

# SEE ALSO

[conda](/man/conda)(1), [conda-env](/man/conda-env)(1)
