# TAGLINE

partition manipulation program that supports both MBR and GPT partition tables

# TLDR

Start **interactive mode** with the specified disk selected

```sudo parted [/dev/sdX]```

Show **partition information** in interactive mode

```print```

Show **free space** between partitions

```print free```

**Select** a disk in interactive mode

```select [/dev/sdX]```

Create a new **GPT partition table** (erases existing partitions)

```mklabel gpt```

Create a **16 GB partition** (GPT partition table)

```mkpart [partition_name] ext4 0% 16G```

Create a partition (**MBR** partition table)

```mkpart primary ext4 0% 16G```

**Resize** partition number 1 to a new end position

```resizepart [1] [end_position]```

**Remove** partition number 1

```rm [1]```

Mark partition 1 as an **EFI system partition**

```set [1] esp on```

Check **alignment** of partition 1

```align-check optimal [1]```

Display **help**

```help```

**Exit** parted

```quit```

# SYNOPSIS

**parted** [_options_] [_device_]

# PARAMETERS

**print** [**devices**|**free**|**list**|**all**]
> Display the partition table

**select** _device_
> Select a disk to work with

**mklabel** _label-type_
> Create a new partition table of the given type, such as gpt or msdos

**mkpart** [_part-type_ _name_ _fs-type_] _start_ _end_
> Create a new partition. Part-type applies to msdos and dvh tables, a name is used on GPT, and fs-type is optional

**name** _partition_ _name_
> Set the name of a partition on Mac, PC98 and GPT labels

**resizepart** _partition_ _end_
> Change the end position of a partition

**rm** _partition_
> Remove a partition

**set** _partition_ _flag_ _state_
> Set a partition flag on or off

**toggle** _partition_ _flag_
> Toggle a partition flag

**disk_set** _flag_ _state_
> Set a disk flag on or off

**disk_toggle** _flag_
> Toggle a disk flag

**type** _partition_ _id_|_uuid_
> Set the partition ID on MS-DOS tables or the type UUID on GPT

**align-check** _type_ _partition_
> Check whether a partition meets the minimal or optimal alignment

**rescue** _start_ _end_
> Search for a lost partition between start and end

**unit** _unit_
> Set the unit used for display and for input without a suffix

**help** [_command_]
> Display help for interactive commands

**version**
> Display version and copyright information

**quit**
> Exit parted

# DESCRIPTION

**parted** is a partition manipulation program that supports both MBR and GPT partition tables. In interactive mode, it provides a command-line interface for viewing and modifying disk partitions.

Commands take a partition **number**, not a device path. Start and end positions accept units such as **MiB**, **GiB**, **s** (sectors) and percentages of the disk.

# CAVEATS

Changes are applied as soon as each command runs, with no separate write step, so a mistake can cause immediate data loss. Back up important data first.

**mkpart** does not create a filesystem: the _fs-type_ only records a hint in the partition entry, so run **mkfs** afterwards. **resizepart** does not change the filesystem inside the partition, so grow or shrink it separately. Some operations require the partition to be unmounted first.

# HISTORY

Part of **GNU Parted**, developed as a free partition editor supporting multiple partition table types.

# SEE ALSO

[parted](/man/parted)(8), [partprobe](/man/partprobe)(8), [fdisk](/man/fdisk)(8), [gdisk](/man/gdisk)(8), [mkfs](/man/mkfs)(8)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/cgit/parted.git)```

```[Homepage](https://www.gnu.org/software/parted/)```

```[Documentation](https://www.gnu.org/software/parted/manual/parted.html)```

<!-- verified: 2026-11-08 -->
