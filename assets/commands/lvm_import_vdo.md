# TLDR

Import a VDO volume with **automatic names** for the VG/LV

```lvm_import_vdo [/dev/mapper/vdo_volume]```

Import and set the **destination VG/LV name**

```lvm_import_vdo -n [vg_name/lv_name] [/dev/mapper/vdo_volume]```

Show what would be done **without changing anything**

```lvm_import_vdo --dry-run [/dev/mapper/vdo_volume]```

Convert in place **without using a temporary snapshot** (less safe)

```lvm_import_vdo --no-snapshot [/dev/mapper/vdo_volume]```

**Verbose output** and automatically answer "yes" to prompts

```lvm_import_vdo -v -y [/dev/mapper/vdo_volume]```

Use a **VDO manager configuration file** during import

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

# SEE ALSO

[lvm](/man/lvm)(8), [lvcreate](/man/lvcreate)(8), [vdo](/man/vdo)(8), [lvmvdo](/man/lvmvdo)(7)
