# TLDR

**Install package**

```upt install [package]```

**Remove package**

```upt remove [package]```

**Update packages**

```upt upgrade```

**Search package**

```upt search [query]```

**List installed**

```upt list```

**Show info**

```upt info [package]```

# SYNOPSIS

**upt** _command_ [_options_] [_package_]

# PARAMETERS

**install**
> Install package.

**remove**
> Remove package.

**upgrade**
> Update all.

**search**
> Find packages.

**list**
> Show installed.

**info**
> Package details.

# DESCRIPTION

**upt** is a universal package tool. It wraps package managers.

Single interface. Works with any PM.

Detects system. apt, pacman, brew, etc.

Consistent commands. Same across systems.

Cross-platform. Linux, macOS.

# CAVEATS

Wrapper tool. Underlying PM varies. May need sudo.

# HISTORY

**upt** (Universal Package Tool) provides a unified interface to various system package managers.

# SEE ALSO

[apt](/man/apt)(1), [pacman](/man/pacman)(1), [brew](/man/brew)(1)
