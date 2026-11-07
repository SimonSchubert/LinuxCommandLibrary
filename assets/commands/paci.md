# TAGLINE

wrapper around pacman, the Arch Linux package manager

# TLDR

**Search for package**

```paci [package_name]```

**Install package**

```paci -S [package]```

**Remove package**

```paci -R [package]```

**Update all packages**

```paci -Syu```

**Show package info**

```paci -Qi [package]```

**List installed packages**

```paci -Q```

**Clean package cache**

```paci -Sc```

**Search installed packages**

```paci -Qs [query]```

# SYNOPSIS

**paci** [_-S_] [_-R_] [_-Q_] [_-Syu_] [_options_] [_package_]

# PARAMETERS

**-S** _PACKAGE_
> Install package.

**-R** _PACKAGE_
> Remove package.

**-Q**
> Query installed packages.

**-Qi** _PACKAGE_
> Show package information.

**-Qs** _QUERY_
> Search installed packages.

**-Syu**
> System upgrade.

**-Sc**
> Clean cache.

**-Ss** _QUERY_
> Search repositories.

# DESCRIPTION

**paci** is a name used by several small, community-written wrappers around **pacman**, the Arch Linux package manager. Such wrappers typically pass pacman-style operations (**-S**, **-R**, **-Q**, **-Syu**) through to pacman, add **sudo** automatically where needed, and may treat a bare argument as a search.

There is no single canonical **paci** project, so available options and behavior depend on the script you have installed. Check **paci --help** or read the script itself.

# CAVEATS

Arch Linux specific and not packaged in the official repositories or a well-known AUR package. Since it wraps pacman, all pacman semantics (partial upgrades are unsupported, **-Sc** removes cached packages) still apply. For AUR support use a maintained helper such as **yay** or **paru**.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1), [trizen](/man/trizen)(1)
