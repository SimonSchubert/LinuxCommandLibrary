# TLDR

**Download and build** packages from the AUR

```aur sync [package1] [package2] ...```

**Upgrade** all AUR packages in the local repository

```aur sync -u```

**Clean** build files after install

```aur sync -C [package]```

Install **without viewing** PKGBUILD and without confirmation

```aur sync --noview -n [package]```

Upgrade but **ignore** specific packages

```aur sync -u --ignore [package1,package2,...]```

# SYNOPSIS

**aur sync** [_options_] _package_...

# DESCRIPTION

**aur sync** is the primary command in aurutils for downloading, building, and adding AUR packages to a local repository. It resolves AUR dependencies, fetches PKGBUILDs, builds packages in a clean chroot, and updates the local repository database.

By default, it opens PKGBUILDs in **vifm** for review before building. This behavior can be disabled with **--noview** for automated workflows.

# PARAMETERS

**-u, --upgrades**
> Check for and build upgrades to installed AUR packages

**-C, --clean**
> Remove build files after successful package creation

**-n, --noconfirm**
> Do not prompt for dependency installation confirmation

**--noview**
> Skip PKGBUILD review in vifm

**--ignore** _packages_
> Comma-separated list of packages to skip during upgrades

**-c, --chroot**
> Build packages in a clean chroot (default)

**--no-ver**
> Disable version checking

# CAVEATS

Requires a properly configured local repository and devtools for chroot builds. PKGBUILD review is important for security; use **--noview** cautiously. AUR packages are user-submitted and not officially vetted.

# SEE ALSO

[aur](/man/aur)(1), [pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8)
