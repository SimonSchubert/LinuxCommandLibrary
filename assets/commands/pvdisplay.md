# TAGLINE

Show LVM physical volume information

# TLDR

Display **all** physical volumes

```sudo pvdisplay```

Display **specific** physical volume

```sudo pvdisplay [/dev/sdXY]```

# SYNOPSIS

**pvdisplay** [**-v**] [**-m**] [**--maps**] [_PhysicalVolume_...]

# PARAMETERS

**-v, --verbose**
> Display more detailed information

**-m, --maps**
> Display mapping of physical extents

**--units _units_**
> Display sizes in specified units

**-C, --columns**
> Output in columns format

**--reportformat _format_**
> Output format (basic, json)

# DESCRIPTION

**pvdisplay** shows detailed information about LVM physical volumes. It reports the physical volume name, volume group membership, size, physical extent size, and allocation status.

The command is part of LVM (Logical Volume Manager) toolset and provides essential information for managing storage on Linux systems using LVM.

# CAVEATS

Requires root privileges. Only shows LVM-initialized devices. Use pvs for scriptable output. Physical volumes must be initialized with pvcreate first.

# HISTORY

**pvdisplay** is part of **LVM2**, the Logical Volume Manager for Linux. LVM provides flexible disk management, allowing dynamic resizing and spanning of storage across multiple devices.

# SEE ALSO

[pvs](/man/pvs)(8), [pvcreate](/man/pvcreate)(8), [vgdisplay](/man/vgdisplay)(8), [lvdisplay](/man/lvdisplay)(8)
