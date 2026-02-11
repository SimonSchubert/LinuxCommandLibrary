# TAGLINE

Build Python distribution packages

# TLDR

**Build package**

```poetry build```

**Build wheel only**

```poetry build -f wheel```

**Build sdist only**

```poetry build -f sdist```

# SYNOPSIS

**poetry build** [_options_]

# PARAMETERS

**-f**, **--format** _FORMAT_
> Build format (wheel, sdist).

# DESCRIPTION

**poetry build** creates distributable Python packages from the current project. By default it generates both a wheel (.whl) and a source distribution (sdist/tarball) in the **dist/** directory.

Use **-f wheel** to build only the wheel format or **-f sdist** for only the source distribution. The build process uses the project metadata from **pyproject.toml** including name, version, dependencies, and entry points.

# CAVEATS

Outputs to dist/ directory. Requires valid pyproject.toml.

# HISTORY

poetry build provides **Python package** building functionality.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-publish](/man/poetry-publish)(1)

