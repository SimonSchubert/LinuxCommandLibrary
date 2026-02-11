# TAGLINE

Build wheel archives from Python packages

# TLDR

**Build wheel from package**

```pip wheel [package]```

**Build wheels to directory**

```pip wheel -w [wheeldir] [package]```

**Build from requirements file**

```pip wheel -r requirements.txt```

**Build wheel from local project**

```pip wheel .```

# SYNOPSIS

**pip** **wheel** [_options_] _packages_...

# PARAMETERS

**-w**, **--wheel-dir** _dir_
> Build wheels to directory.

**-r**, **--requirement** _file_
> Build from requirements file.

**--no-deps**
> Don't build dependencies.

**--no-build-isolation**
> Disable build isolation.

**--src** _dir_
> Source directory for editable projects.

# DESCRIPTION

**pip wheel** builds wheel archives for packages and dependencies. Wheels are pre-built binary distributions that install faster than source distributions. Useful for creating local wheels for offline installation or deployment.

# SEE ALSO

[pip](/man/pip)(1), [pip-download](/man/pip-download)(1), [pip-install](/man/pip-install)(1)

