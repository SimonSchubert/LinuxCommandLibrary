# TLDR

**Launch** the MOC terminal UI

```mocp```

Launch MOC in a **specific directory**

```mocp [path/to/directory]```

**Start server** in background without UI

```mocp -S```

**Add song** to play queue in background

```mocp -q [path/to/audio_file]```

**Add songs recursively** to play queue

```mocp -a [path/to/directory]```

**Clear** the play queue

```mocp -c```

**Play or stop** current song

```mocp --play```
```mocp --stop```

**Stop the server**

```mocp -x```

# SYNOPSIS

**mocp** [**-S**] [**-x**] [**-p**] [**-s**] [**-q**] [**-a**] [**-c**] [**-f**] [**-r**] [_file_|_dir_...]

# PARAMETERS

**-S, --server**
> Run only the server in background and exit

**-F, --foreground**
> Run server in foreground with logging to stdout

**-x, --exit**
> Shut down the MOC server

**-p, --play**
> Start playing from first playlist item

**-s, --stop**
> Stop playback

**-P, --pause**
> Pause playback

**-U, --unpause**
> Resume from pause

**-G, --toggle-pause**
> Toggle between play and pause states

**-f, --next**
> Play next song

**-r, --previous**
> Play previous song

**-q, --enqueue**
> Add files to queue without starting interface

**-a, --append**
> Append files, directories, or playlists

**-c, --clear**
> Clear the playlist

**-k _N_, --seek _N_**
> Seek forward/backward by N seconds (use +/- prefix)

**-v _N_, --volume _N_**
> Set or adjust mixer volume

**-i, --info**
> Display currently playing file information

**-T _theme_, --theme**
> Load specified theme file

**-C _file_, --config**
> Use alternate configuration file

**-m, --music-dir**
> Start in configured MusicDir

# DESCRIPTION

**MOC** (Music On Console) is a console-based audio player with an ncurses interface. It supports OGG, WAV, MP3, FLAC, and other audio formats through various decoder plugins.

The player uses a client-server architecture: the server handles playback while clients provide the interface. This allows music to continue playing after closing the interface. Navigate directories using arrow keys and press Enter to play files.

# CAVEATS

Command-line options affecting server behavior (like --sound-driver) are silently ignored if the server is already running. The server must be restarted to apply such changes. Configuration is stored in ~/.moc/ directory.

# HISTORY

**MOC** was originally developed by **Damian Pietras**. The project provides a lightweight, terminal-based alternative to graphical music players, following the Unix philosophy of doing one thing well.

# SEE ALSO

[cmus](/man/cmus)(1), [mpd](/man/mpd)(1), [ncmpcpp](/man/ncmpcpp)(1)
