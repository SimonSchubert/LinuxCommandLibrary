# TAGLINE

Update project dependencies

# TLDR

**Update all dependencies**

```poetry update```

**Update specific packages**

```poetry update [package1] [package2]```

**Preview updates without installing**

```poetry update --dry-run```

**Update without dev dependencies**

```poetry update --without dev```

**Only update the lock file, don't install**

```poetry update --lock```

# SYNOPSIS

**poetry** **update** [_packages_...] [_options_]

# PARAMETERS

**--dry-run**
> Preview updates without installing.

**--no-dev**
> Skip dev dependencies (deprecated, use **--without dev**).

**--with** _groups_
> Include optional dependency groups.

**--without** _groups_
> Exclude dependency groups.

**--only** _groups_
> Only update the specified dependency groups.

**--lock**
> Only update the lock file, don't install packages.

**--sync**
> Synchronize the environment by removing packages not in the lock file.

**-v**, **-vv**, **-vvv**
> Increase verbosity.

# DESCRIPTION

**poetry update** resolves dependencies to their latest versions allowed by the constraints in pyproject.toml, updates the poetry.lock file, and installs the new versions. When specific packages are given, only those packages and their dependencies are updated. Without arguments, all dependencies are updated.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-install](/man/poetry-install)(1), [poetry-lock](/man/poetry-lock)(1), [poetry-add](/man/poetry-add)(1), [poetry-show](/man/poetry-show)(1)

