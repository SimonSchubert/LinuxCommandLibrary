# TLDR

**List devices** recorded in the devices file

```sudo lvmdevices```

**Add a device** to the devices file

```sudo lvmdevices --adddev [/dev/sdXN]```

**Remove a device** from the devices file

```sudo lvmdevices --deldev [/dev/sdXN]```

**Add a physical volume** by its PVID

```sudo lvmdevices --addpvid [PVID]```

**Remove a physical volume** by its PVID

```sudo lvmdevices --delpvid [PVID]```

**Update** the devices file after device names change

```sudo lvmdevices --update```

**Check** the devices file for problems

```sudo lvmdevices --check```

Display **version**

```lvmdevices --version```

# SYNOPSIS

**lvmdevices** [_options_]

# PARAMETERS

**--adddev _device_**
> Add a device to the LVM devices file by path

**--deldev _device_**
> Remove a device from the devices file by path

**--addpvid _PVID_**
> Add a physical volume by its unique PVID

**--delpvid _PVID_**
> Remove a physical volume by its PVID

**--update**
> Update the devices file to reflect changed device names

**--check**
> Verify the devices file and report problems

**--version**
> Display version information

# DESCRIPTION

**lvmdevices** manages the LVM devices file that controls which block devices LVM can use as physical volumes. Located at **/etc/lvm/devices/system.devices**, this file restricts LVM to scanning only listed devices, improving performance and preventing accidental use of unintended disks.

When devices are added or removed, or when device names change (e.g., after hardware changes), lvmdevices can update the devices file accordingly. The **--check** option validates that listed devices exist and are accessible.

The devices file uses stable device identifiers (WWID, serial numbers) rather than potentially changing paths like /dev/sdX, ensuring consistent behavior across reboots.

# CAVEATS

Requires root privileges. If the devices file is enabled but a device isn't listed, LVM will ignore that device even if it contains valid PV metadata. Use **--update** after hardware changes to ensure device paths are current.

# SEE ALSO

[lvm](/man/lvm)(8), [lvmconfig](/man/lvmconfig)(8), [pvcreate](/man/pvcreate)(8), [pvs](/man/pvs)(8), [vgchange](/man/vgchange)(8)
