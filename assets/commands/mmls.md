# TAGLINE

displays disk partition layout

# TLDR

**List partitions**

```mmls [disk.img]```

**List from device**

```mmls [/dev/sda]```

**Show all partitions**

```mmls -a [disk.img]```

**Specify offset**

```mmls -o [63] [disk.img]```

**Output in bytes**

```mmls -b [disk.img]```

**Show partition type**

```mmls -t [dos] [disk.img]```

# SYNOPSIS

**mmls** [_options_] _image_

# PARAMETERS

_IMAGE_
> Disk image or device.

**-a**
> Show all entries.

**-o** _OFFSET_
> Sector offset.

**-b**
> Display in bytes.

**-t** _TYPE_
> Partition table type.

**--help**
> Display help information.

# DESCRIPTION

**mmls** displays disk partition layout. It's part of The Sleuth Kit for forensics.

The tool shows partition table entries. Supports DOS, GPT, and other schemes.

# CAVEATS

Part of Sleuth Kit. Forensic tool. Read-only analysis.

# HISTORY

mmls is part of **The Sleuth Kit**, forensic tools for disk image analysis by Brian Carrier.

# SEE ALSO

[fdisk](/man/fdisk)(8), [parted](/man/parted)(8), [fls](/man/fls)(1)

