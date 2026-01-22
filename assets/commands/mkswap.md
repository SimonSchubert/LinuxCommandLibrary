# TLDR

Set up a **swap area**

```sudo mkswap /dev/sdXY```

Check for **bad blocks** before creating swap

```sudo mkswap -c /dev/sdXY```

Set a **label** for the swap partition

```sudo mkswap -L swap_label /dev/sdXY```

Set a specific **UUID**

```sudo mkswap -U random /dev/sdXY```

Create a **swap file** of specific size

```sudo mkswap -s 4G -F /path/to/swapfile```

# SYNOPSIS

**mkswap** [_options_] _device_ [_size_]

# DESCRIPTION

**mkswap** sets up a Linux swap area on a device or in a file. The device can be a disk partition or a regular file. After creation, use swapon to enable the swap area.

# PARAMETERS

**-c, --check**
> Check the device for bad blocks before creating swap area

**-f, --force**
> Force creation even if the device has a detected filesystem

**-L, --label LABEL**
> Specify a label for the swap area (for use with swapon -L)

**-p, --pagesize SIZE**
> Specify page size in bytes

**-U, --uuid UUID**
> Specify UUID (clear, random, time, or specific UUID value)

**-v, --swapversion VERSION**
> Specify swap area version (only version 1 supported)

**-e, --endianness ENDIAN**
> Specify endianness (native or little)

**-o, --offset OFFSET**
> Offset for swap header in device

**-s, --size SIZE**
> Size of swap file (with -F)

**-F, --file**
> Create swap file instead of setting up existing file

**--verbose**
> Print verbose messages

# CAVEATS

The device or file must not be in use when running mkswap. For swap files on btrfs, special handling is required. Always run swapon after mkswap to activate the swap area.

# HISTORY

**mkswap** is part of **util-linux**. Swap space provides virtual memory when physical RAM is exhausted.

# SEE ALSO

[swapon](/man/swapon)(8), [swapoff](/man/swapoff)(8), [fdisk](/man/fdisk)(8)
