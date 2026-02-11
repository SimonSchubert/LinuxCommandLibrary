# TAGLINE

Generate and update the dependency lock file

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

**poetry lock** resolves all dependencies defined in **pyproject.toml** and writes the exact resolved versions to **poetry.lock**. This lock file ensures that every installation uses identical package versions for reproducible builds.

The **--no-update** flag regenerates the lock file format without updating dependency versions. The **--check** flag verifies that the existing lock file is consistent with pyproject.toml without modifying anything. Note that this command only updates the lock file; run **poetry install** afterward to actually install packages.

# CAVEATS

Does not install packages. Run poetry install after.

# HISTORY

poetry lock provides **dependency locking** for reproducible environments.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-install](/man/poetry-install)(1)

