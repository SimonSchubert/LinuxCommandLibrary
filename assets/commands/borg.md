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
```

# FEATURES

- Deduplication (chunk-level)
- Compression (lz4, zstd, zlib)
- Encryption (AES)
- Remote backups over SSH
- Sparse file support
- Archive mounting
- Data verification
- Efficient storage

# CAVEATS

Repository corruption can lose all backups (keep offsite copies). Encryption key loss means permanent data loss. Large repos need significant RAM for cache. SSH connection required for remote repos. Check operations can be slow.

# HISTORY

**BorgBackup** was created by Thomas Waldmann in **2015** as a fork of Attic backup, focusing on performance, security, and reliability.

# SEE ALSO

[restic](/man/restic)(1), [duplicity](/man/duplicity)(1), [rsync](/man/rsync)(1)
