# TLDR

Create a **Minix filesystem** inside partition Y on device X

```sudo mkfs.minix [/dev/sdXY]```

Create a Minix filesystem and **check for bad blocks**

```sudo mkfs.minix -c [/dev/sdXY]```

Create a **Minix version 2** filesystem

```sudo mkfs.minix -2 [/dev/sdXY]```

Create a **Minix version 3** filesystem

```sudo mkfs.minix -3 [/dev/sdXY]```

Specify **maximum filename length**

```sudo mkfs.minix -n [30] [/dev/sdXY]```

Create with specific **number of inodes**

```sudo mkfs.minix -i [number] [/dev/sdXY]```

# SYNOPSIS

**mkfs.minix** [**-c**] [**-n** _namelength_] [**-i** _inodes_] [**-l** _badblocks_] [**-1**|**-2**|**-3**] _device_ [_size-in-blocks_]

# PARAMETERS

**-c, --check**
> Check device for bad blocks before creating filesystem

**-n, --namelength _length_**
> Maximum filename length; 14 or 30 for versions 1-2, 60 for version 3; default is 30

**-i, --inodes _number_**
> Number of inodes to create for the filesystem

**-l, --badblocks _filename_**
> Read bad blocks list from file (one block number per line)

**-1**
> Create Minix version 1 filesystem (default)

**-2, -v**
> Create Minix version 2 filesystem

**-3**
> Create Minix version 3 filesystem

**--lock[=_mode_]**
> Use exclusive BSD locking; mode can be yes, no, or nonblock

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# DESCRIPTION

**mkfs.minix** creates a Minix filesystem on a device, typically a hard disk partition. Minix is a simple, educational filesystem originally designed for the Minix operating system.

The optional size-in-blocks parameter specifies filesystem size; if omitted, size is determined automatically. Block counts must be greater than 10 and less than 65536. Version 1 is the default and most compatible; version 2 adds larger file support; version 3 extends filename length to 60 characters.

# CAVEATS

The Minix filesystem has significant limitations: maximum filesystem size of 64MB for version 1, filename restrictions, and no journaling. It is primarily used for educational purposes, boot floppies, or embedded systems requiring minimal overhead. Not recommended for production use with modern storage.

# HISTORY

The Minix filesystem was created by **Andrew S. Tanenbaum** for the **Minix operating system** in **1987**. It served as a teaching tool and directly influenced the development of the Linux kernel. Linus Torvalds initially developed Linux using Minix, and the early Linux filesystem was based on Minix. The mkfs.minix utility is part of **util-linux**.

# SEE ALSO

[mkfs](/man/mkfs)(8), [fsck](/man/fsck)(8), [fsck.minix](/man/fsck.minix)(8)
