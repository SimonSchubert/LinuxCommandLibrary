# TAGLINE

Command-line interface for controlling the Audacious media player.

# TLDR

**Get** current song

```audtool current-song```

**Play/Pause** playback

```audtool playback-playpause```

**Skip** to next track

```audtool playlist-advance```

Get **playback status**

```audtool playback-status```

Set **volume**

```audtool set-volume [75]```

# SYNOPSIS

**audtool** _command_ [_arguments_]

# DESCRIPTION

**audtool** is a command-line interface for controlling the Audacious media player. It allows remote control, playlist management, and status queries without opening the GUI.

The tool is useful for scripts, keybindings, and automation.

# PARAMETERS

**playback-play**
> Start playback

**playback-pause**
> Pause playback

**playback-playpause**
> Toggle play/pause

**playback-stop**
> Stop playback

**playback-status**
> Show playback status

**playlist-advance**
> Next track

**playlist-reverse**
> Previous track

**current-song**
> Print current song info

**current-song-filename**
> Print filename of current song

**set-volume** _n_
> Set volume (0-100)

**get-volume**
> Get current volume

**playlist-length**
> Number of tracks in playlist

**playlist-song** _n_
> Get song at position n

# CAVEATS

Requires Audacious to be running. Commands fail if player is not active. Some features depend on Audacious version.

# HISTORY

**audtool** was developed alongside Audacious to provide scriptable control, continuing the tradition of beep-media-player-control and xmmsctrl.

# SEE ALSO

[audacious](/man/audacious)(1), [playerctl](/man/playerctl)(1)
