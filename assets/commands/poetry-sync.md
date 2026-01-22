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

**poetry sync** synchronizes environment with lock file. Ensures exact versions.

The tool removes extra packages. Matches lock file exactly.

poetry sync aligns environment.

# CAVEATS

Removes unlocked packages. More strict than install.

# HISTORY

poetry sync provides **strict synchronization** with the lock file.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-install](/man/poetry-install)(1), [poetry-lock](/man/poetry-lock)(1)

