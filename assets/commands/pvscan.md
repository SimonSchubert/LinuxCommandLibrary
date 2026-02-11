# TAGLINE

Scan and discover LVM physical volumes

# TLDR

**List** all physical volumes

```sudo pvscan```

Show **volume group** using a PV

```sudo pvscan --cache --listvg [/dev/sdX]```

Show **logical volumes** using a PV

```sudo pvscan --cache --listlvs [/dev/sdX]```

Output in **JSON** format

```sudo pvscan --reportformat json```

# SYNOPSIS

**pvscan** [**--cache**] [**--listvg**] [**--listlvs**] [**--reportformat** _format_] [_device_...]

# PARAMETERS

**--cache**
> Update LVM metadata cache

**--listvg**
> List volume group of specified device

**--listlvs**
> List logical volumes on specified device

**--reportformat _format_**
> Output format (basic, json)

**-v, --verbose**
> Verbose output

# DESCRIPTION

**pvscan** scans for LVM physical volumes and lists them. It can update the LVM metadata cache and report which volume groups and logical volumes are present on specific devices.

The command is useful for discovering physical volumes after adding new disks and for troubleshooting LVM configuration issues.

# CAVEATS

Requires root privileges. Results depend on device availability. Cache updates may be needed after hardware changes. Use with --cache for udev integration.

# HISTORY

**pvscan** is part of **LVM2** (Logical Volume Manager). It provides physical volume discovery functionality essential for dynamic LVM management.

# SEE ALSO

[pvs](/man/pvs)(8), [pvdisplay](/man/pvdisplay)(8), [vgscan](/man/vgscan)(8), [lvscan](/man/lvscan)(8)
