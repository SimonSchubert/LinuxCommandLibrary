# TAGLINE

Utilities for managing AUR packages in a local repository

# TLDR

**Build** a package and add it to a local repository

```aur build [package]```

**Build** an AUR package and its dependencies into a local repository

```aur sync [package]```

**Upgrade** all AUR packages in a local repository

```aur sync -u```

**Search** the AUR

```aur search [query]```

**Check** installed foreign packages for AUR updates

```pacman -Qm | aur vercmp```

**Fetch** PKGBUILD sources

```aur fetch [package]```

# SYNOPSIS

**aur** _command_ [_options_] [_arguments_]

# DESCRIPTION

**aurutils** is a collection of utilities for managing local Arch User Repository (AUR) packages. It helps build, maintain, and deploy AUR packages in a local repository.

The suite integrates with pacman, allowing AUR packages to be managed like official packages.

# PARAMETERS

**build**
> Build packages from AUR

**sync**
> Synchronize packages to local repository

**fetch**
> Download PKGBUILDs

**search**
> Search AUR

**vercmp**
> Compare packages against the AUR, reading name and version pairs from stdin

**repo**
> Inspect or manage a local repository database

**depends**
> Recursively download and parse AUR dependencies

**graph**
> Generate a dependency graph for topological ordering

# CAVEATS

Requires local repository setup. More complex than yay or paru for casual use. Designed for advanced users who want fine control.

# HISTORY

**aurutils** was developed for users wanting reproducible, local repository-based AUR package management, as opposed to direct installation helpers. It is distributed under the ISC license.

# INSTALL

```aur: yay -S aurutils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1), [makepkg](/man/makepkg)(8)

# RESOURCES

```[Source code](https://github.com/aurutils/aurutils)```

<!-- verified: 2026-06-17 -->
