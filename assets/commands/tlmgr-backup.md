# TAGLINE

Backup TeX Live packages

# TLDR

**Backup package**

```tlmgr backup [package]```

**Backup all packages**

```tlmgr backup --all```

**Backup to directory**

```tlmgr backup --backupdir [/path/to/backup] [package]```

**Clean old backups**

```tlmgr backup --clean [days]```

# SYNOPSIS

**tlmgr backup** [_options_] [_package_...]

# PARAMETERS

**--all**
> Backup all installed packages.

**--backupdir** _dir_
> Backup destination directory.

**--clean** _n_
> Remove backups older than n days.

**--dry-run**
> Show what would be done.

# DESCRIPTION

**tlmgr backup** creates backups of TeX Live packages. Useful before updates or system changes. Part of TeX Live Manager.

# SEE ALSO

[tlmgr-restore](/man/tlmgr-restore)(1), [tlmgr-update](/man/tlmgr-update)(1)

