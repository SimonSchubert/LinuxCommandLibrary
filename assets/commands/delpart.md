# TLDR

Tell kernel to **forget** partition 1 of /dev/sda

```sudo delpart [/dev/sda] [1]```

# SYNOPSIS

**delpart** _device_ _partition_

# DESCRIPTION

**delpart** asks the Linux kernel to forget about a partition. This is a low-level command that updates the kernel's in-memory partition table without modifying the actual partition table on disk.

Used when the on-disk partition table has been modified and the kernel needs to be informed of the change without rebooting.

# PARAMETERS

_device_
> The block device (e.g., /dev/sda)

_partition_
> Partition number to remove

# CAVEATS

Does not modify the partition table on disk, only kernel's view. The partition must not be in use (mounted, etc.). Changes may be reverted on reboot if the on-disk table differs. Part of util-linux.

# SEE ALSO

[addpart](/man/addpart)(8), [partprobe](/man/partprobe)(8), [fdisk](/man/fdisk)(8)
