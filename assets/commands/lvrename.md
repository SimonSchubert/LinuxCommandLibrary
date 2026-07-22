# TAGLINE

renames a logical volume within its volume group

# TLDR

Rename using **full paths**

```sudo lvrename /dev/vg_name/old_lv /dev/vg_name/new_lv```

Rename using **VG and names**

```sudo lvrename [vg_name] [old_lv] [new_lv]```

Rename with **auto-confirm**

```sudo lvrename --yes /dev/vg_name/old_lv /dev/vg_name/new_lv```

# SYNOPSIS

**lvrename** [_options_] _vg_/_old_lv_ _new_lv_

# DESCRIPTION

**lvrename** renames a logical volume within its volume group. The volume can be active during the rename operation.

# PARAMETERS

**-y, --yes**
> Answer yes to all prompts

**-A, --autobackup y|n**
> Automatically back up metadata after the change (default y).

**--noudevsync**
> Disable udev synchronisation

**-t, --test**
> Test mode (don't apply changes)

**-v, --verbose**
> Verbose output

# CAVEATS

Update /etc/fstab and any scripts referencing the old LV name. Active filesystems may need remounting after rename.

# INSTALL

```apt: sudo apt install lvm2```

```dnf: sudo dnf install lvm2```

```pacman: sudo pacman -S lvm2```

```apk: sudo apk add lvm2```

```zypper: sudo zypper install lvm2```

```nix: nix profile install nixpkgs#lvm2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvcreate](/man/lvcreate)(8), [lvremove](/man/lvremove)(8), [lvm](/man/lvm)(8)
