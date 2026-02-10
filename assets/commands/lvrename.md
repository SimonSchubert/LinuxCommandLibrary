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
> Auto backup metadata

**-t, --test**
> Test mode (don't apply changes)

**-v, --verbose**
> Verbose output

# CAVEATS

Update /etc/fstab and any scripts referencing the old LV name. Active filesystems may need remounting after rename.

# SEE ALSO

[lvcreate](/man/lvcreate)(8), [lvremove](/man/lvremove)(8), [lvm](/man/lvm)(8)
