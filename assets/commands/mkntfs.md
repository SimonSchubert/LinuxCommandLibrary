# TAGLINE

creates NTFS filesystems

# TLDR

**Create NTFS filesystem**

```mkntfs [/dev/sdb1]```

**Quick format**

```mkntfs -f [/dev/sdb1]```

**Set volume label**

```mkntfs -L "[Label]" [/dev/sdb1]```

**Verbose output**

```mkntfs -v [/dev/sdb1]```

**Force creation**

```mkntfs -F [/dev/sdb1]```

**Set cluster size**

```mkntfs -c [4096] [/dev/sdb1]```

# SYNOPSIS

**mkntfs** [_options_] _device_

# PARAMETERS

_DEVICE_
> Block device to format.

**-f**
> Quick format.

**-L** _LABEL_
> Volume label.

**-v**
> Verbose output.

**-F**
> Force creation.

**-c** _SIZE_
> Cluster size.

**--help**
> Display help information.

# DESCRIPTION

**mkntfs** creates NTFS filesystems. NTFS is Windows' native filesystem.

The tool is part of ntfs-3g/ntfsprogs. Creates compatible NTFS volumes.

# CAVEATS

Destroys existing data. Part of ntfs-3g. Windows compatibility.

# HISTORY

mkntfs is part of **ntfs-3g** project, providing NTFS filesystem creation on Linux.

# SEE ALSO

[mkfs.ntfs](/man/mkfs.ntfs)(8), [ntfs-3g](/man/ntfs-3g)(8), [ntfsfix](/man/ntfsfix)(8)

