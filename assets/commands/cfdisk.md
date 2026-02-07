# TAGLINE

curses-based disk partition editor

# TLDR

Start the partition manager for a **specific device**

```sudo cfdisk [/dev/sdX]```

Create a **new partition table** and manage it

```sudo cfdisk -z [/dev/sdX]```

# SYNOPSIS

**cfdisk** [_options_] _device_

# DESCRIPTION

**cfdisk** is a curses-based disk partition table editor from the util-linux package. It provides a user-friendly text interface for creating, deleting, resizing, and changing the type of disk partitions, making it more approachable than the command-driven fdisk.

The tool supports both MBR (DOS) and GPT partition tables and displays partition layout in an interactive menu-driven format. Navigation uses arrow keys to select partitions and operations, with changes held in memory until explicitly written with the "Write" command.

The `-z` flag starts with a zeroed partition table, which is useful when setting up a new disk or switching between MBR and GPT schemes.

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
