# TAGLINE

Restore TeX Live packages from backups

# TLDR

**List available backups**

```tlmgr restore```

**List backup revisions of a package**

```tlmgr restore [package]```

**Restore package**

```tlmgr restore [package] [revision]```

**Restore all from backup**

```tlmgr restore --all```

# SYNOPSIS

**tlmgr restore** [_options_] [_package_ [_revision_]]

**tlmgr restore** [_options_] **--all**

# PARAMETERS

**--all**
> Restore the latest revision of all package backups found. Cannot be combined with package names.

**--backupdir** _dir_
> Backup source directory. Defaults to the **backupdir** option.

**--dry-run**
> Show what would be restored.

**--force**
> Do not ask questions.

**--json**
> Write the list of backups as JSON.

_revision_
> Specific revision to restore. Without it, available revisions are listed and nothing is restored.

# DESCRIPTION

**tlmgr restore** restores TeX Live packages from backups. Reverts to previous versions after problematic updates. Part of TeX Live Manager.

# SEE ALSO

[tlmgr-backup](/man/tlmgr-backup)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
