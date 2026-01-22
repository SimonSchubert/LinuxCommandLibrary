# TLDR

Create **XFS filesystem** on partition

```sudo mkfs.xfs /dev/sdXY```

Create with **volume label**

```sudo mkfs.xfs -L mylabel /dev/sdXY```

**Force** creation (overwrite existing)

```sudo mkfs.xfs -f /dev/sdXY```

Set **block size**

```sudo mkfs.xfs -b size=4096 /dev/sdXY```

Create with specific **inode size**

```sudo mkfs.xfs -i size=512 /dev/sdXY```

# SYNOPSIS

**mkfs.xfs** [_options_] _device_

# DESCRIPTION

**mkfs.xfs** creates an XFS filesystem on a partition or device. XFS is a high-performance journaling filesystem designed for scalability and parallel I/O operations.

# PARAMETERS

**-L LABEL**
> Set the filesystem label (max 12 characters)

**-f**
> Force overwrite of existing filesystem

**-b size=N**
> Set block size in bytes (512-65536, default usually 4096)

**-i size=N**
> Set inode size in bytes

**-d options**
> Data section options (agcount, file, name, size, etc.)

**-l options**
> Log section options (internal, size, version, etc.)

**-n options**
> Naming options (size, version, etc.)

**-r options**
> Real-time section options

**-q**
> Quiet mode; suppress output

**-N**
> Dry run; print parameters without creating filesystem

# CAVEATS

Creating a filesystem destroys all existing data on the device. The device should not be mounted. XFS cannot be shrunk, only grown.

# HISTORY

**mkfs.xfs** is part of **xfsprogs**, the XFS filesystem utilities. XFS was originally developed by Silicon Graphics for IRIX and was ported to Linux in 2001.

# SEE ALSO

[xfs](/man/xfs)(5), [xfs_admin](/man/xfs_admin)(8), [xfs_repair](/man/xfs_repair)(8), [mkfs](/man/mkfs)(8)
