# TLDR

Show all **mounted filesystems**

```mount```

**Mount** a device to a directory

```mount [path/to/device] [path/to/target_directory]```

Mount a device for a **specific user**

```mount -o uid=[user_id],gid=[group_id] [device] [directory]```

Mount a **CD-ROM** as read-only

```mount -t iso9660 -o ro /dev/cdrom /cdrom```

Mount all filesystems defined in **/etc/fstab**

```mount -a```

**Bind mount** a directory to another location

```mount --bind [old_directory] [new_directory]```

Create directory if needed and **mount**

```mount -m [device] [directory]```

# SYNOPSIS

**mount** [_-t type_] [_-o options_] [_device_] [_directory_]

# DESCRIPTION

**mount** attaches a filesystem found on a device to the directory tree. Without arguments, it displays currently mounted filesystems. The filesystem type can be auto-detected in most cases.

# PARAMETERS

**-t, --types type**
> Specify filesystem type (ext4, ntfs, iso9660, vfat, etc.)

**-o, --options options**
> Mount options (ro, rw, noexec, nosuid, uid, gid, etc.)

**-a, --all**
> Mount all filesystems in /etc/fstab

**-B, --bind**
> Bind mount (mount directory to another location)

**-m, --mkdir**
> Create mount point directory if it doesn't exist

**-r, --read-only**
> Mount read-only (equivalent to -o ro)

**-w, --rw**
> Mount read-write (default)

**-v, --verbose**
> Verbose mode

**-n**
> Mount without writing to /etc/mtab

**-L label**
> Mount partition by label

**-U uuid**
> Mount partition by UUID

# COMMON OPTIONS

**ro**: read-only
**rw**: read-write
**noexec**: don't allow execution
**nosuid**: ignore setuid bits
**noatime**: don't update access times
**uid/gid**: set owner user/group

# CAVEATS

Most mount operations require root privileges. Use /etc/fstab for persistent mounts across reboots.

# HISTORY

Part of **util-linux** package. The mount command has been part of Unix since early versions, dating back to **1971**.

# SEE ALSO

[umount](/man/umount)(8), [fstab](/man/fstab)(5), [findmnt](/man/findmnt)(8), [lsblk](/man/lsblk)(8)
