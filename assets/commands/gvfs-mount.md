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

**gvfs-mount** [_options_] [_location_]

# PARAMETERS

**-l**, **--list**
> List mounted locations.

**-u**, **--unmount** _location_
> Unmount location.

**-e**, **--eject** _location_
> Eject media.

**-d**, **--device** _device_
> Mount device by path.

**-s**, **--unmount-scheme** _scheme_
> Unmount all of scheme type.

**-a**, **--anonymous**
> Use anonymous authentication.

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

Deprecated in favor of gio mount. Requires GVFS daemon. Mount points in /run/user/$UID/gvfs/. Desktop environment integration recommended.

# HISTORY

gvfs-mount was part of GVFS, developed for GNOME to provide virtual filesystem access. The gvfs-* commands have been replaced by the unified **gio** command in modern GNOME.

# SEE ALSO

[gio](/man/gio)(1), [mount](/man/mount)(8), [smbclient](/man/smbclient)(1), [fusermount](/man/fusermount)(1)
