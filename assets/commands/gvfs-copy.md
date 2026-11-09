# TAGLINE

Copy files using the GVFS virtual file system (removed, use gio copy)

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

**Modern equivalent**

```gio copy [source] [destination]```

# SYNOPSIS

**gvfs-copy** [_options_] _source_... _destination_

# PARAMETERS

_SOURCE_
> Source file path or URI.

_DESTINATION_
> Destination file path or URI.

**-T**, **--no-target-directory**
> Do not copy into the destination even if it is a directory.

**-p**, **--progress**
> Show a progress indicator during the copy operation.

**-i**, **--interactive**
> Prompt before overwriting an existing destination file.

**--preserve**
> Preserve all attributes of copied files.

**-b**, **--backup**
> Create a backup of the destination file if it already exists.

**-P**, **--no-dereference**
> Never follow symbolic links.

**--version**
> Show program version.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-copy** copied files using GVFS (GNOME Virtual File System). It supports local files and remote URIs including SMB, FTP, SFTP, DAV, and other protocols supported by GVFS backends.

The same options exist on its replacement, **gio copy**, which also adds **--default-permissions**.

# CAVEATS

No longer shipped: removed from GVFS in version **1.37.2**. Use **gio copy** on current systems. Only old installations still have this command.

# HISTORY

gvfs-copy was part of the **GVFS** utilities. They were deprecated in GVFS **1.31.1** (2016) in favor of the **gio** tool added in GLib **2.50**, and removed in GVFS **1.37.2**.

# SEE ALSO

[gio](/man/gio)(1), [cp](/man/cp)(1), [gvfs-move](/man/gvfs-move)(1), [gvfs-ls](/man/gvfs-ls)(1), [rsync](/man/rsync)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-11-09 -->
