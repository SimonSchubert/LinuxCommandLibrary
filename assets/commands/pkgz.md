# TAGLINE

Unified CLI for multiple Linux package managers

# TLDR

**Install a package**

```pkgz install [package]```

**Install from a specific source**

```pkgz install [package] --source [flatpak]```

**Install several packages**

```pkgz install [package1] [package2]```

**Remove a package**

```pkgz remove [package]```

**Search packages**

```pkgz search [query]```

**Check for available updates**

```pkgz refresh```

**Apply all available updates**

```pkgz update```

**Show package counts per source**

```pkgz info```

**Clean package caches**

```pkgz clean```

# SYNOPSIS

**pkgz** _command_ [_package_...] [**--source** _name_]

**pkgz** **--version**

# PARAMETERS

**install** _PACKAGE_...
> Install one or more packages.

**remove** _PACKAGE_
> Remove a package.

**search** _QUERY_
> Search enabled sources.

**info** [_PACKAGE_]
> Show package counts per source, or the status of one package.

**refresh**
> Check for available updates without installing them.

**update**
> Apply all available updates.

**clean**
> Clean up across enabled sources.

**--source** _NAME_, **--from** _NAME_
> Use this source and skip the interactive source picker.

**--version**
> Display the version.

# DESCRIPTION

**pkgz** is a command-line tool written in Go that drives several package managers from one interface. It supports apt, Flatpak, pacman, paru, yay, DNF and zypper, and elevates privileges with **sudo** or **doas**.

Each operation runs in a terminal interface that shows every enabled source with its status and live output. When a package is available from more than one source, pkgz asks which to use unless **--source** is given, which makes it deterministic for scripts. When stdout is not a terminal, it falls back to plain console output.

On first run pkgz detects the installed package managers and writes **~/.config/pkgz/config.toml**, where sources can be enabled or disabled and the elevation command chosen.

# CAVEATS

At least one supported package manager and either sudo or doas must be installed. Enabled sources whose binaries are missing are skipped with a warning.

# SEE ALSO

[apt](/man/apt)(1), [yum](/man/yum)(1), [pacman](/man/pacman)(1)

# RESOURCES

```[Source code](https://github.com/roguehashrate/pkgz)```

<!-- verified: 2026-11-09 -->
