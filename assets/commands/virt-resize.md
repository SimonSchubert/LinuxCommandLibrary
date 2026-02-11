# TAGLINE

Resize VM disk partitions

# TLDR

**Resize and expand partition to fill space**

```virt-resize --expand [/dev/sda2] [olddisk.qcow2] [newdisk.qcow2]```

**Expand partition and LVM logical volume**

```virt-resize --expand [/dev/sda2] --LV-expand [/dev/vg/lv_root] [old.qcow2] [new.qcow2]```

**Shrink a partition**

```virt-resize --shrink [/dev/sda1] [olddisk.qcow2] [newdisk.qcow2]```

**Resize with verbose output**

```virt-resize -v --expand [/dev/sda2] [old.qcow2] [new.qcow2]```

**Resize specific partition to exact size**

```virt-resize --resize [/dev/sda1=20G] [old.qcow2] [new.qcow2]```

# SYNOPSIS

**virt-resize** [_options_] _indisk_ _outdisk_

# PARAMETERS

**--expand** _partition_
> Expand partition to fill available space.

**--shrink** _partition_
> Shrink partition to make space.

**--resize** _part=size_
> Resize partition to exact size.

**--LV-expand** _logvol_
> Expand LVM logical volume inside PV.

**--no-expand-content**
> Don't expand filesystem, only partition.

**--ntfsresize-force**
> Force NTFS resize (for Windows guests).

**-v**, **--verbose**
> Verbose output.

**-d**, **--debug**
> Debug output.

**--machine-readable**
> Output for scripts.

# DESCRIPTION

**virt-resize** copies a virtual machine disk image, resizing partitions and filesystems in the process. Unlike qemu-img resize which only changes the container size, virt-resize modifies partition tables and can resize filesystems.

The tool cannot resize in place; it requires a separate output disk. First create the new disk with qemu-img create at the desired size, then run virt-resize to copy and resize content.

Supported filesystems for expansion include ext2/3/4, XFS, Btrfs, and NTFS. LVM physical volumes can be expanded, and specific logical volumes can be grown with --LV-expand.

# CAVEATS

Cannot resize in place; needs separate output disk. VM must be shut down. Shrinking can cause data loss if partition is too full. Backup before resizing. Part of libguestfs.

# HISTORY

**virt-resize** is part of libguestfs, a library and tools for accessing and modifying virtual machine disk images. Libguestfs was created by Red Hat to provide powerful offline VM disk manipulation without requiring the VM to be running.

# SEE ALSO

[qemu-img](/man/qemu-img)(1), [virt-sparsify](/man/virt-sparsify)(1), [virt-filesystems](/man/virt-filesystems)(1), [guestfish](/man/guestfish)(1)
