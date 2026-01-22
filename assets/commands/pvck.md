# TLDR

Print LVM **on-disk headers and structures**

```sudo pvck /dev/sdX1 --dump headers```

Print the current **VG metadata** text

```sudo pvck /dev/sdX1 --dump metadata```

List all **metadata versions** found in the metadata area

```sudo pvck /dev/sdX1 --dump metadata_all```

**Search** for metadata when headers may be damaged

```sudo pvck /dev/sdX1 --dump metadata_search -f path/to/metadata.txt```

Select the **second metadata area** when printing

```sudo pvck /dev/sdX1 --dump metadata --settings "mda_num=2"```

**Repair** headers and metadata using a metadata file

```sudo pvck /dev/sdX1 --repair -f path/to/metadata_file```

Repair only **PV header and label**

```sudo pvck /dev/sdX1 --repairtype pv_header```

# SYNOPSIS

**pvck** [_options_] _PhysicalVolume_

# PARAMETERS

**--dump** _type_
> Dump specified type (headers, metadata, metadata_all, metadata_search)

**--repair**
> Repair LVM metadata on the physical volume

**--repairtype** _type_
> Specify repair type (pv_header, etc.)

**-f**, **--file** _file_
> Input/output file for metadata operations

**--settings** _settings_
> Additional settings (e.g., mda_num=2)

# DESCRIPTION

**pvck** checks and repairs LVM metadata on physical volumes. It can dump headers, examine metadata areas, search for metadata in damaged volumes, and perform repairs using backup metadata files.

This tool is essential for LVM disaster recovery when physical volume metadata becomes corrupted.

# CAVEATS

Repair operations can be destructive. Always backup metadata before attempting repairs. Use with extreme caution on production systems.

# HISTORY

Part of **LVM2** (Logical Volume Manager 2), the standard volume management system for Linux.

# SEE ALSO

[pvcreate](/man/pvcreate)(8), [pvdisplay](/man/pvdisplay)(8), [vgcfgrestore](/man/vgcfgrestore)(8), [lvm](/man/lvm)(8)
