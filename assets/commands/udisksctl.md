# TLDR

Show disk **status** overview

```udisksctl status```

Show **detailed info** about a device

```udisksctl info -b /dev/sdX```

**Mount** a device partition

```udisksctl mount -b /dev/sdX1```

**Unmount** a device partition

```udisksctl unmount -b /dev/sdX1```

**Power off** a device safely

```udisksctl power-off -b /dev/sdX```

**Monitor** daemon events

```udisksctl monitor```

**Unlock** an encrypted device

```udisksctl unlock -b /dev/sdX1```

**Lock** an encrypted device

```udisksctl lock -b /dev/sdX1```

# SYNOPSIS

**udisksctl** _COMMAND_ [_OPTIONS_]

# DESCRIPTION

**udisksctl** is a command-line interface for interacting with the udisksd daemon. It allows unprivileged users to query and manipulate storage devices, with authorization managed through polkit. Operations include mounting, unmounting, and powering off devices.

# PARAMETERS

**status**
> Show high-level information about disk drives and block devices

**info**
> Show detailed information about an object, device, or drive

**mount**
> Mount a device; filesystem appears in /run/media hierarchy

**unmount**
> Unmount a mounted device

**unlock**
> Unlock an encrypted device

**lock**
> Lock an unlocked encrypted device

**loop-setup**
> Set up a loop device

**loop-delete**
> Delete a loop device

**power-off**
> Safely power off a drive for removal

**smart-simulate**
> Simulate disk failure scenarios using SMART data

**monitor**
> Monitor the daemon for events

**dump**
> Show current state of the daemon

**-b, --block-device DEVICE**
> Specify block device (e.g., /dev/sda)

**--object-path PATH**
> Specify UDisks object path

**--filesystem-type TYPE**
> Specify filesystem type for mount

**--options OPTIONS**
> Specify mount options

**--force**
> Force unmount (lazy unmount)

# CAVEATS

The command-line interface is not intended for scripts; syntax may change without backward compatibility. No superuser privileges are required as authorization is handled through polkit.

# HISTORY

**udisksctl** is part of **udisks2**, the successor to DeviceKit-disks, providing modern disk management facilities for Linux desktop environments.

# SEE ALSO

[udisksd](/man/udisksd)(8), [mount](/man/mount)(8), [umount](/man/umount)(8), [polkit](/man/polkit)(8)
