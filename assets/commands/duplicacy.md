# TLDR

**Initialize a repository** with local storage

```duplicacy init [snapshot_id] [/path/to/storage]```

**Initialize with cloud storage** (S3, B2, etc.)

```duplicacy init [snapshot_id] [s3://bucket/path]```

**Create a backup**

```duplicacy backup```

**List all snapshots**

```duplicacy list```

**Restore files** from the latest snapshot

```duplicacy restore```

**Restore from a specific revision**

```duplicacy restore -r [revision_number]```

**Prune old snapshots** keeping last N

```duplicacy prune -keep [0:365] -keep [7:30] -keep [1:7]```

**Check repository integrity**

```duplicacy check```

# SYNOPSIS

**duplicacy** _command_ [_options_] [_arguments_]

# PARAMETERS

**init** _snapshot_id storage_
> Initialize a new repository with the specified snapshot ID and storage location.

**backup** [_-stats_] [_-threads n_]
> Create a new backup snapshot.

**restore** [_-r revision_] [_-overwrite_]
> Restore files from a snapshot.

**list** [_-all_] [_-files_]
> List available snapshots.

**prune** [_-keep spec_] [_-id snapshot_id_]
> Remove old snapshots based on retention policy.

**check** [_-files_] [_-stats_]
> Verify repository integrity.

**diff** [_-r revision_]
> Show differences between snapshots.

**cat** _file_ [_-r revision_]
> Print contents of a file from a snapshot.

**-encrypt**
> Enable encryption for the repository.

**-threads** _n_
> Number of concurrent threads.

**-stats**
> Show detailed statistics.

**-verbose**
> Enable verbose output.

**-d**
> Enable debug logging.

# DESCRIPTION

**Duplicacy** is a cross-platform backup tool featuring lock-free deduplication. It uses variable-length chunking to split files into chunks that are deduplicated across all backups, significantly reducing storage requirements for similar data.

A unique feature is lock-free design: multiple computers can back up to the same storage simultaneously without coordination. Each client operates independently, making Duplicacy suitable for backing up multiple machines to shared cloud storage.

The tool supports numerous storage backends including local disk, SFTP, WebDAV, and cloud services (AWS S3, Backblaze B2, Google Cloud, Azure, Wasabi, etc.). Client-side encryption ensures data privacy even with untrusted storage.

Duplicacy uses a two-repository model: the working directory (source) and the storage (destination). Multiple working directories can share the same storage, benefiting from cross-machine deduplication. The prune command implements flexible retention policies with tiered keep rules.

# CAVEATS

Free CLI version has limitations; some features require license. Deduplication effectiveness varies with data type. Initial backup of large datasets takes significant time. Restoration speed depends on chunk distribution across storage. Some cloud storage operations incur API costs.

# HISTORY

**Duplicacy** was created by Gilbert Chen starting around **2016** as a modern backup solution focusing on deduplication and cloud storage. The lock-free design was a response to limitations in tools like Duplicity where concurrent backups required coordination. Both CLI (open-source) and GUI (commercial) versions are available.

# SEE ALSO

[restic](/man/restic)(1), [borg](/man/borg)(1), [rclone](/man/rclone)(1), [duplicity](/man/duplicity)(1)
