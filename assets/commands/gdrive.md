# TAGLINE

command-line client for Google Drive

# TLDR

**List files in root**

```gdrive files list```

**Upload a file**

```gdrive files upload [file.txt]```

**Download a file by ID**

```gdrive files download [file_id]```

**Create a folder**

```gdrive files mkdir [foldername]```

**List available Google Drive accounts**

```gdrive account list```

**Show file info**

```gdrive files info [file_id]```

# SYNOPSIS

**gdrive** _command_ [_options_] [_arguments_]

# PARAMETERS

**files**
> File operations: list, upload, download, info, mkdir, delete, export.

**account**
> Account management: add, list, switch, remove.

**about**
> Show Drive account information.

**--help**
> Display help information.

# DESCRIPTION

**gdrive** is a command-line client for Google Drive, providing file management capabilities directly from the terminal. Unlike gdown which focuses on downloads, gdrive offers full bidirectional operations including uploading, downloading, listing, sharing, and deleting files and folders.

The tool authenticates using a service account or OAuth 2.0, storing credentials locally after initial authorization. It supports multiple Google accounts that can be added and switched between. Once authenticated, it provides terminal access to your Google Drive, enabling scriptable operations for backup automation and programmatic file management.

gdrive v3 uses a subcommand structure (e.g., **gdrive files list**, **gdrive files upload**). It fills the gap left by Google's lack of an official Linux command-line client, making it valuable for server environments, automated workflows, and terminal-based file management.

# CAVEATS

Requires OAuth authentication. API quotas apply. Not for large-scale operations.

# HISTORY

gdrive was created as an unofficial command-line client for Google Drive, filling the gap left by Google's lack of an official Linux client.

# SEE ALSO

[rclone](/man/rclone)(1), [gdown](/man/gdown)(1)
