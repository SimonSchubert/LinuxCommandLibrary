# TAGLINE

Advanced package management with dependency resolution

# TLDR

**Synchronize** list of packages and versions

```sudo aptitude update```

**Install** a new package

```sudo aptitude install [package]```

**Search** for a package

```aptitude search [package]```

Search for an **installed** package

```aptitude search '?installed([package])'```

**Remove** a package and all packages depending on it

```sudo aptitude remove [package]```

**Upgrade** installed packages

```sudo aptitude upgrade```

**Full upgrade** including removing obsolete packages

```sudo aptitude full-upgrade```

**Simulate** an install without making changes

```sudo aptitude install -s [package]```

**Show why** a package is installed

```aptitude why [package]```

**Hold** a package to prevent automatic upgrades

```sudo aptitude hold '?installed([package])'```

# SYNOPSIS

**aptitude** [_options_] _command_ [_arguments_]

# DESCRIPTION

**aptitude** is a powerful package management utility for Debian and Ubuntu systems. It provides both a command-line interface and an interactive ncurses-based interface with advanced dependency resolution and search capabilities.

# PARAMETERS

**update**
> Synchronize package index files from sources

**install package**
> Install or upgrade specified packages

**remove package**
> Remove packages and dependent packages

**purge package**
> Remove packages, configurations, and dependent packages

**upgrade**
> Upgrade installed packages to newest versions

**full-upgrade**
> Upgrade packages, removing obsolete ones as needed

**search pattern**
> Search for packages matching pattern

**show package**
> Display detailed package information

**hold package**
> Prevent package from being upgraded

**unhold package**
> Allow package to be upgraded

**safe-upgrade**
> Upgrade packages conservatively

**clean**
> Remove downloaded package files

**autoclean**
> Remove old downloaded package files

**why package**
> Explain why a package is installed or required

**why-not package**
> Explain why a package cannot be installed

**download package**
> Download .deb file without installing

**reinstall package**
> Reinstall an already-installed package

**versions package**
> List available versions of a package

**forbid-version package**
> Prevent upgrade to a specific package version

**markauto package**
> Mark package as automatically installed

**unmarkauto package**
> Mark package as manually installed

**-s**, **--simulate**
> Preview changes without applying them

**-y**, **--assume-yes**
> Skip confirmation prompts

**-D**, **--show-deps**
> Show explanations for automatic installations and removals

**-V**, **--show-versions**
> Display package version details in listings

**-P**, **--prompt**
> Always display a confirmation prompt before changes

**-R**, **--without-recommends**
> Do not treat recommended packages as dependencies

**-t** _release_
> Set the target release for package installation

**-q**, **--quiet**
> Suppress progress indicators

**changelog** _package_
> Download and display the changelog for a package

# CONFIGURATION

**~/.aptitude/config**
> User-specific aptitude configuration.

**/etc/apt/apt.conf**
> APT configuration shared with apt and apt-get.

**/etc/apt/apt.conf.d/**
> Directory for additional APT configuration fragments.

# CAVEATS

Aptitude uses its own search syntax with special terms like **?installed**, **?automatic**, etc. Different from apt-cache search syntax.

# HISTORY

Created as an alternative to apt-get with more advanced features. First released for Debian in **2001** by Daniel Burrows.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1), [nala](/man/nala)(8)
