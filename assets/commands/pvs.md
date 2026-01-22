# TLDR

**List** physical volumes

```sudo pvs```

List **all** including non-PVs

```sudo pvs -a```

**Verbose** output

```sudo pvs -v```

Show **specific** fields

```sudo pvs -o pv_name,vg_name,pv_size```

**Append** field

```sudo pvs -o +field_name```

**No headings**

```sudo pvs --noheadings```

Use **separator**

```sudo pvs --separator =```

# SYNOPSIS

**pvs** [_OPTIONS_] [_PhysicalVolume_...]

# DESCRIPTION

**pvs** displays information about physical volumes in a configurable table format. It shows device names, volume groups, sizes, and free space for each physical volume.

# PARAMETERS

**-a, --all**
> Show devices that are not physical volumes

**-v, --verbose**
> Increase verbosity and show additional details

**-o, --options** _fields_
> Specify which fields to display

**--noheadings**
> Suppress the heading line in output

**--separator** _char_
> Use specified character as field separator

**--units** _units_
> Display sizes in specified units

# CAVEATS

Physical volumes that are not part of a volume group will show empty VG field. Use -a to see devices that could become physical volumes.

# HISTORY

**pvs** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [pvdisplay](/man/pvdisplay)(8), [lvs](/man/lvs)(8), [vgs](/man/vgs)(8)
