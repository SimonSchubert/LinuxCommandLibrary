# TAGLINE

exFAT filesystem information display

# TLDR

Print on-disk information for **exFAT filesystem**

```dump.exfat [/dev/sdXY]```

# SYNOPSIS

**dump.exfat** _device_

# DESCRIPTION

**dump.exfat** displays detailed on-disk structural information for exFAT (Extended File Allocation Table) filesystems. It reads and presents filesystem metadata including boot sector parameters, FAT (File Allocation Table) region layout, cluster sizes, volume serial numbers, and other low-level details.

The tool is primarily used for forensic analysis, debugging filesystem issues, and understanding exFAT structure. It reveals information like volume label, filesystem version, bytes per sector, sectors per cluster, FAT offset and length, cluster heap offset, and root directory location.

exFAT is commonly used on flash media (SD cards, USB drives) and external drives due to its support for large files and broad compatibility across Windows, macOS, and Linux. dump.exfat helps diagnose corruption, verify filesystem parameters, and analyze how data is organized on the storage device.

The tool operates as a read-only utility and does not modify the filesystem. For accurate results, the filesystem should ideally be unmounted, though read-only access to mounted filesystems is possible.

# PARAMETERS

_device_
> The device containing the exFAT filesystem

# CAVEATS

Part of exfatprogs package. Read-only operation. Filesystem should ideally be unmounted for accurate results.

# SEE ALSO

[fsck.exfat](/man/fsck.exfat)(8), [mkfs.exfat](/man/mkfs.exfat)(8)
