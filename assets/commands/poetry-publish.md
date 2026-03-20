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
> Build the package before publishing.

**-r**, **--repository** _NAME_
> Target repository (default: pypi). Must match a name configured via **poetry config**.

**-u**, **--username** _USER_
> Repository username.

**-p**, **--password** _PASS_
> Repository password.

**--cert** _CERT_
> Certificate authority to access the repository.

**--client-cert** _CERT_
> Client certificate to access the repository.

**--dry-run**
> Simulate publishing without uploading.

**--skip-existing**
> Ignore errors from files already existing in the repository.

# DESCRIPTION

**poetry publish** uploads built distribution packages (wheel and sdist) to PyPI or a custom repository. The **--build** flag builds the package before publishing in a single step.

Use **-r** to specify an alternative repository configured via **poetry config**. Authentication can be provided via **-u**/**-p** flags, a configured token, or the keyring. The **--dry-run** flag simulates the upload without actually publishing.

# CAVEATS

Requires authentication via username/password, API token, or system keyring. The package must be built first, or use **--build** to build and publish in one step.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-build](/man/poetry-build)(1), [poetry-config](/man/poetry-config)(1), [twine](/man/twine)(1)

