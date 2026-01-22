# TLDR

**Update** the list of available packages

```sudo apt-get update```

**Install** a package or update it to the latest version

```sudo apt-get install [package]```

**Remove** a package

```sudo apt-get remove [package]```

**Remove** a package and its configuration files

```sudo apt-get purge [package]```

**Upgrade** all installed packages

```sudo apt-get upgrade```

**Clean** the local repository of interrupted downloads

```sudo apt-get autoclean```

**Remove** all packages that are no longer needed

```sudo apt-get autoremove```

**Upgrade** and handle changing dependencies

```sudo apt-get dist-upgrade```

# SYNOPSIS

**apt-get** [_options_] _command_ [_package_...]

# DESCRIPTION

**apt-get** is the command-line package management utility for Debian and Ubuntu. It handles installation, upgrade, and removal of software packages. For interactive use, **apt** is recommended as a more user-friendly alternative.

# PARAMETERS

**update**
> Resynchronize package index files from sources

**upgrade**
> Install newest versions of all currently installed packages

**dist-upgrade**
> Upgrade and handle changing dependencies

**install package**
> Install or upgrade specified packages

**remove package**
> Remove packages

**purge package**
> Remove packages and configuration files

**autoremove**
> Remove automatically installed packages no longer needed

**autoclean**
> Clear local repository of retrieved package files that can no longer be downloaded

**clean**
> Clear local repository of all retrieved package files

**download package**
> Download the binary package into the current directory

**source package**
> Fetch source packages

**-y, --yes**
> Automatic yes to prompts

**-d, --download-only**
> Download packages but don't install

**--no-install-recommends**
> Don't install recommended packages

**-f, --fix-broken**
> Attempt to fix broken dependencies

# CAVEATS

Run **apt-get update** before other commands to ensure the package list is current.

# HISTORY

Part of the **APT** (Advanced Package Tool) suite developed for Debian in **1998** by the APT Development Team.

# SEE ALSO

[apt](/man/apt)(8), [apt-cache](/man/apt-cache)(8), [dpkg](/man/dpkg)(1), [aptitude](/man/aptitude)(8)
