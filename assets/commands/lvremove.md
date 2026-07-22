# TAGLINE

removes logical volumes from a volume group

# TLDR

Remove **specific** volume

```sudo lvremove volume_group/logical_volume```

Remove **all** volumes in group

```sudo lvremove volume_group```

# SYNOPSIS

**lvremove** [_OPTIONS_] _LogicalVolume_...

# DESCRIPTION

**lvremove** removes logical volumes from a volume group. The logical volume must be closed (unmounted) before removal. This operation permanently destroys all data on the logical volume.

# PARAMETERS

**-f, --force**
> Force removal without confirmation

**-y, --yes**
> Answer yes to all prompts

**--noudevsync**
> Skip udev synchronization

# CAVEATS

All data on the logical volume will be permanently lost. Ensure backups exist before removal. The volume must be unmounted and not in use. Removing a volume does not remove the volume group.

# HISTORY

**lvremove** is part of **LVM2**, the Linux Logical Volume Manager.

# INSTALL

```apt: sudo apt install lvm2```

```dnf: sudo dnf install lvm2```

```pacman: sudo pacman -S lvm2```

```apk: sudo apk add lvm2```

```zypper: sudo zypper install lvm2```

```nix: nix profile install nixpkgs#lvm2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvm](/man/lvm)(8), [lvcreate](/man/lvcreate)(8), [vgremove](/man/vgremove)(8)
