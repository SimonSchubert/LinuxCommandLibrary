# TLDR

**List** SCSI devices

```lsscsi```

Show **detailed** attributes

```lsscsi -L```

Show **disk capacity**

```lsscsi -s```

# SYNOPSIS

**lsscsi** [_OPTIONS_]

# DESCRIPTION

**lsscsi** lists SCSI devices (including SATA disks through libata) and their attributes. It provides information about device type, vendor, model, and device node paths.

# PARAMETERS

**-L, --list**
> List attributes in key=value format

**-s, --size**
> Show disk capacity in human-readable format

**-g, --generic**
> Show generic SCSI device name (sg*)

**-H, --hosts**
> List SCSI hosts instead of devices

**-l, --long**
> Output additional information

**-c, --classic**
> Classic output format (similar to lsscsi 0.21)

**-d, --device**
> Show device major and minor numbers

**-t, --transport**
> Show transport information

# CAVEATS

Shows devices through the Linux SCSI subsystem, which includes SATA, SAS, USB mass storage, and other devices. Some virtual or emulated devices may not appear.

# HISTORY

**lsscsi** provides a human-readable view of the kernel's SCSI device information from sysfs.

# SEE ALSO

[lsblk](/man/lsblk)(8), [lspci](/man/lspci)(8), [lsusb](/man/lsusb)(8)
