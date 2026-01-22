# TLDR

**Play video file**

```mpv [video.mp4]```

**Play audio file**

```mpv [audio.mp3]```

**Play fullscreen**

```mpv --fullscreen [video.mp4]```

**Play from URL**

```mpv "[https://example.com/video.mp4]"```

**Loop playback**

```mpv --loop [video.mp4]```

**Set start time**

```mpv --start=[00:01:30] [video.mp4]```

**Play without video**

```mpv --no-video [file.mp4]```

**Specify audio device**

```mpv --audio-device=[pulse] [file]```

# SYNOPSIS

**mpv** [_options_] _file_|_url_

# PARAMETERS

_FILE_
> Media file or URL to play.

**--fullscreen**
> Start in fullscreen.

**--loop**
> Loop playback infinitely.

**--start** _TIME_
> Start at specified time.

**--no-video**
> Audio only mode.

**--volume** _LEVEL_
> Set volume percentage.

**--help**
> Display help information.

# DESCRIPTION

**mpv** is a modern media player based on MPlayer and mplayer2. It plays video and audio.

The tool supports many formats. Scriptable with Lua and JavaScript. Highly configurable.

mpv is modern media player.

# CAVEATS

Keyboard controlled. Config in ~/.config/mpv/. GPU acceleration varies by platform.

# HISTORY

mpv forked from **MPlayer2** in 2012 to provide a cleaner, more modern media player with active development.

# SEE ALSO

[mplayer](/man/mplayer)(1), [vlc](/man/vlc)(1), [ffplay](/man/ffplay)(1)

