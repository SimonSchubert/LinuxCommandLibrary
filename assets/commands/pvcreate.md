# TAGLINE

Initialize disks for LVM use

# TLDR

**Initialize** a partition as a physical volume

```sudo pvcreate /dev/[sda1]```

**Initialize multiple** devices at once

```sudo pvcreate /dev/[sdb1] /dev/[sdc1]```

**Force** creation without confirmation prompts

```sudo pvcreate -ff /dev/[sda1]```

**Initialize with a specific** metadata size

```sudo pvcreate --metadatasize [512k] /dev/[sda1]```

# SYNOPSIS

**pvcreate** [_OPTIONS_] _PhysicalVolume_...

# DESCRIPTION

**pvcreate** initializes a disk or partition for use as a physical volume in LVM. This writes LVM metadata to the device, preparing it to be added to a volume group.

# PARAMETERS

**-f, --force**
> Force creation without confirmation prompts

**-y, --yes**
> Answer yes to all prompts

**-Z, --zero** _y|n_
> Zero the first 4 sectors of the device

**--metadatasize** _size_
> Size of metadata area

**--dataalignment** _size_
> Align data to a multiple of this size

**-u, --uuid** _uuid_
> Specify UUID for the physical volume. Required when restoring a backup with vgcfgrestore.

**--pvmetadatacopies** _0|1|2_
> Number of metadata areas on this PV (0, 1, or 2).

**--dataalignmentoffset** _size_
> Shift the start of the data area by this offset.

**--bootloaderareasize** _size_
> Reserve space for a bootloader between the LVM metadata and data area.

**--labelsector** _number_
> Sector number where the LVM label is written (default 1).

**--setphysicalvolumesize** _size_
> Override the detected device size.

# CAVEATS

All existing data on the device will be overwritten. The device should not be mounted or in use. Physical volumes must be created before being added to volume groups.

# HISTORY

**pvcreate** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [vgcreate](/man/vgcreate)(8), [pvdisplay](/man/pvdisplay)(8), [pvremove](/man/pvremove)(8), [pvs](/man/pvs)(8), [pvscan](/man/pvscan)(8), [lvcreate](/man/lvcreate)(8)
