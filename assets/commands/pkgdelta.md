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

Arch Linux specific. Requires xdelta3. Space savings vary.

# HISTORY

pkgdelta was created for **bandwidth-efficient** Arch package updates.

# SEE ALSO

[pacman](/man/pacman)(8), [xdelta3](/man/xdelta3)(1)

