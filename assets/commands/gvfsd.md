# TAGLINE

GVFS daemon that handles virtual filesystem operations

# TLDR

**Start GVFS daemon**

```/usr/libexec/gvfsd```

**Replace existing daemon**

```/usr/libexec/gvfsd --replace```

**Start in a terminal with debug output** from backends

```/usr/libexec/gvfsd --replace --debug```

**Start without the FUSE mount**

```/usr/libexec/gvfsd --no-fuse```

# SYNOPSIS

**gvfsd** [_options_]

# PARAMETERS

**-r**, **--replace**
> Replace the currently running gvfsd instance.

**--no-fuse**
> Do not start the FUSE filesystem. The **GVFS_DISABLE_FUSE** environment variable has the same effect.

**-d**, **--debug**
> Enable debug output.

**-h**, **--help**
> Display help information.

**--version**
> Show version number and exit.

# DESCRIPTION

**gvfsd** is the main daemon for the GVFS virtual filesystem. It provides the `org.gtk.vfs.Daemon` name on the session bus and is autostarted by GIO clients if not already running.

The primary task of gvfsd is to act as a mount tracker/manager. It spawns new backends when requested, keeps track of their lifecycle, maintains a list of active mounts, and creates direct connections to them. GVFS backends run as children of the gvfsd process. It also starts **gvfsd-fuse** and provides it the mount point.

# CAVEATS

Not normally run by hand: it is started automatically on the session bus. It is an internal program usually installed outside **$PATH**, typically under **/usr/libexec** or **/usr/lib/gvfs** depending on the distribution.

# SEE ALSO

[gvfs-open](/man/gvfs-open)(1), [gvfsd-fuse](/man/gvfsd-fuse)(1), [gio](/man/gio)(1), [dbus-daemon](/man/dbus-daemon)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-11-09 -->
