# TAGLINE

Create transient mount units

# TLDR

**Mount** a device automatically at /run/media/system/LABEL

```systemd-mount [path/to/device]```

**Mount** a device at a specific location

```systemd-mount [path/to/device] [path/to/mount_point]```

**List** all known block devices with mountable filesystems

```systemd-mount --list```

**Create** an automount point

```systemd-mount --automount yes [path/to/device]```

**Unmount** one or more devices

```systemd-mount -u [path/to/mount_point]```

**Mount** with a specific filesystem type

```systemd-mount -t [filesystem_type] [path/to/device] [path/to/mount_point]```

**Mount** with additional options

```systemd-mount -o [mount_options] [path/to/device] [path/to/mount_point]```

# SYNOPSIS

**systemd-mount** [_options_] _what_ [_where_]

# PARAMETERS

**--list**
> List known block devices with mountable filesystems

**--automount _bool_**
> Create an automount point

**-u, --umount**
> Unmount the specified mount point or device

**-t, --type _fstype_**
> Specify filesystem type

**-o, --options _opts_**
> Mount options

**--owner _user_**
> Set the owner of the mount point

**-A, --automount**
> Create automount unit

**--discover**
> Use automatic device discovery

# DESCRIPTION

**systemd-mount** creates and destroys transient mount or automount points using systemd's mount handling. It creates temporary mount units that are automatically cleaned up when unmounted.

The tool integrates with systemd's device and mount management, supporting features like automount (on-demand mounting) and proper tracking of mount states through systemd units.

# CAVEATS

Mount points created are transient and don't persist across reboots. For persistent mounts, use fstab or create proper systemd mount units. Part of the systemd suite.

# SEE ALSO

[mount](/man/mount)(8), [systemd.mount](/man/systemd.mount)(5), [udisksctl](/man/udisksctl)(1)
