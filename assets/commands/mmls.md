# TAGLINE

displays disk partition layout

# TLDR

**List partitions**

```mmls [disk.img]```

**List from a device**

```mmls [/dev/sda]```

**Add a column** with partition sizes in bytes

```mmls -B [disk.img]```

**Specify the volume offset** into the image (in sectors)

```mmls -o [63] [disk.img]```

**Force the partition table type**

```mmls -t [gpt] [disk.img]```

**List the supported table types**

```mmls -t list```

**Set the device sector size**

```mmls -b [4096] [disk.img]```

# SYNOPSIS

**mmls** [_-t mmtype_] [_-o offset_] [_-i imgtype_] [_-b dev_sector_size_] [_-BrvV_] [_-aAmM_] _image_ [_images_]

# PARAMETERS

_IMAGE_
> Disk image (or device) to analyze. Split images can be given as multiple file names.

**-t** _TYPE_
> Partition table type to analyze (for example **dos**, **mac**, **bsd**, **sun**, **gpt**). Use **-t list** to list supported types. Autodetected if omitted.

**-i** _IMGTYPE_
> Format of the image file (for example **raw**, **ewf**). Use **-i list** to list supported types. Autodetected if omitted.

**-o** _OFFSET_
> Sector offset into the image where the volume containing the partition table starts.

**-b** _SIZE_
> Size, in bytes, of the underlying device sectors. Defaults to 512.

**-B**
> Add a column to the output that gives the size of each partition in bytes.

**-r**
> Recurse into DOS partitions and look for other partition tables.

**-a**
> Show only allocated volumes (those listed in the partition table).

**-A**
> Show only unallocated volumes (gaps not assigned to a partition).

**-m**
> Show metadata volumes (the sectors holding the partition table itself).

**-M**
> Hide metadata volumes.

**-v**
> Verbose debug output to stderr.

**-V**
> Display version information.

# DESCRIPTION

**mmls** displays the layout of a disk, including the partition tables and unallocated spaces. It is part of The Sleuth Kit (TSK), a collection of command-line tools for digital forensics and disk image analysis.

By default it shows all volumes, including unallocated regions and metadata, sorted by their starting sector. The starting and ending sector and length of each entry are reported, which makes mmls useful for finding the offset to pass to other TSK tools (such as **fls** or **fsstat**) when examining a single partition. It supports DOS partitions, BSD disk labels, Sun slices, Mac partitions, and GPT.

# CAVEATS

mmls is a read-only forensic tool: it never modifies the image. Sector values reported here are typically used directly as the **-o** offset for other Sleuth Kit tools. For images with a non-standard sector size, set **-b** accordingly or offsets will be wrong.

# HISTORY

mmls is part of **The Sleuth Kit**, a suite of open-source forensic tools for disk image analysis created by **Brian Carrier**, building on the earlier Coroner's Toolkit (TCT).

# SEE ALSO

[fdisk](/man/fdisk)(8), [parted](/man/parted)(8), [fls](/man/fls)(1)

