# TLDR

**Mount** SMB shares at a mountpoint

```smbnetfs [mountpoint]```

Mount with **debug** output

```smbnetfs -d [mountpoint]```

Mount in **foreground**

```smbnetfs -f [mountpoint]```

**Unmount**

```fusermount -u [mountpoint]```

# SYNOPSIS

**smbnetfs** [_OPTIONS_] _mountpoint_

# PARAMETERS

**-f**
> Run in foreground (do not daemonize)

**-d**
> Enable debug output (implies -f)

**-o** _options_
> Mount options (FUSE options)

**-h**
> Display help

**-V**
> Display version

# DESCRIPTION

**smbnetfs** is a FUSE filesystem that provides Windows Network Neighborhood-like functionality on Linux and FreeBSD. It mounts SMB/CIFS shares interactively, allowing browsing and accessing network resources through the filesystem hierarchy.

Once mounted, navigating to the mountpoint reveals available workgroups, servers, and shares as directories. Authentication is handled automatically or through configuration files. The filesystem integrates with standard file operations, making network shares accessible to any application.

# CONFIGURATION

Configuration is stored in **~/.smb/smbnetfs.conf** and can include:

- Default credentials for shares
- Workgroup settings
- Server-specific authentication
- Mount options

Credentials can also be stored in **~/.smb/smbnetfs.auth** for automatic authentication to specific servers or shares.

# CAVEATS

Requires FUSE support in the kernel. Performance may be slower than direct mount.cifs mounts. Authentication credentials in config files should have restricted permissions. Some SMB features may not be fully supported through the FUSE layer.

# HISTORY

**smbnetfs** was created as an open-source project to provide easy network browsing similar to Windows. It is built on FUSE (Filesystem in Userspace) and libsmbclient from Samba. The project has been actively developed since the mid-**2000s** and is released under GPL-2.0.

# SEE ALSO

[smbclient](/man/smbclient)(1), [mount.cifs](/man/mount.cifs)(8), [fusermount](/man/fusermount)(1), [gvfs-mount](/man/gvfs-mount)(1)
