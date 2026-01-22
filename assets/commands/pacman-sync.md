# TLDR

**Install** a package

```sudo pacman -S package```

**Sync** database and **upgrade**

```sudo pacman -Syu```

Upgrade with **new package**

```sudo pacman -Syu --noconfirm package```

**Search** package database

```pacman -Ss "search_pattern"```

Show package **information**

```pacman -Si package```

**Overwrite** conflicting files

```sudo pacman -Syu --overwrite path/to/file```

**Clean** package cache

```sudo pacman -Sc```

Install specific **version**

```sudo pacman -S package=version```

# SYNOPSIS

**pacman -S** [_OPTIONS_] [_PACKAGE_...]

# DESCRIPTION

**pacman -S** (sync) synchronizes packages from remote repositories. It downloads and installs packages, updates the system, and manages the local package cache on Arch Linux systems.

# PARAMETERS

**-S, --sync**
> Synchronize packages from remote repositories

**-y, --refresh**
> Download fresh package databases from the server

**-u, --sysupgrade**
> Upgrade all out-of-date packages

**-s, --search** _regex_
> Search package names and descriptions

**-i, --info**
> Display detailed package information

**-c, --clean**
> Remove old packages from the cache

**--noconfirm**
> Skip confirmation prompts

**--overwrite** _glob_
> Overwrite conflicting files

**--downloadonly**
> Download packages without installing

# CAVEATS

Always run **-Syu** together to ensure database and packages are in sync. Running **-Sy** alone can cause partial upgrade issues. Use **-Syyu** to force refresh even if databases appear up to date.

# HISTORY

**pacman** is the package manager for **Arch Linux** and its derivatives, designed with simplicity and speed as primary goals.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-query](/man/pacman-query)(8), [pacman-remove](/man/pacman-remove)(8)
