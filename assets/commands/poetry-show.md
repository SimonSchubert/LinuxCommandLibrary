# TAGLINE

Display installed package information

# TLDR

**List installed packages**

```poetry show```

**Show package details**

```poetry show [package]```

**Show dependency tree**

```poetry show --tree```

**Show only top-level dependencies**

```poetry show --top-level```

**Show outdated packages**

```poetry show --outdated```

# SYNOPSIS

**poetry show** [_options_] [_package_]

# PARAMETERS

_PACKAGE_
> Package to show details for.

**--tree**
> Show dependency tree.

**--top-level**
> Only top-level deps.

**--outdated**
> Show outdated packages.

**--latest**
> Show latest versions.

**-a**, **--all**
> Show all packages.

# DESCRIPTION

**poetry show** displays information about installed packages in the project. Without arguments, it lists all installed packages with their versions and descriptions. When given a package name, it shows detailed information including dependencies and available versions.

The **--tree** flag displays the dependency tree showing how packages relate to each other. The **--outdated** flag highlights packages with newer versions available, and **--top-level** shows only direct project dependencies.

# CAVEATS

Requires valid lock file. Shows installed state.

# HISTORY

poetry show provides **dependency inspection** for Poetry projects.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-lock](/man/poetry-lock)(1)

