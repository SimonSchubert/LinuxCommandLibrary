# TAGLINE

command-line tool for viewing and editing ID3 tags in MP3 files

# TLDR

**View ID3 tags**

```id3tag [file.mp3]```

**Set title**

```id3tag -t "[title]" [file.mp3]```

**Set artist**

```id3tag -a "[artist]" [file.mp3]```

**Set album**

```id3tag -A "[album]" [file.mp3]```

**Set year and track number**

```id3tag -y [2024] -T [1] [file.mp3]```

**Set genre**

```id3tag -g "[Rock]" [file.mp3]```

**Remove all tags**

```id3tag -D [file.mp3]```

# SYNOPSIS

**id3tag** [_options_] _file_...

# PARAMETERS

**-t** _title_
> Set song title.

**-a** _artist_
> Set artist name.

**-A** _album_
> Set album name.

**-y** _year_
> Set release year.

**-T** _num_
> Set track number.

**-g** _genre_
> Set genre.

**-c** _comment_
> Set comment.

**-D**
> Delete all tags.

**-v**
> Verbose output.

# DESCRIPTION

**id3tag** is a command-line tool for viewing and editing ID3 tags in MP3 files. Supports both ID3v1 and ID3v2 tags. Can set title, artist, album, year, track number, genre, and comments. Useful for batch tagging with shell scripts.

# SEE ALSO

[id3v2](/man/id3v2)(1), [eyeD3](/man/eyeD3)(1), [mp3info](/man/mp3info)(1)

