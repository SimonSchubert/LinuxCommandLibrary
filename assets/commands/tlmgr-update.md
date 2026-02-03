# TLDR

**Update all packages**

```tlmgr update --all```

**Update specific package**

```tlmgr update [package]```

**Check for updates**

```tlmgr update --list```

**Update self**

```tlmgr update --self```

# SYNOPSIS

**tlmgr update** [_options_] [_package_...]

# PARAMETERS

**--all**
> Update all installed packages.

**--self**
> Update tlmgr itself.

**--list**
> List available updates.

**--dry-run**
> Show what would be updated.

**--backup**
> Backup packages before updating.

**--exclude** _pkg_
> Exclude package from update.

# DESCRIPTION

**tlmgr update** updates TeX Live packages to latest versions. Can update the entire installation or specific packages. Part of TeX Live Manager.

# SEE ALSO

[tlmgr-install](/man/tlmgr-install)(1), [tlmgr](/man/tlmgr)(1)

