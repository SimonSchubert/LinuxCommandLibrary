# TAGLINE

command-line tool for writing ID3 tags to MP3 files

# TLDR

**Set song title**

```id3tag -s "[title]" [file.mp3]```

**Set artist**

```id3tag -a "[artist]" [file.mp3]```

**Set album**

```id3tag -A "[album]" [file.mp3]```

**Set year and track number**

```id3tag -y [2024] -t [1] [file.mp3]```

**Set genre by number**

```id3tag -g [17] [file.mp3]```

**Set multiple tags at once**

```id3tag -a "[artist]" -s "[title]" -A "[album]" -y [2024] -t [1] [file.mp3]```

**Write only ID3v2 tags**

```id3tag -2 -a "[artist]" -s "[title]" [file.mp3]```

# SYNOPSIS

**id3tag** [_options_] _file_...

# PARAMETERS

**-1**, **--v1tag**
> Render only the id3v1 tag.

**-2**, **--v2tag**
> Render only the id3v2 tag.

**-a**, **--artist** _ARTIST_
> Set artist name.

**-s**, **--song** _SONG_
> Set song title.

**-A**, **--album** _ALBUM_
> Set album name.

**-y**, **--year** _NUM_
> Set release year.

**-t**, **--track** _NUM_
> Set track number.

**-T**, **--total** _NUM_
> Set total number of tracks on the album.

**-g**, **--genre** _NUM_
> Set genre by number.

**-c**, **--comment** _COMMENT_
> Set comment.

**-C**, **--desc** _DESCRIPTION_
> Set comment description.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**id3tag** is a command-line tool for writing ID3 tags to MP3 files. Part of the id3lib/libid3-tools package. Renders both ID3v1 and ID3v2 tags by default; use **-1** or **-2** to render only one type. Can set title, artist, album, year, track number, genre, and comments. Useful for batch tagging with shell scripts. Use **id3info** to view existing tags.

# SEE ALSO

[id3v2](/man/id3v2)(1), [eyeD3](/man/eyeD3)(1), [mp3info](/man/mp3info)(1)

