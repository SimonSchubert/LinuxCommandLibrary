# TAGLINE

sets up and controls loop devices, which allow regular files to be

# TLDR

**List** all loop devices

```losetup -a```

**Attach** file to loop device

```sudo losetup /dev/loop0 /path/to/file```

Attach to **free** device with partition scan

```sudo losetup --show -P -f /path/to/file```

Attach **read-only**

```sudo losetup -r /dev/loop0 /path/to/file```

**Detach** all loop devices

```sudo losetup -D```

**Detach** specific loop device

```sudo losetup -d /dev/loop0```

# SYNOPSIS

**losetup** [_OPTIONS_] [_loopdev_] [_file_]

# DESCRIPTION

**losetup** sets up and controls loop devices, which allow regular files to be accessed as block devices. This is commonly used for mounting disk images, ISO files, or encrypted containers.

# PARAMETERS

**-a, --all**
> Show status of all loop devices

**-f, --find**
> Find the first unused loop device

**-P, --partscan**
> Scan the partition table on the device

**-r, --read-only**
> Set up a read-only loop device

**-d, --detach**
> Detach specified loop device

**-D, --detach-all**
> Detach all associated loop devices

**--show**
> Print the loop device name after setup

**-o, --offset** _bytes_
> Start at offset into the file

**--sizelimit** _bytes_
> Limit the size of the loop device

# CAVEATS

Loop devices require root privileges to create and detach. The kernel has a limited number of loop devices available (configurable). Always detach loop devices when finished to free resources.

# HISTORY

**losetup** is part of the **util-linux** package, providing loop device management on Linux systems.

# SEE ALSO

[mount](/man/mount)(8), [cryptsetup](/man/cryptsetup)(8), [dd](/man/dd)(1)
