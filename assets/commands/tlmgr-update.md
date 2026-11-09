# TAGLINE

Update TeX Live packages

# TLDR

**Update all packages and tlmgr itself**

```tlmgr update --self --all```

**Update specific package**

```tlmgr update [package]```

**Check for updates**

```tlmgr update --list```

**Update self**

```tlmgr update --self```

**Update everything except one package**

```tlmgr update --all --exclude [package]```

**Keep a backup of packages before updating**

```tlmgr update --all --backup```

# SYNOPSIS

**tlmgr update** [_options_] [_package_...]

# PARAMETERS

**--all**
> Update all installed packages except tlmgr itself; fails if a tlmgr update is pending, unless combined with **--self** or **--force**.

**--self**
> Update tlmgr itself and the infrastructure packages, before any other updates requested.

**--list** [_package_]
> List available updates without changing anything; implies **--all** if no package is given.

**--dry-run**
> Show what would be updated, in more detail than **--list**.

**--backup**
> Backup packages before updating, to the directory set with **tlmgr option backupdir**.

**--backupdir** _dir_
> Backup packages before updating, to the given directory.

**--exclude** _pkg_
> Exclude package and its platform-specific packages from update. Can be repeated.

**--no-auto-remove** [_pkg_...]
> Keep packages removed from their collection on the server. Not recommended.

**--no-auto-install** [_pkg_...]
> Do not install packages newly added to a collection. Not recommended.

**--reinstall-forcibly-removed**
> Reinstall packages removed earlier with **remove --force**.

**--no-depends**
> Do not check dependencies for updates.

**--no-depends-at-all**
> Also skip platform-specific binary packages. Implies **--no-depends**.

**--force**
> Update normal packages without updating tlmgr itself. Not recommended.

# DESCRIPTION

**tlmgr update** updates TeX Live packages to latest versions. Can update the entire installation or specific packages; either **--all** or at least one package name is required. Part of TeX Live Manager.

Updating a collection also synchronizes it with the server: packages added to or removed from the collection are installed or removed locally.

# CAVEATS

A package is never downgraded if the mirror is older than the installation. New symlinks in system directories are not added automatically; run **tlmgr path add** if you use that feature.

# SEE ALSO

[tlmgr-install](/man/tlmgr-install)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
