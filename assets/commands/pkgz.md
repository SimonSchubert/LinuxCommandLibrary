# TAGLINE

Cross-distribution package manager wrapper

# TLDR

**Search packages**

```pkgz search [query]```

**Install package**

```pkgz install [package]```

**List installed**

```pkgz list```

**Update packages**

```pkgz update```

# SYNOPSIS

**pkgz** [_command_] [_options_]

# PARAMETERS

**search** _QUERY_
> Search packages.

**install** _PACKAGE_
> Install package.

**list**
> List installed.

**update**
> Update packages.

**--help**
> Display help.

# DESCRIPTION

**pkgz** is a package manager wrapper that provides a unified command interface across Linux distributions. It translates common operations like install, search, and update into the appropriate commands for the underlying package manager (apt, dnf, pacman, zypper, etc.).

This allows users and scripts to use a single set of commands regardless of which distribution is running, simplifying cross-distribution workflows and documentation.

# CAVEATS

Wrapper tool. Underlying package manager required.

# HISTORY

pkgz provides **simplified package management** across distributions.

# SEE ALSO

[apt](/man/apt)(1), [yum](/man/yum)(1), [pacman](/man/pacman)(1)

