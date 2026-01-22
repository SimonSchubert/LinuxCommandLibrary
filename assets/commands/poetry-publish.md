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

**poetry publish** uploads package to PyPI or custom repository. Publishes distributions.

The tool handles authentication. Uploads wheel and sdist.

poetry publish releases packages.

# CAVEATS

Requires authentication. Build first or use --build.

# HISTORY

poetry publish provides **package publishing** to Python repositories.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-build](/man/poetry-build)(1)

