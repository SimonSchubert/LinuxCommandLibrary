# TLDR

Remove **specific** volume

```sudo lvremove volume_group/logical_volume```

Remove **all** volumes in group

```sudo lvremove volume_group```

# SYNOPSIS

**lvremove** [_OPTIONS_] _LogicalVolume_...

# DESCRIPTION

**lvremove** removes logical volumes from a volume group. The logical volume must be closed (unmounted) before removal. This operation permanently destroys all data on the logical volume.

# PARAMETERS

**-f, --force**
> Force removal without confirmation

**-y, --yes**
> Answer yes to all prompts

**--noudevsync**
> Skip udev synchronization

# CAVEATS

All data on the logical volume will be permanently lost. Ensure backups exist before removal. The volume must be unmounted and not in use. Removing a volume does not remove the volume group.

# HISTORY

**lvremove** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [lvcreate](/man/lvcreate)(8), [vgremove](/man/vgremove)(8)
