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

**-dumpaudio**
> Dump raw audio stream to a file.

**-dumpfile** _FILE_
> Filename for dumped audio/video stream.

**-speed** _FACTOR_
> Playback speed multiplier (0.01-100, default: 1.0).

**-quiet**
> Suppress most status messages.

**-identify**
> Print media properties (useful for scripting).

# DESCRIPTION

**mplayer** is a powerful, command-line media player that supports a vast range of audio and video formats. It uses FFmpeg's libavcodec and libavformat for decoding, along with native codecs for some formats.

Keyboard shortcuts control playback: arrow keys seek, **p** pauses, **q** quits, **f** toggles fullscreen, and **+/-** adjusts audio delay. The player can also be controlled via a FIFO pipe or slave mode for scripting.

# CAVEATS

MPlayer is considered legacy software; **mpv** is its actively maintained successor with a modern codebase. Some distributions no longer package MPlayer. Configuration files are in **~/.mplayer/**.

# HISTORY

**MPlayer** was started by **Árpád Gereöffy** in **2000**. It became one of the most popular open-source media players on Linux and influenced several successors including **mpv** (forked in 2013) and **MPlayer2**.

# SEE ALSO

[mpv](/man/mpv)(1), [vlc](/man/vlc)(1), [ffplay](/man/ffplay)(1)

