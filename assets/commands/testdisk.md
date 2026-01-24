# TLDR

**Start testdisk** interactively

```sudo testdisk```

**Analyze a specific disk**

```sudo testdisk [/dev/sdX]```

**Analyze a disk image** file

```testdisk [path/to/image.dd]```

**Create a log file** during recovery

```sudo testdisk /log [/dev/sdX]```

**Run in scripted mode** with commands

```sudo testdisk /cmd [/dev/sdX] [commands]```

**Specify a directory** for recovered files

```sudo testdisk /d [path/to/recovery_dir] /cmd [/dev/sdX] [commands]```

# SYNOPSIS

**testdisk** [_/log_] [_/debug_] [_/d recup_dir_] [_/cmd device commands_] [_device|image_]

# PARAMETERS

**/log**
> Create a testdisk.log file recording all operations and analysis results.

**/debug**
> Enable debug mode with additional detailed output.

**/d** _recup_dir_
> Specify the directory to store recovered files (should be on a different device than the one being recovered).

**/cmd**
> Run in non-interactive scripted mode with the specified command sequence.

**device**
> The disk device to analyze (e.g., /dev/sda, /dev/nvme0n1).

**image**
> A disk image file to analyze instead of a physical device.

# DESCRIPTION

**TestDisk** is a powerful open-source data recovery utility designed to recover lost partitions and repair boot sectors. It can restore partition tables, recover deleted partitions, rebuild boot sectors for FAT and NTFS, and fix corrupted file systems.

TestDisk supports a wide range of file systems including FAT12/FAT16/FAT32, NTFS, exFAT, ext2/ext3/ext4, HFS/HFS+, JFS, ReiserFS, XFS, and many others. It works with various partition table types including DOS/MBR, GPT, Mac, and BSD disklabels.

The utility operates in an ncurses-based interactive menu by default, guiding users through the recovery process. For automation, scripted mode is available via **/cmd**. TestDisk also includes a file recovery feature accessible through its Advanced menu, allowing recovery of deleted files from supported file systems.

# CAVEATS

Root privileges are required when working with physical disk devices. When recovering files, always save them to a different disk or partition to avoid overwriting recoverable data. TestDisk is primarily a partition recovery tool; for file-level recovery from damaged partitions, consider using its companion tool **photorec**.

# HISTORY

TestDisk was created by **Christophe Grenier** and initially developed as a partition repair tool for DOS, which explains its **/flag** command-line syntax. The project became part of **CGSecurity** and was open-sourced under the GPL. It is bundled with **PhotoRec**, a file carving tool for recovering files regardless of file system. The current version 7.2 supports modern partition schemes and file systems.

# SEE ALSO

[photorec](/man/photorec)(1), [fdisk](/man/fdisk)(8), [gdisk](/man/gdisk)(8), [fsck](/man/fsck)(8), [ddrescue](/man/ddrescue)(1)
