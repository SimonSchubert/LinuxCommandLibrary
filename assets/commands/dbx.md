# TAGLINE

command-line interface for Dropbox cloud storage

# TLDR

**Authenticate with Dropbox**

```dbx auth login```

**List files** in Dropbox folder

```dbx ls [/path/to/folder]```

**Upload a file** to Dropbox

```dbx put [local_file.txt] [/remote/path/file.txt]```

**Download a file** from Dropbox

```dbx get [/remote/path/file.txt] [local_file.txt]```

**Create a shared link**

```dbx share [/path/to/file]```

**Show account information**

```dbx account info```

# SYNOPSIS

**dbx** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation to perform: auth, ls, get, put, share, etc.

**auth login**
> Authenticate with Dropbox account.

**ls** _PATH_
> List directory contents.

**get** _REMOTE_ _LOCAL_
> Download file from Dropbox.

**put** _LOCAL_ _REMOTE_
> Upload file to Dropbox.

**share** _PATH_
> Create shared link for file.

**account info**
> Display account details.

**--help**
> Display help information.

# DESCRIPTION

**dbx** is a command-line interface for Dropbox, allowing file operations without the graphical client. It provides functionality for uploading, downloading, listing, and sharing files stored in Dropbox cloud storage.

The tool requires OAuth authentication which is handled through the auth command. Once authenticated, it maintains credentials for subsequent operations. It supports both personal and business Dropbox accounts.

dbx is useful for scripting backup operations, automating file transfers, and accessing Dropbox on headless servers or systems without a graphical environment.

# CAVEATS

Requires network connectivity to Dropbox servers. Large file transfers may timeout. API rate limits apply to frequent operations. OAuth tokens may need periodic refresh.

# HISTORY

dbx is a community-developed command-line tool for Dropbox, separate from the official Dropbox CLI. Various implementations exist with similar functionality, providing command-line access to Dropbox's API for users who prefer terminal workflows.

# SEE ALSO

[rclone](/man/rclone)(1), [curl](/man/curl)(1), [rsync](/man/rsync)(1)
