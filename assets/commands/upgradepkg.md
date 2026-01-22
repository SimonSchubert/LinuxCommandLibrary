# TLDR

**Upgrade** a package

```sudo upgradepkg [path/to/package.tgz]```

**Install** if not present

```sudo upgradepkg --install-new [path/to/package.tgz]```

**Reinstall** package

```sudo upgradepkg --reinstall [path/to/package.tgz]```

**Dry run** preview

```upgradepkg --dry-run [path/to/package.tgz]```

**Verbose** upgrade

```sudo upgradepkg --verbose [path/to/package.tgz]```

# SYNOPSIS

**upgradepkg** [_OPTIONS_] _PACKAGE_...

# PARAMETERS

**--install-new**
> Install package if not already present

**--reinstall**
> Reinstall even if same version exists

**--dry-run**
> Preview without making changes

**--verbose**
> Show detailed progress

# DESCRIPTION

**upgradepkg** upgrades Slackware packages by replacing existing packages with new versions. It removes the old package and installs the new one, preserving configuration where possible.

Part of the Slackware pkgtools package management system.

# CAVEATS

Slackware specific. Requires root privileges. Does not handle dependencies. Old package is removed before new one is installed.

# SEE ALSO

[installpkg](/man/installpkg)(8), [removepkg](/man/removepkg)(8), [makepkg](/man/makepkg)(8), [pkgtool](/man/pkgtool)(8)
