# TAGLINE

operates directly on the package database, allowing modification of package

# TLDR

Mark as **dependency**

```sudo pacman -D --asdeps [package]```

Mark as **explicitly** installed

```sudo pacman -D --asexplicit [package]```

**Check** local database consistency (dependencies, conflicts)

```pacman -Dk```

Also check **sync** databases against installed packages

```pacman -Dkk```

Check in **quiet** mode (errors only)

```pacman -Dkq```

Mark all **explicit installs as deps**, then re-mark a package explicit

```sudo pacman -D --asdeps $(pacman -Qqe) && sudo pacman -D --asexplicit [package]```

# SYNOPSIS

**pacman -D** [_OPTIONS_] [_PACKAGE_...]

# DESCRIPTION

**pacman -D** (database) operates directly on the package database, allowing modification of package attributes without reinstalling. It can change installation reason and verify database integrity. Packages installed **as dependencies** become orphans (listed by **pacman -Qdt**) once nothing requires them.

# PARAMETERS

**-D, --database**
> Operate on the package database

**--asdeps**
> Mark packages as installed as dependencies

**--asexplicit**
> Mark packages as explicitly installed

**-k, --check**
> Check that all installed packages have their dependencies met and no conflicts

**-kk**
> Also check that dependencies of installed packages are satisfiable from sync databases

**-q, --quiet**
> Suppress normal output, show only errors

# CAVEATS

Marking packages incorrectly can affect orphan detection. Use **--asdeps** carefully as those packages may be removed when cleaning orphans. Double **-k** also checks sync databases, so run **pacman -Sy** first or results may be stale.

# HISTORY

**pacman** was written by **Judd Vinet** in **2002** as the package manager for **Arch Linux**. The **-D** operation was added in **pacman 3.5** (2011); **-Dk** checks arrived in **pacman 4.2** (2014).

# INSTALL

```apt: sudo apt install pacman-package-manager```

```dnf: sudo dnf install pacman```

```pacman: sudo pacman -S pacman```

```apk: sudo apk add pacman```

```nix: nix profile install nixpkgs#pacman```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-query](/man/pacman-query)(8), [pacman-sync](/man/pacman-sync)(8)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/pacman/pacman)```

```[Homepage](https://pacman.archlinux.page/)```

```[Documentation](https://man.archlinux.org/man/pacman.8)```

<!-- verified: 2026-11-07 -->
