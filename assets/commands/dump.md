# TLDR

**Backup filesystem to file**

```dump -0uf [/backup/root.dump] [/dev/sda1]```

**Backup with compression**

```dump -0uf - [/] | gzip > [backup.dump.gz]```

**Incremental backup (level 1)**

```dump -1uf [/backup/root.1.dump] [/]```

**Backup to tape device**

```dump -0uf [/dev/st0] [/home]```

**List files in dump archive**

```restore -tf [backup.dump]```

# SYNOPSIS

**dump** [_options_] _filesystem_

# PARAMETERS

**-0** through **-9**
> Dump level; 0 is full, 1-9 are incremental.

**-u**
> Update /etc/dumpdates after successful dump.

**-f** _file_
> Output file or device.

**-a**
> Auto-size; bypass tape length calculation.

**-h** _level_
> Honor nodump flag for levels above this.

**-L** _label_
> Label for dump volume.

**-z** _level_
> Compress output with zlib.

**-M**
> Multi-volume; prompt for new tape.

# DESCRIPTION

**dump** creates backups of ext2/ext3/ext4 filesystems. It operates at the filesystem level, reading disk blocks directly, which provides complete backups including file metadata and special files.

Dump supports incremental backups through levels 0-9. Level 0 is a full backup; higher levels back up files changed since the last backup at a lower level. The /etc/dumpdates file tracks backup history.

# DUMP LEVELS

```
Level 0: Full backup (all files)
Level 1: Files changed since level 0
Level 2: Files changed since level 1
...and so on
```

Common strategy: Weekly level 0, daily level 1.

# CAVEATS

Filesystem-specific; works with ext2/3/4 but not XFS or Btrfs. Cannot back up mounted filesystems reliably in all cases. Use **restore** command to recover files. Modern alternatives like rsync or borg may be preferred.

# HISTORY

dump dates back to early Unix at **Bell Labs** in the **1970s**. It was one of the original backup utilities, designed for tape backups. The Linux version (dump/restore) was adapted from 4.4BSD and continues the traditional interface while supporting modern ext filesystems.

# SEE ALSO

[restore](/man/restore)(1), [tar](/man/tar)(1), [rsync](/man/rsync)(1), [dd](/man/dd)(1)
