# TAGLINE

Download, build, and add AUR packages to a local pacman repository

# TLDR

**Download and build** packages from the AUR

```aur sync [package1] [package2] ...```

**Upgrade** all AUR packages in the local repository

```aur sync -u```

**Build in a clean chroot**

```aur sync -c [package]```

**Sync without viewing** PKGBUILD and without confirmation

```aur sync --noview --noconfirm [package]```

Upgrade but **ignore** specific packages

```aur sync -u --ignore=[package1,package2]```

**Rebuild** a package regardless of version

```aur sync --rebuild [package]```

**Show** the build queue without building

```aur sync -o [package]```

**Keep going** after failed builds

```AUR_SYNC_USE_NINJA=1 aur sync -k [0] -u```

# SYNOPSIS

**aur sync** [_options_] _package_...

# DESCRIPTION

**aur sync** is the primary command in **aurutils** for downloading, building, and adding AUR packages to a local pacman repository. It resolves AUR dependencies, fetches PKGBUILDs, builds packages, and updates the local repository database. It is a high level composition of the **aur depends**, **aur fetch**, **aur view**, and **aur build** programs.

By default, build files are presented for review through **aur view**, using **AUR_PAGER** if defined or **vifm** if installed, before building. This behavior can be disabled with **--noview** for automated workflows.

# PARAMETERS

**-u**, **--upgrades**
> Check for and build upgrades to installed AUR packages.

**-c**, **--chroot**
> Build packages in a systemd-nspawn container.

**-f**, **--force**
> Continue the build if a package with the same name exists. Does not disable version checks: up to date targets are still skipped.

**--rebuild**
> Build the given packages even if the local repository holds the same or a newer version. Short for **--force --no-ver-argv**.

**--rebuild-tree**
> Build the given packages and all their AUR dependencies regardless of versions.

**--rebuild-all**
> Build all packages in the local repository.

**-n**, **--noconfirm**
> Do not wait for user input when installing or removing build dependencies.

**--noview**, **--no-view**
> Do not present build files for inspection.

**--ignore**=_package_
> Skip a package during upgrades. Comma-separated or repeatable.

**--ignore-file**=_FILE_
> Ignore upgrades listed in FILE (default: $XDG_CONFIG_HOME/aurutils/sync/ignore).

**-d**, **--database**=_name_
> Use specified local repository database. Selected automatically if only one is configured.

**--root**=_DIR_
> Location of the repository root.

**--pool**=_DIR_
> Location for built packages.

**--continue**
> Do not download package files.

**--no-ver**
> Disable version checking for packages.

**--no-ver-argv**
> Disable version checking for command-line targets and upgrade candidates only.

**--no-provides**
> Do not consider virtual dependencies (provides) in pacman sync repositories.

**--provides-from**=_REPO1,..._
> Only consider the given pacman repositories for virtual dependencies.

**--optdepends**
> Include optdepends when resolving dependencies.

**--no-check**
> Do not handle checkdepends.

**--no-graph**
> Do not verify the AUR dependency graph.

**-o**, **--no-build**
> Print target packages and their paths instead of building them.

**-S**, **--sign**
> Sign built packages with GPG.

**-k** _NUM_, **--keep-going**=_NUM_
> Keep going until NUM packages fail to build (0 continues indefinitely). Requires **AUR_SYNC_USE_NINJA**.

**-C**, **--clean**
> Clean up leftover work files and directories after a successful build.

**-r**, **--rmdeps**
> Remove dependencies installed by makepkg.

**-K**, **--auto-key-retrieve**
> Automatically import PGP keys from validpgpkeys.

**--ff**, **--rebase**, **--reset**
> Change how new AUR commits are merged (default: discard local changes and fast-forward).

**--format**=_diff|log_
> Generate diffs with git diff or git log for review.

**--makepkg-args**=_args_
> Pass additional arguments to makepkg.

# CAVEATS

Requires a properly configured local pacman repository and **devtools** for chroot builds. PKGBUILD review is critical for security; use **--noview** cautiously since AUR packages are user-submitted and not officially vetted. Rebuilding with **--force** without increasing pkgrel may cause checksum mismatches on install unless the repository is a pacman CacheDir.

# SEE ALSO

[aur](/man/aur)(1), [pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8)

# RESOURCES

```[Source code](https://github.com/aurutils/aurutils)```

<!-- verified: 2026-11-09 -->
