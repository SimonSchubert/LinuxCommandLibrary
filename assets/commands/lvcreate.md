# TAGLINE

creates a logical volume in an existing volume group

# TLDR

Create **10 GB** volume

```sudo lvcreate -L 10G vg1```

Create **named** volume

```sudo lvcreate -L 1500M -n mylv vg1```

Use **60%** of volume group

```sudo lvcreate -l 60%VG -n mylv vg1```

Use **all free** space

```sudo lvcreate -l 100%FREE -n mylv vg1```

# SYNOPSIS

**lvcreate** [_OPTIONS_] _VolumeGroup_

# DESCRIPTION

**lvcreate** creates a logical volume in an existing volume group. Logical volumes are virtual block devices that can span multiple physical volumes and support features like snapshots, striping, and mirroring.

# PARAMETERS

**-L, --size** _size_
> Specify size (e.g., 10G, 1500M)

**-l, --extents** _extents_
> Specify size in extents or percentage (%VG, %FREE, %PVS)

**-n, --name** _name_
> Name for the logical volume

**-s, --snapshot**
> Create a snapshot volume

**-T, --thin**
> Create a thin pool or thin volume

**--thinpool** _pool_
> Specify thin pool for thin volume

**-m, --mirrors** _count_
> Create a mirrored volume

**-i, --stripes** _count_
> Number of stripes for striped volume

# CAVEATS

The volume group must have sufficient free space. Logical volume names must be unique within a volume group. After creation, a filesystem must be created on the LV before mounting.

# HISTORY

**lvcreate** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [lvextend](/man/lvextend)(8), [lvremove](/man/lvremove)(8), [vgcreate](/man/vgcreate)(8)
