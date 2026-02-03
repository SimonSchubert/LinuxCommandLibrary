# TLDR

**List available backups**

```tlmgr restore```

**Restore package**

```tlmgr restore [package] [revision]```

**Restore all from backup**

```tlmgr restore --all```

# SYNOPSIS

**tlmgr restore** [_options_] [_package_ [_revision_]]

# PARAMETERS

**--all**
> Restore all packages.

**--backupdir** _dir_
> Backup source directory.

**--dry-run**
> Show what would be restored.

_revision_
> Specific revision to restore.

# DESCRIPTION

**tlmgr restore** restores TeX Live packages from backups. Reverts to previous versions after problematic updates. Part of TeX Live Manager.

# SEE ALSO

[tlmgr-backup](/man/tlmgr-backup)(1), [tlmgr](/man/tlmgr)(1)

