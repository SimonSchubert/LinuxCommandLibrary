# TAGLINE

displays directory contents in tree format using GVFS

# TLDR

**Show directory tree**

```gvfs-tree [directory]```

**Show remote tree**

```gvfs-tree smb://server/share/```

**Show hidden files**

```gvfs-tree -h [directory]```

**Follow symlinks**

```gvfs-tree -l [directory]```

# SYNOPSIS

**gvfs-tree** [_options_] _location_

# PARAMETERS

_LOCATION_
> Directory path or URI.

**-h**, **--hidden**
> Show hidden files.

**-l**, **--follow-symlinks**
> Follow symbolic links, mounts and shortcuts.

**-?**, **--help**
> Print a short help text and exit.

# DESCRIPTION

**gvfs-tree** displays directory contents in tree format using GVFS. It shows hierarchical structure of local and remote directories.

The tool visualizes directory trees across GVFS backends, providing a unified view of local and networked filesystems.

# CAVEATS

Part of the gvfs-bin command-line tools, deprecated in gvfs 1.31 (2016) and removed entirely in gvfs 1.38 (2018) in favor of the unified **gio** command (`gio tree`). Modern distributions no longer ship gvfs-tree. Large or deeply nested remote trees may be slow to enumerate.

# HISTORY

**gvfs-tree** was part of GVFS's original gvfs-bin utilities, introduced for GNOME alongside GVFS in **2008** (GNOME 2.22). It has since been superseded by **gio tree**.

# SEE ALSO

[gio](/man/gio)(1), [tree](/man/tree)(1), [gvfs-ls](/man/gvfs-ls)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-07-17 -->
