# TAGLINE

Install Cradle packages and dependencies

# TLDR

**Install all packages** from configuration

```cradle install```

**Install specific package**

```cradle install [package_name]```

**Force install** (overwrite existing)

```cradle install -f```

**Install skipping SQL setup**

```cradle install --skip-sql```

**Install skipping versioning**

```cradle install --skip-versioning```

**Install with database credentials**

```cradle install -h [127.0.0.1] -u [root] -p [password]```

# SYNOPSIS

**cradle** **install** [_options_] [_packages..._]

# PARAMETERS

**-f**, **--force**
> Force installation, overwriting existing files.

**--skip-sql**
> Skip SQL database setup during installation.

**--skip-versioning**
> Skip version checks during installation.

**-h** _HOST_
> Database host address.

**-u** _USER_
> Database username.

**-p** _PASSWORD_
> Database password.

# DESCRIPTION

**cradle install** installs packages and dependencies for the Cradle PHP framework. It manages package installation within the Cradle ecosystem, handling framework-specific modules and extensions.

When run without arguments, it installs all dependencies listed in the project's package configuration. When given a specific package name, it installs that package and updates the dependency manifest.

# SEE ALSO

[cradle](/man/cradle)(1), [composer](/man/composer)(1)
