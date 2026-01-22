# TLDR

Show all **EXIF information** in an image

```exif [path/to/image.jpg]```

Show table **listing** known EXIF tags

```exif [-l|--list-tags] --no-fixup [path/to/image.jpg]```

**Extract** thumbnail to file

```exif [-e|--extract-thumbnail] [-o|--output] [path/to/thumbnail.jpg] [path/to/image.jpg]```

Show **raw contents** of a tag

```exif --ifd [0] [-t|--tag] "[Model]" [-m|--machine-readable] [path/to/image.jpg]```

**Change** value of a tag

```exif [-o|--output] [path/to/new.jpg] --ifd [0] [-t|--tag] "[Artist]" --set-value "[John Smith]" --no-fixup [path/to/image.jpg]```

# SYNOPSIS

**exif** [_options_] _files_

# DESCRIPTION

**exif** shows and modifies EXIF metadata in JPEG files. EXIF data contains camera settings, date/time, GPS coordinates, and other image information.

Command-line tool for quick EXIF inspection and modification.

# PARAMETERS

**-l, --list-tags**
> List known EXIF tags

**-e, --extract-thumbnail**
> Extract embedded thumbnail

**-o, --output** _file_
> Output file for operations

**-t, --tag** _tag_
> Specify tag name

**--set-value** _value_
> Set tag to value

**--ifd** _number_
> Select IFD (0 or 1)

**-m, --machine-readable**
> Machine-readable output

**--no-fixup**
> Don't fix malformed data

# CAVEATS

Only works with JPEG files. Some tags are read-only. Use --no-fixup when modifying to preserve original data structure.

# SEE ALSO

[exiftool](/man/exiftool)(1), [jhead](/man/jhead)(1), [identify](/man/identify)(1)
