# TLDR

Show all **EXIF data**

```jhead image.jpg```

Set **file date to EXIF** date

```jhead -ft image.jpg```

Set **EXIF date to file** date

```jhead -dsft image.jpg```

**Rename** files based on EXIF date

```jhead -n%Y_%m_%d-%H_%M_%S *.jpg```

**Auto-rotate** based on EXIF orientation

```jhead -autorot *.jpg```

**Adjust** EXIF timestamps

```jhead -ta-1:00:00 *.jpg```

**Remove** all EXIF data

```jhead -purejpg image.jpg```

**Delete** thumbnail only

```jhead -dt image.jpg```

# SYNOPSIS

**jhead** [_options_] [_file_...]

# DESCRIPTION

**jhead** is a utility for displaying and manipulating EXIF metadata in JPEG images from digital cameras. It can adjust timestamps, remove thumbnails, auto-rotate images, and transfer EXIF headers between files.

# PARAMETERS

**-ft**
> Set file modification time to EXIF create date

**-dsft**
> Set EXIF timestamp to file modification time

**-n FORMAT**
> Rename files using strftime format based on EXIF date

**-autorot**
> Rotate images losslessly based on EXIF orientation tag

**-ta OFFSET**
> Adjust EXIF time by offset (format: +/-HH:MM:SS)

**-da NEWDATE-OLDDATE**
> Correct large date offsets

**-purejpg**
> Remove all non-essential sections and metadata

**-de**
> Delete entire EXIF header

**-dt**
> Delete thumbnail from EXIF header

**-dc**
> Delete comment field

**-te FILE**
> Transfer EXIF header from another file

**-ce**
> Edit comment field in text editor

**-cl STRING**
> Set comment from command line

**-st FILE**
> Save thumbnail to file

**-rgt SIZE**
> Regenerate thumbnail with specified size

**-mkexif**
> Create minimal EXIF header

# CAVEATS

The -autorot option uses jpegtran for lossless rotation. Renaming with -n uses strftime format codes. Changes are made in-place to the original files unless otherwise specified.

# HISTORY

**jhead** was created by Matthias Wandel for manipulating EXIF data in JPEG files from digital cameras.

# SEE ALSO

[exiftool](/man/exiftool)(1), [exiv2](/man/exiv2)(1), [jpegtran](/man/jpegtran)(1)
