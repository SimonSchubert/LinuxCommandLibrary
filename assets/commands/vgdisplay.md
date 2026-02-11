# TAGLINE

Display LVM volume group information

# TLDR

**Display** information about all volume groups

```sudo vgdisplay```

**Display** information about a specific volume group

```sudo vgdisplay [vg1]```

# SYNOPSIS

**vgdisplay** [_options_] [_volume_group_...]

# PARAMETERS

**-c, --colon**
> Output in colon-separated format

**-s, --short**
> Short listing format

**-v, --verbose**
> Verbose output with additional details

**-A, --activevolumegroups**
> Show only active volume groups

**--units _units_**
> Display sizes in specified units (b, s, k, m, g, t, p, e)

**-C, --columns**
> Output in columns (similar to vgs)

# DESCRIPTION

**vgdisplay** shows detailed information about LVM volume groups including size, extent information, physical volumes, and logical volumes contained within.

The output includes total size, physical extent size, number of physical and logical volumes, and allocation status. Use this to understand the structure and capacity of your LVM configuration.

# CAVEATS

Requires root privileges. For scripting, consider using **vgs** with format options instead. Part of the LVM2 package.

# SEE ALSO

[lvm](/man/lvm)(8), [vgs](/man/vgs)(8), [vgchange](/man/vgchange)(8), [lvdisplay](/man/lvdisplay)(8), [pvdisplay](/man/pvdisplay)(8)
