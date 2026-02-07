# TAGLINE

comprehensive metadata reader and writer

# TLDR

**Show all metadata** for a file

```exiftool [image.jpg]```

**Show specific tags**

```exiftool -DateTimeOriginal -Model [image.jpg]```

**Show metadata** for all files in directory

```exiftool [/path/to/directory]```

**Remove all metadata**

```exiftool -all= [image.jpg]```

**Set a specific tag**

```exiftool -Artist="[Name]" [image.jpg]```

**Copy metadata** from one file to another

```exiftool -TagsFromFile [source.jpg] [dest.jpg]```

**Rename files** based on date taken

```exiftool "-FileName<DateTimeOriginal" -d "%Y%m%d_%H%M%S.%%e" [*.jpg]```

**Fix date/time** by shifting

```exiftool -AllDates+=1:30 [image.jpg]```

**Extract embedded thumbnail**

```exiftool -b -ThumbnailImage [image.jpg] > [thumb.jpg]```

# SYNOPSIS

**exiftool** [_options_] [**-**_tag_[=_value_]]... _file_...

# PARAMETERS

**-**_tag_
> Extract specific tag.

**-**_tag_**=** _value_
> Set tag to value.

**-all=**
> Remove all writable metadata.

**-TagsFromFile** _file_
> Copy tags from another file.

**-r**, **--recurse**
> Process directories recursively.

**-overwrite_original**
> Overwrite without backup.

**-d** _fmt_
> Date format for renaming.

**-FileName<** _tag_
> Rename file based on tag.

**-json**
> Output as JSON.

**-csv**
> Output as CSV.

**-b**
> Output binary data.

**-v**
> Verbose output.

**-n**
> Disable print conversion.

**-s**
> Short output format.

**-G**
> Show group name for each tag.

# DESCRIPTION

**ExifTool** is a powerful, platform-independent tool for reading, writing, and editing metadata in a wide variety of file formats. It supports EXIF, IPTC, XMP, GPS, and many proprietary metadata formats used by cameras and software.

The tool can handle images (JPEG, TIFF, PNG, RAW formats), audio files, video files, PDFs, and documents. It recognizes metadata from virtually every camera manufacturer and supports both reading and writing for most formats.

ExifTool is invaluable for photographers organizing collections, forensic analysts examining files, and anyone needing to manage file metadata programmatically.

# CAVEATS

Writing metadata may not be supported for all formats. Some proprietary formats have limited write support. Backup important files before bulk editing. Time zone handling can be complex for GPS timestamps.

# HISTORY

**ExifTool** was created by **Phil Harvey** in **2003** as a Perl library and command-line tool for metadata manipulation. It has grown to support over 23,000 tags across hundreds of file formats. The project is continuously updated to support new cameras and formats, making it the most comprehensive metadata tool available.

# SEE ALSO

[identify](/man/identify)(1), [jhead](/man/jhead)(1), [file](/man/file)(1), [mediainfo](/man/mediainfo)(1)
