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

**Remove a collection but keep its packages**

```tlmgr remove --no-depends [collection-name]```

**Uninstall all of TeX Live**

```tlmgr remove --all```

# SYNOPSIS

**tlmgr remove** [_options_] _package_...

**tlmgr remove --all** [_--force_]

# PARAMETERS

**--force**
> Remove a package or collection unconditionally, even if it is a dependency of another collection or scheme. With **--all**, skip the confirmation.

**--dry-run**, **-n**
> Write the actions to the terminal without removing anything.

**--no-depends**
> Do not remove the package dependencies of a collection.

**--no-depends-at-all**
> Also skip the platform-specific binary packages, and imply **--no-depends**. Do not use it unless you are sure of what you are doing.

**--backup**
> Save a copy of the packages before removal. This is the default behaviour.

**--backupdir** _directory_
> Directory to save backups in.

**--all**
> Uninstall all of TeX Live, asking for confirmation unless **--force** is also given.

# DESCRIPTION

**tlmgr remove** uninstalls TeX Live packages, collections, or schemes. Removing a collection also removes its package dependencies, but not other collections it depends on, and removing a plain package never removes dependencies. By default it prevents removal of packages required by other installed collections or schemes unless overridden with `--force`. When TeX Live is installed system-wide, root privileges are required.

# CAVEATS

A package removed with **--force** while still listed in an installed collection will not be updated, and is reported as "forcibly removed" by `tlmgr update --list`. Except with **--all**, symlinks to executables in system directories are not removed; run `tlmgr path remove` yourself if needed. Use `tlmgr restore` to recover a package from a backup.

# SEE ALSO

[tlmgr-install](/man/tlmgr-install)(1), [tlmgr-update](/man/tlmgr-update)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

```[Source code](https://www.tug.org/texlive/svn/)```

<!-- verified: 2026-11-09 -->
