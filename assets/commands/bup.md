# TAGLINE

Git-based backup system with deduplication

# TLDR

**Initialize** repository

```bup init```

**Index** files

```bup index [/path/to/backup]```

**Save** backup

```bup save -n [backup-name] [/path/to/backup]```

**List** backups

```bup ls```

**Restore** files

```bup restore -C [/restore/path] [backup-name/latest/path]```

# SYNOPSIS

**bup** _command_ [_options_]

# DESCRIPTION

**bup** is a backup system based on git's packfile format. It provides very efficient storage through deduplication, splitting large files into chunks, and using rolling checksums to find duplicate data.

The tool is particularly effective for backing up large files with small changes.

# PARAMETERS

**init**
> Initialize bup repository

**index** _path_
> Index files for backup

**save** _path_
> Save backup

**restore** _backup_
> Restore files

**ls** [_backup_]
> List backups or files

**fsck**
> Check repository integrity

**fuse** _mountpoint_
> Mount backups as filesystem

# FEATURES

- Efficient deduplication
- Incremental backups
- Large file support
- Git-based storage
- Filesystem mounting
- Remote backups over SSH
- Fast indexing
- Minimal dependencies

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
```

# DEDUPLICATION

Uses rolling checksums to identify duplicate chunks even when shifted within files. Very efficient for:
- Virtual machine images
- Large archives
- Database backups
- Version control repositories

# CAVEATS

Not encrypted by default. Repository can grow large without maintenance. Restore can be slow for many small files. Less mature than borg/restic. Documentation sometimes lacking. Not ideal for many tiny files.

# HISTORY

**bup** was created by Avery Pennarun around **2010** to provide git-like backup with efficient deduplication for large files.

# SEE ALSO

[borg](/man/borg)(1), [restic](/man/restic)(1), [git](/man/git)(1)
