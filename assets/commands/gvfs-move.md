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
> Prompt before overwriting files.

**-b**, **--backup**
> Backup existing destination files.

**-T**, **--no-target-directory**
> Don't move into destination even if it is a directory.

**-h**, **--help**
> Print a short help text and exit.

# DESCRIPTION

**gvfs-move** moves files using GVFS. It supports local files and remote URIs, handling moves across different backends transparently.

The tool provides atomic moves within the same filesystem and copy-then-delete for cross-filesystem moves. It integrates with GNOME's VFS.

# CAVEATS

Part of the gvfs-bin command-line tools, deprecated in gvfs 1.31 (2016) and removed entirely in gvfs 1.38 (2018) in favor of the unified **gio** command (`gio move`). Modern distributions no longer ship gvfs-move. Cross-filesystem moves require enough free space at the destination since they fall back to copy-then-delete.

# HISTORY

**gvfs-move** was part of GVFS's original gvfs-bin utilities, introduced for GNOME alongside GVFS in **2008** (GNOME 2.22). It has since been superseded by **gio move**.

# SEE ALSO

[gio](/man/gio)(1), [mv](/man/mv)(1), [gvfs-copy](/man/gvfs-copy)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-07-17 -->
