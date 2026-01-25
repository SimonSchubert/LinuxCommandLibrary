# TLDR

**Initialize drive in directory**

```drive init [~/gdrive]```

**Pull files from Google Drive**

```drive pull [path/to/file]```

**Push files to Google Drive**

```drive push [path/to/file]```

**List files in Google Drive**

```drive list```

**Pull all changes**

```drive pull -all```

**Push with force**

```drive push -force [path]```

**Show differences**

```drive diff [path]```

# SYNOPSIS

**drive** _command_ [_options_] [_path_]

# PARAMETERS

**init**
> Initialize drive context in directory.

**pull** [_path_]
> Download files from Google Drive.

**push** [_path_]
> Upload files to Google Drive.

**list** [_path_]
> List files and directories.

**diff** [_path_]
> Show differences between local and remote.

**trash** [_path_]
> Move files to trash.

**untrash** [_path_]
> Restore files from trash.

**delete** [_path_]
> Permanently delete files.

**-all**
> Apply operation to all files.

**-force**
> Force operation without confirmation.

**-no-prompt**
> Disable confirmation prompts.

**-depth** _n_
> Limit directory traversal depth.

# DESCRIPTION

**drive** is a command-line client for Google Drive. It provides a git-like interface for synchronizing files between local directories and Google Drive, with explicit push and pull operations rather than automatic sync.

The tool requires OAuth authentication on first use. Files are tracked in a local context directory, and operations compare local state with remote to determine what needs synchronization.

# CAVEATS

Requires Go runtime for installation. OAuth tokens are stored locally. Large files may take time to transfer. Conflicts between local and remote changes require manual resolution. Not suitable for real-time sync; use for explicit transfers.

# HISTORY

drive was created by **Emmanuel Odeke** as a command-line alternative to Google's official Drive sync clients. It was designed for users who prefer explicit control over synchronization rather than automatic background sync.

# SEE ALSO

[rclone](/man/rclone)(1), [gdrive](/man/gdrive)(1), [rsync](/man/rsync)(1), [git](/man/git)(1)
