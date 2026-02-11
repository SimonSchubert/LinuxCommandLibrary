# TAGLINE

Update project dependencies

# TLDR

**Update all dependencies**

```poetry update```

**Update specific package**

```poetry update [package]```

**Update with dry run**

```poetry update --dry-run```

**Update without dev dependencies**

```poetry update --without dev```

# SYNOPSIS

**poetry** **update** [_packages_...] [_options_]

# PARAMETERS

**--dry-run**
> Preview updates without installing.

**--no-dev**
> Skip dev dependencies.

**--with** _groups_
> Include optional groups.

**--without** _groups_
> Exclude dependency groups.

**--lock**
> Only update lock file, don't install.

**-v**, **-vv**, **-vvv**
> Increase verbosity.

# DESCRIPTION

**poetry update** updates dependencies to their latest versions according to constraints in pyproject.toml. Updates the poetry.lock file and installs new versions. Can target specific packages or update all dependencies.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-install](/man/poetry-install)(1), [poetry-lock](/man/poetry-lock)(1)

