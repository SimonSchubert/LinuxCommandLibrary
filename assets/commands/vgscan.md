# TLDR

**Scan** for volume groups

```sudo vgscan```

Scan and create **device nodes**

```sudo vgscan --mknodes```

**Verbose** scan

```sudo vgscan -v```

# SYNOPSIS

**vgscan** [_options_]

# DESCRIPTION

**vgscan** scans all supported LVM block devices in the system for volume groups. It builds the LVM cache file that holds current information about volume groups on the system.

# PARAMETERS

**--mknodes**
> Create special device files in /dev needed to access logical volumes

**-v, --verbose**
> Verbose mode; display progress information

**--cache**
> Scan only devices in the LVM cache file

**--ignorelockingfailure**
> Continue even if locking fails

**--partial**
> Allow operations on volume groups with missing physical volumes

# CAVEATS

vgscan is typically run automatically during system boot. Manually running vgscan is rarely necessary on modern systems as LVM automatically detects changes. Use vgchange -a y to activate volume groups after scanning.

# HISTORY

**vgscan** is part of **LVM2** (Logical Volume Manager), providing dynamic disk management capabilities for Linux systems.

# SEE ALSO

[vgdisplay](/man/vgdisplay)(8), [vgchange](/man/vgchange)(8), [pvscan](/man/pvscan)(8), [lvscan](/man/lvscan)(8)
