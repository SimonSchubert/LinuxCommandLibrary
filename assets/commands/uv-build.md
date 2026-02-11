# TAGLINE

Build Python packages from source

# TLDR

**Build package**

```uv build```

**Build wheel only**

```uv build --wheel```

**Build sdist only**

```uv build --sdist```

**Build to specific directory**

```uv build --out-dir [dist]```

# SYNOPSIS

**uv** **build** [_options_]

# PARAMETERS

**--wheel**
> Build wheel only.

**--sdist**
> Build source distribution only.

**--out-dir** _dir_
> Output directory.

**--no-build-isolation**
> Disable build isolation.

# DESCRIPTION

**uv build** builds Python packages from source. Creates wheel and/or source distribution packages. Supports PEP 517/518 build systems.

# SEE ALSO

[uv](/man/uv)(1), [uv-publish](/man/uv-publish)(1)

