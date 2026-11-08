# TAGLINE

Create delta files between package versions

# TLDR

**Create delta package**

```pkgdelta [old_package] [new_package]```

**Apply delta**

```xdelta3 -d -s [old_package] [delta] [new_package]```

# SYNOPSIS

**pkgdelta** [_options_] _old_pkg_ _new_pkg_

# PARAMETERS

_OLD_PKG_
> Original package file.

_NEW_PKG_
> New package file.

**-q**
> Quiet mode.

# DESCRIPTION

**pkgdelta** creates binary delta files between two versions of an Arch Linux package. The resulting delta file contains only the differences, significantly reducing the download size needed for package upgrades compared to downloading the full new package.

Part of the pacman package manager suite, it uses the xdelta3 algorithm to compute efficient binary diffs. Delta packages are applied with xdelta3 to reconstruct the new package from the old one and the delta file.

# CAVEATS

Obsolete: delta package support and **pkgdelta** were removed from pacman in version 5.2 (2019). Only relevant to older pacman installations. Requires xdelta3.

# HISTORY

pkgdelta was created for **bandwidth-efficient** Arch package updates. Delta support was removed entirely in **pacman 5.2** in October 2019.

# SEE ALSO

[pacman](/man/pacman)(8), [xdelta3](/man/xdelta3)(1)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/pacman/pacman)```

<!-- verified: 2026-11-08 -->
