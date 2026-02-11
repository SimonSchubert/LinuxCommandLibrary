# TAGLINE

Manage project version numbers

# TLDR

**Show current version**

```poetry version```

**Bump major version**

```poetry version major```

**Bump minor version**

```poetry version minor```

**Bump patch version**

```poetry version patch```

**Set specific version**

```poetry version [1.2.3]```

# SYNOPSIS

**poetry version** [_options_] [_version_]

# PARAMETERS

_VERSION_
> Version or bump rule.

**major**
> Bump major version.

**minor**
> Bump minor version.

**patch**
> Bump patch version.

**--short**
> Only output version.

**--dry-run**
> Don't modify files.

# DESCRIPTION

**poetry version** displays or updates the project version in **pyproject.toml**. Without arguments, it shows the current version. With a bump rule (**major**, **minor**, **patch**, **premajor**, **preminor**, **prepatch**, **prerelease**) or an explicit version string, it updates the version accordingly.

The **--short** flag outputs only the version number without the project name. Use **--dry-run** to preview the version change without modifying the file.

# CAVEATS

Only updates pyproject.toml. Does not create git tags.

# HISTORY

poetry version provides **version management** for Poetry projects.

# SEE ALSO

[poetry](/man/poetry)(1), [semver](/man/semver)(1)

