# TAGLINE

build and run GStreamer multimedia pipelines

# TLDR

**Play a video file**

```gst-launch-1.0 filesrc location=[video.mp4] ! decodebin ! autovideosink```

**Display test video pattern**

```gst-launch-1.0 videotestsrc ! autovideosink```

**Play audio file**

```gst-launch-1.0 filesrc location=[audio.mp3] ! decodebin ! autoaudiosink```

**Display webcam**

```gst-launch-1.0 v4l2src ! autovideosink```

**Stream from RTSP**

```gst-launch-1.0 rtspsrc location=[rtsp://url] ! decodebin ! autovideosink```

**Verbose output**

```gst-launch-1.0 -v videotestsrc ! autovideosink```

**Send EOS on interrupt**

```gst-launch-1.0 -e filesrc location=[video.mp4] ! decodebin ! autovideosink```

# SYNOPSIS

**gst-launch-1.0** [_options_] _pipeline-description_

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**-e**, **--eos-on-shutdown**
> Send EOS on interrupt for clean shutdown.

**--gst-debug-level** _N_
> Set debug level (0-9).

**-q**, **--quiet**
> Suppress status output.

# DESCRIPTION

**gst-launch-1.0** builds and runs GStreamer multimedia pipelines from the command line. Elements are linked with **!** (exclamation mark), and properties are set with **name=value** syntax.

Caps filters constrain formats between elements (e.g., **video/x-raw,width=640,height=480**). Use **decodebin** or **playbin** for automatic codec selection.

# SEE ALSO

[gst-inspect-1.0](/man/gst-inspect-1.0)(1), [gst-discoverer-1.0](/man/gst-discoverer-1.0)(1), [ffmpeg](/man/ffmpeg)(1)
