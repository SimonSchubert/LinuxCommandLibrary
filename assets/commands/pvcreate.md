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
> Override various checks, confirmations, and protections. Use twice (`-ff`) to forcibly overwrite an existing physical volume.

**-y, --yes**
> Answer yes to all prompts automatically.

**-Z, --zero** _y|n_
> Controls if the first 4 sectors (2048 bytes) of the device are wiped. Default is yes unless `--restorefile` or `--uuid` are specified.

**--metadatasize** _size_
> Approximate amount of space to set aside for each metadata area on the PV.

**--metadatacopies** _0|1|2_
> Number of metadata area copies on this PV. 0 stores no copies, 1 stores at the front only, 2 stores copies at both front and end.

**--metadataignore** _y|n_
> Whether to ignore metadata areas on this PV. Useful when creating a large number of PVs to limit the number of metadata copies.

**--dataalignment** _size_
> Align the start of the data area to a multiple of this size.

**--dataalignmentoffset** _size_
> Shift the start of the data area by this additional offset.

**-u, --uuid** _uuid_
> Specify a UUID for the physical volume. Without this option, a random UUID is generated. Required when restoring metadata with vgcfgrestore.

**--restorefile** _file_
> Use metadata from a backup file to ensure consistent PV placement when restoring a volume group.

**--bootloaderareasize** _size_
> Reserve space for a bootloader between the LVM metadata and the first physical extent.

**--labelsector** _number_
> Sector number where the LVM2 label is written (default 1).

**--setphysicalvolumesize** _size_
> Override the automatically detected device size.

**-v, --verbose**
> Set verbose level. Can be repeated up to 4 times to increase detail.

# CAVEATS

All existing data on the device will be destroyed. The device should not be mounted or in use. Physical volumes must be created before being added to volume groups. Using `-ff` will override the check for existing filesystem signatures.

# HISTORY

**pvcreate** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [vgcreate](/man/vgcreate)(8), [pvdisplay](/man/pvdisplay)(8), [pvremove](/man/pvremove)(8), [pvs](/man/pvs)(8), [pvscan](/man/pvscan)(8), [lvcreate](/man/lvcreate)(8)
