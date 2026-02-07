# TAGLINE

end-to-end encrypted cloud storage CLI

# TLDR

**Upload file**

```filen upload [file.txt]```

**Download file**

```filen download [remote_path] [local_path]```

**List files**

```filen ls [path]```

**Sync directory**

```filen sync [local] [remote]```

**Login to account**

```filen login```

# SYNOPSIS

**filen** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: upload, download, ls, sync, login, etc.

**upload** _FILE_
> Upload file to cloud.

**download** _REMOTE_ _LOCAL_
> Download from cloud.

**ls** _PATH_
> List directory contents.

**sync** _LOCAL_ _REMOTE_
> Synchronize directories.

**login**
> Authenticate with Filen.

**whoami**
> Show current user.

**--help**
> Display help information.

# DESCRIPTION

**filen** is the command-line interface for Filen, an end-to-end encrypted cloud storage service. It provides file upload, download, and synchronization with zero-knowledge encryption.

All files are encrypted client-side before upload, ensuring the server never has access to unencrypted data. The CLI enables scripted backups and file management without the desktop app.

filen supports folder synchronization for automated backup workflows.

# CAVEATS

Requires Filen account. Encryption adds processing overhead. Storage limits depend on subscription.

# HISTORY

filen is the CLI for **Filen**, a German cloud storage service emphasizing privacy through end-to-end encryption. The service launched as an encrypted alternative to mainstream cloud storage.

# SEE ALSO

[rclone](/man/rclone)(1), [aws](/man/aws)(1), [gsutil](/man/gsutil)(1)
