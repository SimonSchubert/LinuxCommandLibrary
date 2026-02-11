# TAGLINE

Remove Slackware packages

# TLDR

**Remove** a package

```sudo removepkg package_name```

Generate a **simulated removal report**

```removepkg -warn package_name```

**Preserve** package files and remove

```sudo removepkg -preserve package_name```

**Copy** package without removing

```removepkg -copy package_name```

**Keep** temporary files for debugging

```sudo removepkg -keep package_name```

# SYNOPSIS

**removepkg** [_options_] _package_name_

# PARAMETERS

**-warn**
> Generate simulated removal report without removing

**-preserve**
> Reconstruct package tree in /tmp/preserved_packages before removing

**-copy**
> Copy package to /tmp/preserved_packages without removing

**-keep**
> Keep temporary files for debugging

# DESCRIPTION

**removepkg** removes specified Slackware packages from the system. It can simulate removal, preserve package files before deletion, or copy packages without removing them.

The tool is part of Slackware's native package management system.

# CAVEATS

Does not handle dependencies automatically. Removing packages that others depend on may break the system.

# HISTORY

Part of **Slackware** package management utilities. Provides basic package removal functionality for the Slackware Linux distribution.

# SEE ALSO

[installpkg](/man/installpkg)(8), [upgradepkg](/man/upgradepkg)(8), [pkgtool](/man/pkgtool)(8)
