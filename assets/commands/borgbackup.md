# TAGLINE

Deduplicating backup with compression and encryption

# TLDR

**Initialize a new backup repository**

```borg init --encryption=repokey [/path/to/repo]```

**Create a backup**

```borg create [/path/to/repo]::[archive_name] [/path/to/source]```

**Create backup with compression**

```borg create --compression lz4 [/path/to/repo]::[archive_name] [/path/to/source]```

**List archives in a repository**

```borg list [/path/to/repo]```

**List contents of an archive**

```borg list [/path/to/repo]::[archive_name]```

**Extract an archive**

```borg extract [/path/to/repo]::[archive_name]```

**Delete old archives** keeping the last 7 daily and 4 weekly

```borg prune --keep-daily=7 --keep-weekly=4 [/path/to/repo]```

**Mount archive as filesystem**

```borg mount [/path/to/repo]::[archive_name] [/mnt/point]```

# SYNOPSIS

**borg** _command_ [_options_] [_repository_]

# PARAMETERS

**init**
> Initialize a new backup repository.

**create**
> Create a new backup archive.

**list**
> List repository contents or archive files.

**extract**
> Extract files from an archive.

**delete**
> Delete archives.

**prune**
> Delete archives according to retention policy.

**mount** / **umount**
> Mount/unmount archive as FUSE filesystem.

**info**
> Show archive or repository information.

**check**
> Verify repository consistency.

**--encryption** _mode_
> Encryption mode: none, repokey, keyfile.

**--compression** _algo_
> Compression: none, lz4, zstd, zlib, lzma.

**--exclude** _pattern_
> Exclude files matching pattern.

**--progress**
> Show progress during operations.

**-v**, **--verbose**
> Increase output verbosity.

# DESCRIPTION

**Borg** (BorgBackup) is a deduplicating backup program with compression and encryption. It efficiently stores multiple backups by identifying and reusing duplicate data blocks, dramatically reducing storage requirements for incremental backups.

Key features include **client-side encryption** ensuring only you can read your data, **efficient deduplication** that stores each unique data chunk only once across all archives, and **compression** to further reduce storage needs.

Borg can backup to local directories, remote hosts via SSH, or cloud storage through rclone. Archives can be mounted via FUSE for easy browsing and selective restoration. Retention policies automatically prune old archives.

# CAVEATS

The repository format is Borg-specific; archives cannot be read with other tools. The encryption key must be backed up separately - losing it means losing access to backups. Remote backups require SSH access and Borg installed on both sides. Deduplication happens across all archives in a repository, not across repositories.

# HISTORY

BorgBackup was forked from **Attic** in **2015** after Attic development stalled. The name "Borg" references Star Trek's Borg, known for assimilating and efficiently organizing. Development accelerated after the fork, adding features like authenticated encryption, improved compression, and macOS/Windows support. Borg has become one of the most popular open-source backup solutions.

# SEE ALSO

[restic](/man/restic)(1), [duplicity](/man/duplicity)(1), [rsync](/man/rsync)(1), [rclone](/man/rclone)(1)
