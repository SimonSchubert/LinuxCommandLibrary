# TAGLINE

encodes video from MPlayer

# TLDR

**Convert video**

```mencoder [input.avi] -o [output.mp4] -ovc lavc -oac mp3lame```

**Extract audio**

```mencoder [video.avi] -o [audio.mp3] -ovc copy -oac mp3lame```

**Resize video**

```mencoder [input.avi] -o [output.avi] -vf scale=[640:480] -ovc lavc -oac copy```

**Two-pass encoding**

```mencoder [input.avi] -o /dev/null -ovc lavc -lavcopts vpass=1 && mencoder [input.avi] -o [output.avi] -ovc lavc -lavcopts vpass=2```

**Join videos**

```mencoder -ovc copy -oac copy -o [joined.avi] [file1.avi] [file2.avi]```

# SYNOPSIS

**mencoder** [_options_] _input_ -o _output_

# PARAMETERS

_INPUT_
> Input media file.

**-o** _FILE_
> Output file.

**-ovc** _CODEC_
> Video codec.

**-oac** _CODEC_
> Audio codec.

**-vf** _FILTERS_
> Video filters.

**--help**
> Display help information.

# DESCRIPTION

**mencoder** encodes video from MPlayer. It converts between formats and applies filters.

The tool is part of MPlayer project. Superseded by FFmpeg in many cases.

# CAVEATS

MPlayer project (legacy). FFmpeg often preferred. Complex options.

# HISTORY

mencoder was the encoding companion to **MPlayer**, providing video conversion capabilities.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mplayer](/man/mplayer)(1), [handbrake](/man/handbrake)(1)

