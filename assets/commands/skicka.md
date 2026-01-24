# TLDR

**Upload file**

```skicka upload [local-file] [drive-path]```

**Download file**

```skicka download [drive-path] [local-path]```

**List files**

```skicka ls [drive-path]```

**Create folder**

```skicka mkdir [drive-path]```

**Delete file**

```skicka rm [drive-path]```

**Show disk usage**

```skicka du [drive-path]```

# SYNOPSIS

**skicka** _command_ [_options_] [_args_]

# PARAMETERS

**upload**
> Upload to Drive.

**download**
> Download from Drive.

**ls**
> List contents.

**mkdir**
> Create directory.

**rm**
> Remove file.

**du**
> Disk usage.

**-encrypt**
> Encrypt files.

# DESCRIPTION

**skicka** manages Google Drive. It's a CLI client.

Upload and download. Sync files.

Encryption support. Local encryption.

Recursive operations. Folder transfers.

Written in Go. Single binary.

# CAVEATS

Requires OAuth setup. API limits apply. Not official Google tool.

# HISTORY

**skicka** was created by **Matt Pharr** as a command-line interface for Google Drive with encryption support.

# SEE ALSO

[rclone](/man/rclone)(1), [gdrive](/man/gdrive)(1), [drive](/man/drive)(1)
