# TLDR

**List all RAID sets**

```dmraid -s```

**Activate all RAID** sets

```dmraid -ay```

**Activate specific RAID** set

```dmraid -ay [raidset_name]```

**Deactivate all RAID** sets

```dmraid -an```

**Show detailed RAID** information

```dmraid -s -s```

**List block devices**

```dmraid -b```

**Remove inactive RAID** metadata

```dmraid -E [/dev/sda]```

# SYNOPSIS

**dmraid** [_options_] [_device_...]

# PARAMETERS

**-s**
> Display RAID sets (double for details).

**-ay**
> Activate RAID sets.

**-an**
> Deactivate RAID sets.

**-b**
> List block devices.

**-r**
> List RAID devices.

**-E** _DEVICE_
> Erase RAID metadata.

**-n**
> Dry run (show but don't execute).

**-v**
> Verbose output.

# DESCRIPTION

**dmraid** discovers and activates software RAID sets using the Linux device-mapper. It supports various hardware RAID metadata formats including those from Intel, NVIDIA, VIA, and other motherboard RAID controllers.

The tool reads RAID metadata from drives and creates device-mapper mappings that present the RAID array as a single block device. This enables Linux to work with "fake RAID" or "firmware RAID" commonly found on consumer motherboards.

dmraid operates independently of the RAID controller's BIOS, allowing arrays to be used even without controller-specific drivers.

# CAVEATS

Only supports specific metadata formats. Some RAID levels may have limited support. Activating degraded arrays may risk data. Does not replace hardware RAID controllers or mdadm software RAID.

# HISTORY

dmraid was developed to support hardware RAID metadata formats in Linux. It emerged to address the need for Linux compatibility with consumer motherboard RAID implementations that use software RAID with proprietary metadata formats.

# SEE ALSO

[mdadm](/man/mdadm)(8), [dmsetup](/man/dmsetup)(8), [lvm](/man/lvm)(8)
