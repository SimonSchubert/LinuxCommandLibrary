# TAGLINE

creates an NTFS filesystem on a device or file

# TLDR

Create an **NTFS filesystem** inside partition Y on device X

```sudo mkfs.ntfs [/dev/sdXY]```

Create an NTFS filesystem with a **volume label**

```sudo mkfs.ntfs -L [volume_label] [/dev/sdXY]```

Create an NTFS filesystem with a specific **UUID**

```sudo mkfs.ntfs -U [/dev/sdXY]```

Perform a **quick format** (skip zeroing and bad sector check)

```sudo mkfs.ntfs -f [/dev/sdXY]```

Enable **compression** on the filesystem

```sudo mkfs.ntfs -C [/dev/sdXY]```

**Simulate** formatting without writing to device

```sudo mkfs.ntfs -n [/dev/sdXY]```

# SYNOPSIS

**mkfs.ntfs** [**-f**|**-Q**] [**-c** _cluster-size_] [**-L** _label_] [**-C**] [**-U**] [**-n**] [**-q**|**-v**] _device_ [_number-of-sectors_]

# PARAMETERS

**-f, -Q, --fast, --quick**
> Perform quick format; skips zeroing volume and bad sector checking

**-L, --label _string_**
> Set volume label for the filesystem

**-C, --enable-compression**
> Enable filesystem-level compression

**-U, --with-uuid**
> Generate random volume UUID

**-c, --cluster-size _bytes_**
> Set cluster size from 256 to 2,097,152 bytes; default is 4096

**-s, --sector-size _bytes_**
> Set sector size: 256, 512, 1024, 2048, or 4096 bytes

**-p, --partition-start _sector_**
> Specify partition start sector

**-H, --heads _num_**
> Number of heads; required for Windows boot capability

**-S, --sectors-per-track _num_**
> Sectors per track; required for Windows boot capability

**-z, --mft-zone-multiplier _num_**
> MFT zone size multiplier (1-4); affects fragmentation behavior

**-I, --no-indexing**
> Disable content indexing on the volume

**-n, --no-action**
> Simulate formatting without writing changes

**-q, --quiet**
> Suppress non-error output

**-v, --verbose**
> Enable verbose output

# DESCRIPTION

**mkfs.ntfs** (also known as **mkntfs**) creates an NTFS filesystem on a device or file. NTFS is the primary filesystem used by Windows NT and later versions, supporting features like file permissions, compression, encryption, and large volumes.

The utility automatically determines filesystem size if sector count is omitted. It creates the Master File Table (MFT), system files, and directory structures required by NTFS. The tool is part of the **ntfs-3g** package.

# CAVEATS

Windows chkdsk may report uppercase filename warnings due to Unicode version differences between Windows editions and mkntfs. For bootable Windows partitions, the -H and -S options must be set correctly. NTFS write support on Linux requires ntfs-3g driver.

# HISTORY

NTFS was developed by **Microsoft** and introduced with **Windows NT 3.1 in 1993**. It replaced FAT as the primary filesystem for Windows. The Linux ntfs-3g driver and mkfs.ntfs utility were developed by the **NTFS-3G** project, providing reliable read/write access to NTFS volumes from Linux systems.

# SEE ALSO

[mkfs](/man/mkfs)(8), [ntfs-3g](/man/ntfs-3g)(8), [ntfsfix](/man/ntfsfix)(8), [badblocks](/man/badblocks)(8)
