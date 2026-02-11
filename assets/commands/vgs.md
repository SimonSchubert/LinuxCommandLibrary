# TAGLINE

Report LVM volume group information

# TLDR

**List** volume groups

```sudo vgs```

List **all** groups

```sudo vgs -a```

**Verbose** output

```sudo vgs -v```

Show **specific** fields

```sudo vgs -o vg_name,vg_size,vg_free```

**Append** field

```sudo vgs -o +field_name```

**No headings**

```sudo vgs --noheadings```

Use **separator**

```sudo vgs --separator =```

# SYNOPSIS

**vgs** [_OPTIONS_] [_VolumeGroupName_...]

# DESCRIPTION

**vgs** displays information about volume groups in a configurable table format. It shows group names, physical volumes count, logical volumes count, sizes, and free space.

# PARAMETERS

**-a, --all**
> Show all volume groups including incomplete ones

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

Incomplete volume groups (missing physical volumes) are hidden by default; use -a to show them. Default output is human-readable; use formatting options for scripting.

# HISTORY

**vgs** is part of **LVM2**, the Linux Logical Volume Manager.

# SEE ALSO

[lvm](/man/lvm)(8), [vgdisplay](/man/vgdisplay)(8), [pvs](/man/pvs)(8), [lvs](/man/lvs)(8)
