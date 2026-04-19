# TAGLINE

Set up and control loop devices that expose regular files as block devices

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
> Show status of all attached loop devices.

**-f, --find**
> Find the first unused loop device. With no other arguments, print its name; with a backing file, attach the file to it.

**-P, --partscan**
> Force the kernel to scan the partition table on the newly created loop device.

**-r, --read-only**
> Set up a read-only loop device.

**-d, --detach** _loopdev_
> Detach the specified loop device.

**-D, --detach-all**
> Detach all currently attached loop devices.

**-j, --associated** _file_
> Show loop devices associated with _file_.

**--show**
> Print the assigned device name (useful together with **-f**).

**-o, --offset** _bytes_
> Start the loop device at _bytes_ offset into the backing file.

**--sizelimit** _bytes_
> Limit the loop device to _bytes_ starting at offset.

**-b, --sector-size** _bytes_
> Set the logical sector size (512, 1024, 2048, or 4096).

**--direct-io**[=**on**|**off**]
> Enable or disable kernel direct I/O on the backing file.

**-c, --set-capacity** _loopdev_
> Force the kernel to reread the size of the backing file.

**-L, --nooverlap**
> Fail if any existing loop device already covers the same byte range of the backing file.

**-O, --output** _columns_
> Specify which columns to print (use `--list --output list` to see available).

**-l, --list**
> Use a listing format similar to `losetup -a` but with extra columns.

**-J, --json**
> Output as JSON (use with --list).

**--help**
> Display help information.

# CAVEATS

Loop devices require root privileges to create and detach. The kernel has a limited number of loop devices available (configurable). Always detach loop devices when finished to free resources.

# HISTORY

**losetup** is part of the **util-linux** package, providing loop device management on Linux systems.

# SEE ALSO

[mount](/man/mount)(8), [cryptsetup](/man/cryptsetup)(8), [dd](/man/dd)(1)
