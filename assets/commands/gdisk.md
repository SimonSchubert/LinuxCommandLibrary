# TAGLINE

interactive GPT partitioning tool

# TLDR

**List** partitions

```sudo gdisk -l```

Start the **interactive** partition manipulator

```sudo gdisk /dev/sdX```

# INTERACTIVE COMMANDS

**?**
> Open help menu

**p**
> Print partition table

**n**
> Add new partition

**d**
> Delete a partition

**t**
> Change partition type

**c**
> Change partition name

**w**
> Write table to disk and exit

**q**
> Quit without saving changes

# SYNOPSIS

**gdisk** [_options_] _device_

# PARAMETERS

**-l**, **--list**
> List partition tables for all devices and exit

**device**
> Device to partition (e.g., /dev/sda, /dev/nvme0n1)

# DESCRIPTION

**gdisk** is an interactive GPT (GUID Partition Table) partitioning tool, similar to fdisk but designed specifically for GPT disks. It can create, delete, and modify partitions on modern UEFI systems.

GPT is the modern partitioning scheme that replaces MBR (Master Boot Record), supporting disks larger than 2TB and more than 4 primary partitions (up to 128). gdisk maintains both primary and backup partition tables for redundancy.

gdisk can also convert MBR disks to GPT (and vice versa with **sgdisk**), though this should be done carefully with backups.

# CAVEATS

Requires root privileges. Changes are only written when using **w** command. Converting between MBR and GPT can cause boot issues if not done correctly. Always backup important data before partitioning.

# HISTORY

gdisk (GPT fdisk) was created by Roderick W. Smith and first released around **2009**. It was developed to provide a text-mode GPT partitioning tool similar in interface to the classic fdisk, as UEFI and GPT became the standard for modern systems.

# SEE ALSO

[fdisk](/man/fdisk)(8), [parted](/man/parted)(8), [cfdisk](/man/cfdisk)(8), [sgdisk](/man/sgdisk)(8)
