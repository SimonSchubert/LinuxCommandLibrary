# TAGLINE

package manager for Ubuntu and Debian-based distributions that brings AUR-like

# TLDR

**Search** the package database for a package

```pacstall -S [query]```

**Install** a package

```pacstall -I [package]```

**Remove** a package

```pacstall -R [package]```

**Add** a repository to the database

```pacstall -A [remote_repository_location]```

**Update** pacstall's scripts

```pacstall -U```

**Upgrade** all packages

```pacstall -Up```

Display **information** about a package

```pacstall -Ci [package]```

**List** all installed packages

```pacstall -L```

# SYNOPSIS

**pacstall** [_operation_] [_options_] [_package_...]

# PARAMETERS

**-S**, **--search** _query_
> Search for packages matching query

**-I**, **--install** _package_
> Install specified package

**-R**, **--remove** _package_
> Remove specified package

**-A**, **--add-repo** _url_
> Add a repository (GitHub/GitLab supported)

**-U**, **--update**
> Update pacstall scripts

**-Up**, **--upgrade**
> Upgrade all installed packages

**-Ci**, **--cache-info** _package_
> Display package information from cache

**-L**, **--list**
> List all installed packages

**-D**, **--download** _package_
> Download package without installing

**-Qa**, **--query-all**
> List all available packages

**-V**, **--version**
> Display version information

# DESCRIPTION

**pacstall** is a package manager for Ubuntu and Debian-based distributions that brings AUR-like functionality by allowing users to install packages from community-maintained build scripts. It compiles packages from source using pacscripts (similar to Arch's PKGBUILDs).

The tool maintains its own repositories of build scripts, separate from the system's apt repositories. Users can add custom repositories hosted on GitHub or GitLab, enabling community-driven package distribution outside official channels.

# CAVEATS

Packages are built from source, which can be time-consuming. Requires build dependencies to be installed. Not officially supported by Ubuntu/Debian; packages may conflict with system packages. Always review pacscripts before installation.

# HISTORY

Created to bring the AUR (Arch User Repository) experience to Ubuntu users. Developed as an alternative to PPAs and Snaps for users who prefer building packages from source with community-maintained scripts. The project aims to provide a simple way to install software not available in official repositories.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [yay](/man/yay)(8), [makepkg](/man/makepkg)(8)
