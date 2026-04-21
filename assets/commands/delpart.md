# TAGLINE

ask kernel to forget about a partition

# TLDR

**Forget partition 1 of /dev/sda**

```sudo delpart [/dev/sda] [1]```

**Forget an NVMe partition**

```sudo delpart [/dev/nvme0n1] [3]```

**Show help**

```delpart --help```

# SYNOPSIS

**delpart** _device_ _partition_

# DESCRIPTION

**delpart** asks the Linux kernel to forget about the specified partition (by number) on the given block device. It is a thin wrapper around the `BLKPG_DEL_PARTITION` ioctl and updates only the kernel's in-memory view — the on-disk partition table is not touched.

Typical use is after manually editing a partition table with **fdisk** or **parted** while other partitions on the same disk remain busy: **delpart** removes the kernel node for a single partition so it can be recreated with **addpart**, avoiding a full re-read of the table (as **partprobe** or `blockdev --rereadpt` would attempt).

# PARAMETERS

_device_
> The block device containing the partition (e.g., /dev/sda, /dev/nvme0n1).

_partition_
> The partition number to remove from the kernel's view.

**-h**, **--help**
> Display help and exit.

**-V**, **--version**
> Display version information and exit.

# CAVEATS

Requires root privileges. The partition must not be in use — unmount filesystems and stop any swap, LVM, or RAID components on it first, or the ioctl will fail with **EBUSY**. Only the kernel's view is updated; on reboot the kernel re-reads the on-disk table, so the partition will reappear unless the table was also edited. Part of the util-linux package.

# HISTORY

**delpart** ships as part of **util-linux**, which is maintained by Karel Zak and distributed via the Linux Kernel Archive. It complements **addpart** and **resizepart** as minimal ioctl wrappers intended for scripts that modify partitions on live systems.

# SEE ALSO

[addpart](/man/addpart)(8), [partx](/man/partx)(8), [partprobe](/man/partprobe)(8), [fdisk](/man/fdisk)(8), [parted](/man/parted)(8)
