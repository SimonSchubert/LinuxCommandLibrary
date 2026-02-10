# TAGLINE

scans all SCSI, IDE, and other disks visible to the system and lists devices

# TLDR

**Scan all devices** that may be used as physical volumes

```lvmdiskscan```

Show only **physical volumes** (PVs)

```lvmdiskscan -l```

Increase **verbosity** (repeat for more detail)

```lvmdiskscan -v```

# SYNOPSIS

**lvmdiskscan** [_options_]

# PARAMETERS

**-l, --lvmpartition**
> Show only partitions that are LVM physical volumes

**-v, --verbose**
> Increase verbosity level; can be repeated for more detail

# DESCRIPTION

**lvmdiskscan** scans all SCSI, IDE, and other disks visible to the system and lists devices that may be used as physical volumes by LVM. It reports each device's size and whether it is already an LVM physical volume.

The output shows partitions and whole disks, indicating which ones contain LVM metadata. This is useful for identifying available storage before creating new physical volumes.

# CAVEATS

This command is **deprecated**; use **pvs** for listing physical volumes and standard tools like **lsblk** for device enumeration. The scan can be slow on systems with many devices. Requires root privileges for complete device information.

# SEE ALSO

[pvs](/man/pvs)(8), [pvscan](/man/pvscan)(8), [lsblk](/man/lsblk)(8), [lvm](/man/lvm)(8)
