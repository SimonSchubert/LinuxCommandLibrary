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
> Follow symbolic links.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-tree** displays directory contents in tree format using GVFS. It shows hierarchical structure of local and remote directories.

The tool visualizes directory trees across GVFS backends, providing a unified view of local and networked filesystems.

gvfs-tree shows directory trees via GVFS.

# CAVEATS

Deprecated in favor of gio tree. GNOME dependencies. Large trees may be slow.

# HISTORY

gvfs-tree was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** command.

# SEE ALSO

[gio](/man/gio)(1), [tree](/man/tree)(1), [gvfs-ls](/man/gvfs-ls)(1)
