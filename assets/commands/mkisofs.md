# TAGLINE

pre-mastering utility that generates ISO9660, Joliet, and HFS hybrid

# TLDR

Create an **ISO image** from a directory

```mkisofs -o [filename.iso] [path/to/source_directory]```

Set the **disc label** when creating an ISO

```mkisofs -o [filename.iso] -V "[label_name]" [path/to/source_directory]```

Create ISO with **Rock Ridge extensions** for Unix compatibility

```mkisofs -o [filename.iso] -R [path/to/source_directory]```

Create ISO with **Joliet extensions** for Windows compatibility

```mkisofs -o [filename.iso] -J [path/to/source_directory]```

Create **bootable ISO** with El Torito boot image

```mkisofs -o [filename.iso] -b [boot_image] [path/to/source_directory]```

**Exclude files** matching a pattern

```mkisofs -o [filename.iso] -m "*.bak" [path/to/source_directory]```

# SYNOPSIS

**mkisofs** [**-o** _filename_] [**-V** _volid_] [**-R**] [**-J**] [**-b** _boot_image_] [**-m** _glob_] _pathspec_ [_pathspec_...]

# PARAMETERS

**-o _filename_**
> Specify output file location for the ISO image

**-V _volid_**
> Set volume identifier; maximum 32 characters

**-R**
> Generate Rock Ridge SUSP records for Unix file attributes

**-r**
> Like -R but normalizes ownership and permissions globally

**-J**
> Add Joliet directory records for Windows long filename support

**-l**
> Allow full 31-character filenames (not MS-DOS compatible)

**-b _boot_image_**
> Specify El Torito boot image (1200, 1440, or 2880 KB floppy)

**-no-emul-boot**
> Use no emulation boot mode for bootable ISOs

**-boot-info-table**
> Insert boot information table at offset 8 in boot image

**-m _glob_**
> Exclude files matching shell wildcard pattern

**-graft-points**
> Allow custom directory grafting with path=source syntax

**-hide _glob_**
> Hide files from ISO9660 and Rock Ridge directory trees

**-hide-joliet _glob_**
> Hide files from Joliet tree only

**-quiet**
> Minimize verbose output

**-print-size**
> Calculate and display filesystem size in sectors

# DESCRIPTION

**mkisofs** (also known as **genisoimage**) is a pre-mastering utility that generates ISO9660, Joliet, and HFS hybrid filesystem images. It creates binary images suitable for writing to CDs, DVDs, or other optical media.

The tool supports Rock Ridge extensions for Unix file attributes, Joliet extensions for Windows long filenames, El Torito for bootable media, and Apple HFS hybrid filesystems. It processes directory trees without directly communicating with disc writers.

# CAVEATS

Basic ISO9660 limits filenames to 8.3 format; use -R or -J for longer names. The -boot-info-table option modifies the source boot file directly; use a copy if needed. HFS and UDF support are partially experimental. Character encoding varies between platforms and may require explicit charset options.

# HISTORY

**mkisofs** was originally written by Eric Youngdale and later maintained as part of the **cdrtools** package by Joerg Schilling. The **genisoimage** fork was created as part of **cdrkit** for Debian and derivatives. The ISO9660 standard dates to 1988.

# SEE ALSO

[genisoimage](/man/genisoimage)(1), [wodim](/man/wodim)(1), [cdrecord](/man/cdrecord)(1), [isoinfo](/man/isoinfo)(8)
