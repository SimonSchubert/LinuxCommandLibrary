# TLDR

**Remove file**

```gvfs-rm [file]```

**Remove remote file**

```gvfs-rm smb://server/share/file.txt```

**Force removal**

```gvfs-rm -f [file]```

# SYNOPSIS

**gvfs-rm** [_options_] _location_

# PARAMETERS

_LOCATION_
> File path or URI to remove.

**-f**, **--force**
> Ignore nonexistent files.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-rm** removes files using GVFS. It can delete local files and files on remote servers accessed through GVFS backends.

The tool handles deletion across different protocols transparently. It works with SMB, FTP, SSH, and other GVFS-supported systems.

gvfs-rm removes files via GVFS backends.

# CAVEATS

Deprecated in favor of gio remove. GNOME dependencies. No recursive directory removal.

# HISTORY

gvfs-rm was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** command.

# SEE ALSO

[gio](/man/gio)(1), [rm](/man/rm)(1), [gvfs-trash](/man/gvfs-trash)(1)
