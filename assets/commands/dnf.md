# TAGLINE

Fedora/RHEL package manager

# TLDR

**Upgrade** installed packages to newest versions

```sudo dnf upgrade```

**Search** packages via keywords

```dnf search [keyword]```

Display **details** about a package

```dnf info [package]```

**Install** new packages

```sudo dnf install [package]```

**Remove** packages

```sudo dnf remove [package]```

List **installed** packages

```dnf list --installed```

Find which packages **provide** a command

```dnf provides [command]```

**Clean** cached data

```sudo dnf clean all```

# SYNOPSIS

**dnf** [_options_] _command_ [_arguments_]

# DESCRIPTION

**dnf** (Dandified YUM) is the package manager for Fedora, RHEL, and related distributions. It has been the default since Fedora 22, with DNF5 becoming the default in Fedora 41+. It is the successor to YUM and provides improved dependency resolution, performance, and a more consistent interface.

# PARAMETERS

**install, in package**
> Install specified packages

**remove, rm package**
> Remove specified packages

**upgrade, up**
> Upgrade all installed packages

**search, se keyword**
> Search for packages matching keyword

**info, if package**
> Display detailed information about a package

**list, ls**
> List packages (--installed, --available, --updates)

**provides command**
> Find packages providing a file or command

**clean option**
> Clean cached data (all, dbcache, expire-cache, metadata, packages)

**repolist**
> Display configured repositories

**history**
> View transaction history

**autoremove**
> Remove unneeded packages

**-y, --assumeyes**
> Automatically answer yes to prompts

**--refresh**
> Set metadata as expired before running command

# CONFIGURATION

**/etc/dnf/dnf.conf**
> Main DNF configuration file with settings for package management behavior.

**/etc/yum.repos.d/*.repo**
> Repository configuration files defining package sources.

# CAVEATS

DNF5 (used in Fedora 41+) has some differences from earlier DNF versions. Check documentation for specific version differences.

# HISTORY

DNF was introduced in **Fedora 18** as an experimental package manager and became the default in **Fedora 22**. DNF5 is a complete rewrite released with Fedora 41.

# SEE ALSO

[yum](/man/yum)(8), [rpm](/man/rpm)(8), [apt](/man/apt)(8), [pacman](/man/pacman)(8)
