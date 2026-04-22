# TAGLINE

short form of **pacman --upgrade**, install or upgrade from local package files

# TLDR

This command is an alias of **pacman --upgrade**. See the full documentation:

```tldr pacman upgrade```

**Install a local package file**

```sudo pacman -U [package.pkg.tar.zst]```

**Install multiple local packages** with globbing

```sudo pacman -U [*.pkg.tar.zst]```

**Install a package from a URL**

```sudo pacman -U [https://example.com/package.pkg.tar.zst]```

**Downgrade from the pacman cache**

```sudo pacman -U [/var/cache/pacman/pkg/package-oldver-x86_64.pkg.tar.zst]```

**Install without dependency version checks**

```sudo pacman -Udd [package.pkg.tar.zst]```

# SYNOPSIS

**pacman** {**-U** | **--upgrade**} [_options_] _file_|_url_ ...

# DESCRIPTION

**pacman -U** (long form `--upgrade`) installs or upgrades a package from a local package file or URL, bypassing the configured repositories. This is how you install locally built packages (from `makepkg`/AUR helpers), downgrades from the cache, and packages downloaded by hand.

Unlike `-S`, which resolves names against the sync databases, `-U` operates directly on a `.pkg.tar.zst` (or `.pkg.tar.xz`, `.pkg.tar.gz`) file. Dependencies are still resolved against the sync databases, so a full refresh via `pacman -Sy` first is often advisable.

# COMMON OPTIONS

**-d**, **--nodeps**
> Skip dependency version checks. Doubling (`-dd`) skips dependency checking entirely.

**--asdeps**
> Mark the installed package as a dependency (not explicitly requested).

**--asexplicit**
> Mark the installed package as explicitly installed.

**--needed**
> Skip install if the same version is already installed.

**--overwrite** _GLOB_
> Overwrite conflicting files matching _GLOB_ (use with caution).

**--noconfirm**
> Do not ask for any confirmation.

**-v**, **--verbose**
> Verbose output.

# CAVEATS

Requires root privileges (use `sudo`). The package must target the same architecture and be signed by a trusted key, or pass `--nosigcheck` (dangerous). Downgrading may break packages that depend on the newer version.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-upgrade](/man/pacman-upgrade)(8), [pacman-key](/man/pacman-key)(8), [makepkg](/man/makepkg)(8)
