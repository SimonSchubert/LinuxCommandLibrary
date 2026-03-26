# TAGLINE

Scriptable GPT partition table manager

# TLDR

**Show partition table**

```sgdisk -p [/dev/sda]```

**Create new GPT**

```sgdisk -o [/dev/sda]```

**Create partition**

```sgdisk -n [1:0:+500M] [/dev/sda]```

**Set partition type**

```sgdisk -t [1:8300] [/dev/sda]```

**Delete partition**

```sgdisk -d [1] [/dev/sda]```

**Change partition name**

```sgdisk -c [1:boot] [/dev/sda]```

**Backup partition table**

```sgdisk -b [backup.gpt] [/dev/sda]```

**Restore partition table**

```sgdisk -l [backup.gpt] [/dev/sda]```

# SYNOPSIS

**sgdisk** [_-n part:start:end_] [_-t part:type_] [_options_] _device_

# PARAMETERS

**-p**, **--print**
> Print partition table.

**-o**, **--clear**
> Create new GPT.

**-n**, **--new** _PART:START:END_
> Create partition.

**-d**, **--delete** _PART_
> Delete partition.

**-t**, **--typecode** _PART:TYPE_
> Set type code.

**-c**, **--change-name** _PART:NAME_
> Set name.

**-b**, **--backup** _FILE_
> Backup table.

**-l**, **--load-backup** _FILE_
> Restore table.

**-L**, **--list-types**
> List known partition type codes.

**-i**, **--info** _PART_
> Show detailed information about a partition.

**-v**, **--verify**
> Verify disk's GPT data structures.

**-Z**, **--zap-all**
> Destroy both GPT and MBR data structures.

**-g**, **--mbrtogpt**
> Convert MBR to GPT.

# DESCRIPTION

**sgdisk** is the command-line, scriptable counterpart to the interactive **gdisk** partitioning tool, designed for manipulating GUID Partition Table (GPT) disk layouts. It performs all operations through flags and arguments rather than an interactive menu, making it ideal for use in scripts, automated provisioning, and disk imaging workflows.

Partition creation uses flexible notation where sizes can be specified with **+** prefixes for relative sizing and **0** to fill remaining space. Type codes such as **8300** (Linux filesystem), **EF00** (EFI System Partition), and **8200** (Linux swap) identify the purpose of each partition. Multiple operations can be chained in a single command to build complete partition layouts atomically.

The tool also supports backing up and restoring entire partition tables, converting MBR disks to GPT, and verifying table integrity. All changes are written in a single operation when the command completes successfully.

# CAVEATS

Destructive operations are immediate and cannot be undone. Specifying the wrong device will destroy data. Only works with GPT partition tables (use fdisk for MBR). Use `-b` to back up the partition table before making changes.

# HISTORY

**sgdisk** is part of the **GPT fdisk** suite by **Rod Smith**, first released around **2010**. It was created as the scriptable counterpart to the interactive **gdisk** tool, filling the need for automated GPT partition management in scripts and deployment workflows.

# SEE ALSO

[gdisk](/man/gdisk)(1), [fdisk](/man/fdisk)(1), [parted](/man/parted)(1)
