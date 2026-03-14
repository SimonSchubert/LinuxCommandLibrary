# TAGLINE

Command-line Google Drive client

# TLDR

**Upload file** to Google Drive

```skicka upload [local-file] [drive-path]```

**Download file** from Google Drive

```skicka download [drive-path] [local-path]```

**List files** in a Drive folder

```skicka ls [drive-path]```

**Upload with encryption**

```skicka upload -encrypt [local-file] [drive-path]```

**Create folder** on Drive

```skicka mkdir [drive-path]```

**Show disk usage** of a Drive folder

```skicka du [drive-path]```

**Print contents** of a Drive file

```skicka cat [drive-path]```

**Delete file** from Drive

```skicka rm [drive-path]```

# SYNOPSIS

**skicka** _command_ [_options_] [_args_]

# COMMANDS

**upload**
> Upload files or directories to Drive

**download**
> Download files or directories from Drive

**ls**
> List contents of a Drive folder

**cat**
> Print the contents of a Drive file

**mkdir**
> Create a directory (use -p for intermediate directories)

**rm**
> Remove a file or folder (use -s to skip trash)

**du**
> Report disk usage for a Drive folder hierarchy

**df**
> Display free space on Drive

**fsck**
> Check consistency of local and Drive files

**init**
> Create an initial configuration file

# PARAMETERS

**-encrypt**
> Encrypt files before uploading

**-ignore-times**
> Force content comparison instead of relying on modification times

**-p**
> Create intermediate directories (for mkdir)

**-s**
> Skip trash and permanently delete (for rm)

# DESCRIPTION

**skicka** is a command-line client for Google Drive that provides Unix-like file operations including upload, download, listing, directory creation, and deletion. It supports recursive operations for transferring entire folder hierarchies.

A notable feature is client-side encryption (**-encrypt**), which encrypts files locally before uploading to Google Drive, ensuring that stored data remains private even from the cloud provider. Encryption keys are generated with the **genkey** subcommand. The tool is written in Go.

# CAVEATS

Requires OAuth setup and a ~/.skicka.config file. Google Drive API rate limits apply. Not an official Google product but is hosted under the Google GitHub organization.

# HISTORY

**skicka** was created by **Matt Pharr** as a command-line interface for Google Drive with encryption support.

# SEE ALSO

[rclone](/man/rclone)(1), [gdrive](/man/gdrive)(1), [drive](/man/drive)(1)
