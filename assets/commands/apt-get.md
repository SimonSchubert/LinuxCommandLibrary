# TAGLINE

Install, upgrade, and manage packages.

# TLDR

**Refresh** the package index from every configured source

```sudo apt-get update```

**Install** a package, answering yes to every prompt

```sudo apt-get install -y [package]```

Install one **specific version** instead of the newest

```sudo apt-get install [package]=[version]```

**Reinstall** a package that is already at the newest version

```sudo apt-get install --reinstall [package]```

**Dry-run** an operation and print what it would change

```sudo apt-get -s dist-upgrade```

**Upgrade** everything, letting APT add and remove packages as dependencies require

```sudo apt-get dist-upgrade```

**Uninstall** packages while leaving their configuration in place

```sudo apt-get remove [package1] [package2]```

Uninstall a package **with its configuration** and any orphans it leaves behind

```sudo apt-get purge --auto-remove [package]```

**Repair** a broken or half-configured dependency state

```sudo apt-get -f install```

Reclaim disk space by **emptying the downloaded .deb cache**

```sudo apt-get clean```

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

**build-dep package**
> Install the build dependencies of a source package

**satisfy string**
> Satisfy dependency strings (as used in Build-Depends); prefix an argument with 'Conflicts: ' to express a conflict

**-y, --yes**
> Automatic yes to prompts; run non-interactively

**-s, --simulate**
> No action; simulate the events that would occur without changing the system

**-d, --download-only**
> Download packages but don't unpack or install

**--no-install-recommends**
> Don't install recommended packages

**--reinstall**
> Reinstall packages already at the newest version

**--only-upgrade**
> Only upgrade already-installed packages; ignore requests to install new ones

**-f, --fix-broken**
> Attempt to fix broken dependencies

# CONFIGURATION

**/etc/apt/sources.list**
> Package source repositories.

**/etc/apt/apt.conf**
> Main APT configuration file.

**/etc/apt/apt.conf.d/**
> Directory for drop-in configuration fragments.

# CAVEATS

Run **apt-get update** before other commands to ensure the package list is current.

# HISTORY

Part of the **APT** (Advanced Package Tool) suite developed for Debian in **1998** by the APT Development Team.

# INSTALL

```apt: sudo apt install apt```

```dnf: sudo dnf install apt```

```pacman: sudo pacman -S apt```

```apk: sudo apk add apt```

```brew: brew install apt```

```nix: nix profile install nixpkgs#apt```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apt](/man/apt)(8), [apt-cache](/man/apt-cache)(8), [dpkg](/man/dpkg)(1), [aptitude](/man/aptitude)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/apt-team/apt)```

```[Documentation](https://manpages.debian.org/apt-get)```

<!-- verified: 2026-06-11 -->
