# TAGLINE

moves files using GVFS

# TLDR

**Move local file**

```gvfs-move [source] [destination]```

**Move to remote**

```gvfs-move [local-file] smb://server/share/```

**Move with progress**

```gvfs-move -p [source] [destination]```

**Interactive mode**

```gvfs-move -i [source] [destination]```

# SYNOPSIS

**gvfs-move** [_options_] _source_ _destination_

# PARAMETERS

_SOURCE_
> Source file or URI.

_DESTINATION_
> Destination file or URI.

**-p**, **--progress**
> Show progress.

**-i**, **--interactive**
> Prompt before overwrite.

**-n**, **--no-target-directory**
> Treat destination as file.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-move** moves files using GVFS. It supports local files and remote URIs, handling moves across different backends transparently.

The tool provides atomic moves within the same filesystem and copy-then-delete for cross-filesystem moves. It integrates with GNOME's VFS.

# CAVEATS

Deprecated in favor of gio move. GNOME dependencies. Cross-filesystem moves require space.

# HISTORY

gvfs-move was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** command.

# SEE ALSO

[gio](/man/gio)(1), [mv](/man/mv)(1), [gvfs-copy](/man/gvfs-copy)(1)
