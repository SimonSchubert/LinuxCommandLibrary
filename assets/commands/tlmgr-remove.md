# TAGLINE

Uninstall TeX Live packages

# TLDR

**Remove package**

```tlmgr remove [package]```

**Remove multiple packages**

```tlmgr remove [package1] [package2]```

**Force removal**

```tlmgr remove --force [package]```

**Dry run**

```tlmgr remove --dry-run [package]```

# SYNOPSIS

**tlmgr remove** [_options_] _package_...

# PARAMETERS

**--force**
> Force removal even if other packages depend on it.

**--dry-run**
> Show what would be removed.

**--no-depends**
> Don't remove dependencies.

**--no-depends-at-all**
> Even more aggressive: do not check for and remove dependent packages even from the same collection.

# DESCRIPTION

**tlmgr remove** uninstalls TeX Live packages, collections, or schemes. By default it prevents removal of packages required by other installed components, ensuring the integrity of the TeX Live installation, unless overridden with `--force`. When TeX Live is installed system-wide, root privileges are required.

# SEE ALSO

[tlmgr-install](/man/tlmgr-install)(1), [tlmgr-update](/man/tlmgr-update)(1), [tlmgr](/man/tlmgr)(1)

