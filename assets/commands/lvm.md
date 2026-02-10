# TAGLINE

linux Logical Volume Manager, providing flexible disk management through

# TLDR

Start **interactive** shell

```sudo lvm```

Initialize **physical** volume

```sudo lvm pvcreate /dev/sda1```

Display **physical** volumes

```sudo lvm pvdisplay```

Create **volume group**

```sudo lvm vgcreate vg1 /dev/sda1```

Display **volume groups**

```sudo lvm vgdisplay```

Create **logical volume**

```sudo lvm lvcreate -L 10G vg1```

Display **logical volumes**

```sudo lvm lvdisplay```

# SYNOPSIS

**lvm** [_command_ [_OPTIONS_]]

# DESCRIPTION

**lvm** is the Linux Logical Volume Manager, providing flexible disk management through physical volumes (PVs), volume groups (VGs), and logical volumes (LVs). It enables dynamic resizing, snapshots, mirroring, and striping.

# PARAMETERS

**pvcreate**
> Initialize a physical volume

**pvdisplay**
> Display physical volume information

**vgcreate**
> Create a volume group

**vgdisplay**
> Display volume group information

**lvcreate**
> Create a logical volume

**lvdisplay**
> Display logical volume information

**lvextend**
> Extend a logical volume

**lvreduce**
> Reduce a logical volume

**help** _command_
> Display help for a specific command

# CAVEATS

LVM requires physical volumes to be initialized before use. Reducing volumes requires careful handling to avoid data loss. Some operations require the logical volume to be unmounted.

# HISTORY

**LVM2** is the second major version of the Linux Logical Volume Manager, providing enterprise-grade storage management capabilities.

# SEE ALSO

[lvcreate](/man/lvcreate)(8), [lvextend](/man/lvextend)(8), [vgcreate](/man/vgcreate)(8), [pvcreate](/man/pvcreate)(8)
