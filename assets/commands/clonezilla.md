# TLDR

**Boot Clonezilla and start interactive mode**

```clonezilla```

**Save disk to image**

```ocs-sr -q2 -c -j2 -z1p -i 2000 -fsck-y -senc -p reboot savedisk [image_name] [sda]```

**Restore image to disk**

```ocs-sr -g auto -e1 auto -e2 -r -j2 -c -p reboot restoredisk [image_name] [sda]```

**Clone disk to disk**

```ocs-onthefly -g auto -e1 auto -e2 -r -j2 -sfsck -k -p reboot -f [sda] -d [sdb]```

**Save partition to image**

```ocs-sr -q2 -c -j2 -z1p -i 2000 -fsck-y -senc -p reboot saveparts [image_name] [sda1]```

**List available images**

```ocs-sr -l```

# SYNOPSIS

**ocs-sr** [_options_] _action_ _image_name_ _device_

# PARAMETERS

**savedisk** _name_ _disk_
> Save entire disk to image.

**restoredisk** _name_ _disk_
> Restore image to disk.

**saveparts** _name_ _parts_
> Save partitions to image.

**restoreparts** _name_ _parts_
> Restore partitions from image.

**-q2**
> Use partclone for imaging.

**-c**
> Confirm before action.

**-j2**
> Clone hidden data between MBR and partition.

**-z1p**
> Use parallel gzip compression.

**-i** _size_
> Split image into files of given MB.

**-fsck-y**
> Run fsck automatically.

**-senc**
> Encrypt the image.

**-g auto**
> Reinstall grub automatically.

**-p** _action_
> Post-action: reboot, poweroff, or choose.

# DESCRIPTION

**Clonezilla** is a disk cloning and imaging solution similar to Norton Ghost. It creates backup images of entire disks or partitions and can restore them to the same or different hardware.

Clonezilla boots from USB or CD into a Linux environment with specialized imaging tools. It supports imaging filesystems (ext4, NTFS, HFS+, etc.) efficiently by copying only used blocks. Raw mode supports any filesystem.

Two modes are available: **Clonezilla Live** for imaging single machines, and **Clonezilla SE (Server Edition)** for mass deployment via network using PXE boot.

# SUPPORTED FILESYSTEMS

**Linux**: ext2/3/4, XFS, Btrfs, JFS, ReiserFS
**Windows**: NTFS, FAT12/16/32, exFAT
**macOS**: HFS+, APFS (limited)
**Others**: UFS, VMFS, minix

# CAVEATS

Target disk/partition must be equal or larger than source for differential imaging. Encrypted partitions may require raw mode (larger images). UEFI and Secure Boot may require configuration. Network deployment requires DHCP and TFTP infrastructure.

# HISTORY

Clonezilla was created by **Steven Shiau** and the DRBL (Diskless Remote Boot in Linux) project at the **National Center for High-Performance Computing** in Taiwan, first released in **2004**. Built on Partclone, Partimage, and other open-source tools, it became a popular free alternative to commercial disk imaging solutions. Both Live and Server editions remain actively developed.

# SEE ALSO

[dd](/man/dd)(1), [partclone](/man/partclone)(8), [partimage](/man/partimage)(1), [rsync](/man/rsync)(1)
