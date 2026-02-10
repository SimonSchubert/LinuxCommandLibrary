# TAGLINE

shows detailed information about LVM logical volumes including size

# TLDR

Display **all** logical volumes

```sudo lvdisplay```

Display in **short format**

```sudo lvdisplay --columns```

Display volumes in **specific VG**

```sudo lvdisplay [vg_name]```

Display **specific LV**

```sudo lvdisplay [vg_name]/[lv_name]```

# SYNOPSIS

**lvdisplay** [_options_] [_vg_/_lv_...]

# DESCRIPTION

**lvdisplay** shows detailed information about LVM logical volumes including size, segments, status, and attributes. For a compact listing, use lvs instead.

# PARAMETERS

**-C, --columns**
> Display in short columnar format (like lvs)

**-v, --verbose**
> Verbose output

**-a, --all**
> Show internal logical volumes

**--maps**
> Display segment mapping information

**--colon**
> Colon-separated output (deprecated)

# OUTPUT FIELDS

**LV Path**: Device path
**LV Name**: Logical volume name
**VG Name**: Volume group name
**LV Size**: Volume size
**LV Status**: available/unavailable

# SEE ALSO

[lvs](/man/lvs)(8), [lvm](/man/lvm)(8), [vgdisplay](/man/vgdisplay)(8), [pvdisplay](/man/pvdisplay)(8)
