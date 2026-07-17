# TAGLINE

mounts virtual filesystems through GVFS

# TLDR

**Mount remote location**

```gvfs-mount [smb://server/share]```

**Mount SSH location**

```gvfs-mount [sftp://user@host]```

**List mounted locations**

```gvfs-mount -l```

**Unmount location**

```gvfs-mount -u [smb://server/share]```

**Eject media**

```gvfs-mount -e [/dev/sr0]```

# SYNOPSIS

**gvfs-mount** [_options_] [_location_...]

**gvfs-mount** **--list** [_options_]

**gvfs-mount** **--unmount-scheme**=_SCHEME_

# PARAMETERS

_LOCATION_
> File or directory path or URI to mount.

**-m**, **--mountable**
> Mount the specified location as a mountable, rather than the default mount operation.

**-d**, **--device** _DEVICE_
> Mount the volume with the given device file.

**-u**, **--unmount**
> Unmount the given locations.

**-e**, **--eject**
> Eject the given locations.

**-s**, **--unmount-scheme** _SCHEME_
> Unmount all mounts with the given scheme (e.g. smb, sftp).

**-l**, **--list**
> List all known mounts.

**-o**, **--monitor**
> Monitor mount and unmount events.

**-i**, **--detail**
> Show extra information for **--list** and **--monitor**.

**-h**, **--help**
> Print a short help text and exit.

# DESCRIPTION

**gvfs-mount** mounts virtual filesystems through GVFS (GNOME Virtual File System). It supports various protocols including SMB/CIFS, SFTP, FTP, WebDAV, and MTP.

GVFS provides a userspace filesystem layer, allowing file managers and applications to access remote resources transparently.

# SUPPORTED SCHEMES

```
smb://    SMB/CIFS network shares
sftp://   SSH file transfer
ftp://    FTP servers
dav://    WebDAV servers
mtp://    MTP devices (phones)
gphoto2:// PTP cameras
```

# CAVEATS

Part of the gvfs-bin command-line tools, deprecated in gvfs 1.31 (2016) and removed entirely in gvfs 1.38 (2018) in favor of the unified **gio** command (`gio mount`). Modern distributions no longer ship gvfs-mount. Requires a running GVFS daemon; mount points appear under /run/user/$UID/gvfs/.

# HISTORY

**gvfs-mount** was part of GVFS's original gvfs-bin utilities, introduced for GNOME alongside GVFS in **2008** (GNOME 2.22). It has since been superseded by **gio mount**.

# SEE ALSO

[gio](/man/gio)(1), [mount](/man/mount)(8), [smbclient](/man/smbclient)(1), [fusermount](/man/fusermount)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-07-17 -->
