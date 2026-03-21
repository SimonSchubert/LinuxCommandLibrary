# TAGLINE

Copy files using the GVFS virtual file system (deprecated)

# TLDR

**Copy a local file**

```gvfs-copy [source] [destination]```

**Copy a file from a remote SMB share**

```gvfs-copy smb://server/share/file.txt [local-file]```

**Copy a file from an FTP server**

```gvfs-copy ftp://server/path/file.txt [local-file]```

**Copy with progress indicator**

```gvfs-copy -p [source] [destination]```

**Prompt before overwriting an existing file**

```gvfs-copy -i [source] [destination]```

**Copy while preserving file attributes**

```gvfs-copy --preserve [source] [destination]```

# SYNOPSIS

**gvfs-copy** [_options_] _source_ _destination_

# PARAMETERS

_SOURCE_
> Source file path or URI.

_DESTINATION_
> Destination file path or URI.

**-p**, **--progress**
> Show a progress indicator during the copy operation.

**-i**, **--interactive**
> Prompt before overwriting an existing destination file.

**--preserve**
> Preserve file attributes such as timestamps and permissions.

**-b**, **--backup**
> Create a backup of the destination file if it already exists.

**--no-dereference**
> Do not follow symbolic links; copy the link itself.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-copy** copies files using GVFS (GNOME Virtual File System). It supports local files and remote URIs including SMB, FTP, SFTP, DAV, and other protocols supported by GVFS backends.

The tool handles network protocols transparently, copying files across different backends. It integrates with GNOME's file system abstraction layer.

This command is deprecated and has been replaced by **gio copy**, which provides the same functionality.

# CAVEATS

Deprecated in favor of **gio copy**. Requires GNOME/GVFS libraries and a running GVFS daemon.

# HISTORY

gvfs-copy was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** command introduced in GLib 2.36.

# SEE ALSO

[gio](/man/gio)(1), [cp](/man/cp)(1), [gvfs-move](/man/gvfs-move)(1), [gvfs-ls](/man/gvfs-ls)(1), [rsync](/man/rsync)(1)
