# TAGLINE

short form of **pacman --sync**, which synchronizes packages

# TLDR

This command is an alias of **pacman --sync**

View documentation for the original command

```tldr pacman sync```

# SYNOPSIS

**pacman -S** [_options_] [_package(s)_]

# PARAMETERS

**-y**, **--refresh**
> Download a fresh copy of the master package databases from the server.

**-u**, **--sysupgrade**
> Upgrade all out-of-date packages.

**-s**, **--search** _regexp_
> Search package names and descriptions in sync databases.

**-i**, **--info**
> Display detailed information for packages in the sync database.

**-c**, **--clean**
> Remove old packages from the cache directory.

**-l**, **--list**
> List all packages in the specified repositories.

**-g**, **--groups**
> Display members of a package group.

**-q**, **--quiet**
> Show less information for query and search results.

**--needed**
> Do not reinstall packages that are already up-to-date.

**--asdeps**
> Install packages as non-explicitly installed (as dependencies).

**--overwrite** _glob_
> Overwrite conflicting files matching the given glob pattern.

**--downloadonly**, **-w**
> Download packages without installing them.

**--ignore** _package_
> Skip upgrades for the specified package.

# DESCRIPTION

**pacman -S** is the short form of **pacman --sync**, which synchronizes packages. It handles installing packages from repositories, updating the package database, and performing system upgrades.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-sync](/man/pacman-sync)(8)
