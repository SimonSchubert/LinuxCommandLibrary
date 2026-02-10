# TAGLINE

increases the size of a logical volume in LVM

# TLDR

Extend to **absolute** size

```sudo lvextend -L 120G logical_volume```

Extend by **relative** size

```sudo lvextend -L +40G -r logical_volume```

Use **all free** space

```sudo lvextend -l +100%FREE logical_volume```

Extend and **resize filesystem**

```sudo lvextend -l +100%FREE -r logical_volume```

# SYNOPSIS

**lvextend** [_OPTIONS_] _LogicalVolume_

# DESCRIPTION

**lvextend** increases the size of a logical volume in LVM. It can extend by an absolute size, relative size, or percentage of available space. The underlying filesystem can be resized automatically.

# PARAMETERS

**-L, --size** _size_
> Specify new absolute size or relative increase (+size)

**-l, --extents** _extents_
> Specify size in extents or percentage (%VG, %FREE, %PVS)

**-r, --resizefs**
> Automatically resize the underlying filesystem

**-n, --nofsck**
> Skip filesystem check before resize

**--use-policies**
> Use thin pool autoextend policies

# CAVEATS

Ensure sufficient free space in the volume group. The filesystem resize with -r only works for ext2/3/4 and XFS. For other filesystems, manual resize is required after extending. XFS can only grow, not shrink.

# HISTORY

**lvextend** is part of **LVM2**, the Linux Logical Volume Manager, providing dynamic storage management.

# SEE ALSO

[lvm](/man/lvm)(8), [lvresize](/man/lvresize)(8), [lvreduce](/man/lvreduce)(8), [lvcreate](/man/lvcreate)(8)
