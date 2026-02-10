# TAGLINE

program to manipulate disk partitions

# TLDR

List partitions on **all block devices**

```sudo parted -l```

Create a **new partition table**

```sudo parted /dev/sdX mklabel gpt```

Create **boot and system partitions**

```sudo parted /dev/sdX -s mklabel gpt mkpart "boot" 0% 500MiB mkpart "system" 500MiB 100%```

Set the **boot flag** on a partition

```sudo parted /dev/sdX set 1 boot on```

Start **interactive mode**

```sudo parted /dev/sdX```

Print **partition information**

```sudo parted /dev/sdX print```

# SYNOPSIS

**parted** [_options_] [_device_ [_command_ [_options_]...]]

# DESCRIPTION

**parted** is a program to manipulate disk partitions. It supports multiple partition table formats, including MS-DOS (MBR) and GPT. It can be used to create space for new operating systems, reorganize disk usage, and copy data to new hard disks.

# PARAMETERS

**-h, --help**
> Display help message

**-l, --list**
> List partition layout on all block devices

**-m, --machine**
> Show machine-parseable output

**-j, --json**
> Show JSON output

**-s, --script**
> Never prompt for user intervention

**-f, --fix**
> Auto-answer "fix" to exceptions in script mode

**-a, --align TYPE**
> Set alignment for new partitions (none, cylinder, minimal, optimal)

# COMMANDS

**mklabel TYPE**
> Create new partition table (gpt, msdos, etc.)

**mkpart NAME START END**
> Create new partition with optional filesystem type

**print**
> Display partition table

**rm NUMBER**
> Delete partition by number

**select DEVICE**
> Choose device to edit

**set NUMBER FLAG STATE**
> Change partition flags (boot, raid, lvm, esp, etc.)

**name NUMBER NAME**
> Set partition name (GPT only)

**resizepart NUMBER END**
> Modify partition end position

**rescue START END**
> Recover lost partitions

**type NUMBER TYPE**
> Set partition type ID (MBR) or UUID (GPT)

**unit UNIT**
> Set display/input units (s, B, kB, MB, GB, TB, %)

# CAVEATS

Parted modifies the partition table directly and changes take effect immediately. Always backup important data before modifying partitions. Use **-s** flag for scripting to avoid interactive prompts.

# HISTORY

**parted** is part of the GNU Parted package, first released in 1999 by Andrew Clausen. It was designed to handle larger disks and more partition types than traditional fdisk.

# SEE ALSO

[fdisk](/man/fdisk)(8), [gdisk](/man/gdisk)(8), [mkfs](/man/mkfs)(8), [partprobe](/man/partprobe)(8)
