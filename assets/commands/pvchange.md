# TLDR

**Allow** allocation on physical volume

```sudo pvchange -x y /dev/sdXN```

**Disallow** allocation on physical volume

```sudo pvchange -x n /dev/sdXN```

**Ignore** metadata areas

```sudo pvchange --metadataignore y /dev/sdXN```

**Stop ignoring** metadata areas

```sudo pvchange --metadataignore n /dev/sdXN```

**Add tag** to physical volume

```sudo pvchange --addtag mytag /dev/sdXN```

Generate **new UUID**

```sudo pvchange --uuid /dev/sdXN```

Change **all** visible physical volumes

```sudo pvchange -a -x y```

# SYNOPSIS

**pvchange** [_options_] _PhysicalVolume_...

# DESCRIPTION

**pvchange** changes the attributes of a physical volume in LVM. It can control allocation, metadata handling, tagging, and UUID generation for physical volumes.

# PARAMETERS

**-x, --allocatable {y|n}**
> Allow or disallow allocation of physical extents on this volume

**--metadataignore {y|n}**
> Ignore or use metadata areas on this physical volume

**--addtag TAG**
> Add a tag to the physical volume

**--deltag TAG**
> Remove a tag from the physical volume

**--uuid**
> Generate a new UUID for the physical volume

**-a, --all**
> Change all visible physical volumes

**-f, --force**
> Force operation

**-v, --verbose**
> Verbose mode

# CAVEATS

Use --uuid with caution as it can cause problems if the volume group is active or if backups refer to the old UUID. Disabling allocation on a PV prevents new extents from being placed on it.

# HISTORY

**pvchange** is part of **LVM2** (Logical Volume Manager), providing flexible disk management and storage virtualization for Linux systems.

# SEE ALSO

[pvs](/man/pvs)(8), [pvdisplay](/man/pvdisplay)(8), [pvcreate](/man/pvcreate)(8), [vgchange](/man/vgchange)(8)
