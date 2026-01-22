# TLDR

**Generate lock file**

```poetry lock```

**Update lock without installing**

```poetry lock --no-update```

**Check if lock is current**

```poetry lock --check```

# SYNOPSIS

**poetry lock** [_options_]

# PARAMETERS

**--no-update**
> Don't update dependencies.

**--check**
> Verify lock file is up-to-date.

# DESCRIPTION

**poetry lock** generates poetry.lock file. Resolves and locks dependencies.

The tool creates reproducible builds. Locks exact versions.

poetry lock freezes deps.

# CAVEATS

Does not install packages. Run poetry install after.

# HISTORY

poetry lock provides **dependency locking** for reproducible environments.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-install](/man/poetry-install)(1)

