# TLDR

**Sync** and update all AUR packages

```trizen -Syua```

**Install** package

```trizen -S [package]```

**Remove** package and dependencies

```trizen -Rs [package]```

**Search** for package

```trizen -Ss [keyword]```

Show package **info**

```trizen -Si [package]```

**List** installed packages

```trizen -Qe```

# SYNOPSIS

**trizen** [_OPTIONS_] [_TARGETS_...]

# PARAMETERS

**-S**
> Sync/install package

**-Ss**
> Search for packages

**-Si**
> Show package information

**-Syua**
> Sync databases and upgrade all AUR packages

**-Rs**
> Remove package with dependencies

**-Qe**
> List explicitly installed packages

# DESCRIPTION

**trizen** is an Arch Linux utility for building and installing packages from the Arch User Repository (AUR). It uses pacman-style commands and provides features like dependency resolution, PKGBUILD review, and clean build options.

The tool handles downloading PKGBUILDs, building packages, and installing them along with their dependencies from both official repositories and the AUR.

# CAVEATS

AUR packages are user-submitted and not officially supported. Review PKGBUILDs before building. Requires base-devel package group. Building may require significant time and resources.

# HISTORY

**trizen** was written in Perl as a lightweight AUR helper for Arch Linux, focusing on simplicity and speed while maintaining compatibility with pacman commands.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(8), [paru](/man/paru)(1)
