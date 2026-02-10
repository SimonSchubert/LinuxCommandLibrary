# TAGLINE

creates device mapper entries for the partitions within a disk image or block

# TLDR

**Add** partition mappings and print them

```kpartx -av [whole_disk.img]```

**Delete** partition mappings

```kpartx -d [whole_disk.img]```

**List** partition mappings

```kpartx -l [whole_disk.img]```

# SYNOPSIS

**kpartx** [_options_] _device_

# PARAMETERS

**-a**
> Add partition mappings

**-d**
> Delete partition mappings

**-l**
> List partition mappings without adding them

**-v**
> Verbose output

**-s**
> Sync mode (wait for udev to update)

**-f**
> Force creation of mappings

# DESCRIPTION

**kpartx** creates device mapper entries for the partitions within a disk image or block device. This allows individual partitions to be accessed as separate block devices, enabling mounting and manipulation.

When adding mappings, kpartx creates entries like /dev/mapper/loop0p1, /dev/mapper/loop0p2, etc., corresponding to each partition found in the image.

# CAVEATS

Requires root privileges. Device mapper and loop device support must be enabled in the kernel. Mappings should be removed before detaching loop devices.

# HISTORY

kpartx is part of the multipath-tools package. It was developed to simplify working with partitioned disk images, particularly useful for virtual machine images and system administration tasks.

# SEE ALSO

[losetup](/man/losetup)(8), [dmsetup](/man/dmsetup)(8), [mount](/man/mount)(8)
