# TAGLINE

MLT command-line video editor

# TLDR

**Play video**

```melt [video.mp4]```

**Render to file**

```melt [input.mp4] -consumer avformat:[output.mp4]```

**Add filter**

```melt [video.mp4] -filter [sepia]```

**Mix audio**

```melt [video.mp4] -mix [10] -mixer [mix:-1]```

**Set output profile**

```melt -profile [atsc_1080p_25] [input.mp4]```

**Concatenate clips**

```melt [clip1.mp4] [clip2.mp4] -consumer avformat:[output.mp4]```

# SYNOPSIS

**melt** [_options_] _input_ [_filters_]

# PARAMETERS

_INPUT_
> Input media file.

**-consumer** _TYPE_
> Output consumer.

**-filter** _NAME_
> Apply filter.

**-profile** _NAME_
> Use profile.

**-mix** _FRAMES_
> Transition frames.

**--help**
> Display help information.

# DESCRIPTION

**melt** is the MLT command-line video editor. It processes video with filters and transitions.

The tool is MLT framework's utility. Used for scripted video editing and effects.

# CAVEATS

Complex syntax. MLT framework knowledge helpful. Part of MLT package.

# HISTORY

melt is the command-line tool for **MLT Multimedia Framework**, used by Kdenlive and Shotcut.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [kdenlive](/man/kdenlive)(1), [shotcut](/man/shotcut)(1)

