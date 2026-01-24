# TLDR

**Create a local repository**

```kopia repository create filesystem --path [/path/to/repo]```

**Connect to an existing repository**

```kopia repository connect filesystem --path [/path/to/repo]```

**Create a backup snapshot**

```kopia snapshot create [/path/to/backup]```

**List all snapshots**

```kopia snapshot list```

**Restore a snapshot** to a directory

```kopia restore [snapshot_id] [/path/to/restore]```

**Mount snapshots** as filesystem

```kopia mount all [/mnt/kopia]```

**Show repository status**

```kopia repository status```

**Set retention policy**

```kopia policy set --keep-latest [10] --keep-daily [7] [/path/to/backup]```

# SYNOPSIS

**kopia** _command_ [_options_]

# PARAMETERS

**repository create** _type_
> Create new repository (filesystem, s3, b2, gcs, azure, sftp, etc.).

**repository connect** _type_
> Connect to existing repository.

**repository status**
> Show repository connection status.

**snapshot create** _path_
> Create a backup snapshot.

**snapshot list** [_path_]
> List snapshots, optionally filtered by source.

**snapshot restore** _id_ _target_
> Restore snapshot to directory.

**mount** _snapshots_ _mountpoint_
> Mount snapshots as FUSE filesystem.

**policy set** [_options_] [_path_]
> Set backup and retention policies.

**policy show** [_path_]
> Show effective policy.

**maintenance run**
> Run repository maintenance.

**server start**
> Start Kopia server (UI and API).

**--password** _pass_
> Repository password.

**--config-file** _path_
> Use alternate config file.

# DESCRIPTION

**Kopia** is a fast, secure backup tool with encryption, deduplication, and compression. It supports multiple storage backends including local filesystem, cloud storage (S3, B2, GCS, Azure), and SFTP servers.

Backups are encrypted client-side with AES-256-GCM before leaving your machine. Content-defined chunking enables efficient deduplication across all snapshots. Compression further reduces storage requirements.

The snapshot model provides point-in-time backups. Each snapshot captures directory state with metadata. Incremental backups only store changed data, but each snapshot is logically complete - you can restore any snapshot independently.

Policies control backup behavior per directory: compression, scheduling, retention (how many snapshots to keep), and file exclusions. Policies cascade from global to specific paths.

The optional server provides a web UI for browsing snapshots, monitoring backup status, and managing policies. It can also serve as a centralized backup server for multiple machines.

Mount functionality allows browsing snapshots as a filesystem, enabling file-level recovery without full restore.

# CAVEATS

Repository password cannot be recovered if lost - keep secure backups of credentials. Large initial backups take time. FUSE mount requires FUSE support. Some storage backends may have API costs. Deduplication effectiveness depends on data patterns.

# HISTORY

**Kopia** was created by Jarek Kowalski starting around **2019** as a modern backup solution. The design emphasized security (mandatory encryption), performance (Go implementation, parallelism), and flexibility (multiple backends). It gained popularity as an alternative to Restic and Borg, offering a web UI and cross-platform support.

# SEE ALSO

[restic](/man/restic)(1), [borg](/man/borg)(1), [duplicacy](/man/duplicacy)(1), [rclone](/man/rclone)(1)
