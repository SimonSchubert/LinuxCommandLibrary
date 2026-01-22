# TLDR

**Update** package list

```wajig update```

**Install** package

```wajig install [package]```

**Purge** package

```wajig purge [package]```

**Daily** upgrade

```wajig daily-upgrade```

Show package **sizes**

```wajig sizes```

List **versions**

```wajig versions```

List **upgradable**

```wajig toupgrade```

Show **dependents**

```wajig dependents [package]```

# SYNOPSIS

**wajig** _COMMAND_ [_ARGS_...]

# COMMANDS

**update**
> Update package lists

**install**
> Install or upgrade package

**purge**
> Remove package and configuration

**daily-upgrade**
> Update and dist-upgrade

**sizes**
> Display installed package sizes

**versions**
> List versions for all packages

**toupgrade**
> List upgradable packages

**dependents**
> Show packages depending on given package

# DESCRIPTION

**wajig** is a simplified all-in-one-place system support tool for Debian-based systems. It wraps apt, dpkg, and other tools into a consistent interface with easy-to-remember commands.

The tool provides a unified interface for common package management tasks.

# CAVEATS

Debian-based systems only. Requires root for most operations. Wraps standard package tools.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [aptitude](/man/aptitude)(8)
