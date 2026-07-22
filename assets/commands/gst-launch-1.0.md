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
> Verbose output, prints properties and tags as the pipeline runs.

**-q**, **--quiet**
> Suppress status output (position, progress).

**-e**, **--eos-on-shutdown**
> Send EOS on interrupt for clean shutdown, instead of stopping abruptly.

**-m**, **--messages**
> Output messages posted on the pipeline's bus.

**-t**, **--tags**
> Output tags (metadata) found in the stream.

**-f**, **--no-fault**
> Do not install a fault handler (segfault backtrace helper).

**--gst-debug=**_STRING_
> Set debug levels for specific categories (e.g., **GST_SCHEDULING:5**).

**--gst-debug-level=**_N_
> Set global debug level (0-9).

**--gst-plugin-path=**_PATH_
> Add extra directories to scan for plugins.

# DESCRIPTION

**gst-launch-1.0** builds and runs GStreamer multimedia pipelines from the command line. Elements are linked with **!** (exclamation mark), and properties are set with **name=value** syntax.

Caps filters constrain formats between elements (e.g., **video/x-raw,width=640,height=480**). Use **decodebin** or **playbin** for automatic codec selection.

# CAVEATS

Intended for testing and prototyping pipelines, not as a robust playback application. Press Ctrl+C to stop; without **-e** the pipeline stops immediately rather than draining buffered data.

# INSTALL

```apt: sudo apt install gstreamer1.0-tools```

```apk: sudo apk add gstreamer-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gst-inspect-1.0](/man/gst-inspect-1.0)(1), [gst-discoverer-1.0](/man/gst-discoverer-1.0)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Homepage](https://gstreamer.freedesktop.org/)```

```[Source code](https://gitlab.freedesktop.org/gstreamer/gstreamer)```

```[Documentation](https://gstreamer.freedesktop.org/documentation/tools/gst-launch.html)```

<!-- verified: 2026-07-17 -->
