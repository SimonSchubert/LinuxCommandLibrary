# TAGLINE

powerful media player

# TLDR

**Play video file**

```mplayer [video.mp4]```

**Play audio file**

```mplayer [audio.mp3]```

**Play fullscreen**

```mplayer -fs [video.mp4]```

**Specify audio output**

```mplayer -ao [alsa] [file]```

**Loop playback**

```mplayer -loop [0] [file]```

**Set start position**

```mplayer -ss [00:01:30] [video.mp4]```

**Dump audio stream**

```mplayer -dumpaudio -dumpfile [out.mp3] [video.mp4]```

# SYNOPSIS

**mplayer** [_options_] _file_

# PARAMETERS

_FILE_
> Media file to play.

**-fs**
> Fullscreen mode.

**-ao** _DRIVER_
> Audio output driver.

**-vo** _DRIVER_
> Video output driver.

**-loop** _N_
> Loop count (0=infinite).

**-ss** _TIME_
> Seek to position.

**--help**
> Display help information.

# DESCRIPTION

**mplayer** is a powerful media player. It plays almost any audio and video format.

The tool supports many codecs. Keyboard controlled with extensive command-line options.

# CAVEATS

Legacy player. Consider mpv as successor. Keyboard controls in terminal.

# HISTORY

MPlayer was created in **2000** as an open-source media player, becoming foundational for mpv and others.

# SEE ALSO

[mpv](/man/mpv)(1), [vlc](/man/vlc)(1), [ffplay](/man/ffplay)(1)

