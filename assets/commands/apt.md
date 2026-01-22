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
> Install or upgrade specified packages

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
> List packages matching criteria

**edit-sources**
> Edit sources.list files

**-y, --yes**
> Assume yes to prompts

**-q, --quiet**
> Quiet output

**--no-install-recommends**
> Don't install recommended packages

# CAVEATS

Intended for interactive use; for scripts, **apt-get** is recommended for more stable output formatting.

# HISTORY

**apt** was introduced in **Debian 8 (Jessie)** and **Ubuntu 14.04** as a unified frontend combining features from apt-get, apt-cache, and apt-config.

# SEE ALSO

[apt-get](/man/apt-get)(8), [apt-cache](/man/apt-cache)(8), [dpkg](/man/dpkg)(1), [aptitude](/man/aptitude)(8)
