# TLDR

**List** all files in an ISO image

```isoinfo -f -i [path/to/image.iso]```

**Extract** a file from ISO to stdout

```isoinfo -i [path/to/image.iso] -x [/PATH/TO/FILE.EXT]```

Show **header information** for an ISO

```isoinfo -d -i [path/to/image.iso]```

# SYNOPSIS

**isoinfo** [_options_] **-i** _filename_

# PARAMETERS

**-i** _FILE_
> Input ISO image file

**-f**
> List all files in the ISO

**-d**
> Display header information (volume descriptor)

**-x** _PATH_
> Extract file at specified path to stdout

**-l**
> Long listing format (like ls -l)

**-R**
> Use Rock Ridge extensions

**-J**
> Use Joliet extensions

# DESCRIPTION

**isoinfo** examines and extracts information from ISO 9660 filesystem images. It can list files, display volume information, and extract individual files without mounting the image.

The tool supports ISO 9660 extensions including Rock Ridge (Unix permissions and long filenames) and Joliet (Windows long filenames). This is useful for inspecting ISO images before burning or mounting.

# CAVEATS

File paths inside ISO images are often uppercase. Rock Ridge or Joliet extensions may be needed to see original filenames. Extracted files go to stdout; redirect to save.

# HISTORY

isoinfo is part of the cdrtools/cdrkit package, originally developed by Joerg Schilling. ISO 9660 is the standard filesystem for CD-ROM media, defined in **1988**.

# SEE ALSO

[genisoimage](/man/genisoimage)(1), [xorriso](/man/xorriso)(1), [mount](/man/mount)(8)
