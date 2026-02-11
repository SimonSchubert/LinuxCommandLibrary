# TAGLINE

Sync files to and from cloud storage

# TLDR

**Configure a new remote** interactively

```rclone config```

**List configured remotes**

```rclone listremotes```

**List files** in a remote directory

```rclone ls [remote]:[path]```

**Copy files** from local to remote

```rclone copy [source] [remote]:[path]```

**Sync local directory to remote** (mirror, deletes extras on remote)

```rclone sync [source] [remote]:[path]```

**Mount remote as filesystem**

```rclone mount [remote]:[path] [/local/mountpoint]```

**Check differences** between source and destination

```rclone check [source] [remote]:[path]```

**Dry run** to preview sync without changes

```rclone sync --dry-run [source] [remote]:[path]```

# SYNOPSIS

**rclone** _command_ [_options_] _source_:_path_ [_dest_:_path_]

# PARAMETERS

**config**
> Interactive configuration of remotes

**copy**
> Copy files from source to destination (no deletion)

**sync**
> Make destination identical to source (deletes extras)

**move**
> Move files from source to destination

**ls**
> List objects with size and path

**lsd**
> List directories only

**mount**
> Mount remote as FUSE filesystem

**check**
> Check if source and destination match

**delete**
> Remove files in path

**--dry-run**, **-n**
> Preview changes without executing

**--interactive**, **-i**
> Prompt before destructive operations

**--progress**, **-P**
> Show real-time transfer progress

**--transfers** _N_
> Number of parallel file transfers (default 4)

**--checkers** _N_
> Number of parallel checkers (default 8)

**--verbose**, **-v**
> Increase verbosity (use -vv for more)

**--config** _FILE_
> Specify config file location

# DESCRIPTION

**rclone** is a command-line program for managing files on cloud storage, often described as "rsync for cloud storage." It supports over 70 cloud storage providers including Amazon S3, Google Drive, Dropbox, OneDrive, Backblaze B2, and standard protocols like SFTP, WebDAV, and FTP.

The **sync** command makes the destination identical to the source, including deleting files not present in the source. Use **copy** for one-way copying without deletion. Both commands transfer only modified files based on size and modification time (or checksums).

Configuration is stored in **~/.config/rclone/rclone.conf** and created interactively with **rclone config**. Each remote has a name used as a prefix (e.g., **gdrive:**) in commands.

The **mount** command exposes cloud storage as a local filesystem using FUSE, enabling standard file operations on remote storage.

# CONFIGURATION

**~/.config/rclone/rclone.conf**
> Main configuration file storing remote definitions with provider type, credentials, and options. Created interactively via **rclone config**.

**RCLONE_CONFIG**
> Environment variable overriding the default configuration file path.

**RCLONE_CONFIG_PASS**
> Environment variable providing the password for an encrypted configuration file.

# CAVEATS

**sync** deletes files on the destination that don't exist on the source. Always use **--dry-run** first to preview changes, especially when syncing to cloud storage.

Cloud-to-cloud transfers typically route through your local machine. For large transfers, running rclone on a cloud instance reduces latency and bandwidth usage.

API rate limits apply to most cloud providers. Google Drive limits uploads to approximately 2 files/second. Adjust **--transfers** and **--checkers** based on provider limits.

Encrypted remotes add a layer of client-side encryption but increase complexity. Test backup and restore procedures before relying on encryption.

# HISTORY

Rclone was created by **Nick Craig-Wood** with the first release in **2012**. The project started as a way to sync files with Google Drive and expanded to support dozens of cloud providers. It is written in Go and distributed as a single binary. The name combines "rsync" and "cloud."

# SEE ALSO

[rsync](/man/rsync)(1), [aws](/man/aws)(1), [gsutil](/man/gsutil)(1), [s3cmd](/man/s3cmd)(1)
