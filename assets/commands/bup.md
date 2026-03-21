# TAGLINE

Git-based backup system with deduplication

# TLDR

**Initialize** a bup repository in the default location (~/.bup)

```bup init```

**Initialize** a repository in a custom directory

```BUP_DIR=[/path/to/repo] bup init```

**Index** files for backup

```bup index [/path/to/backup]```

**Save** an indexed backup with a name

```bup save -n [backup-name] [/path/to/backup]```

**List** all backups

```bup ls```

**List** files in a specific backup

```bup ls [backup-name]/latest/```

**Restore** files to a target directory

```bup restore -C [/restore/path] [backup-name/latest/path]```

**Check** repository integrity

```bup fsck```

# SYNOPSIS

**bup** _command_ [_options_]

# DESCRIPTION

**bup** is a backup system based on git's packfile format. It provides very efficient storage through deduplication, splitting large files into chunks, and using rolling checksums to find duplicate data.

The tool is particularly effective for backing up large files with small changes.

# PARAMETERS

**init**
> Initialize bup repository. Uses ~/.bup by default or BUP_DIR if set.

**index** _path_
> Index files for backup. Must be run before save.

**save** **-n** _name_ _path_
> Save indexed files as a named backup set.

**restore** **-C** _target_ _backup-path_
> Restore files from a backup to the target directory.

**ls** [_backup_]
> List backups or files within a backup.

**fsck**
> Check repository integrity.

**fuse** _mountpoint_
> Mount backups as a read-only FUSE filesystem.

**damage**
> Deliberately damage a repository for testing fsck.

**margin**
> Report the maximum number of matching prefix bits between objects.

**midx**
> Create or display midx (multi-index) files.

**memtest**
> Test memory throughput.

**web**
> Start a web server to browse backups.

# ENVIRONMENT

**BUP_DIR**
> Path to the bup repository. Defaults to ~/.bup.

**BUP_FORCE_TTY**
> Force progress output even when not on a terminal.

# WORKFLOW

```bash
# Initialize (in ~/.bup by default)
export BUP_DIR=/backup/bup-repo
bup init

# Index files
bup index ~/Documents

# Save backup
bup save -n documents ~/Documents

# List backups
bup ls

# List files in backup
bup ls documents/latest/

# Restore
bup restore -C ~/restored documents/latest/

# Mount as filesystem
mkdir /mnt/bup
bup fuse /mnt/bup

# Remote backup over SSH
bup init -r myserver:
bup save -r myserver: -n documents ~/Documents
```

# DEDUPLICATION

Uses rolling checksums to identify duplicate chunks even when shifted within files. Very efficient for:
- Virtual machine images
- Large archives
- Database backups
- Version control repositories

# CAVEATS

Not encrypted by default. Repository can grow large without maintenance. Restore can be slow for many small files. Less mature than borg/restic. Documentation sometimes lacking. Not ideal for many tiny files. No built-in pruning of old backups.

# HISTORY

**bup** was created by Avery Pennarun around **2010** to provide git-like backup with efficient deduplication for large files.

# SEE ALSO

[borg](/man/borg)(1), [restic](/man/restic)(1), [git](/man/git)(1), [rsync](/man/rsync)(1), [tar](/man/tar)(1)
