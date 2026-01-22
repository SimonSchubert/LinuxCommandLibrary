# TLDR

Print on-disk information for **exFAT filesystem**

```dump.exfat [/dev/sdXY]```

# SYNOPSIS

**dump.exfat** _device_

# DESCRIPTION

**dump.exfat** shows on-disk information of an exFAT filesystem. It displays filesystem metadata including boot sector information, FAT region details, and other structural data.

Useful for debugging and analyzing exFAT filesystems.

# PARAMETERS

_device_
> The device containing the exFAT filesystem

# CAVEATS

Part of exfatprogs package. Read-only operation. Filesystem should ideally be unmounted for accurate results.

# SEE ALSO

[fsck.exfat](/man/fsck.exfat)(8), [mkfs.exfat](/man/mkfs.exfat)(8)
