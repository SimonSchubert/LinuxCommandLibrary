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

**-h**, **--help**
> Display help information.

**--version**
> Show version number and exit.

# DESCRIPTION

**gvfsd** is the main daemon for the GVFS virtual filesystem. It provides the `org.gtk.vfs.Daemon` name on the session bus and is autostarted by GIO clients if not already running.

The primary task of gvfsd is to act as a mount tracker/manager. It spawns new backends when requested, keeps track of their lifecycle, maintains a list of active mounts, and creates direct connections to them. GVFS backends run as children of the gvfsd process.

# CAVEATS

Usually auto-started by D-Bus. Requires proper D-Bus session. GNOME specific.

# HISTORY

gvfsd was developed as part of **GVFS** for the **GNOME** desktop environment to provide virtual filesystem support.

# SEE ALSO

[gvfs-open](/man/gvfs-open)(1), [gvfsd-fuse](/man/gvfsd-fuse)(1), [gio](/man/gio)(1), [dbus-daemon](/man/dbus-daemon)(1)
