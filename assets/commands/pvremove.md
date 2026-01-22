# TLDR

**Remove** LVM label from physical volume

```sudo pvremove [/dev/sdXY]```

Remove with **verbose** output

```sudo pvremove -v [/dev/sdXY]```

Remove **without confirmation**

```sudo pvremove -y [/dev/sdXY]```

**Force** removal

```sudo pvremove -f [/dev/sdXY]```

Output in **JSON** format

```sudo pvremove --reportformat json [/dev/sdXY]```

# SYNOPSIS

**pvremove** [**-v**] [**-y**] [**-f**] [**--reportformat** _format_] _PhysicalVolume_...

# PARAMETERS

**-v, --verbose**
> Display detailed output during operation

**-y, --yes**
> Answer yes to all prompts

**-f, --force**
> Force removal even with warnings

**--reportformat _format_**
> Output format (basic, json)

# DESCRIPTION

**pvremove** removes LVM labels from physical volumes, essentially uninitializing them from LVM. After removal, the device is no longer recognized as an LVM physical volume.

The device must not be part of a volume group when removed. Use vgreduce to remove a physical volume from its volume group first.

# CAVEATS

Requires root privileges. Device must not be in a volume group. Data on the physical volume is not erased, only LVM metadata. Force flag can cause data loss if misused.

# HISTORY

**pvremove** is part of **LVM2** (Logical Volume Manager). It complements pvcreate by providing a way to decommission physical volumes from LVM management.

# SEE ALSO

[pvcreate](/man/pvcreate)(8), [vgreduce](/man/vgreduce)(8), [pvdisplay](/man/pvdisplay)(8)
