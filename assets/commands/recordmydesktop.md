# TAGLINE

Record desktop screen to video file

# TLDR

**Record full screen**

```recordmydesktop -o [output.ogv]```

**Record specific window**

```recordmydesktop --windowid $(xdotool selectwindow) -o [output.ogv]```

**Record area**

```recordmydesktop -x [100] -y [100] --width [800] --height [600] -o [output.ogv]```

**Record without sound**

```recordmydesktop --no-sound -o [output.ogv]```

# SYNOPSIS

**recordmydesktop** [_options_]

# PARAMETERS

**-o** _file_
> Output file.

**--windowid** _id_
> Record specific window.

**-x**, **-y**
> Starting position.

**--width**, **--height**
> Recording dimensions.

**--no-sound**
> Disable audio.

**--fps** _n_
> Frames per second.

**--delay** _n_
> Delay before start.

**--on-the-fly-encoding**
> Encode while recording.

# DESCRIPTION

**recordmydesktop** is a lightweight screen recorder for Linux X11 sessions that captures desktop video and audio to Ogg Theora/Vorbis format. It can record the full screen, a specific window selected by ID, or a rectangular region defined by position and dimensions.

Audio is captured from the default ALSA or OSS input device and can be disabled with **--no-sound**. Recording is stopped with Ctrl+C, after which the tool encodes the captured frames into the final output file. The **--on-the-fly-encoding** option encodes during recording to reduce post-processing time at the cost of higher CPU usage.

# EXAMPLES

```bash
# Record full screen
recordmydesktop -o screencast.ogv

# Record window (click to select)
recordmydesktop --windowid $(xdotool selectwindow)

# Record region
recordmydesktop -x 0 -y 0 --width 1280 --height 720 -o region.ogv

# High quality
recordmydesktop --v_quality 63 --s_quality 10 -o hq.ogv

# No cursor
recordmydesktop --no-cursor -o nocursor.ogv
```

# CONTROLS

```
Ctrl+C       - Stop recording
Ctrl+Alt+P   - Pause (if enabled)
```

# CAVEATS

X11 only (no Wayland). Output is Ogg format. Convert with ffmpeg for other formats.

# HISTORY

recordmydesktop was created by **John Googalidis** as a simple, efficient screen recorder for Linux.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [peek](/man/peek)(1), [obs](/man/obs)(1), [simplescreenrecorder](/man/simplescreenrecorder)(1)
