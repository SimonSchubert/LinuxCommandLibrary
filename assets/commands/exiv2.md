# TLDR

**Show metadata** of image

```exiv2 [image.jpg]```

**Print all Exif** data

```exiv2 -pa [image.jpg]```

**Print IPTC data**

```exiv2 -pi [image.jpg]```

**Print XMP data**

```exiv2 -px [image.jpg]```

**Modify Exif** data

```exiv2 -M "set Exif.Photo.UserComment [text]" [image.jpg]```

**Delete all metadata**

```exiv2 -da [image.jpg]```

**Rename by date**

```exiv2 -r "%Y%m%d_%H%M%S" [*.jpg]```

# SYNOPSIS

**exiv2** [_options_] [_actions_] _files_...

# PARAMETERS

_FILES_
> Image files to process.

**-pa**
> Print all Exif tags.

**-pi**
> Print IPTC tags.

**-px**
> Print XMP tags.

**-M** _CMD_
> Modify metadata.

**-da**
> Delete all metadata.

**-r** _FORMAT_
> Rename files by timestamp.

**-e** _FORMAT_
> Extract thumbnail.

**--help**
> Display help information.

# DESCRIPTION

**exiv2** reads, writes, and manipulates image metadata including Exif, IPTC, and XMP. It supports JPEG, TIFF, PNG, and many other image formats.

The tool provides detailed access to camera settings, GPS coordinates, timestamps, and descriptive metadata. Batch operations can modify metadata across multiple files.

exiv2 is useful for organizing photos, removing sensitive metadata, and forensic analysis of image files.

# CAVEATS

Metadata modifications are permanent. Some formats have limited metadata support. GPS data may reveal location. Backup before bulk operations.

# HISTORY

exiv2 is an open-source project providing a library and command-line tool for Exif and other metadata handling, used by many image applications.

# SEE ALSO

[exiftool](/man/exiftool)(1), [identify](/man/identify)(1), [jhead](/man/jhead)(1)
