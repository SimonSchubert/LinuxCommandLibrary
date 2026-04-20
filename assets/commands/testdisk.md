# TAGLINE

Recover lost partitions and boot sectors

# TLDR

**Start testdisk** interactively

```sudo testdisk```

**Analyze a specific disk**

```sudo testdisk [/dev/sdX]```

**Analyze a disk image** file

```testdisk [path/to/image.dd]```

**Create a log file** during recovery

```sudo testdisk /log [/dev/sdX]```

**List partitions** on a device

```sudo testdisk /list [/dev/sdX]```

**Dump raw sectors** to the log

```sudo testdisk /dump [/dev/sdX]```

**Show the version** and exit

```testdisk /version```

# SYNOPSIS

**testdisk** [_/log_] [_/debug_] [_/list_] [_/dump_] [_/version_] [_device|image_]

# PARAMETERS

**/log**
> Append all operations and analysis results to **testdisk.log** in the current directory.

**/debug**
> Enable debug mode with additional detailed output.

**/list**
> Display partition information for the specified device or image and exit.

**/dump**
> Dump raw sector contents into the log for post-mortem inspection.

**/version**
> Print the TestDisk version and exit.

**device**
> The disk device to analyze (e.g. **/dev/sda**, **/dev/nvme0n1**).

**image**
> A disk image file to analyze instead of a physical device.

# DESCRIPTION

**TestDisk** is a powerful open-source data recovery utility designed to recover lost partitions and repair boot sectors. It can restore partition tables, recover deleted partitions, rebuild boot sectors for FAT and NTFS, and fix corrupted file systems.

TestDisk supports a wide range of file systems including FAT12/FAT16/FAT32, NTFS, exFAT, ext2/ext3/ext4, HFS/HFS+, JFS, ReiserFS, XFS, and many others. It works with various partition table types including DOS/MBR, GPT, Mac, and BSD disklabels.

The utility operates in an ncurses-based interactive menu, guiding users through the recovery process. TestDisk also includes a file recovery feature accessible through its Advanced menu, allowing recovery of deleted files from supported file systems.

# CAVEATS

Root privileges are required when working with physical disk devices. When recovering files, always save them to a different disk or partition to avoid overwriting recoverable data. TestDisk is primarily a partition recovery tool; for file-level recovery from damaged partitions, consider using its companion tool **photorec**.

# HISTORY

TestDisk was created by **Christophe Grenier** and initially developed as a partition repair tool for DOS, which explains its **/flag** command-line syntax. The project became part of **CGSecurity** and was open-sourced under the GPL. It is bundled with **PhotoRec**, a file carving tool for recovering files regardless of file system.

# SEE ALSO

[photorec](/man/photorec)(1), [fdisk](/man/fdisk)(8), [gdisk](/man/gdisk)(8), [fsck](/man/fsck)(8), [ddrescue](/man/ddrescue)(1)
