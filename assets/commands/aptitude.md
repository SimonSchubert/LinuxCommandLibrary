# TAGLINE

Advanced package management with dependency resolution

# TLDR

Launch the **full-screen interactive** package browser

```aptitude```

**Refresh** the package lists

```sudo aptitude update```

**Search** by name using aptitude's own pattern language

```aptitude search '~n[keyword]'```

Find packages that are installed but **no longer in any repository**

```aptitude search '~o'```

Show the **full record** for one package

```aptitude show [package]```

**Preview** an installation without changing anything

```sudo aptitude -s install [package]```

Apply only the upgrades that **install or remove nothing else**

```sudo aptitude safe-upgrade```

Upgrade everything, **allowing dependency changes**

```sudo aptitude full-upgrade```

**Explain** why a package is on the system

```aptitude why [package]```

Explain why a package **cannot** be installed

```aptitude why-not [package]```

**Pin** a package at its current version

```sudo aptitude hold [package]```

Purge **configuration files** left behind by removed packages

```sudo aptitude purge '~c'```

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

# INSTALL

```apt: sudo apt install aptitude```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1), [nala](/man/nala)(8)
