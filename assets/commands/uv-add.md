# TLDR

**Add dependency**

```uv add [package]```

**Add with version constraint**

```uv add [package]>=[version]```

**Add dev dependency**

```uv add --dev [package]```

**Add optional dependency**

```uv add --optional [group] [package]```

# SYNOPSIS

**uv** **add** [_options_] _packages_...

# PARAMETERS

**--dev**
> Add as development dependency.

**--optional** _group_
> Add to optional group.

**--frozen**
> Don't update lockfile.

**--no-sync**
> Don't sync environment.

# DESCRIPTION

**uv add** adds dependencies to a Python project. Updates pyproject.toml and uv.lock. Automatically syncs the virtual environment with new dependencies. Part of uv, an extremely fast Python package manager.

# SEE ALSO

[uv](/man/uv)(1), [uv-remove](/man/uv-remove)(1), [uv-sync](/man/uv-sync)(1)

