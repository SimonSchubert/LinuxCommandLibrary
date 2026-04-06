# TAGLINE

removes packages from an Arch Linux system

# TLDR

**Remove a package and its unneeded dependencies**

```sudo pacman -Rs [package]```

**Remove without saving config backup files**

```sudo pacman -Rsn [package]```

**Remove without prompting for confirmation**

```sudo pacman -R --noconfirm [package]```

**Remove orphan packages (unneeded dependencies)**

```sudo pacman -Rsn $(pacman -Qdtq)```

**Cascade remove a package and all packages that depend on it**

```sudo pacman -Rc [package]```

**Preview what would be removed without removing**

```pacman -Rp [package]```

# SYNOPSIS

**pacman -R** [_OPTIONS_] _PACKAGE_...

# DESCRIPTION

**pacman -R** (remove) removes packages from an Arch Linux system. It can also remove dependencies, configuration files, and handle cascading removals of dependent packages.

# PARAMETERS

**-R**, **--remove**
> Remove packages from the system.

**-s**, **--recursive**
> Remove specified targets and their dependencies not required by other packages and not explicitly installed. Pass twice (**-ss**) to also remove explicitly installed dependencies.

**-n**, **--nosave**
> Remove configuration backup files (prevents **.pacsave** files from being created).

**-c**, **--cascade**
> Remove all target packages, as well as all packages that depend on them. This operation is recursive.

**-p**, **--print**
> Print what would be removed without actually removing.

**-u**, **--unneeded**
> Remove targets that are not required by any other packages. Useful when removing a group without using **-c**.

**-d**, **--nodeps**
> Skip dependency version checks. Pass twice to skip all dependency checks.

**--dbonly**
> Remove the database entry only, leaving all files in place.

**--noscriptlet**
> Do not execute install scriptlet during removal.

**--noconfirm**
> Skip confirmation prompts.

# CAVEATS

Using **-c** (cascade) can remove many packages if removing a core dependency. Always use **-p** first to preview what would be removed. Orphan packages should be cleaned periodically with **pacman -Rsn $(pacman -Qdtq)**.

# HISTORY

**pacman** is the package manager for **Arch Linux** and its derivatives.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-query](/man/pacman-query)(8), [pacman-sync](/man/pacman-sync)(8), [pacman-database](/man/pacman-database)(8), [pacman-upgrade](/man/pacman-upgrade)(8)
