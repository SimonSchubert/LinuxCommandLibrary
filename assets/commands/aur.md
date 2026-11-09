# TAGLINE

Collection of scripts for managing AUR packages through a local repository.

# TLDR

**Search** the AUR database for a package

```aur search [keyword]```

**Download, build, and add** packages to a local repository

```aur sync [package1] [package2] ...```

**List packages** available in your local repository

```aur repo -l```

**Upgrade** local repository packages

```aur sync -u```

Build a package in a **clean chroot**

```aur sync -c [package]```

**Clean** leftover work files after a successful build

```aur sync -C [package]```

Install a package **without review prompts**

```aur sync --no-view --no-confirm [package]```

**Fetch** package sources from AUR without building

```aur fetch [package]```

Show the **dependency pairs** for a package

```aur depends [package]```

# SYNOPSIS

**aur** _command_ [_options_]

# DESCRIPTION

**aur** (aurutils) is a collection of scripts for managing AUR packages through a local pacman repository. It automates downloading PKGBUILDs, building packages (optionally in clean chroots), and adding them to a local repository that pacman can use directly.

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
> Resolve package dependencies using aurweb and print them as pkgbase and dependency pairs

**view**
> Inspect build files before they are executed

**query**
> Send requests to the aurweb RPC interface

**vercmp**
> Compare local package versions against the AUR

**chroot**
> Build packages in a systemd-nspawn container

**graph**
> Print package and dependency order from .SRCINFO data

**srcver**
> List the latest revision of VCS packages

# CAVEATS

Requires a local repository to be configured in **/etc/pacman.conf**. Build files are shown with **AUR_PAGER** if defined, otherwise with **vifm** if installed. Packages are built with makepkg by default; building in a container needs **-c**/**--chroot** and the **devtools** package. Initial setup is more involved than simple AUR helpers like yay or paru.

# HISTORY

**aurutils** was created to provide a more robust and scriptable approach to AUR package management on Arch Linux. It follows the Unix philosophy of small, composable tools rather than a monolithic AUR helper.

# SEE ALSO

[aur-sync](/man/aur-sync)(1), [aurutils](/man/aurutils)(1), [pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8), [yay](/man/yay)(1)

# RESOURCES

```[Source code](https://github.com/aurutils/aurutils)```

<!-- verified: 2026-11-09 -->
