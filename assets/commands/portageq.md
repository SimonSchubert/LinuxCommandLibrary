# TAGLINE

Query Gentoo Portage package database

# TLDR

Display **environment variable** value

```portageq envvar [PORTDIR]```

Show **repository** configuration

```portageq repos_config /```

List repositories by **priority**

```portageq get_repos /```

Query package **metadata**

```portageq metadata / ebuild [category]/[package] [DEPEND]```

# SYNOPSIS

**portageq** _command_ [_root_] [_arguments_...]

# COMMANDS

**envvar**
> Display Portage environment variable

**repos_config**
> Show detailed repository configuration

**get_repos**
> List repositories by priority

**metadata**
> Query package metadata

**best_visible**
> Find best visible package version

**match**
> Find packages matching atom

**has_version**
> Check if package is installed

# PARAMETERS

**root**
> Root directory for queries (usually /)

**variable**
> Environment variable name

**category/package**
> Package atom for queries

# DESCRIPTION

**portageq** queries Portage configuration and package database on Gentoo Linux. It provides programmatic access to Portage's internal data, useful for scripts and build automation.

The tool can retrieve environment variables, repository information, and detailed package metadata without parsing configuration files directly.

# CAVEATS

Gentoo-specific tool. Some queries require package to be installed. Root parameter required for most commands. Output format varies by command.

# HISTORY

**portageq** is part of **Portage**, Gentoo's package management system. It provides a stable query interface for scripts, avoiding direct parsing of Portage's complex configuration.

# SEE ALSO

[emerge](/man/emerge)(1), [equery](/man/equery)(1), [eix](/man/eix)(1)
