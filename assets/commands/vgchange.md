# TAGLINE

Modify LVM volume group attributes

# TLDR

**Change** the activation status of all volume groups

```sudo vgchange -a y|n```

**Change** the activation status of a specific volume group

```sudo vgchange -a y|n [volume_group]```

# SYNOPSIS

**vgchange** [_options_] [_volume_group_...]

# PARAMETERS

**-a, --activate y|n|ay**
> Activate or deactivate logical volumes (y=yes, n=no, ay=auto-yes)

**-c, --clustered y|n**
> Change cluster attribute

**-x, --resizeable y|n**
> Change resizeable attribute

**--addtag _tag_**
> Add a tag to the volume group

**--deltag _tag_**
> Delete a tag from the volume group

**--refresh**
> Refresh metadata for active volume group

**-u, --uuid**
> Generate new UUID for the volume group

# DESCRIPTION

**vgchange** modifies the attributes of LVM volume groups. The most common use is activating or deactivating logical volumes within a volume group, which is necessary before the volumes can be mounted.

Volume group activation makes the logical volumes available to the system. Deactivation is required before physical volumes can be removed or the system can be safely shut down.

# CAVEATS

Requires root privileges. Deactivating a volume group with mounted filesystems will fail. Use **vgscan** to discover volume groups. Part of the LVM2 package.

# SEE ALSO

[lvm](/man/lvm)(8), [vgcreate](/man/vgcreate)(8), [vgdisplay](/man/vgdisplay)(8), [vgscan](/man/vgscan)(8)
