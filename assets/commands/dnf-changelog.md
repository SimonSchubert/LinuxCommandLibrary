# TAGLINE

display package changelogs

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

**dnf changelog** displays package changelogs, which document changes, bug fixes, and security updates included in package versions. It's part of dnf-plugins-core and requires that plugin to be installed.

Changelogs are maintained by package maintainers and provide insight into what has changed between versions. This is particularly useful before upgrading to review security fixes, new features, or bug corrections. You can filter changelogs by date or count to focus on recent changes, or use --upgrades to see only what's new in available updates compared to your installed version.

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
