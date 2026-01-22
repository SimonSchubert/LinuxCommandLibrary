# TLDR

**Start MOC**

```mocp```

**Start server only**

```mocp -S```

**Play file**

```mocp -l [file.mp3]```

**Add to playlist**

```mocp -a [file.mp3]```

**Play/pause**

```mocp -G```

**Next track**

```mocp -f```

**Stop server**

```mocp -x```

# SYNOPSIS

**mocp** [_options_] [_files_]

# PARAMETERS

_FILES_
> Audio files to play.

**-S**
> Start server.

**-l** _FILE_
> Play file.

**-a** _FILE_
> Add to playlist.

**-G**
> Toggle play/pause.

**-f**
> Next track.

**-x**
> Stop server.

**--help**
> Display help information.

# DESCRIPTION

**moc** (Music On Console) is a terminal audio player. It uses a client-server architecture.

The tool plays in background. Supports many formats via plugins. ncurses interface.

moc is terminal music player.

# CAVEATS

Server runs separately. ncurses interface. Plugin-based format support.

# HISTORY

MOC was created to provide a console-based **music player** with background playback support.

# SEE ALSO

[mpd](/man/mpd)(1), [cmus](/man/cmus)(1), [mpv](/man/mpv)(1)

