# TAGLINE

ID3 tag editor for MP3 files

# TLDR

**View** information about an MP3 file

```eyeD3 [filename.mp3]```

Set the **title** of an MP3 file

```eyeD3 [-t|--title] "[A Title]" [filename.mp3]```

Set the **album** of all MP3 files in directory

```eyeD3 [-A|--album] "[Album Name]" [*.mp3]```

Set front **cover art** for an MP3 file

```eyeD3 --add-image [front_cover.jpeg]:FRONT_COVER: [filename.mp3]```

# SYNOPSIS

**eyeD3** [_options_] _files_

# DESCRIPTION

**eyeD3** reads and manipulates ID3 metadata in MP3 files. It supports ID3 v1.x and v2.x tags including text, images, and custom frames.

Useful for organizing music libraries and batch tagging MP3 collections.

# PARAMETERS

**-t, --title** _text_
> Set track title.

**-A, --album** _text_
> Set album name.

**-a, --artist** _text_
> Set artist name.

**-b, --album-artist** _text_
> Set album artist (compilations, multi-artist albums).

**-n, --track** _num_
> Set track number.

**-N, --track-total** _num_
> Set total number of tracks.

**-d, --disc-num** _num_
> Set disc number.

**-G, --genre** _genre_
> Set genre (name or numeric ID3v1 code).

**-Y, --release-year** _year_
> Set release year.

**-c, --comment** _text_
> Add a comment.

**--add-image** _path:type[:description]_
> Add an image (APIC frame); TYPE from `--list-image-types` (e.g. FRONT_COVER).

**--remove-all-images**
> Remove all embedded images.

**--write-images** _dir_
> Extract images to a directory.

**--to-v2.3**, **--to-v2.4**, **--to-v1.1**
> Convert the tag to the specified ID3 version.

**--remove-v1**, **--remove-v2**, **--remove-all**
> Remove ID3 v1.x, v2.x, or all tags.

**--preserve-file-times**
> Keep original file modification timestamps.

**-Q, --quiet**
> Suppress output.

# CAVEATS

Only works with MP3 files. Some players may not support all ID3v2 features. Unicode support depends on tag version.

# SEE ALSO

[id3v2](/man/id3v2)(1), [mp3info](/man/mp3info)(1), [ffmpeg](/man/ffmpeg)(1)
