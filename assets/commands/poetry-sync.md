# TAGLINE

Synchronize environment with lock file

# TLDR

**Sync dependencies with lock file**

```poetry sync```

**Sync without dev dependencies**

```poetry sync --no-dev```

**Sync specific groups**

```poetry sync --with [group]```

**Dry run**

```poetry sync --dry-run```

# SYNOPSIS

**poetry sync** [_options_]

# PARAMETERS

**--no-dev**
> Exclude dev dependencies.

**--with** _GROUPS_
> Include specific groups.

**--without** _GROUPS_
> Exclude specific groups.

**--dry-run**
> Simulate sync.

# DESCRIPTION

**poetry sync** strictly synchronizes the virtual environment to match the **poetry.lock** file exactly. Unlike **poetry install**, it also removes any packages present in the environment that are not listed in the lock file.

This is useful for ensuring clean, reproducible environments in CI/CD pipelines or production deployments. Use **--dry-run** to preview changes before applying them.

# CAVEATS

Removes unlocked packages. More strict than install.

# HISTORY

poetry sync provides **strict synchronization** with the lock file.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-install](/man/poetry-install)(1), [poetry-lock](/man/poetry-lock)(1)

