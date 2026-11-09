# TAGLINE

AUR-inspired package manager for Ubuntu and Debian-based distributions

# TLDR

**Search** for a package

```pacstall -S [query]```

**Install** a package

```pacstall -I [package]```

**Remove** a package

```pacstall -R [package]```

**Add** a repository

```pacstall -A [repository_url]```

**Update** pacstall's scripts

```pacstall -U```

**Upgrade** all installed packages

```pacstall -Up```

**List** available upgrades

```pacstall -Lu```

**Hold** a package back from upgrades

```pacstall -M [package] hold```

Display **information** about an installed package

```pacstall -Ci [package]```

**List** all installed packages

```pacstall -L```

Install a package without prompts, keeping build files

```pacstall -P -K -I [package]```

# SYNOPSIS

**pacstall** [_command_] [_options_] [_package_...]

# PARAMETERS

**-I**, **--install** _package_
> Install a package from a repository or a pacscript.

**-R**, **--remove** _package_
> Remove a package from the system.

**-S**, **--search** _query_
> Search for packages from all available repositories.

**-Sd**, **--search-description** _query_
> Search package names and descriptions.

**-Si**, **--search-info** _package_
> Display metadata (SRCINFO) of a remote package.

**-Ci**, **--cache-info** _package_
> Display metadata of an installed package.

**-A**, **--add-repo** _url_
> Add a repository to pacstall.

**-Rr**, **--remove-repo** _repo_
> Remove a repository from pacstall.

**-U**, **--update** [_user_] [_branch_]
> Update pacstall and needed scripts, optionally from a specific fork and branch.

**-Up**, **--upgrade**
> Upgrade packages that have a newer version.

**-L**, **--list**
> List installed packages.

**-Lu**, **--list-upgrades**
> List upgrades for installed packages.

**-M**, **--mark** _package_ _hold|unhold_
> Toggle upgrade checking of an installed package.

**-T**, **--tree** _package_
> Display a tree graph of an installed package.

**-D**, **--download** _package_
> Download pacscript to the current directory.

**-Qa**, **--quality-assurance** _package#number_
> Test a package from a pull request prior to merging.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help.

**-x**, **--debug**
> Enable debug output. Must be the first argument.

**-P**, **--disable-prompts**
> Disable prompts and accept all defaults.

**-K**, **--keep**
> Keep the build files after installation.

**-B**, **--build-only**
> Build the deb but do not install it.

**-Q**, **--quiet**
> Download package entries quietly.

**-Nc**, **--nocheck**
> Skip the check() function if present in the pacscript.

**-Ns**, **--nosandbox**
> Build the package without bwrap sandboxing.

# DESCRIPTION

**pacstall** is a package manager for Ubuntu and Debian-based distributions that brings AUR-like functionality by allowing users to install packages from community-maintained build scripts called pacscripts (similar to Arch's PKGBUILDs).

The tool maintains its own repositories of build scripts, separate from the system's apt repositories, and packages each pacscript into a .deb before installing it. Users can add custom repositories hosted on GitHub or GitLab, enabling community-driven package distribution outside official channels.

# CAVEATS

Source-based pacscripts can be time-consuming to build. Requires build dependencies to be installed. Not officially supported by Ubuntu/Debian; packages may conflict with system packages. Always review pacscripts before installation.

# HISTORY

Created to bring the AUR (Arch User Repository) experience to Ubuntu users. Developed as an alternative to PPAs and Snaps for users who prefer building packages from source with community-maintained scripts. The project aims to provide a simple way to install software not available in official repositories.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [yay](/man/yay)(8), [makepkg](/man/makepkg)(8), [nala](/man/nala)(8)

# RESOURCES

```[Source code](https://github.com/pacstall/pacstall)```

```[Homepage](https://pacstall.dev/)```

<!-- verified: 2026-11-09 -->
