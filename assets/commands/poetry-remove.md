# TAGLINE

Remove dependencies from a Poetry project

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

**poetry remove** removes one or more dependencies from the project, updating both **pyproject.toml** and the lock file. It also uninstalls the packages and any orphaned transitive dependencies from the virtual environment.

Use **-G** to remove from a specific dependency group (e.g., dev, test). The **--dry-run** flag shows what would be removed without making changes.

# CAVEATS

Updates lock file. May remove dependent packages.

# HISTORY

poetry remove provides **dependency removal** from Poetry projects.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-add](/man/poetry-add)(1)

