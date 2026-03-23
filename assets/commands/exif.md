# TAGLINE

EXIF metadata viewer and editor

# TLDR

Show all **EXIF information** in an image

```exif [path/to/image.jpg]```

Show table **listing** known EXIF tags

```exif [-l|--list-tags] [path/to/image.jpg]```

**Extract** thumbnail to file

```exif [-e|--extract-thumbnail] [-o|--output] [path/to/thumbnail.jpg] [path/to/image.jpg]```

Show **raw contents** of a tag

```exif --ifd [0] [-t|--tag] "[Model]" [-m|--machine-readable] [path/to/image.jpg]```

**Change** value of a tag

```exif [-o|--output] [path/to/new.jpg] --ifd [0] [-t|--tag] "[Artist]" --set-value "[John Smith]" --no-fixup [path/to/image.jpg]```

**Remove** a tag from an image

```exif --remove --ifd [0] [-t|--tag] "[Artist]" [-o|--output] [path/to/new.jpg] [path/to/image.jpg]```

**Create** EXIF data if none exists

```exif [-c|--create-exif] [-o|--output] [path/to/new.jpg] [path/to/image.jpg]```

# SYNOPSIS

**exif** [_options_] _files_

# PARAMETERS

**-v**, **--version**
> Display version number.

**-l**, **--list-tags**
> List known EXIF tags.

**-e**, **--extract-thumbnail**
> Extract embedded thumbnail.

**-r**, **--remove-thumbnail**
> Remove thumbnail from image.

**-n**, **--insert-thumbnail** _file_
> Insert file as thumbnail.

**-o**, **--output** _file_
> Output file for operations.

**-t**, **--tag** _tag_
> Specify tag name or number.

**-s**, **--show-description**
> Show description of tag.

**--set-value** _value_
> Set tag to value.

**--remove**
> Remove tag or entire IFD.

**--ifd** _ifd_
> Select IFD (0, 1, EXIF, GPS, Interoperability).

**-c**, **--create-exif**
> Create EXIF data if absent.

**-m**, **--machine-readable**
> Machine-readable tab-delimited output.

**-x**, **--xml-output**
> Produce XML output.

**-i**, **--ids**
> Show ID numbers instead of tag names.

**--no-fixup**
> Don't fix EXIF violations.

**-d**, **--debug**
> Show debug messages.

**-w**, **--width** _n_
> Set maximum output width (default 80).

# DESCRIPTION

**exif** shows and modifies EXIF metadata in JPEG files. EXIF data contains camera settings, date/time, GPS coordinates, and other image information.

Command-line tool for quick EXIF inspection and modification. It can list tags, extract and manage thumbnails, read and write individual tag values, and create EXIF data from scratch.

# CAVEATS

Only works with JPEG files. Some tags are read-only. Use --no-fixup when modifying to preserve original data structure. The --machine-readable and --xml-output options are mutually exclusive.

# SEE ALSO

[exiftool](/man/exiftool)(1), [jhead](/man/jhead)(1), [identify](/man/identify)(1)
