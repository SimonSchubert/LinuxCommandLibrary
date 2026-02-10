# TAGLINE

displays information about logical volumes in a configurable table format

# TLDR

**List** logical volumes

```sudo lvs```

List **all** volumes

```sudo lvs -a```

**Verbose** output

```sudo lvs -v```

Show **specific** fields

```sudo lvs -o lv_name,vg_name,lv_size```

**Append** field

```sudo lvs -o +field_name```

**No headings**

```sudo lvs --noheadings```

Use **separator**

```sudo lvs --separator =```

# SYNOPSIS

**lvs** [_OPTIONS_] [_VolumeGroupName_|_LogicalVolume_...]

# DESCRIPTION

**lvs** displays information about logical volumes in a configurable table format. It provides quick overview of LV names, sizes, attributes, and related volume groups.

# PARAMETERS

**-a, --all**
> Show all logical volumes including internal ones

**-v, --verbose**
> Increase verbosity and show additional details

**-o, --options** _fields_
> Specify which fields to display

**--noheadings**
> Suppress the heading line in output

**--separator** _char_
> Use specified character as field separator

**--units** _units_
> Display sizes in specified units (b, k, m, g, t)

# CAVEATS

Some fields require verbose mode to display. Default output is designed for human readability; use --separator and --noheadings for scripting.

# HISTORY

**lvs** is part of **LVM2**, the Linux Logical Volume Manager, providing quick volume listing functionality.

# SEE ALSO

[lvm](/man/lvm)(8), [lvdisplay](/man/lvdisplay)(8), [pvs](/man/pvs)(8), [vgs](/man/vgs)(8)
