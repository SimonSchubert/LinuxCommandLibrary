# TLDR

**Remove dependency**

```uv remove [package]```

**Remove dev dependency**

```uv remove --dev [package]```

**Remove from optional group**

```uv remove --optional [group] [package]```

# SYNOPSIS

**uv** **remove** [_options_] _packages_...

# PARAMETERS

**--dev**
> Remove from dev dependencies.

**--optional** _group_
> Remove from optional group.

**--frozen**
> Don't update lockfile.

**--no-sync**
> Don't sync environment.

# DESCRIPTION

**uv remove** removes dependencies from a Python project. Updates pyproject.toml and uv.lock. Automatically syncs the virtual environment.

# SEE ALSO

[uv](/man/uv)(1), [uv-add](/man/uv-add)(1), [uv-sync](/man/uv-sync)(1)

