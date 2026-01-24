# TLDR

**Backup all known games**

```ludusavi backup```

**Backup specific game**

```ludusavi backup --by-title "[Game Name]"```

**Restore all backups**

```ludusavi restore```

**Restore specific game**

```ludusavi restore --by-title "[Game Name]"```

**Preview backup** (dry run)

```ludusavi backup --preview```

**Backup to custom location**

```ludusavi backup --path [/path/to/backups]```

**List backed up games**

```ludusavi backups```

**Update game manifest**

```ludusavi manifest update```

# SYNOPSIS

**ludusavi** [_backup_] [_restore_] [_backups_] [_--by-title name_] [_--path dir_] [_options_]

# PARAMETERS

**backup**
> Back up save data.

**restore**
> Restore save data from backup.

**backups**
> List available backups.

**--by-title** _NAME_
> Operate on specific game by title.

**--by-steam-id** _ID_
> Operate on game by Steam ID.

**--path** _DIR_
> Custom backup directory.

**--preview**
> Show what would happen without doing it.

**--force**
> Overwrite without confirmation.

**--compression** _TYPE_
> Compression type (none, deflate, bzip2, zstd).

**--format** _TYPE_
> Backup format (simple, zip).

**--merge**
> Merge with existing backup.

**manifest update**
> Update game database.

**--config** _FILE_
> Use custom config file.

**--help**
> Show help.

# DESCRIPTION

**ludusavi** backs up and restores video game save data. It knows where games store saves and can handle thousands of titles automatically.

The manifest contains paths for game saves across Windows, Linux, and macOS. It covers Steam, GOG, Epic, and other platforms. Custom entries can be added for unsupported games.

Backup formats include simple directories and compressed ZIP files. Multiple compression algorithms balance speed versus size.

Scheduled backups can be configured to run automatically. The merge option adds new saves to existing backups without replacing old ones.

The tool integrates with Playnite and other game launchers through plugins. A GUI version provides visual management for those who prefer it.

# CAVEATS

Not all games are in the manifest. Cloud saves may conflict. Some games use registry entries (Windows). Very large saves may take time to compress.

# HISTORY

**ludusavi** was created around **2020** as an open-source alternative to GameSave Manager. It uses the PCGamingWiki manifest for save locations, benefiting from community-maintained data about thousands of games.

# SEE ALSO

[restic](/man/restic)(1), [rsync](/man/rsync)(1), [rclone](/man/rclone)(1)
