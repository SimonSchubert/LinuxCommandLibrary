# TAGLINE

install Cradle packages and dependencies

# TLDR

**Install Cradle packages**

```cradle install```

**Install specific package**

```cradle install [package_name]```

# SYNOPSIS

**cradle** **install** [_options_] [_packages..._]

# DESCRIPTION

**cradle install** installs packages and dependencies for the Cradle PHP framework. It manages package installation within the Cradle ecosystem, handling framework-specific modules and extensions.

The command works similarly to composer but operates at the Cradle framework level, installing both standard PHP dependencies and Cradle-specific packages. It resolves dependencies, downloads packages, and integrates them into the application structure following Cradle's modular architecture.

When run without arguments, it installs all dependencies listed in the project's package configuration. When given a specific package name, it installs that package and updates the dependency manifest.

# SEE ALSO

[cradle](/man/cradle)(1), [composer](/man/composer)(1)
