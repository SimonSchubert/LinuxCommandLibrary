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

**poetry build** builds distributable packages. Creates wheel and sdist.

The tool packages Python projects. Generates distribution files.

poetry build creates packages.

# CAVEATS

Outputs to dist/ directory. Requires valid pyproject.toml.

# HISTORY

poetry build provides **Python package** building functionality.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-publish](/man/poetry-publish)(1)

