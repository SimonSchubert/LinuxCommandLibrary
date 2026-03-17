# TAGLINE

Scan for LVM volume groups

# TLDR

**Scan for all volume groups**

```sudo vgscan```

**Scan and recreate missing device nodes**

```sudo vgscan --mknodes```

**Scan with verbose output**

```sudo vgscan -v```

**Scan in test mode without updating metadata**

```sudo vgscan -t```

# SYNOPSIS

**vgscan** [_options_]

# DESCRIPTION

**vgscan** scans all supported LVM block devices in the system for volume groups. It builds the LVM cache file that holds current information about volume groups on the system.

On modern LVM2 systems, volume group scans happen automatically when changes are made. Manual use of vgscan is mainly needed after hardware changes or to rebuild the cache.

# PARAMETERS

**--mknodes**
> Check and recreate LVM special device files in /dev. Creates missing nodes and removes unused ones.

**-v**, **--verbose**
> Verbose mode. Repeat up to 4 times to increase detail.

**--notifydbus**
> Send a notification to D-Bus after the scan completes.

**--reportformat** _basic|json_
> Override the output format for reports.

**--ignorelockingfailure**
> Continue with read-only metadata operations after locking failures.

**-t**, **--test**
> Run in test mode without updating metadata.

**-d**, **--debug**
> Set debug level. Repeat up to 6 times to increase detail.

**-q**, **--quiet**
> Suppress output and log messages.

# CAVEATS

vgscan is typically run automatically during system boot. Manually running vgscan is rarely necessary on modern systems as LVM automatically detects changes. Use **vgchange -a y** to activate volume groups after scanning. Requires root privileges.

# HISTORY

**vgscan** is part of **LVM2** (Logical Volume Manager), which evolved from the original LVM implementation. LVM2 was developed by **Red Hat** and uses the device-mapper kernel framework for dynamic disk management on Linux.

# SEE ALSO

[vgdisplay](/man/vgdisplay)(8), [vgchange](/man/vgchange)(8), [vgcreate](/man/vgcreate)(8), [pvscan](/man/pvscan)(8), [lvscan](/man/lvscan)(8), [lvm](/man/lvm)(8)
