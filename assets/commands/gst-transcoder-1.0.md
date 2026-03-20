# TAGLINE

GStreamer media transcoder

# TLDR

**Transcode a video file** to WebM format (auto-detected from extension)

```gst-transcoder-1.0 file:///[path/to/input.mp4] file:///[path/to/output.webm]```

**Transcode with a specific encoding format**

```gst-transcoder-1.0 file:///[path/to/input.mp4] file:///[path/to/output.mkv] "[encoding_format]"```

**Transcode and resize** the video to a specific frame size

```gst-transcoder-1.0 -s [1280x720] file:///[path/to/input.mp4] file:///[path/to/output.mp4]```

**Transcode with a specific video framerate**

```gst-transcoder-1.0 -f [30/1] file:///[path/to/input.mp4] file:///[path/to/output.mp4]```

**List all available encoding targets**

```gst-transcoder-1.0 -l```

**Limit CPU usage** during transcoding

```gst-transcoder-1.0 -c [50] file:///[path/to/input.mp4] file:///[path/to/output.mp4]```

# SYNOPSIS

**gst-transcoder-1.0** [_options_] _input-uri_ _output-uri_ [_encoding-format_[/_profile-name_]]

# PARAMETERS

**-h**, **--help**
> Show help options.

**--help-all**
> Show all help options.

**--help-gst**
> Show GStreamer-specific options.

**-c**, **--cpu-usage** _PERCENT_
> Target CPU usage percentage for the transcoding process.

**-l**, **--list-targets**
> List all available encoding targets and exit.

**-s**, **--size** _WxH_
> Set the output video frame size (e.g. 1280x720).

**-r**, **--audio-rate** _HZ_
> Set the audio sampling rate in Hz.

**-f**, **--framerate** _FRACTION_
> Set the video framerate as a fraction (e.g. 24/1) or a single number (e.g. 24).

**-v**, **--video-encoder** _ENCODER_
> Specify the video encoder element to use.

# DESCRIPTION

**gst-transcoder-1.0** is a command-line tool that transcodes multimedia streams from one format to another using the GStreamer framework. It reads from an input URI, processes the media, and writes to an output URI in the specified encoding format.

The encoding format can be specified explicitly as a serialization string (e.g. **muxer_caps:video_caps:audio_caps**), as a named target from **.gep** profile files, or omitted entirely to let the tool guess the format from the output file extension.

The tool uses the GStreamer Transcoder API internally, leveraging **decodebin** and **encodebin** elements for automatic format detection and encoding.

# CAVEATS

Input and output paths must be specified as URIs with the **file:///** prefix, not as plain file paths. The available encoding formats depend on which GStreamer plugins are installed on the system. The CPU usage throttling is approximate and depends on system load. Complex transcoding scenarios may require explicit encoding format strings rather than relying on file extension detection.

# HISTORY

**gst-transcoder-1.0** was originally developed as part of the **Pitivi** video editor project to provide transcoding functionality. It was later integrated into **gst-plugins-bad**, becoming a standard GStreamer utility. The tool builds on the GstTranscoder library, which provides a simplified high-level API for media transcoding on top of GStreamer's pipeline framework.

# SEE ALSO

[gst-launch-1.0](/man/gst-launch-1.0)(1), [gst-inspect-1.0](/man/gst-inspect-1.0)(1), [ges-launch-1.0](/man/ges-launch-1.0)(1), [ffmpeg](/man/ffmpeg)(1)
