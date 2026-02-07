# TAGLINE

command-line client for Google Drive

# TLDR

**List files**

```gdrive list```

**Upload file**

```gdrive upload [file.txt]```

**Download file**

```gdrive download [file_id]```

**Create folder**

```gdrive mkdir [foldername]```

**Share file**

```gdrive share [file_id]```

# SYNOPSIS

**gdrive** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: list, upload, download, mkdir, share, etc.

**list**
> List files and folders.

**upload** _FILE_
> Upload file.

**download** _ID_
> Download file by ID.

**mkdir** _NAME_
> Create folder.

**share** _ID_
> Share file.

**sync**
> Synchronize folder.

**--help**
> Display help information.

# DESCRIPTION

**gdrive** is an unofficial command-line client for Google Drive, providing comprehensive file management capabilities directly from the terminal. Unlike gdown which focuses on downloads, gdrive offers full bidirectional operations including uploading, downloading, listing, sharing, deleting, and synchronizing files and folders.

The tool authenticates using OAuth 2.0, storing credentials locally after initial authorization. Once authenticated, it provides terminal access to your entire Google Drive, enabling scriptable operations for backup automation, CI/CD workflows, and programmatic file management.

gdrive supports advanced operations like folder synchronization (similar to rsync), recursive uploads and downloads, setting file permissions and sharing, searching Drive contents, and managing trash. It can output results in various formats for integration with other tools and scripts.

As an unofficial third-party client, gdrive fills the gap left by Google's lack of an official Linux command-line client. It's particularly valuable for server environments, automated workflows, and users who prefer terminal-based file management. However, being unofficial means it's subject to Google API limitations and quota restrictions.

# CAVEATS

Requires OAuth authentication. API quotas apply. Not for large-scale operations.

# HISTORY

gdrive was created as an unofficial command-line client for Google Drive, filling the gap left by Google's lack of an official Linux client.

# SEE ALSO

[rclone](/man/rclone)(1), [gdown](/man/gdown)(1)
