# TAGLINE

creates an exFAT filesystem on a device

# TLDR

Create **exFAT** filesystem

```sudo mkfs.exfat /dev/sdXY```

Create with **volume label**

```sudo mkfs.exfat --volume-label [name] /dev/sdXY```

Create with **volume GUID**

```sudo mkfs.exfat --volume-guid [guid] /dev/sdXY```

# SYNOPSIS

**mkfs.exfat** [_options_] _device_

# DESCRIPTION

**mkfs.exfat** creates an exFAT filesystem on a device. exFAT is designed for flash drives and supports large files (>4GB) while being compatible with Windows, macOS, and Linux.

# PARAMETERS

**-L, --volume-label NAME**
> Set volume label

**-U, --volume-guid GUID**
> Set volume GUID

**-c, --cluster-size SIZE**
> Set cluster size in bytes

**-s, --sectors-per-cluster N**
> Sectors per cluster

**-b, --boundary-align SIZE**
> Boundary alignment

# CAVEATS

All data on device will be lost. exFAT is ideal for USB drives and SD cards requiring files larger than 4GB.

# SEE ALSO

[mkfs](/man/mkfs)(8), [exfatprogs](/man/exfatprogs)(8), [mkfs.vfat](/man/mkfs.vfat)(8)
