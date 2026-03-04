# TAGLINE

Command-line interface music player

# TLDR

**Play** media files

```climp --play [/path/to/song.mp3]```

**Play** a web radio stream

```climp --play [http://example.com/stream]```

**Create** a playlist and start playback

```climp --playlist [song1.mp3] [song2.mp3] --play```

**Add** files to the current playlist

```climp --add [newsong.mp3] [myplaylist.m3u]```

**Set** volume to 80

```climp --volume 80```

**Seek** to 1 minute 30 seconds

```climp --seek 1:30```

**Show** the currently playing track

```climp --current```

**Quit** the daemon

```climp --quit```

# SYNOPSIS

**climp** **--**_cmd1_ [[_arg1_] ...] **--**_cmd2_ [[_arg1_] ...]

# PARAMETERS

**--play** [_args_]
> Start playback. Arguments can be media files, .m3u/.txt playlists, URIs, or a playlist index (0-based, negative indices supported).

**--add** [_files_]
> Add media files or playlists to the current playlist.

**--playlist** [_args_]
> Without args: print current playlist with metadata. With args: set a new playlist.

**--current**, **-c**
> Show the currently playing track with position, duration, title, artist, album.

**--next**, **-n**
> Play the next track in the playlist.

**--pause**
> Toggle pause/unpause.

**--stop**
> Stop playback.

**--volume** [_int_], **-v**
> Get or set the volume level.

**--seek** _time_
> Seek to a position. Formats: m:ss, m.ss, or seconds.

**--speed** [_float_]
> Get or set the playback speed.

**--pitch** [_float_]
> Get or set the playback pitch.

**--shuffle** [_bool_]
> Set playlist shuffle on or off.

**--repeat** [_bool_]
> Set playlist repeat on or off.

**--mute** [_bool_], **-m**
> Toggle mute or set on/off.

**--clear**
> Clear the current playlist.

**--remove** [_indices_]
> Remove tracks from the playlist by index.

**--sort**
> Sort the playlist alphabetically by file path.

**--stdin**, **-i**
> Read playlist entries from stdin for piping.

**--quit**, **-q**
> Shut down the climpd daemon.

# DESCRIPTION

**climp** is a lightweight terminal-based music player written in C that uses a client-daemon architecture. The **climp** binary is a thin client that sends commands over a Unix domain socket to **climpd**, the background daemon that handles actual audio playback via GStreamer. If the daemon is not running when a command is issued, climp automatically spawns it. It supports local media files, network streams (web radio), and playlist management (.m3u and .txt formats).

A companion utility **climp-discover** recursively discovers media files in directories for piping into climp.

# CONFIGURATION

Configuration stored at **~/.config/climp/climpd.conf**. Playlists stored at **~/.config/climp/playlists/**. Settings include volume, pitch, speed, repeat, shuffle, column width, and whether to persist changes on quit.

# CAVEATS

Cannot run as root. Requires GStreamer and its plugins for codec support. The project has not been updated since 2016. Requires the author's custom **libvci** library for building. First-time playlist display may be slow while parsing metadata.

# HISTORY

**climp** was created by **Steffen Nuessl** in **February 2014**. Written in C and licensed under GPL-3.0. The repository accumulated 153 commits and was last active around January 2016. Developed and tested on Arch Linux and Debian Jessie.

# SEE ALSO

[cmus](/man/cmus)(1), [moc](/man/moc)(1), [mpd](/man/mpd)(1), [mpc](/man/mpc)(1), [mpv](/man/mpv)(1)
