# TLDR

**Synchronize** and update all packages

```sudo pacman -Syu```

**Install** a package

```sudo pacman -S package```

**Remove** a package and its dependencies

```sudo pacman -Rs package```

**Search** the package database

```pacman -Ss "search_pattern"```

Search for packages containing a specific **file**

```pacman -F "file_name"```

List **explicitly installed** packages

```pacman -Qe```

List **orphan** packages

```pacman -Qtdq```

**Empty** the package cache

```sudo pacman -Scc```

# SYNOPSIS

**pacman** _<operation>_ [_options_] [_targets_]

# DESCRIPTION

**pacman** is the package manager for Arch Linux. It combines a simple binary package format with an easy-to-use build system, tracking installed packages with dependency support, package groups, and synchronization with remote repositories.

# OPERATIONS

**-S, --sync**
> Synchronize packages from remote repositories

**-R, --remove**
> Remove packages from the system

**-Q, --query**
> Query the local package database

**-U, --upgrade**
> Upgrade or add packages from local files or URLs

**-D, --database**
> Operate on the package database

**-F, --files**
> Query the files database

**-T, --deptest**
> Check if dependencies are satisfied

# COMMON OPTIONS

**-y, --refresh**
> Download fresh package databases from servers

**-u, --sysupgrade**
> Upgrade all outdated packages

**-s, --search**
> Search for packages matching a pattern

**-i, --info**
> Display package information

**-l, --list**
> List files owned by a package

**-c, --cascade**
> Remove packages and all dependent packages

**-n, --nosave**
> Remove configuration files during removal

**-w, --downloadonly**
> Download packages without installing

**--noconfirm**
> Bypass all confirmation prompts

**--needed**
> Skip reinstalling up-to-date packages

**-d, --nodeps**
> Skip dependency checks

**-q, --quiet**
> Produce less output

# CAVEATS

Always run **-Syu** instead of just **-Sy** before installing packages to avoid partial upgrades which can break the system. Configuration files are saved with .pacsave extension when removing packages unless **-n** is used.

# HISTORY

**pacman** was created by Judd Vinet for Arch Linux and first released in 2002. It is the front-end to libalpm (Arch Linux Package Management library), allowing alternative front-ends like pamac or octopi.

# SEE ALSO

[pacman.conf](/man/pacman.conf)(5), [makepkg](/man/makepkg)(8), [yay](/man/yay)(8), [paru](/man/paru)(8)
