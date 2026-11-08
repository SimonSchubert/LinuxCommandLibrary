# TAGLINE

Remove Slackware packages

# TLDR

**Remove** a package

```sudo removepkg package_name```

**Remove** from another root filesystem

```sudo ROOT=/mnt removepkg package_name```

Generate a **simulated removal report**

```removepkg -warn package_name```

**Preserve** package files and remove

```sudo removepkg -preserve package_name```

**Copy** package without removing

```sudo removepkg -copy package_name```

**Keep** temporary files for debugging

```sudo removepkg -keep package_name```

# SYNOPSIS

**removepkg** [_options_] _package_name_

# PARAMETERS

**-warn**, **--dry-run**
> Generate simulated removal report without removing

**-preserve**
> Reconstruct package tree in /var/lib/pkgtools/setup/tmp/preserved_packages before removing

**-copy**
> Copy package to /var/lib/pkgtools/setup/tmp/preserved_packages without removing

**-keep**
> Keep temporary files for debugging

**--skip-douninst**
> Skip running the package's uninstall script

**--verbose**
> List files, symlinks, and directories as they are removed

**--terse**
> Print a single line per package (now the default)

# DESCRIPTION

**removepkg** removes specified Slackware packages from the system. It can simulate removal, preserve package files before deletion, or copy packages without removing them.

Only files unique to the package are deleted; other installed packages are checked first. The file index moves from /var/lib/pkgtools/packages to /var/log/pkgtools/removed_packages. The double-dash forms of all options (such as **--warn**) are also accepted.

# CAVEATS

Does not handle dependencies automatically. Removing packages that others depend on may break the system.

# HISTORY

Part of **Slackware** package management utilities. Provides basic package removal functionality for the Slackware Linux distribution.

# SEE ALSO

[installpkg](/man/installpkg)(8), [upgradepkg](/man/upgradepkg)(8), [pkgtool](/man/pkgtool)(8)

# RESOURCES

```[Source code](https://mirrors.slackware.com/slackware/slackware64-current/source/a/pkgtools/)```

<!-- verified: 2026-11-08 -->
