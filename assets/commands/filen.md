# TAGLINE

end-to-end encrypted cloud storage CLI

# TLDR

**Login to account**

```filen login```

**Upload a file to the cloud**

```filen upload [local_file] [cloud_path]```

**Download a file or directory from the cloud**

```filen download [cloud_path] [local_destination]```

**List directory contents**

```filen ls [cloud_path]```

**Sync a local directory with the cloud continuously**

```filen sync [local_dir] [cloud_dir] --continuous```

**Start a local WebDAV server**

```filen webdav```

**Show current user info**

```filen whoami```

# SYNOPSIS

**filen** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: upload, download, ls, sync, login, etc.

**upload** _LOCAL_ _CLOUD_PATH_
> Upload a local file or directory to the cloud.

**download** _CLOUD_PATH_ _LOCAL_DEST_
> Download a file or directory from the cloud.

**ls** _PATH_
> List directory contents.

**sync** _LOCAL_ _REMOTE_
> Synchronize directories. Use --continuous to keep syncing.

**login**
> Authenticate with Filen.

**logout**
> Log out of Filen.

**whoami**
> Show current user.

**mkdir** _PATH_
> Create a directory in the cloud.

**rm** _PATH_
> Delete a file or directory. Use --no-trash to delete permanently.

**mv** _FROM_ _TO_
> Move a file or directory.

**cp** _FROM_ _TO_
> Copy a file or directory.

**stat** _PATH_
> Display information about a file or directory.

**webdav**
> Start a local WebDAV server mirroring your Filen Drive.

**s3**
> Start a local S3 server mirroring your Filen Drive.

**--skip-update**
> Skip checking for updates.

**--data-dir** _PATH_
> Override the default data directory location.

**--help**
> Display help information.

# DESCRIPTION

**filen** is the command-line interface for Filen, an end-to-end encrypted cloud storage service. It provides file upload, download, synchronization, and local WebDAV/S3 server capabilities with zero-knowledge encryption.

All files are encrypted client-side before upload, ensuring the server never has access to unencrypted data. The CLI enables scripted backups and file management without the desktop app.

When invoked without any command, filen enters interactive mode. It supports folder synchronization for automated backup workflows, with the --continuous flag for ongoing sync.

# CAVEATS

Requires Filen account. Encryption adds processing overhead. Storage limits depend on subscription.

# HISTORY

filen is the CLI for **Filen**, a German cloud storage service emphasizing privacy through end-to-end encryption. The service launched as an encrypted alternative to mainstream cloud storage.

# SEE ALSO

[rclone](/man/rclone)(1), [aws](/man/aws)(1), [gsutil](/man/gsutil)(1)
