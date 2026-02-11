# TAGLINE

FAT filesystem bootloader installer

# TLDR

**Install SYSLINUX on FAT filesystem**

```syslinux -i [/dev/sdb1]```

**Install to USB drive** with MBR

```syslinux -i -m -a [/dev/sdb1]```

**Install in subdirectory**

```syslinux -i -d [/boot/syslinux] [/dev/sdb1]```

**Update existing installation**

```syslinux -U [/dev/sdb1]```

**Install with RAID mode**

```syslinux -i -r [/dev/sdb1]```

**Force installation**

```syslinux -f -i [/dev/sdb1]```

**Install safe/slow version** for buggy BIOS

```syslinux -s -i [/dev/sdb1]```

# SYNOPSIS

**syslinux** [_options_] _device_

# PARAMETERS

**-i**, **--install**
> Install SYSLINUX, overwriting any previous bootloader.

**-U**, **--update**
> Update existing SYSLINUX installation.

**-s**, **--stupid**
> Install safe, slow version for buggy BIOSes.

**-f**, **--force**
> Force install even if it appears unsafe.

**-r**, **--raid**
> RAID mode: boot next device on failure.

**-d**, **--directory** _subdir_
> Install control files in specified subdirectory.

**-a**, **--active**
> Mark partition as active (bootable).

**-m**, **--mbr**
> Install Master Boot Record code.

**--offset** _bytes_
> Byte offset of filesystem in disk image.

**-t**, **--type** _type_
> Specify filesystem type explicitly.

**-z**, **--zipdrive**
> Assume ZIP drive geometry.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**syslinux** installs the SYSLINUX bootloader on FAT filesystems. SYSLINUX is a lightweight bootloader designed for booting Linux from MS-DOS FAT filesystems, commonly used for USB drives and rescue media.

The bootloader consists of a boot sector and the **ldlinux.sys** file. Configuration is done through **syslinux.cfg** which specifies kernel images and boot parameters.

For ext2/3/4 and btrfs filesystems, use **extlinux** instead. Since version 4.00, EXTLINUX and SYSLINUX share the same codebase.

After installation, create a syslinux.cfg file in the installation directory to configure boot entries.

# CONFIGURATION

**syslinux.cfg**
> Boot configuration file specifying kernel images, boot parameters, menu entries, and timeout settings. Located in the root or installation subdirectory of the FAT filesystem.

# CAVEATS

Only works with FAT12, FAT16, and FAT32 filesystems. The device must not be mounted when installing, or use the -f flag. BIOS boot only; for UEFI systems, different tools are needed. Some BIOSes may require the -s option for compatibility.

# HISTORY

**SYSLINUX** was created by H. Peter Anvin starting in 1994. It evolved into a family of bootloaders including ISOLINUX (for CD-ROM), PXELINUX (for network boot), and EXTLINUX (for Linux filesystems). The project provided a simpler alternative to LILO and GRUB for specific use cases like bootable USB drives.

# SEE ALSO

[extlinux](/man/extlinux)(1), [isolinux](/man/isolinux)(1), [grub-install](/man/grub-install)(1), [dd](/man/dd)(1)
