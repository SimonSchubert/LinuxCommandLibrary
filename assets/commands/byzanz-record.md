# TAGLINE

Record screen sessions as animated GIFs or videos

# TLDR

**Record** the screen to a file (default 10 seconds)

```byzanz-record [path/to/file.gif]```

Show **verbose** information during recording

```byzanz-record -v [path/to/file.gif]```

Record for a **specific duration**

```byzanz-record -d 60 [path/to/file.gif]```

**Delay** before starting recording

```byzanz-record --delay 10 [path/to/file.gif]```

# SYNOPSIS

**byzanz-record** [_options_] _file_

# DESCRIPTION

**byzanz-record** captures screen recordings and saves them in various formats including GIF, WebM, OGV, and FLV. It is designed for creating short screencasts and animated GIFs for documentation or demonstrations.

By default, recording lasts 10 seconds. The tool supports recording specific windows or screen regions.

# PARAMETERS

**-d, --duration** _seconds_
> Recording duration in seconds

**--delay** _seconds_
> Delay before starting recording

**-v, --verbose**
> Show information during and after recording

**-x, -y** _pixels_
> X and Y position of recording area

**-w, --width** _pixels_
> Width of recording area

**-h, --height** _pixels_
> Height of recording area

**-c, --cursor**
> Record cursor movements

# OUTPUT FORMATS

- **.gif** - Animated GIF
- **.webm** - WebM video
- **.ogv/.ogg** - Ogg Theora video
- **.flv** - Flash video
- **.byzanz** - Native format

# CAVEATS

GIF output can produce large files for long recordings. Works only with X11, not Wayland. Recording high-resolution screens may be resource-intensive.

# SEE ALSO

[peek](/man/peek)(1), [ffmpeg](/man/ffmpeg)(1), [recordmydesktop](/man/recordmydesktop)(1)
