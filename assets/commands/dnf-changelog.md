# TLDR

View **all changelogs** for a package

```dnf changelog [package]```

View changelogs **since date**

```dnf changelog --since [date] [package]```

View **last n** changelogs

```dnf changelog --count [number] [package]```

Show **new items** for upgradeable packages

```dnf changelog --upgrades [package]```

# SYNOPSIS

**dnf changelog** [_options_] _package_

# DESCRIPTION

**dnf changelog** displays changelogs for packages. Part of dnf-plugins-core.

Useful for reviewing what changes a package update will bring before upgrading.

# PARAMETERS

**--since** _date_
> Show entries after specified date

**--count** _n_
> Show last n entries

**--upgrades**
> Show only new entries for available upgrades

**--help-cmd**
> Display help

# CAVEATS

Requires dnf-plugins-core. Changelog availability depends on package maintainers including them in the RPM.

# SEE ALSO

[dnf](/man/dnf)(8), [rpm](/man/rpm)(8)
