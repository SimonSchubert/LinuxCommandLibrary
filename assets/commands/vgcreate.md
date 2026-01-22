# TLDR

Create volume group with **single** device

```sudo vgcreate volume_group /dev/sda1```

Create with **multiple** devices

```sudo vgcreate volume_group /dev/sda1 /dev/sdb1```

# SYNOPSIS

**vgcreate** [_OPTIONS_] _VolumeGroupName_ _PhysicalVolume_...

# DESCRIPTION

**vgcreate** creates a new volume group by combining one or more physical volumes. Volume groups are the storage pools from which logical volumes are allocated, providing flexible storage management.

# PARAMETERS

**-s, --physicalextentsize** _size_
> Physical extent size for the volume group

**-p, --maxphysicalvolumes** _count_
> Maximum number of physical volumes

**-l, --maxlogicalvolumes** _count_
> Maximum number of logical volumes

**-A, --autobackup** _y|n_
> Automatically backup metadata

**--clustered** _y|n_
> Create a clustered volume group

# CAVEATS

Physical volumes must be initialized with pvcreate first. Volume group names must be unique on the system. Adding devices to a volume group creates a single storage pool for logical volume creation.

# HISTORY

**vgcreate** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [pvcreate](/man/pvcreate)(8), [lvcreate](/man/lvcreate)(8), [vgextend](/man/vgextend)(8)
