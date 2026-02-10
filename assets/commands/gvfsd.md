# TAGLINE

GVFS daemon that handles virtual filesystem operations

# TLDR

**Start GVFS daemon**

```gvfsd```

**Replace existing daemon**

```gvfsd --replace```

**Debug mode**

```gvfsd --debug```

**No fuse support**

```gvfsd --no-fuse```

# SYNOPSIS

**gvfsd** [_options_]

# PARAMETERS

**--replace**
> Replace running daemon.

**--no-fuse**
> Disable FUSE support.

**--debug**
> Enable debug output.

**--help**
> Display help information.

# DESCRIPTION

**gvfsd** is the GVFS daemon that handles virtual filesystem operations. It manages backends for accessing remote filesystems like SMB, FTP, and SSH.

The daemon is started automatically by D-Bus when needed. It coordinates mount operations and file access for GNOME applications.

# CAVEATS

Usually auto-started by D-Bus. Requires proper D-Bus session. GNOME specific.

# HISTORY

gvfsd was developed as part of **GVFS** for the **GNOME** desktop environment to provide virtual filesystem support.

# SEE ALSO

[gvfsd-fuse](/man/gvfsd-fuse)(1), [gio](/man/gio)(1), [dbus-daemon](/man/dbus-daemon)(1)
