# TAGLINE

graphical and command-line package manager for Arch-based

# TLDR

**Install** a package

```pamac install [package]```

**Remove** package with orphans

```pamac remove --orphans [package]```

**Search** for a package, including the AUR

```pamac search --aur [package]```

**Show details** about a package

```pamac info [package]```

**List** installed packages

```pamac list --installed```

**List** orphaned packages

```pamac list --orphans```

**Check** for updates

```pamac checkupdates```

**Upgrade** all packages, including the AUR

```pamac upgrade --aur```

**Build and install** a package from the AUR

```pamac build [package]```

**Clean** the package cache, keeping the 2 newest versions

```pamac clean --keep [2]```

# SYNOPSIS

**pamac** _command_ [_options_] [_packages_...]

# COMMANDS

**search**
> Search package databases, or the owners of files with **--files**

**list**
> List packages, groups, repositories or files

**info**
> Show package details

**install**
> Install packages or groups from the repositories

**reinstall**
> Reinstall packages

**remove**
> Remove installed packages

**checkupdates**
> Check for available updates

**update**, **upgrade**
> Upgrade installed packages

**clone**
> Clone the build files of AUR packages

**build**
> Build packages from the AUR and install them

**clean**
> Clean the package cache and build files

# PARAMETERS

**-a**, **--aur**
> Include the AUR (search, info, checkupdates, update, upgrade).

**--no-aur**
> Exclude the AUR, overriding the configuration.

**--no-confirm**
> Skip confirmation prompts (build, install, reinstall, remove, update, clean).

**-d**, **--dry-run**
> Show what would be done without doing it.

**-w**, **--download-only**
> Download packages without installing them.

**--ignore** _packages_
> Ignore upgrades of the given packages (install, update, upgrade).

**--overwrite** _glob_
> Overwrite conflicting files matching the glob.

**--devel**
> Also check development packages from the AUR for updates.

**--force-refresh**
> Force a refresh of the package databases (update, upgrade).

**--enable-downgrade**
> Allow downgrades during an upgrade.

**-o**, **--orphans**
> With remove, also remove dependencies no longer required. With list, show orphans.

**-c**, **--cascade**
> With remove, also remove packages that depend on the targets.

**-u**, **--unneeded**
> With remove, only remove packages not required by others.

**-i**, **--installed**
> Limit search or list to installed packages.

**-e**, **--explicitly-installed**
> List explicitly installed packages.

**-m**, **--foreign**
> List packages not found in the repositories.

**-g**, **--groups**
> List groups.

**-r**, **--repos**
> Search or list by repository.

**-f**, **--files**
> Search by file, or list a package's files.

**-q**, **--quiet**
> Print less information.

**-k**, **--keep** _number_
> With clean, how many versions of each package to keep.

**-b**, **--build-files**
> With clean, remove build files instead of cached packages.

**--builddir** _dir_
> Directory used for AUR builds.

# DESCRIPTION

**pamac** is a graphical and command-line package manager for Arch-based distributions, primarily Manjaro. It is built on libalpm and supports the AUR (Arch User Repository).

The command-line client combines package installation, removal, searching, and system updates in a unified interface. AUR support must be enabled in /etc/pamac.conf or through the GUI settings. Run **pamac** _command_ **--help** for the options of each command.

# CAVEATS

AUR packages require enabling in configuration. Transactions ask for privileges through polkit. Options differ per command, so a flag accepted by one command may be rejected by another.

# HISTORY

**pamac** is written by **Guillaume Benoit** for the **Manjaro** project. The command-line client is maintained separately from the GTK interface.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1)

# RESOURCES

```[Source code](https://github.com/manjaro/pamac-cli)```

<!-- verified: 2026-11-08 -->
