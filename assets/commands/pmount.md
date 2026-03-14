# TAGLINE

Mount removable devices as regular user

# TLDR

**Mount** device to /media/

```pmount [/dev/sdb1]```

Mount with specific **filesystem** and label

```pmount -t [ext4] [/dev/sdb1] [mylabel]```

Mount **CD-ROM** read-only

```pmount -t iso9660 -r [/dev/cdrom]```

Mount **NTFS** with read-write

```pmount -t ntfs -w [/dev/sdX]```

Display **mounted** removable devices

```pmount```

# SYNOPSIS

**pmount** [**-t** _type_] [**-r**|**-w**] _device_ [_label_]

# PARAMETERS

**-t, --type _fstype_**
> Filesystem type

**-r, --read-only**
> Mount read-only

**-w, --read-write**
> Force read-write mount

**-s, --sync**
> Mount with sync option (no write caching)

**-A, --noatime**
> Mount with noatime option

**-u, --umask _mask_**
> Set umask for mount

**-e, --exec**
> Allow execution of binaries (default: noexec)

**-c, --charset _charset_**
> Set I/O character set (default: utf8 in UTF-8 locale)

**-d, --debug**
> Enable verbose debug messages

**label**
> Mount point name under /media/

# DESCRIPTION

**pmount** allows regular users to mount removable devices without root privileges. It mounts to /media/ with the device name or specified label as mount point. Default mount flags are: async,atime,nodev,noexec,noauto,nosuid,user,rw.

The tool enforces security restrictions: only devices in /media can be mounted, and dangerous options like suid are disabled. It's designed for desktop environments lacking automatic mounting.

# CAVEATS

Only works with removable devices. Mount point created automatically under /media/. Use pumount to unmount. Requires pmount package and appropriate permissions.

# HISTORY

**pmount** was created to provide secure user mounting before udisks and modern desktop automounters. It remains useful for minimal systems or when automatic mounting is undesired.

# SEE ALSO

[pumount](/man/pumount)(1), [mount](/man/mount)(8), [udisksctl](/man/udisksctl)(1)
