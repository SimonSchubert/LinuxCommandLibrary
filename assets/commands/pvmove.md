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

**pvmove** moves data between LVM physical volumes. Online data migration.

The tool relocates extents. Part of LVM2.

pvmove migrates LVM data.

# CAVEATS

Requires LVM. Can be slow for large volumes. Interruptible.

# HISTORY

pvmove is part of **LVM2** for physical volume data migration.

# SEE ALSO

[lvm](/man/lvm)(8), [pvcreate](/man/pvcreate)(8), [vgreduce](/man/vgreduce)(8)

