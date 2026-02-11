# TAGLINE

Validate pyproject.toml configuration

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

**poetry check** validates the structure and content of the **pyproject.toml** file, ensuring that required fields are present and properly formatted. It catches configuration errors before they cause problems during install or build operations.

The **--lock** option additionally verifies that the **poetry.lock** file is consistent with pyproject.toml and up-to-date. This is useful in CI pipelines to ensure the lock file hasn't drifted.

# CAVEATS

Only checks syntax and structure. Does not verify dependencies exist.

# HISTORY

poetry check provides **configuration validation** for Poetry projects.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-lock](/man/poetry-lock)(1)

