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

```aur sync -u --ignore [package1] --ignore [package2]```

**Rebuild** a package regardless of version

```aur sync -f [package]```

# SYNOPSIS

**aur sync** [_options_] _package_...

# DESCRIPTION

**aur sync** is the primary command in **aurutils** for downloading, building, and adding AUR packages to a local pacman repository. It resolves AUR dependencies, fetches PKGBUILDs, builds packages, and updates the local repository database.

By default, it opens PKGBUILDs for review using the file manager specified by **AUR_PAGER** (or **vifm**) before building. This behavior can be disabled with **--noview** for automated workflows.

# PARAMETERS

**-u**, **--upgrades**
> Check for and build upgrades to installed AUR packages.

**-c**, **--chroot**
> Build packages in a clean chroot using aur-chroot.

**-f**, **--force**
> Force rebuild regardless of version.

**-n**, **--noconfirm**
> Do not prompt for confirmation.

**--noview**
> Skip PKGBUILD review.

**--ignore** _package_
> Skip a package during upgrades (repeatable).

**-d**, **--database** _name_
> Use specified local repository database.

**--no-ver**
> Disable version checking (rebuild all).

**--no-ver-argv**
> Disable version checking for command-line arguments only.

**--provides**
> Consider provides when resolving dependencies.

**-S**, **--sign**
> Sign built packages with GPG.

**-k**, **--keep-going**
> Continue building remaining packages if one fails.

**--makepkg-args** _args_
> Pass additional arguments to makepkg.

# CAVEATS

Requires a properly configured local pacman repository and **devtools** for chroot builds. PKGBUILD review is critical for security; use **--noview** cautiously since AUR packages are user-submitted and not officially vetted. The **--ignore** flag takes one package per flag (not comma-separated).

# SEE ALSO

[aur](/man/aur)(1), [pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8)
