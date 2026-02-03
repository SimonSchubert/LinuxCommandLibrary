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

# DESCRIPTION

**tlmgr remove** uninstalls TeX Live packages. Optionally removes unused dependencies. Part of TeX Live Manager for managing LaTeX installations.

# SEE ALSO

[tlmgr-install](/man/tlmgr-install)(1), [tlmgr](/man/tlmgr)(1)

