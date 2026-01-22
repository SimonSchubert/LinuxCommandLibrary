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

**pkgdelta** creates delta packages. Reduces download size for updates.

The tool generates binary diffs. Part of Arch Linux pacman.

pkgdelta makes update deltas.

# CAVEATS

Arch Linux specific. Requires xdelta3. Space savings vary.

# HISTORY

pkgdelta was created for **bandwidth-efficient** Arch package updates.

# SEE ALSO

[pacman](/man/pacman)(8), [xdelta3](/man/xdelta3)(1)

