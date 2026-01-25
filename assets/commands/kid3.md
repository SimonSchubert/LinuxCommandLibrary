# TLDR

**Start Kid3**

```kid3```

**Open directory**

```kid3 [/path/to/music]```

**Command-line tagging**

```kid3-cli -c "[get title]" [file.mp3]```

**Set tag value**

```kid3-cli -c "[set title 'My Song']" [file.mp3]```

**Batch convert**

```kid3-cli -c "[fromtag '%{artist} - %{title}' 2]" [*.mp3]```

# SYNOPSIS

**kid3** [_options_] [_directory_]

**kid3-cli** [_options_] [_files_...]

# PARAMETERS

_directory_
> Music directory to open.

**-c** _command_
> Execute command (kid3-cli).

# DESCRIPTION

**Kid3** is an audio tag editor supporting MP3, Ogg Vorbis, FLAC, MPC, MP4/AAC, and other formats. It can edit ID3v1, ID3v2, APE, Vorbis, and other tag formats.

The application provides batch editing, filename-to-tag and tag-to-filename conversion, and import from online databases like MusicBrainz and Discogs.

# CLI COMMANDS

```bash
# Get tag
kid3-cli -c "get artist" song.mp3

# Set multiple tags
kid3-cli -c "set artist 'Band'" -c "set album 'Album'" song.mp3

# Rename from tags
kid3-cli -c "fromtag '%{track} - %{title}' 2" *.mp3

# Export to CSV
kid3-cli -c "export export.csv 'CSV'" .
```

# CAVEATS

Different tag versions may conflict. Batch operations should be previewed. Some formats have tag limitations.

# HISTORY

Kid3 was created by **Urs Fleisch** as a simple tag editor for KDE. It evolved to support many formats and became available on multiple platforms.

# SEE ALSO

[id3v2](/man/id3v2)(1), [eyeD3](/man/eyeD3)(1), [easytag](/man/easytag)(1)
