# TAGLINE

Publish packages to PyPI or repositories

# TLDR

**Publish to PyPI**

```poetry publish```

**Build and publish**

```poetry publish --build```

**Publish to custom repository**

```poetry publish -r [repository]```

**Dry run**

```poetry publish --dry-run```

# SYNOPSIS

**poetry publish** [_options_]

# PARAMETERS

**--build**
> Build before publishing.

**-r**, **--repository** _NAME_
> Target repository.

**-u**, **--username** _USER_
> Repository username.

**-p**, **--password** _PASS_
> Repository password.

**--dry-run**
> Simulate publishing.

# DESCRIPTION

**poetry publish** uploads built distribution packages (wheel and sdist) to PyPI or a custom repository. The **--build** flag builds the package before publishing in a single step.

Use **-r** to specify an alternative repository configured via **poetry config**. Authentication can be provided via **-u**/**-p** flags, a configured token, or the keyring. The **--dry-run** flag simulates the upload without actually publishing.

# CAVEATS

Requires authentication. Build first or use --build.

# HISTORY

poetry publish provides **package publishing** to Python repositories.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-build](/man/poetry-build)(1)

