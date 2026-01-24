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
> List type codes.

# DESCRIPTION

**sgdisk** manages GPT partition tables. It's the scriptable version of gdisk.

Partition creation uses flexible notation. Size with +, from start with 0.

Type codes identify partition purpose. 8300 for Linux, EF00 for EFI.

Backup preserves partition layout. Restore recreates exact table.

Multiple operations chain together. Build complex layouts in one command.

# CAVEATS

Destructive operations are immediate. Wrong device destroys data. No MBR support.

# HISTORY

**sgdisk** is part of **GPT fdisk** by **Rod Smith**. It provides scriptable GPT partition management.

# SEE ALSO

[gdisk](/man/gdisk)(1), [fdisk](/man/fdisk)(1), [parted](/man/parted)(1)
