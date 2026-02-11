# TAGLINE

Initialize disks for LVM use

# TLDR

**Initialize** physical volume

```sudo pvcreate /dev/sda1```

**Force** creation

```sudo pvcreate -f /dev/sda1```

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
> Specify UUID for the physical volume

# CAVEATS

All existing data on the device will be overwritten. The device should not be mounted or in use. Physical volumes must be created before being added to volume groups.

# HISTORY

**pvcreate** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [vgcreate](/man/vgcreate)(8), [pvdisplay](/man/pvdisplay)(8), [pvremove](/man/pvremove)(8)
