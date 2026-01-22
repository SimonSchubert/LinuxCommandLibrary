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

**gdrive** is a command-line tool for Google Drive. It provides file management operations including upload, download, listing, and sharing directly from the terminal.

The tool authenticates via OAuth and stores credentials locally. It supports folder synchronization, recursive operations, and various output formats.

gdrive enables scriptable Google Drive operations for automation.

# CAVEATS

Requires OAuth authentication. API quotas apply. Not for large-scale operations.

# HISTORY

gdrive was created as an unofficial command-line client for Google Drive, filling the gap left by Google's lack of an official Linux client.

# SEE ALSO

[rclone](/man/rclone)(1), [gdown](/man/gdown)(1)
