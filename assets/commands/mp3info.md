# TLDR

**Show MP3 info**

```mp3info [file.mp3]```

**Set title tag**

```mp3info -t "[Song Title]" [file.mp3]```

**Set artist tag**

```mp3info -a "[Artist Name]" [file.mp3]```

**Set album tag**

```mp3info -l "[Album Name]" [file.mp3]```

**Set year tag**

```mp3info -y [2024] [file.mp3]```

**Set track number**

```mp3info -n [1] [file.mp3]```

**Delete all tags**

```mp3info -d [file.mp3]```

# SYNOPSIS

**mp3info** [_options_] _files_

# PARAMETERS

_FILES_
> MP3 files to process.

**-t** _TITLE_
> Set title tag.

**-a** _ARTIST_
> Set artist tag.

**-l** _ALBUM_
> Set album tag.

**-y** _YEAR_
> Set year tag.

**-n** _NUM_
> Set track number.

**-d**
> Delete all ID3 tags.

**--help**
> Display help information.

# DESCRIPTION

**mp3info** displays and edits MP3 file ID3 tags. It's a lightweight tag editor.

The tool reads ID3v1 tags. Shows bitrate, duration, and other technical info.

mp3info is MP3 tag viewer/editor.

# CAVEATS

ID3v1 focused. Limited ID3v2 support. Consider id3v2 for advanced editing.

# HISTORY

mp3info was created as a simple **ID3 tag** viewer and editor for command-line MP3 management.

# SEE ALSO

[id3v2](/man/id3v2)(1), [eyeD3](/man/eyeD3)(1), [ffprobe](/man/ffprobe)(1)

