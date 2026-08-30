# TAGLINE

manages the LVM devices file that controls which block devices LVM can

# TLDR

Show which devices LVM is currently **allowed to use**

```sudo lvmdevices```

**Authorize** a disk so LVM will scan it

```sudo lvmdevices --adddev [/dev/sdb1]```

**Revoke** a disk

```sudo lvmdevices --deldev [/dev/sdb1]```

Record a physical volume by its **PVID**, which survives renaming

```sudo lvmdevices --addpvid [PVID]```

Drop a physical volume by PVID

```sudo lvmdevices --delpvid [PVID]```

**Repair** stale entries after disks were renamed or replaced

```sudo lvmdevices --update```

Prune entries whose devices are **no longer present**

```sudo lvmdevices --update --delnotfound```

**Report** inconsistencies without changing anything

```sudo lvmdevices --check```

Work on a **named devices file** instead of the default

```sudo lvmdevices --devicesfile [vg_backup] --check```

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

# INSTALL

```dnf: sudo dnf install lvm2```

```pacman: sudo pacman -S lvm2```

```apk: sudo apk add lvm2```

```zypper: sudo zypper install lvm2```

```nix: nix profile install nixpkgs#lvm2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvm](/man/lvm)(8), [lvmconfig](/man/lvmconfig)(8), [pvcreate](/man/pvcreate)(8), [pvs](/man/pvs)(8), [vgchange](/man/vgchange)(8)
