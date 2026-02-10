# TAGLINE

lists directory contents using GVFS

# TLDR

**List directory**

```gvfs-ls [directory]```

**List remote directory**

```gvfs-ls smb://server/share/```

**Show hidden files**

```gvfs-ls -h [directory]```

**Long listing format**

```gvfs-ls -l [directory]```

**Show specific attributes**

```gvfs-ls -a [standard::name,standard::size] [directory]```

# SYNOPSIS

**gvfs-ls** [_options_] _location_

# PARAMETERS

_LOCATION_
> Directory path or URI.

**-h**, **--hidden**
> Show hidden files.

**-l**, **--long**
> Long listing format.

**-a**, **--attributes** _ATTR_
> Show specific attributes.

**-n**, **--nofollow-symlinks**
> Don't follow symlinks.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-ls** lists directory contents using GVFS. It works with local directories and remote URIs, providing consistent listing across backends.

The tool shows file names and optionally detailed attributes. It supports network protocols like SMB, FTP, SSH, and WebDAV.

# CAVEATS

Deprecated in favor of gio list. GNOME dependencies. Requires running GVFS daemon.

# HISTORY

gvfs-ls was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** command.

# SEE ALSO

[gio](/man/gio)(1), [ls](/man/ls)(1), [gvfs-info](/man/gvfs-info)(1)
