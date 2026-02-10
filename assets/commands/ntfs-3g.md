# TAGLINE

mounts NTFS filesystems with read-write support

# TLDR

**Mount NTFS partition**

```ntfs-3g [/dev/sda1] [/mnt/windows]```

**Mount read-only**

```ntfs-3g -o ro [/dev/sda1] [/mnt/windows]```

**Mount with permissions**

```ntfs-3g -o uid=[1000],gid=[1000] [/dev/sda1] [/mnt]```

**Mount with umask**

```ntfs-3g -o umask=[022] [/dev/sda1] [/mnt]```

**Force mount dirty volume**

```ntfs-3g -o force [/dev/sda1] [/mnt]```

# SYNOPSIS

**ntfs-3g** [_options_] _device_ _mount_point_

# PARAMETERS

_DEVICE_
> NTFS partition device.

_MOUNT_POINT_
> Mount location.

**-o** _OPTIONS_
> Mount options.

**ro**
> Read-only mount.

**force**
> Force mount.

**--help**
> Display help information.

# DESCRIPTION

**ntfs-3g** mounts NTFS filesystems with read-write support. FUSE-based driver.

The tool enables Linux NTFS access. Full read-write capability.

# CAVEATS

FUSE-based. May need unmount before Windows. Requires permissions.

# HISTORY

ntfs-3g was created to provide **full NTFS read-write** support on Linux via FUSE.

# SEE ALSO

[mount](/man/mount)(1), [ntfsfix](/man/ntfsfix)(1), [fusermount](/man/fusermount)(1)

