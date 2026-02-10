# TAGLINE

copies files using GVFS

# TLDR

**Copy local file**

```gvfs-copy [source] [destination]```

**Copy from remote**

```gvfs-copy smb://server/share/file.txt [local-file]```

**Copy with progress**

```gvfs-copy -p [source] [destination]```

**Preserve attributes**

```gvfs-copy --preserve [source] [destination]```

# SYNOPSIS

**gvfs-copy** [_options_] _source_ _destination_

# PARAMETERS

_SOURCE_
> Source file or URI.

_DESTINATION_
> Destination file or URI.

**-p**, **--progress**
> Show progress.

**-i**, **--interactive**
> Prompt before overwrite.

**--preserve**
> Preserve attributes.

**-n**, **--no-target-directory**
> Treat destination as file.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-copy** copies files using GVFS (GNOME Virtual File System). It supports local files and remote URIs like SMB, FTP, and SSH.

The tool handles network protocols transparently, copying files across different backends. It integrates with GNOME's file system abstraction.

# CAVEATS

Deprecated in favor of gio copy. GNOME dependencies. Requires running GVFS daemon.

# HISTORY

gvfs-copy was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** command.

# SEE ALSO

[gio](/man/gio)(1), [cp](/man/cp)(1), [gvfs-move](/man/gvfs-move)(1)
