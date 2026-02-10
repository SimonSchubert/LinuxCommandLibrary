# TAGLINE

removes packages from an Arch Linux system

# TLDR

**Remove** package and dependencies

```sudo pacman -Rs package```

Remove **without** config backups

```sudo pacman -Rsn package```

Remove **without** prompting

```sudo pacman -R --noconfirm package```

Remove **orphan** packages

```sudo pacman -Rsn $(pacman -Qdtq)```

**Cascade** remove dependents

```sudo pacman -Rc package```

**Preview** removal

```pacman -Rp package```

# SYNOPSIS

**pacman -R** [_OPTIONS_] _PACKAGE_...

# DESCRIPTION

**pacman -R** (remove) removes packages from an Arch Linux system. It can also remove dependencies, configuration files, and handle cascading removals of dependent packages.

# PARAMETERS

**-R, --remove**
> Remove packages from the system

**-s, --recursive**
> Remove unnecessary dependencies recursively

**-n, --nosave**
> Remove configuration files (pacnew/pacsave files)

**-c, --cascade**
> Remove packages and all packages that depend on them

**-p, --print**
> Print what would be removed without removing

**-u, --unneeded**
> Remove packages that are no longer needed

**--noconfirm**
> Skip confirmation prompts

# CAVEATS

Using **-c** (cascade) can remove many packages if removing a core dependency. Always use **-p** first to preview what would be removed. Orphan packages should be cleaned periodically with **pacman -Rsn $(pacman -Qdtq)**.

# HISTORY

**pacman** is the package manager for **Arch Linux** and its derivatives.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-query](/man/pacman-query)(8), [pacman-sync](/man/pacman-sync)(8)
