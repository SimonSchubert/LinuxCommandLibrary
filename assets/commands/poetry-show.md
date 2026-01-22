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

**poetry show** displays installed packages. Shows dependency information.

The tool lists project dependencies. Displays version details.

poetry show lists packages.

# CAVEATS

Requires valid lock file. Shows installed state.

# HISTORY

poetry show provides **dependency inspection** for Poetry projects.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-lock](/man/poetry-lock)(1)

