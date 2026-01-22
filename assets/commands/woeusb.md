# TLDR

Create bootable USB (**format** device)

```woeusb -d [path/to/windows.iso] [/dev/sdX]```

Create bootable **partition** (no format)

```woeusb -p [path/to/windows.iso] [/dev/sdXN]```

# SYNOPSIS

**woeusb** [_OPTIONS_] _SOURCE_ _TARGET_

# PARAMETERS

**-d, --device**
> Format entire device and make bootable

**-p, --partition**
> Use existing partition without erasing

**--target-filesystem** _FS_
> Target filesystem (FAT, NTFS)

# DESCRIPTION

**woeusb** is a Windows media creation tool for Linux. It creates bootable Windows USB installation drives from ISO images.

The --device mode formats the entire USB drive. The --partition mode preserves existing data on other partitions.

# CAVEATS

Device mode erases all data on the USB drive. Requires sufficient USB drive size. UEFI boot may require FAT32 filesystem. Some Windows ISOs may not work correctly.

# SEE ALSO

[dd](/man/dd)(1), [ventoy](/man/ventoy)(8)
