# TAGLINE

Add physical volumes to volume groups

# TLDR

**Add** single device

```sudo vgextend vg1 /dev/sda1```

Add **multiple** devices

```sudo vgextend vg1 /dev/sda1 /dev/sdb1```

# SYNOPSIS

**vgextend** [_OPTIONS_] _VolumeGroupName_ _PhysicalVolume_...

# DESCRIPTION

**vgextend** adds one or more physical volumes to an existing volume group. This increases the total space available for creating or extending logical volumes within the group.

# PARAMETERS

**-f, --force**
> Force extension without confirmation

**-y, --yes**
> Answer yes to all prompts

**-A, --autobackup** _y|n_
> Automatically backup metadata after changes

**--restoremissing**
> Restore physical volumes that were removed

# CAVEATS

Physical volumes must be initialized with pvcreate first. A physical volume can only belong to one volume group at a time. Adding a device does not automatically redistribute existing data.

# HISTORY

**vgextend** is part of **LVM2**, the Linux Logical Volume Manager.

# INSTALL

```apt: sudo apt install lvm2```

```dnf: sudo dnf install lvm2```

```pacman: sudo pacman -S lvm2```

```apk: sudo apk add lvm2```

```zypper: sudo zypper install lvm2```

```nix: nix profile install nixpkgs#lvm2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvm](/man/lvm)(8), [vgcreate](/man/vgcreate)(8), [vgreduce](/man/vgreduce)(8), [pvcreate](/man/pvcreate)(8)
