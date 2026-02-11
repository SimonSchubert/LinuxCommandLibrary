# TAGLINE

Command-line Google Drive client

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

**skicka** is a command-line client for Google Drive that provides Unix-like file operations including upload, download, listing, directory creation, and deletion. It supports recursive operations for transferring entire folder hierarchies.

A notable feature is client-side encryption (**-encrypt**), which encrypts files locally before uploading to Google Drive, ensuring that stored data remains private even from the cloud provider. The tool is written in Go and distributed as a single binary.

# CAVEATS

Requires OAuth setup. API limits apply. Not official Google tool.

# HISTORY

**skicka** was created by **Matt Pharr** as a command-line interface for Google Drive with encryption support.

# SEE ALSO

[rclone](/man/rclone)(1), [gdrive](/man/gdrive)(1), [drive](/man/drive)(1)
