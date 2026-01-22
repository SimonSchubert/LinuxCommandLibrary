# TLDR

**Build** AUR package

```aur build [package]```

**Sync** AUR database

```aur sync [package]```

**Search** AUR

```aur search [query]```

**Check** for updates

```aur vercmp```

**Fetch** PKGBUILD

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
> Check installed packages against AUR

**repo**
> Manage local repository

**deps**
> Resolve dependencies

**graph**
> Generate dependency graph

# CAVEATS

Requires local repository setup. More complex than yay or paru for casual use. Designed for advanced users who want fine control.

# HISTORY

**aurutils** was developed for users wanting reproducible, local repository-based AUR package management, as opposed to direct installation helpers.

# SEE ALSO

[yay](/man/yay)(1), [paru](/man/paru)(1), [makepkg](/man/makepkg)(8)
