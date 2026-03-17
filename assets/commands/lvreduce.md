# TAGLINE

Reduce the size of a logical volume

# TLDR

Reduce volume to **specific size**

```sudo lvreduce -L 120G [logical_volume]```

Reduce by **amount** with filesystem resize

```sudo lvreduce -L -40G --resizefs [logical_volume]```

Reduce by a number of **logical extents**

```sudo lvreduce -l -3 [vg00/lvol1]```

**Test** a reduction without applying changes

```sudo lvreduce -t -L -10G [logical_volume]```

# SYNOPSIS

**lvreduce** [_options_] {**-L**|**-l**} [**-**]_size_ _lv_

# DESCRIPTION

**lvreduce** reduces the size of a logical volume. The freed logical extents are returned to the volume group to be used by other logical volumes. This is a destructive operation -- data in the reduced area is lost.

You should ensure that any filesystem on the volume is resized before running **lvreduce** so that the extents to be removed are not in use, unless using the **--resizefs** option.

# PARAMETERS

**-L**, **--size** _SIZE_[**k**|**m**|**g**|**t**]
> New absolute size, or with a leading minus sign, the amount to subtract from the current size. Accepts size suffixes: k (KiB), m (MiB), g (GiB), t (TiB).

**-l**, **--extents** [**-**]_Number_[**%**{**VG**|**FREE**|**PVS**|**ORIGIN**}]
> New size in logical extents, or relative reduction with minus prefix. Supports percentage suffixes: %VG (of VG size), %FREE (of VG free space), %PVS (of specified PVs).

**-r**, **--resizefs**
> Resize the underlying filesystem together with the logical volume using **fsadm**(8).

**-f**, **--force**
> Force size reduction without prompting, even when it may cause data loss.

**-n**, **--nofsck**
> Skip the filesystem check before resizing.

**-y**, **--yes**
> Do not prompt for confirmation; always assume yes.

**-t**, **--test**
> Run in test mode; commands will not update metadata.

**-A**, **--autobackup** {**y**|**n**}
> Automatically back up metadata after a change.

# CAVEATS

**Data loss risk**: Always back up before reducing. The filesystem must be reduced first unless using **--resizefs**. Shrinking is not supported on XFS or GFS2 filesystems. Only ext2/ext3/ext4 can be reduced with **--resizefs**.

# SEE ALSO

[lvextend](/man/lvextend)(8), [lvresize](/man/lvresize)(8), [lvcreate](/man/lvcreate)(8), [lvm](/man/lvm)(8), [resize2fs](/man/resize2fs)(8)
