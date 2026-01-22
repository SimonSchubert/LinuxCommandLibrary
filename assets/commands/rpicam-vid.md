# TLDR

**Capture** a 10 second video

```rpicam-vid -t 10000 -o path/to/file.h264```

# SYNOPSIS

**rpicam-vid** [_options_]

# PARAMETERS

**-t**, **--timeout** _ms_
> Recording duration in milliseconds

**-o**, **--output** _file_
> Output file path (.h264, .mp4, etc.)

# DESCRIPTION

**rpicam-vid** captures encoded video using a Raspberry Pi camera. By default it produces H.264 encoded video, suitable for direct playback or further processing.

The tool supports various output formats and encoding options for different use cases.

# CAVEATS

H.264 raw streams may need container wrapping for some players. Use ffmpeg or similar to convert to MP4 if needed.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite using libcamera. Replaces legacy raspivid.

# SEE ALSO

[rpicam-raw](/man/rpicam-raw)(1), [rpicam-still](/man/rpicam-still)(1), [vlc](/man/vlc)(1), [ffmpeg](/man/ffmpeg)(1)
