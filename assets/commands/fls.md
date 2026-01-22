# TLDR

**List files in** image

```fls [disk.img]```

**List deleted files**

```fls -d [disk.img]```

**Recursive listing**

```fls -r [disk.img]```

**List specific directory**

```fls [disk.img] [inode]```

**List with file** types

```fls -p [disk.img]```

# SYNOPSIS

**fls** [_options_] _image_ [_inode_]

# PARAMETERS

_IMAGE_
> Disk image file.

_INODE_
> Starting inode (default: root).

**-r**
> Recursive listing.

**-d**
> Show deleted entries.

**-l**
> Long format output.

**-p**
> Show full paths.

**-m** _PREFIX_
> Output in mactime format.

**-o** _OFFSET_
> Partition offset.

**--help**
> Display help information.

# DESCRIPTION

**fls** lists file and directory names from disk images. It's part of The Sleuth Kit forensics toolkit and examines filesystem structures directly without mounting.

The tool shows regular and deleted file entries, useful for data recovery and forensic analysis. It works with various filesystems including NTFS, FAT, ext, and HFS+.

fls enables examining disk images without modifying their contents, preserving forensic integrity.

# CAVEATS

Requires raw or forensic disk images. Deleted file recovery depends on filesystem state. Large images may be slow.

# HISTORY

fls is part of **The Sleuth Kit** created by Brian Carrier. It evolved from earlier forensic tools and provides cross-platform filesystem analysis for digital investigations.

# SEE ALSO

[ils](/man/ils)(1), [icat](/man/icat)(1), [mmls](/man/mmls)(1)
