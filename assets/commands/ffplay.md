# TLDR

**Play media file**

```ffplay [video.mp4]```

**Play with specific** size

```ffplay -x [640] -y [480] [video.mp4]```

**Loop playback**

```ffplay -loop [0] [video.mp4]```

**Play audio only**

```ffplay -nodisp [audio.mp3]```

**Seek to position**

```ffplay -ss [00:01:30] [video.mp4]```

# SYNOPSIS

**ffplay** [_options_] _input_

# PARAMETERS

_INPUT_
> Media file or stream to play.

**-x** _WIDTH_
> Display width.

**-y** _HEIGHT_
> Display height.

**-loop** _N_
> Loop count (0 = infinite).

**-nodisp**
> Disable display (audio only).

**-ss** _TIME_
> Start position.

**-t** _DURATION_
> Play duration.

**-vf** _FILTER_
> Video filter.

**-af** _FILTER_
> Audio filter.

**-fs**
> Start fullscreen.

**--help**
> Display help information.

# DESCRIPTION

**ffplay** is a simple media player using the ffmpeg libraries. It plays virtually any audio or video format that ffmpeg supports, making it useful for testing filters and previewing encodes.

The player provides basic controls via keyboard: space for pause, arrows for seeking, and q to quit. It can apply filters in real-time for previewing effects before encoding.

ffplay is primarily a development and testing tool rather than a full-featured media player.

# CAVEATS

Minimal UI compared to full players. No playlist support. Filter preview may not match final output exactly.

# HISTORY

ffplay was created as a reference player demonstrating ffmpeg's decoding capabilities. It serves as both a testing tool and simple player for formats that other players might not support.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mpv](/man/mpv)(1), [vlc](/man/vlc)(1)
