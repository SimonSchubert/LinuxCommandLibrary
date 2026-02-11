# TAGLINE

Remove physical volumes from volume groups

# TLDR

**Remove physical volume from volume group**

```sudo vgreduce [vg_name] [/dev/sdb]```

**Remove all empty physical volumes**

```sudo vgreduce -a [vg_name]```

**Remove missing physical volumes**

```sudo vgreduce --removemissing [vg_name]```

**Force remove missing PVs with partial LVs**

```sudo vgreduce --removemissing --force [vg_name]```

**Test removal without making changes**

```sudo vgreduce -t [vg_name] [/dev/sdb]```

# SYNOPSIS

**vgreduce** [_options_] _volume_group_ [_physical_volume_...]

# PARAMETERS

**-a**, **--all**
> Remove all empty physical volumes.

**--removemissing**
> Remove missing (failed) physical volumes.

**--mirrorsonly**
> Only remove missing PVs from mirror LVs.

**-f**, **--force**
> Force removal, removing partial LVs if needed.

**-t**, **--test**
> Test mode; don't make changes.

**-v**, **--verbose**
> Verbose output.

**-y**, **--yes**
> Answer yes to prompts.

# DESCRIPTION

**vgreduce** removes physical volumes from a volume group, reducing its capacity. The removed physical volumes can then be used in other volume groups or removed from the system entirely.

Before removal, ensure the physical volume contains no data by checking with pvdisplay. If data exists, use pvmove to migrate it to other physical volumes first. After vgreduce, use pvremove to clean LVM metadata from the disk.

The --removemissing option handles failed disks that are no longer present. Combined with --force, it removes any logical volumes that had data on the missing disk.

# CAVEATS

Cannot remove PV with active data without pvmove. Force removal destroys data on affected LVs. Test mode recommended before force operations. Removed PVs need pvremove for reuse.

# HISTORY

**vgreduce** is part of LVM2 (Logical Volume Manager), which evolved from the original LVM in Linux 2.4. LVM2 provides flexible disk management allowing dynamic resizing of storage. The vgreduce command enables non-destructive removal of storage from volume groups.

# SEE ALSO

[vgextend](/man/vgextend)(8), [vgdisplay](/man/vgdisplay)(8), [pvmove](/man/pvmove)(8), [pvremove](/man/pvremove)(8), [lvm](/man/lvm)(8)
