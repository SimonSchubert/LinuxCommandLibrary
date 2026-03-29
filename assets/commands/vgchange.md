# TAGLINE

Modify LVM volume group attributes

# TLDR

**Activate** all volume groups

```sudo vgchange -a y```

**Deactivate** a specific volume group

```sudo vgchange -a n [volume_group]```

**Refresh** metadata for all active logical volumes in a volume group

```sudo vgchange --refresh [volume_group]```

**Set** the maximum number of logical volumes for a volume group

```sudo vgchange -l [128] [volume_group]```

**Make** a volume group not resizeable

```sudo vgchange -x n [volume_group]```

# SYNOPSIS

**vgchange** [_options_] [_volume_group_...]

# PARAMETERS

**-a, --activate y|n|ay**
> Activate or deactivate logical volumes (y=yes, n=no, ay=autoactivation)

**-x, --resizeable y|n**
> Enable or disable adding/removing physical volumes

**-l, --logicalvolume _Number_**
> Set the maximum number of logical volumes allowed in the volume group

**-p, --maxphysicalvolumes _Number_**
> Set the maximum number of physical volumes in the volume group

**-s, --physicalextentsize _Size_**
> Change the physical extent size on physical volumes

**--refresh**
> Reload metadata for all active logical volumes

**--monitor y|n**
> Start or stop monitoring logical volumes with dmeventd

**--poll y|n**
> Control background transformation of logical volumes

**--sysinit**
> Indicate that the command is being invoked during early system initialization

**-u, --uuid**
> Generate new random UUID for the volume group

**--addtag _tag_**
> Add a tag to the volume group

**--deltag _tag_**
> Delete a tag from the volume group

**-f, --force**
> Override various checks, confirmations, and protections

**--alloc contiguous|cling|normal|anywhere|inherit**
> Set the physical extent allocation policy

# DESCRIPTION

**vgchange** modifies the attributes of LVM volume groups. The most common use is activating or deactivating logical volumes within a volume group, which is necessary before the volumes can be mounted.

Volume group activation makes the logical volumes available to the system. Deactivation is required before physical volumes can be removed or the system can be safely shut down.

# CAVEATS

Requires root privileges. Deactivating a volume group with mounted or active filesystems will fail. Activating with missing physical volumes requires the **--activationmode partial** or **-P** flag. Use **vgscan** to discover volume groups. Part of the LVM2 package.

# SEE ALSO

[lvm](/man/lvm)(8), [vgcreate](/man/vgcreate)(8), [vgdisplay](/man/vgdisplay)(8), [vgscan](/man/vgscan)(8), [vgremove](/man/vgremove)(8), [lvchange](/man/lvchange)(8), [pvchange](/man/pvchange)(8)
