# TAGLINE

Control and query Video4Linux2 devices

# TLDR

**List** all video devices

```v4l2-ctl --list-devices```

List supported **formats** and resolutions

```v4l2-ctl --list-formats-ext```

List formats for **specific device**

```v4l2-ctl -d /dev/video0 --list-formats-ext```

Show **all details** of a device

```v4l2-ctl -d /dev/video0 --all```

**List controls** and their values

```v4l2-ctl -d /dev/video0 --list-ctrls```

**Set control** value

```v4l2-ctl -d /dev/video0 --set-ctrl brightness=128```

**Capture** a JPEG photo

```v4l2-ctl -d /dev/video0 --set-fmt-video=width=1920,height=1080,pixelformat=MJPG --stream-mmap --stream-to=photo.jpg --stream-count=1```

Capture **video stream**

```v4l2-ctl -d /dev/video0 --stream-mmap --stream-to=video.raw --stream-count=100```

# SYNOPSIS

**v4l2-ctl** [**-h**] [**-d** _dev_] [_options_]

# DESCRIPTION

**v4l2-ctl** is used to control video4linux devices, including video, VBI, radio, and swradio devices, both input and output. It provides access to nearly all V4L2 API functionality for querying and configuring video devices.

# PARAMETERS

**-d, --device DEV**
> Specify target video device (default: /dev/video0)

**-D, --info**
> Display driver capabilities

**--all**
> Show comprehensive device information

**--list-devices**
> List all video devices

**--list-formats-ext**
> List supported formats with frame sizes

**-l, --list-ctrls**
> List all available controls

**-C, --get-ctrl**
> Get control value

**-c, --set-ctrl**
> Set control value

**--set-fmt-video**
> Set video capture format (width, height, pixelformat)

**--stream-mmap**
> Capture using memory-mapped I/O

**--stream-dmabuf**
> Capture using DMA buffers

**--stream-to FILE**
> Write captured stream to file

**--stream-count N**
> Capture N frames

**-e, --out-device DEV**
> Specify output device for streaming

**-v, --verbose**
> Enable detailed output

**--help-all**
> Show complete option documentation

# CAVEATS

The default device is /dev/video0 if not specified. Format settings must match device capabilities. Raw video output requires conversion with tools like ffmpeg for playback.

# HISTORY

**v4l2-ctl** is part of the **v4l-utils** package, providing user-space utilities for Video4Linux2 API devices on Linux systems.

# SEE ALSO

[v4l2-compliance](/man/v4l2-compliance)(1), [ffmpeg](/man/ffmpeg)(1), [cheese](/man/cheese)(1)
