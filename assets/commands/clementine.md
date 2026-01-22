# TLDR

**Start Clementine** music player

```clementine```

**Play/pause** the current track

```clementine -t```

**Skip to the next** track

```clementine -f```

**Skip to the previous** track

```clementine -r```

**Stop** playback

```clementine -s```

**Add files or URLs** to the playlist

```clementine -a [path/to/music.mp3]```

**Load and play** a file or URL immediately

```clementine -l [path/to/music.mp3]```

**Seek to a position** in the current track (in seconds)

```clementine --seek-to [120]```

# SYNOPSIS

**clementine** [_options_] [_URL_...]

# PARAMETERS

**-t**, **--play-pause**
> Toggle play/pause state.

**-f**, **--next**
> Skip to the next track in the playlist.

**-r**, **--previous**
> Skip to the previous track.

**-s**, **--stop**
> Stop playback.

**-a**, **--append**
> Append files or URLs to the current playlist.

**-l**, **--load**
> Load files or URLs, replacing the current playlist and starting playback.

**-k**, **--play-track** _N_
> Play track number N in the playlist.

**--seek-to** _SECONDS_
> Seek to absolute position in seconds.

**--seek-by** _SECONDS_
> Seek by relative amount in seconds.

**-v**, **--volume** _N_
> Set volume level (0-100).

**--volume-up**
> Increase volume by 4%.

**--volume-down**
> Decrease volume by 4%.

**-q**, **--quiet**
> Equivalent to --volume 0.

**--help**
> Display help information.

# DESCRIPTION

**Clementine** is a cross-platform music player and library organizer inspired by Amarok 1.4. It features a clean interface, smart playlists, internet radio support, and integration with cloud storage services like Google Drive, Dropbox, and OneDrive.

The command-line interface allows remote control of a running Clementine instance, making it scriptable for automation or integration with media keys and desktop shortcuts. Files and URLs passed on the command line can be appended to the playlist or played immediately.

Clementine supports a wide range of audio formats through GStreamer, including MP3, FLAC, OGG, and AAC. It can transcode audio, fetch lyrics and album art, tag files, and manage large music libraries with advanced search and filtering capabilities.

# CAVEATS

Remote control commands require a Clementine instance already running with D-Bus support (Linux) or other IPC mechanisms on macOS/Windows. Some internet radio services require authentication or may have regional restrictions.

# HISTORY

Clementine was created in **2010** as a fork of Amarok 1.4, preserving its Qt4-based interface when Amarok moved to KDE4. Named after the fruit in the Portal game, it quickly became popular for its simplicity and cross-platform support. The project spawned Strawberry as a modern continuation in **2018**.

# SEE ALSO

[mpc](/man/mpc)(1), [mpv](/man/mpv)(1), [cmus](/man/cmus)(1), [vlc](/man/vlc)(1)
