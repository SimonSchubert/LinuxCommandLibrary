# TLDR

**Show file information**

```gvfs-info [file]```

**Show remote file info**

```gvfs-info smb://server/share/file```

**Show specific attribute**

```gvfs-info -a [standard::size] [file]```

**Show filesystem info**

```gvfs-info -f [file]```

# SYNOPSIS

**gvfs-info** [_options_] _location_

# PARAMETERS

_LOCATION_
> File path or URI.

**-a**, **--attributes** _ATTR_
> Show specific attributes.

**-f**, **--filesystem**
> Show filesystem info.

**-n**, **--nofollow-symlinks**
> Don't follow symlinks.

**-w**, **--query-writable**
> Show writable attributes.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-info** displays file information using GVFS. It shows attributes like size, type, permissions, and custom metadata for local and remote files.

The tool accesses files through GVFS backends, providing unified information across different protocols like SMB, FTP, and local filesystems.

gvfs-info shows file attributes via GVFS.

# CAVEATS

Deprecated in favor of gio info. GNOME dependencies. Requires running GVFS daemon.

# HISTORY

gvfs-info was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** command.

# SEE ALSO

[gio](/man/gio)(1), [stat](/man/stat)(1), [file](/man/file)(1)
