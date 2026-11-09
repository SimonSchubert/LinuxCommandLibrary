# TAGLINE

Backup TeX Live packages

# TLDR

**Backup package**

```tlmgr backup [package]```

**Backup all packages**

```tlmgr backup --all```

**Backup to directory**

```tlmgr backup --backupdir [/path/to/backup] [package]```

**Prune old backups, keeping the newest N of each package**

```tlmgr backup --clean=[N] --all```

**Preview which backups would be pruned**

```tlmgr backup --clean=[N] --dry-run [package]```

# SYNOPSIS

**tlmgr backup** [_options_] **--all**

**tlmgr backup** [_options_] _package_...

# PARAMETERS

**--all**
> Backup all installed packages, or with **--clean** prune all packages. Takes a lot of space and time.

**--backupdir** _dir_
> Backup directory; must exist and be writable. Overrides the **backupdir** option.

**--clean**[=_N_]
> Prune backups instead of creating them, keeping _N_ per package. Defaults to the **autobackup** option; requires **--all** or package names.

**--dry-run**
> Show what would be done.

# DESCRIPTION

**tlmgr backup** creates backups of TeX Live packages. Useful before updates or system changes. Part of TeX Live Manager.

If neither **--backupdir** nor the **backupdir** option is set, no backups are made. The installer sets **backupdir** to **tlpkg/backups** under the TeX Live root.

# SEE ALSO

[tlmgr-restore](/man/tlmgr-restore)(1), [tlmgr-update](/man/tlmgr-update)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
