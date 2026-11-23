# TAGLINE

Compare Arch package file differences

# TLDR

Compare the locally built package with the **repository version** (run inside the PKGBUILD directory)

```pkgctl diff```

Compare two package files in **tar content list** mode (default)

```pkgctl diff -l [path/to/old.pkg.tar.zst] [path/to/new.pkg.tar.zst]```

Compare package files using **diffoscope**

```pkgctl diff -d [path/to/file]```

Compare package **.PKGINFO** files

```pkgctl diff -p [path/to/file]```

Compare package **.BUILDINFO** files

```pkgctl diff -b [path/to/file]```

Show the diff **side by side** in color

```pkgctl diff -y --color=always [path/to/file]```

# SYNOPSIS

**pkgctl diff** [_options_] [_modes_] [_file_|_pkgname_...]

# PARAMETERS

**-l**, **--list**
> Compare using tar content list mode (default)

**-d**, **--diffoscope**
> Compare using diffoscope for detailed diff

**-p**, **--pkginfo**
> Compare .PKGINFO metadata files

**-b**, **--buildinfo**
> Compare .BUILDINFO files

**-M**, **--makepkg-config** _FILE_
> Use an alternate makepkg configuration file

**-P**, **--pool** _DIR_
> Search diff target in pool dir (default: _/srv/ftp/pool_)

**-v**, **--verbose**
> Provide more detailed/unfiltered output

**--color**[=_WHEN_]
> Color output: _never_, _always_ or _auto_ (plain **--color** means _auto_)

**-u**, **-U**, **--unified**
> Output 3 lines of unified context

**-y**, **--side-by-side**
> Output in two columns

**-W**, **--width**[=_NUM_]
> Output at most _NUM_ print columns: _auto_ (default), _columns_ or a number

**-h**, **--help**
> Show help text

# DESCRIPTION

**pkgctl diff** searches for a locally built package corresponding to the **PKGBUILD** in the current directory and compares it against the last version of that package downloaded from the Pacman repositories. Given one package, it diffs that package against the locally built one; given two, it diffs them against each other. Package names are resolved to files from the cache or pool. It is the standard pre-release sanity check for Arch package maintainers, exposing accidental file moves, dropped binaries, soname bumps, or unintended **.PKGINFO**/**.BUILDINFO** drift.

Without flags it runs in **--list** mode, which compares the tar manifest. Use **--diffoscope** for byte-level differences (slow but exhaustive), **--pkginfo** for runtime metadata, or **--buildinfo** to verify reproducibility-relevant fields like compiler flags and installed build dependencies.

# CAVEATS

**--diffoscope** requires the **diffoscope** package and can be very slow on packages with large compiled artifacts. When passed a bare _pkgname_, **pkgctl diff** downloads the published package from the mirrors, so a working network and configured Pacman mirrorlist are required.

# HISTORY

Part of **pkgctl** from Arch Linux **devtools**, the package control tool for official repository maintainers. The standalone **diffpkg** script in devtools provides the same functionality with identical options.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [diffoscope](/man/diffoscope)(1)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/archlinux/devtools)```

```[Documentation](https://man.archlinux.org/man/pkgctl-diff.1)```

<!-- verified: 2026-11-23 -->
