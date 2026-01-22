# TLDR

**Remove a dependency**

```poetry remove [package]```

**Remove dev dependency**

```poetry remove --group dev [package]```

**Remove multiple packages**

```poetry remove [package1] [package2]```

**Dry run**

```poetry remove --dry-run [package]```

# SYNOPSIS

**poetry remove** [_options_] _packages_

# PARAMETERS

_PACKAGES_
> Packages to remove.

**-G**, **--group** _GROUP_
> Remove from specific group.

**-D**, **--dev**
> Remove from dev dependencies.

**--dry-run**
> Simulate removal.

# DESCRIPTION

**poetry remove** removes dependencies from project. Updates pyproject.toml.

The tool uninstalls packages. Cleans dependency tree.

poetry remove deletes deps.

# CAVEATS

Updates lock file. May remove dependent packages.

# HISTORY

poetry remove provides **dependency removal** from Poetry projects.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-add](/man/poetry-add)(1)

