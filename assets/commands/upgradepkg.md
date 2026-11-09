# TAGLINE

Upgrade Slackware packages

# TLDR

**Upgrade** a package

```sudo upgradepkg [path/to/package.txz]```

**Install** if not present

```sudo upgradepkg --install-new [path/to/package.txz]```

**Reinstall** package

```sudo upgradepkg --reinstall [path/to/package.txz]```

Upgrade across a package **rename**

```sudo upgradepkg [oldpackagename]%[path/to/newpackage.txz]```

**Dry run** preview

```upgradepkg --dry-run [path/to/package.txz]```

**Verbose** upgrade

```sudo upgradepkg --verbose [path/to/package.txz]```

Upgrade under another **root** directory

```sudo ROOT=[/mnt] upgradepkg [path/to/package.txz]```

# SYNOPSIS

**upgradepkg** [_OPTIONS_] _NEWPACKAGE_...

**upgradepkg** [_OPTIONS_] _OLDPACKAGE_%_NEWPACKAGE_...

# PARAMETERS

**--install-new**
> Install package if not already present

**--reinstall**
> Upgrade even if the exact same package is already installed

**--dry-run**
> Report what would be installed or upgraded without making changes

**--warn**
> Same as --dry-run

**--terse**
> Show a single line of output per package

**--terselength** _LENGTH_
> Maximum line length in --terse mode

**--verbose**
> Show all details of the upgrade

# DESCRIPTION

**upgradepkg** upgrades Slackware packages from an older version to a newer one. It installs the new package, then removes any files from the old package that are not in the new one. If the old and new packages have different names, give them as _old_%_new_ with no whitespace.

Packages may be .txz, .tgz, .tbz or .tlz. Part of the Slackware pkgtools package management system.

# CAVEATS

Slackware specific. Requires root privileges. Does not handle dependencies. Save configuration files first: they are only sometimes preserved, depending on the package. If more than one installed package matches the old package name, all are removed.

# SEE ALSO

[installpkg](/man/installpkg)(8), [removepkg](/man/removepkg)(8), [explodepkg](/man/explodepkg)(8), [makepkg](/man/makepkg)(8), [pkgtool](/man/pkgtool)(8)

# RESOURCES

```[Homepage](http://www.slackware.com/)```

```[Documentation](https://docs.slackware.com/slackware:package_management)```

<!-- verified: 2026-11-09 -->
