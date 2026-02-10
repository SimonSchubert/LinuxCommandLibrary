# TAGLINE

queries the local package database on Arch Linux systems

# TLDR

**List** all installed packages

```pacman -Q```

List **explicitly** installed packages

```pacman -Qe```

Find package **owning** a file

```pacman -Qo filename```

Show package **information**

```pacman -Qi package```

**List** files owned by package

```pacman -Ql package```

List **orphan** packages

```pacman -Qdtq```

List **foreign** packages

```pacman -Qm```

List **upgradable** packages

```pacman -Qu```

# SYNOPSIS

**pacman -Q** [_OPTIONS_] [_PACKAGE_...]

# DESCRIPTION

**pacman -Q** (query) queries the local package database on Arch Linux systems. It provides information about installed packages including version, dependencies, files, and installation status.

# PARAMETERS

**-Q, --query**
> Query the local package database

**-e, --explicit**
> Filter to explicitly installed packages only

**-d, --deps**
> Filter to packages installed as dependencies

**-t, --unrequired**
> Filter to packages not required by any other package

**-o, --owns** _file_
> Search for the package that owns the specified file

**-i, --info**
> Display detailed package information

**-l, --list**
> List files owned by the package

**-m, --foreign**
> Filter to packages not found in sync databases (AUR packages)

**-n, --native**
> Filter to packages found in sync databases

**-u, --upgrades**
> Filter to out-of-date packages

**-q, --quiet**
> Show less information (package names only)

# CAVEATS

The query operates on the local database only. Use **pacman -S** for sync database operations. Orphan packages (installed as dependencies but no longer required) can be found with **-Qdt**.

# HISTORY

**pacman** is the package manager for **Arch Linux** and its derivatives, designed for simplicity and speed.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-sync](/man/pacman-sync)(8), [paru](/man/paru)(1), [yay](/man/yay)(1)
