# TLDR

Tell the kernel about the existence of a **partition**

```addpart [device] [partition] [start] [length]```

# SYNOPSIS

**addpart** _device_ _partition_ _start_ _length_

# DESCRIPTION

**addpart** tells the Linux kernel about the existence of the specified partition. It is a simple wrapper around the "add partition" ioctl. This command informs the kernel of a partition that exists on disk but may not have been detected during boot.

The command does not modify the partition table on disk; it only updates the kernel's in-memory representation.

# PARAMETERS

**device**
> The block device containing the partition (e.g., /dev/sda)

**partition**
> The partition number to add

**start**
> The starting sector of the partition

**length**
> The length of the partition in sectors

# CAVEATS

This command only informs the kernel about partitions; it does not create or modify the actual partition table on disk. Use tools like **fdisk** or **parted** to modify partition tables.

# HISTORY

Part of the **util-linux** package, which provides essential system utilities for Linux.

# SEE ALSO

[delpart](/man/delpart)(8), [partx](/man/partx)(8), [fdisk](/man/fdisk)(8), [parted](/man/parted)(8)
