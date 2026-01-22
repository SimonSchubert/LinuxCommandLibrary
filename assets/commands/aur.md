# TLDR

**Search** the AUR database for a package

```aur search [keyword]```

**Download, build, and add** packages to a local repository

```aur sync [package1] [package2] ...```

**List packages** available in your local repository

```aur repo -l```

**Upgrade** local repository packages

```aur sync -u```

**Clean** build files after install

```aur sync -C [package]```

Install a package **without confirmation prompts**

```aur sync --noview -n [package]```

# SYNOPSIS

**aur** _command_ [_options_]

# DESCRIPTION

**aur** (aurutils) is a collection of scripts for managing AUR packages through a local pacman repository. It automates downloading PKGBUILDs, building packages in clean chroots, and adding them to a local repository that pacman can use directly.

Unlike AUR helpers that install packages directly, aurutils maintains a proper local repository, enabling cleaner dependency management and the ability to share built packages across systems.

# SUBCOMMANDS

**search**
> Search the AUR for packages matching a pattern

**sync**
> Download, build, and add packages to the local repository

**repo**
> Manage the local repository

**fetch**
> Download AUR package sources

**build**
> Build packages from downloaded sources

**depends**
> Display package dependency trees

# CAVEATS

Requires a local repository to be configured in **/etc/pacman.conf**. Uses **vifm** by default for PKGBUILD review (can be changed). Building occurs in a clean chroot, requiring **devtools** package. Initial setup is more complex than simple AUR helpers.

# HISTORY

**aurutils** was created to provide a more robust and scriptable approach to AUR package management on Arch Linux. It follows the Unix philosophy of small, composable tools rather than a monolithic AUR helper.

# SEE ALSO

[aur-sync](/man/aur-sync)(1), [pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8), [yay](/man/yay)(1)
