# TLDR

**Add** single device

```sudo vgextend vg1 /dev/sda1```

Add **multiple** devices

```sudo vgextend vg1 /dev/sda1 /dev/sdb1```

# SYNOPSIS

**vgextend** [_OPTIONS_] _VolumeGroupName_ _PhysicalVolume_...

# DESCRIPTION

**vgextend** adds one or more physical volumes to an existing volume group. This increases the total space available for creating or extending logical volumes within the group.

# PARAMETERS

**-f, --force**
> Force extension without confirmation

**-y, --yes**
> Answer yes to all prompts

**-A, --autobackup** _y|n_
> Automatically backup metadata after changes

**--restoremissing**
> Restore physical volumes that were removed

# CAVEATS

Physical volumes must be initialized with pvcreate first. A physical volume can only belong to one volume group at a time. Adding a device does not automatically redistribute existing data.

# HISTORY

**vgextend** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [vgcreate](/man/vgcreate)(8), [vgreduce](/man/vgreduce)(8), [pvcreate](/man/pvcreate)(8)
