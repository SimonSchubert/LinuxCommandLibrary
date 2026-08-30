# TAGLINE

Convert a standalone VDO volume into an LVM-managed VDO logical volume

# TLDR

**Rehearse** the conversion first, since the real thing cannot be undone

```lvm_import_vdo --dry-run [/dev/mapper/vdo_volume]```

Convert a VDO volume, letting LVM **choose the names**

```lvm_import_vdo [/dev/mapper/vdo_volume]```

**Choose the volume group and logical volume** name yourself

```lvm_import_vdo --name [vg_name/lv_name] [/dev/mapper/vdo_volume]```

Answer the prompts automatically and **show each step**

```lvm_import_vdo --verbose --yes [/dev/mapper/vdo_volume]```

Skip the protective snapshot, which is quicker but leaves **no way back**

```lvm_import_vdo --no-snapshot [/dev/mapper/vdo_volume]```

Read the settings from a **VDO manager configuration file**

```lvm_import_vdo --vdo-config [path/to/vdo.conf] [/dev/mapper/vdo_volume]```

# SYNOPSIS

**lvm_import_vdo** [_options_] _device_

# PARAMETERS

**-n, --name _vg/lv_**
> Specify the destination volume group and logical volume name

**--dry-run**
> Preview the import without making changes

**--no-snapshot**
> Skip creating a temporary snapshot during conversion (faster but riskier)

**-v, --verbose**
> Enable verbose output

**-y, --yes**
> Automatically answer yes to all prompts

**--vdo-config _file_**
> Use a VDO manager configuration file during import

# DESCRIPTION

**lvm_import_vdo** converts a VDO (Virtual Data Optimizer) volume created with the standalone VDO manager into an LVM-managed VDO logical volume. This allows integration with LVM's volume management capabilities while preserving the VDO deduplication and compression features.

The conversion is **irreversible** and migrates the VDO metadata format. By default, a temporary snapshot is created for safety during the conversion process.

VDO provides inline deduplication and compression for block storage, reducing storage requirements for workloads with redundant data like virtual machines and containers.

# CAVEATS

This operation is **irreversible**; the original VDO volume format cannot be restored. The **--no-snapshot** option skips safety mechanisms and should only be used when snapshot creation fails. Back up important data before importing. Requires root privileges.

# INSTALL

```apk: sudo apk add lvm2-extra```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvm](/man/lvm)(8), [lvcreate](/man/lvcreate)(8)
