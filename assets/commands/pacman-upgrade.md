# TAGLINE

installs packages from local archive files rather than from remote repositories

# TLDR

**Install** from local files

```sudo pacman -U path/to/package.pkg.tar.zst```

Install **without** prompting

```sudo pacman -U --noconfirm path/to/package.pkg.tar.zst```

**Overwrite** conflicting files

```sudo pacman -U --overwrite path/to/file path/to/package.pkg.tar.zst```

**Skip** dependency checks

```sudo pacman -Ud path/to/package.pkg.tar.zst```

**Preview** upgrade

```pacman -Up path/to/package.pkg.tar.zst```

# SYNOPSIS

**pacman -U** [_OPTIONS_] _PACKAGE_...

# DESCRIPTION

**pacman -U** (upgrade) installs packages from local archive files rather than from remote repositories. This is useful for installing locally built packages, AUR packages, or downgrading to older package versions.

# PARAMETERS

**-U, --upgrade**
> Upgrade or install from package files

**-d, --nodeps**
> Skip dependency version checks

**-p, --print**
> Print what would be installed without installing

**--overwrite** _glob_
> Overwrite conflicting files matching the glob pattern

**--noconfirm**
> Skip confirmation prompts

**--asdeps**
> Mark packages as non-explicitly installed (dependencies)

**--asexplicit**
> Mark packages as explicitly installed

# CAVEATS

Package files must be compatible with the system architecture. Dependencies are not automatically resolved from repositories when using **-U**. Using **-d** to skip dependency checks can break the system.

# HISTORY

**pacman** is the package manager for **Arch Linux** and its derivatives.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-sync](/man/pacman-sync)(8), [makepkg](/man/makepkg)(8)
