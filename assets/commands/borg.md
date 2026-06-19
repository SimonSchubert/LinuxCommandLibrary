# TAGLINE

Deduplicating backup with compression and encryption

# TLDR

**Initialize** repository

```borg init --encryption=[repokey] [/path/to/repo]```

**Create** backup

```borg create [/path/to/repo::backup-{now}] [/path/to/data]```

**List** archives

```borg list [/path/to/repo]```

**Extract** backup

```borg extract [/path/to/repo::backup-name]```

**Check** repository

```borg check [/path/to/repo]```

**Prune** old backups

```borg prune --keep-daily [7] --keep-weekly [4] [/path/to/repo]```

**Compact** the repository to actually free pruned space

```borg compact [/path/to/repo]```

**Mount** an archive to browse it as a filesystem

```borg mount [/path/to/repo::backup-name] [/mnt/point]```

# SYNOPSIS

**borg** _command_ [_options_]

# DESCRIPTION

**borg** (BorgBackup) is a deduplicating backup program with compression and authenticated encryption. It efficiently stores multiple backups by sharing common data blocks, making it ideal for frequent backups of large datasets.

The tool provides security, efficiency, and reliability for local and remote backups.

# PARAMETERS

**init**
> Initialize repository

**create**
> Create new archive

**extract**
> Extract archive contents

**list**
> List archives or contents

**diff**
> Compare archives

**delete**
> Delete archive

**prune**
> Delete old archives by retention policy

**compact**
> Free repository space freed by prune or delete (run after pruning)

**info**
> Show archive/repository information

**mount**
> Mount archive as filesystem

**check**
> Verify repository consistency

# ENCRYPTION MODES

**repokey**
> Key stored in repository

**keyfile**
> Key stored locally

**none**
> No encryption

**authenticated**
> Authenticated only (no encryption)

# WORKFLOW

```bash
# Initialize repository
borg init --encryption=repokey /backup/repo

# Create first backup
borg create /backup/repo::monday /home/user

# Create incremental backup (automatic deduplication)
borg create /backup/repo::tuesday /home/user

# List backups
borg list /backup/repo

# Restore
borg extract /backup/repo::monday

# Mount for browsing
borg mount /backup/repo::monday /mnt/backup

# Prune old backups
borg prune --keep-daily=7 --keep-weekly=4 /backup/repo

# Reclaim the space freed by prune
borg compact /backup/repo
```

# FEATURES

**Deduplication**
> Chunk-level deduplication shares common data across archives

**Compression**
> Supports lz4, zstd, zlib, and lzma

**Encryption**
> Authenticated AES encryption with repokey or keyfile modes

**Remote backups**
> Push backups to a remote repository over SSH

**Other**
> Sparse file support, archive mounting via FUSE, data verification, and efficient storage

# CAVEATS

Repository corruption can lose all backups (keep offsite copies). Encryption key loss means permanent data loss. Large repos need significant RAM for cache. SSH connection required for remote repos. Check operations can be slow.

# HISTORY

**BorgBackup** was created by Thomas Waldmann in **2015** as a fork of Attic backup, focusing on performance, security, and reliability.

# SEE ALSO

[restic](/man/restic)(1), [duplicity](/man/duplicity)(1), [rsync](/man/rsync)(1)

# RESOURCES

```[Source code](https://github.com/borgbackup/borg)```

```[Homepage](https://www.borgbackup.org)```

```[Documentation](https://borgbackup.readthedocs.io)```

<!-- verified: 2026-06-19 -->

