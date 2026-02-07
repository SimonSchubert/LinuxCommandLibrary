# TAGLINE

release RAM disk memory

# TLDR

**Free a RAM disk**

```freeramdisk [/dev/ram0]```

# SYNOPSIS

**freeramdisk** _device_

# DESCRIPTION

**freeramdisk** releases memory allocated to a RAM disk device, returning it to the system's available memory pool. RAM disks are block devices that use system RAM as storage, providing very fast I/O but consuming physical memory.

Before running freeramdisk, the RAM disk must be unmounted with umount. Once freed, the memory becomes available for other processes. This is useful for cleaning up temporary RAM disks after they are no longer needed.

RAM disks are typically created with size limitations defined when the ramdisk kernel module loads. The freeramdisk utility is part of the util-linux package and works with the legacy ramdisk driver, though tmpfs and ramfs are more commonly used in modern systems.

# SEE ALSO

[mount](/man/mount)(8), [umount](/man/umount)(8)

