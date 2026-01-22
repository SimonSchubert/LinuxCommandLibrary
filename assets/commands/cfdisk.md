# TLDR

Start the partition manager for a **specific device**

```sudo cfdisk [/dev/sdX]```

Create a **new partition table** and manage it

```sudo cfdisk -z [/dev/sdX]```

# SYNOPSIS

**cfdisk** [_options_] _device_

# DESCRIPTION

**cfdisk** is a curses-based partition table editor. It provides a user-friendly text interface for creating, deleting, and modifying disk partitions.

The tool supports MBR (DOS) and GPT partition tables and displays partition information in an easy-to-read format.

# PARAMETERS

**-z, --zero**
> Start with an empty partition table (useful for new disks)

**-L, --color**
> Colorize output

**-h, --help**
> Display help

# INTERACTIVE COMMANDS

Use arrow keys to navigate, Enter to select:

**New**
> Create a new partition

**Delete**
> Delete selected partition

**Type**
> Change partition type

**Write**
> Write changes to disk

**Quit**
> Exit without writing

**Sort**
> Sort partitions by start sector

# CAVEATS

Changes are only written when explicitly choosing "Write". Incorrectly modifying partitions can cause data loss. Unmount partitions before modifying. Requires root privileges.

# SEE ALSO

[fdisk](/man/fdisk)(8), [parted](/man/parted)(8), [gdisk](/man/gdisk)(8)
