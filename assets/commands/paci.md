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

**paci** is a wrapper around pacman, the Arch Linux package manager. It provides a simplified interface while maintaining pacman's power.

The tool uses a familiar syntax for common operations: install, remove, update, and query. Complex pacman flags are abstracted into simpler commands.

Search functionality finds packages in repositories without requiring explicit flags. Interactive selection may be available depending on configuration.

Integration with AUR helpers may be included, enabling installation of community packages alongside official repositories.

The wrapper aims to reduce the learning curve for pacman while remaining compatible with its behavior.

# CAVEATS

Arch Linux specific. Wraps pacman, so pacman must be available. May not support all pacman features. Behavior may differ between implementations.

# HISTORY

Various **paci** implementations exist as pacman wrappers. They emerged from the Arch Linux community's desire for simpler package management interfaces while maintaining access to pacman's functionality.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1), [trizen](/man/trizen)(1)
