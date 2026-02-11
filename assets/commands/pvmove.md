# TAGLINE

Migrate LVM data between physical volumes

# TLDR

**Move data between physical volumes**

```pvmove [/dev/sda1] [/dev/sdb1]```

**Move all data from PV**

```pvmove [/dev/sda1]```

**Show progress**

```pvmove -v [/dev/sda1]```

**Abort move**

```pvmove --abort```

# SYNOPSIS

**pvmove** [_options_] _source_ [_dest_]

# PARAMETERS

_SOURCE_
> Source physical volume.

_DEST_
> Destination physical volume.

**-v**
> Verbose output.

**--abort**
> Abort in-progress move.

**-b**
> Background mode.

**-n** _LV_
> Move only this LV.

# DESCRIPTION

**pvmove** migrates data between LVM physical volumes while the logical volumes remain online and accessible. This enables live storage migration, allowing administrators to replace disks, rebalance storage, or evacuate a physical volume before removing it from a volume group.

When called with a source and destination physical volume, pvmove relocates all physical extents from the source to the destination. If no destination is specified, LVM automatically distributes the data across available physical volumes in the same volume group. The **-n** flag restricts the move to a specific logical volume. Operations can be run in the background with **-b** and aborted with **--abort** if needed.

# CAVEATS

Requires LVM. Can be slow for large volumes. Interruptible.

# HISTORY

pvmove is part of **LVM2** for physical volume data migration.

# SEE ALSO

[lvm](/man/lvm)(8), [pvcreate](/man/pvcreate)(8), [vgreduce](/man/vgreduce)(8)

