# TAGLINE

Create bootable Windows USB drives

# TLDR

Create bootable USB (**format** device)

```woeusb -d [path/to/windows.iso] [/dev/sdX]```

Create bootable **partition** (no format)

```woeusb -p [path/to/windows.iso] [/dev/sdXN]```

# SYNOPSIS

**woeusb** [_OPTIONS_] _SOURCE_ _TARGET_

# PARAMETERS

**-d**, **--device**
> Format entire device and make bootable (wipes all data)

**-p**, **--partition**
> Use existing partition without erasing other partitions

**--target-filesystem** _FS_, **--tgt-fs** _FS_
> Target partition filesystem: FAT or NTFS (device mode only)

**-l** _LABEL_, **--label** _LABEL_
> Filesystem label for the created partition (device mode only)

**--workaround-bios-boot-flag**
> Toggle the partition boot flag for BIOSes that require it

**-v**, **--verbose**
> Enable verbose output

**--no-color**
> Disable colored output

**-h**, **--help**
> Display help message

**-V**, **--version**
> Print version information

# DESCRIPTION

**woeusb** is a Windows media creation tool for Linux. It creates bootable Windows USB installation drives from ISO images.

The --device mode formats the entire USB drive. The --partition mode preserves existing data on other partitions.

# CAVEATS

Device mode erases all data on the USB drive. Requires sufficient USB drive size. UEFI boot may require FAT32 filesystem. Some Windows ISOs may not work correctly.

# SEE ALSO

[dd](/man/dd)(1), [ventoy](/man/ventoy)(8)
