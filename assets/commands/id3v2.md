# TLDR

**List** all available genres

```id3v2 -L```

**List** all tags of specific files

```id3v2 -l [path/to/file.mp3]```

**Delete** id3v2 tags from files

```id3v2 --delete-v2 [path/to/file.mp3]```

**Delete** id3v1 tags from files

```id3v2 --delete-v1 [path/to/file.mp3]```

Display **help**

```id3v2 -h```

# SYNOPSIS

**id3v2** [_options_] [_files_]

# PARAMETERS

**-L**, **--list-genres**
> List all available genre codes

**-l**, **--list**
> List all tags in the specified files

**--delete-v2**
> Delete all id3v2 tags

**--delete-v1**
> Delete all id3v1 tags

**-a**, **--artist** _ARTIST_
> Set the artist tag

**-A**, **--album** _ALBUM_
> Set the album tag

**-t**, **--song** _TITLE_
> Set the song title tag

**-g**, **--genre** _GENRE_
> Set the genre (number or name)

**-y**, **--year** _YEAR_
> Set the year tag

**-T**, **--track** _NUM/TOTAL_
> Set track number

# DESCRIPTION

**id3v2** is a command-line tool for viewing and editing ID3v2 tags in MP3 files. It also handles ID3v1 tags and can convert between the two versions.

ID3 tags store metadata like artist, album, title, year, and genre within MP3 files. The id3v2 format supports extended information including album art, lyrics, and custom frames.

# CAVEATS

Some poorly-encoded files may have corrupted tags. ID3v2 tags can be at the beginning or end of the file. Editing tags doesn't re-encode the audio. Some players may cache tag information.

# HISTORY

ID3v2 was developed as an extension to the original ID3v1 tag format, which was limited to 30 characters per field. ID3v2 was introduced in **1998** and supports Unicode, embedded images, and virtually unlimited field lengths.

# SEE ALSO

[mid3v2](/man/mid3v2)(1), [eyeD3](/man/eyeD3)(1), [ffmpeg](/man/ffmpeg)(1)
