# TAGLINE

creates an exFAT filesystem on a device

# TLDR

Create **exFAT** filesystem

```sudo mkfs.exfat /dev/sdXY```

Create with **volume label**

```sudo mkfs.exfat -L [name] /dev/sdXY```

Create with specific **cluster size**

```sudo mkfs.exfat -c [32K] /dev/sdXY```

Perform a **full format** (zero entire device)

```sudo mkfs.exfat -f /dev/sdXY```

Create in **quiet mode** (errors only)

```sudo mkfs.exfat -q /dev/sdXY```

# SYNOPSIS

**mkfs.exfat** [_options_] _device_

# DESCRIPTION

**mkfs.exfat** creates an exFAT filesystem on a device. exFAT is designed for flash drives and supports large files (>4GB) while being compatible with Windows, macOS, and Linux. It is part of the **exfatprogs** package.

# PARAMETERS

**-L, --volume-label=LABEL**
> Set volume label

**-U, --volume-guid=GUID**
> Set volume GUID

**-c, --cluster-size=SIZE**
> Set cluster size in bytes (must be a power of two); supports k/K for kibibytes and m/M for mebibytes

**-s, --sector-size=SIZE**
> Set sector size in bytes (512, 1024, 2048, or 4096)

**-b, --boundary-align=SIZE**
> Alignment for the FAT and the start of the cluster heap

**-f, --full-format**
> Perform a full format, zeroing the entire disk device

**-K, --no-discard**
> Do not attempt to discard blocks

**-C, --verify-written**
> Verify filesystem metadata by reading it back after writing

**--pack-bitmap**
> Relocate the allocation bitmap so it ends at the alignment boundary following the FAT

**-q, --quiet**
> Print only error messages

**-v, --verbose**
> Print verbose debugging information

**-h, --help**
> Display help and exit

**-V, --version**
> Display version and exit

# CAVEATS

All data on device will be lost. exFAT is ideal for USB drives and SD cards requiring files larger than 4GB.

# SEE ALSO

[mkfs](/man/mkfs)(8), [fsck.exfat](/man/fsck.exfat)(8), [mkfs.vfat](/man/mkfs.vfat)(8), [exfatlabel](/man/exfatlabel)(8)
