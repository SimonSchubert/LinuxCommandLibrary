# TAGLINE

Display installed package information

# TLDR

**List all installed packages**

```poetry show```

**Show details for a specific package**

```poetry show [package]```

**Show the full dependency tree**

```poetry show --tree```

**Show only top-level dependencies**

```poetry show --top-level```

**Show outdated packages with latest versions**

```poetry show --outdated --latest```

**Show why a package is required**

```poetry show --why [package]```

**Output package list as JSON**

```poetry show --format json```

# SYNOPSIS

**poetry show** [_options_] [_package_]

# PARAMETERS

_PACKAGE_
> Package to show details for.

**--tree**
> Show dependency tree.

**--top-level**
> Only show top-level dependencies.

**--outdated**
> Show outdated packages.

**--latest**
> Show latest available versions.

**--why**
> Show whether packages are a direct dependency or required by other packages.

**-a**, **--all**
> Show all packages including development dependencies.

**-f**, **--format** _FORMAT_
> Output format: text (default) or json. Cannot be combined with --tree.

# DESCRIPTION

**poetry show** displays information about installed packages in the project. Without arguments, it lists all installed packages with their versions and descriptions. When given a package name, it shows detailed information including dependencies and available versions.

The **--tree** flag displays the dependency tree showing how packages relate to each other. The **--outdated** flag highlights packages with newer versions available, and **--top-level** shows only direct project dependencies.

# CAVEATS

Requires valid lock file. Shows installed state.

# HISTORY

poetry show provides **dependency inspection** for Poetry projects.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-lock](/man/poetry-lock)(1)

