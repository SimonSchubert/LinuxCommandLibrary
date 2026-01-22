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
> Set track title

**-A, --album** _text_
> Set album name

**-a, --artist** _text_
> Set artist name

**-n, --track-num** _num_
> Set track number

**--add-image** _path:type:_
> Add image to file

**-G, --genre** _genre_
> Set genre

**-Y, --year** _year_
> Set release year

# CAVEATS

Only works with MP3 files. Some players may not support all ID3v2 features. Unicode support depends on tag version.

# SEE ALSO

[id3v2](/man/id3v2)(1), [mp3info](/man/mp3info)(1), [ffmpeg](/man/ffmpeg)(1)
