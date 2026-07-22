# TAGLINE

High-level package management interface

# TLDR

**Update** the list of available packages

```sudo apt update```

**Search** packages by name or description

```apt search [package]```

**Show** detailed information about a package

```apt show [package]```

**Install** a package or update it to the latest version

```sudo apt install [package]```

**Remove** a package

```sudo apt remove [package]```

**Upgrade** all installed packages to their latest versions

```sudo apt upgrade```

List all **installed** packages

```apt list --installed```

List packages that **can be upgraded**

```apt list --upgradable```

**Remove** unused dependencies

```sudo apt autoremove```

# SYNOPSIS

**apt** [_options_] _command_ [_arguments_]

# DESCRIPTION

**apt** is the high-level command-line interface for the package management system on Debian-based distributions. It is intended as a user-friendly alternative to **apt-get** for interactive use with improved defaults and progress display.

# PARAMETERS

**update**
> Download package information from configured sources

**upgrade**
> Install available upgrades without removing packages

**full-upgrade**
> Perform upgrades, removing packages if necessary

**install package**
> Install or upgrade specified packages; use _package=version_ to pin a version or _package/codename_ to select a release

**reinstall package**
> Reinstall packages already at the newest version

**remove package**
> Remove specified packages

**purge package**
> Remove packages and their configuration files

**autoremove**
> Remove packages that were automatically installed but are no longer needed

**search pattern**
> Search for packages matching a pattern

**show package**
> Display package information

**list**
> List packages matching criteria (use **--installed**, **--upgradable**, or **--all-versions**)

**satisfy string**
> Satisfy dependency strings (as used in Build-Depends)

**edit-sources**
> Edit sources.list files

**-y, --yes**
> Assume yes to prompts

**-q, --quiet**
> Quiet output

**-t, --target-release release**
> Prefer packages from the given release (e.g. a backports suite)

**--no-install-recommends**
> Don't install recommended packages

# CONFIGURATION

**/etc/apt/sources.list**
> Main list of package repositories.

**/etc/apt/sources.list.d/**
> Directory for additional repository list files.

**/etc/apt/apt.conf**
> Main APT configuration file.

**/etc/apt/apt.conf.d/**
> Directory for additional APT configuration fragments.

**/etc/apt/preferences**
> Package pinning preferences.

**/etc/apt/preferences.d/**
> Directory for additional pinning preference files.

# CAVEATS

Intended for interactive use; for scripts, **apt-get** is recommended for more stable output formatting.

# HISTORY

**apt** was introduced in **Debian 8 (Jessie)** and **Ubuntu 14.04** as a unified frontend combining features from apt-get, apt-cache, and apt-config.

# INSTALL

```apt: sudo apt install apt```

```dnf: sudo dnf install apt```

```pacman: sudo pacman -S apt```

```apk: sudo apk add apt```

```brew: brew install apt```

```nix: nix profile install nixpkgs#apt```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apt-get](/man/apt-get)(8), [apt-cache](/man/apt-cache)(8), [dpkg](/man/dpkg)(1), [aptitude](/man/aptitude)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/apt-team/apt)```

```[Documentation](https://manpages.debian.org/apt)```

<!-- verified: 2026-06-11 -->
