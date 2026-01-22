# TLDR

**Remove** a volume group with confirmation

```sudo vgremove [volume_group]```

**Forcefully remove** a volume group without confirmation

```sudo vgremove -f [volume_group]```

**Remove** with debug logging

```sudo vgremove -d -d [volume_group]```

**Use** a specific config setting

```sudo vgremove --config 'global/locking_type=1' [volume_group]```

# SYNOPSIS

**vgremove** [_options_] _volume_group_...

# PARAMETERS

**-f, --force**
> Force removal without confirmation

**-d, --debug**
> Enable debug output (repeat for more detail, up to 6 times)

**--config _string_**
> Override configuration settings

**-t, --test**
> Test mode, don't actually make changes

**-v, --verbose**
> Verbose output

**-y, --yes**
> Answer yes to all prompts

# DESCRIPTION

**vgremove** removes one or more LVM volume groups. Before a volume group can be removed, all logical volumes within it must first be removed using **lvremove**.

The command updates the LVM metadata to mark the volume group as removed. The underlying physical volumes remain but are no longer associated with any volume group.

# CAVEATS

Requires root privileges. All logical volumes must be removed first. Cannot remove an active volume group with mounted filesystems. Data on the volume group will be inaccessible after removal. Part of the LVM2 package.

# SEE ALSO

[lvm](/man/lvm)(8), [vgcreate](/man/vgcreate)(8), [lvremove](/man/lvremove)(8), [pvremove](/man/pvremove)(8)
