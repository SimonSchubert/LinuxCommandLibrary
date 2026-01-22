# TLDR

**Check pyproject.toml validity**

```poetry check```

**Check with lock file validation**

```poetry check --lock```

# SYNOPSIS

**poetry check** [_options_]

# PARAMETERS

**--lock**
> Also validate poetry.lock file.

# DESCRIPTION

**poetry check** validates pyproject.toml structure. Checks configuration.

The tool finds configuration errors. Validates project setup.

poetry check validates config.

# CAVEATS

Only checks syntax and structure. Does not verify dependencies exist.

# HISTORY

poetry check provides **configuration validation** for Poetry projects.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-lock](/man/poetry-lock)(1)

