# TAGLINE

provides FUSE access to GVFS mounts

# TLDR

**Start FUSE bridge**

```gvfsd-fuse [/run/user/UID/gvfs]```

**Start with debug**

```gvfsd-fuse -d [mountpoint]```

**Foreground mode**

```gvfsd-fuse -f [mountpoint]```

# SYNOPSIS

**gvfsd-fuse** [_options_] _mountpoint_

# PARAMETERS

_MOUNTPOINT_
> FUSE mount location.

**-d**
> Debug mode.

**-f**
> Run in foreground.

**-o** _OPTIONS_
> FUSE mount options.

**--help**
> Display help information.

# DESCRIPTION

**gvfsd-fuse** provides FUSE access to GVFS mounts. It creates a filesystem view of GVFS-mounted resources, enabling non-GVFS-aware applications to access remote files.

The daemon bridges GVFS backends to the standard filesystem interface. It makes SMB shares, FTP sites, and other mounts visible as regular directories.

# CAVEATS

Usually auto-started. Requires FUSE support. Performance varies by backend.

# HISTORY

gvfsd-fuse was developed as part of **GVFS** to provide filesystem access to GVFS mounts for non-GNOME applications.

# SEE ALSO

[gvfsd](/man/gvfsd)(1), [fusermount](/man/fusermount)(1), [gio](/man/gio)(1)
