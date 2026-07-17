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
> Enable FUSE debug output (implies **-f**).

**-f**
> Run in the foreground.

**-s**
> Run single-threaded.

**-o** _OPTION_
> Pass a FUSE-specific mount option (see FUSE documentation for available settings).

# DESCRIPTION

**gvfsd-fuse** maintains a FUSE mount that exposes GVFS backends (SMB, SFTP, FTP, MTP, and others) to ordinary POSIX applications that know nothing about GVFS. The mount point is given as _PATH_, normally **$XDG_RUNTIME_DIR/gvfs** on modern systems (or the legacy **$HOME/.gvfs**).

Unlike the deprecated gvfs-bin command-line tools (gvfs-ls, gvfs-mount, etc., all replaced by **gio**), gvfsd-fuse remains an active part of the current GVFS architecture: it is what lets non-GNOME-aware programs open files under a GVFS mount as if they were local.

The daemon is normally started automatically by **gvfsd** the first time something is mounted, and does not need to be run manually.

# CAVEATS

Usually auto-started by gvfsd; manual invocation is rarely needed. Requires kernel FUSE support. Performance depends on the underlying GVFS backend.

# HISTORY

**gvfsd-fuse** has been part of **GVFS** since GNOME 2.22 (2008), providing FUSE-based filesystem access to GVFS mounts for applications that don't use the GIO/GVFS API directly.

# SEE ALSO

[gvfsd](/man/gvfsd)(1), [fusermount](/man/fusermount)(1), [gio](/man/gio)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-07-17 -->
