# TLDR

**Capture a single JPEG image**

```streamer -o [image.jpeg]```

**Capture from specific video device**

```streamer -c /dev/video[0] -o [image.jpeg]```

**Record video to AVI file**

```streamer -o [video.avi] -f mjpeg -t [00:30]```

**Capture with specific resolution**

```streamer -s [640x480] -o [image.jpeg]```

**Capture sequence of images**

```streamer -o [frame000.jpeg] -t [00:10] -r [5]```

**Record with audio**

```streamer -o [video.avi] -f mjpeg -F stereo -t [01:00]```

**Set color depth**

```streamer -b [24] -o [image.jpeg]```

# SYNOPSIS

**streamer** [_options_]

# PARAMETERS

**-o** _file_
> Output filename. Use numbered pattern (file000.jpeg) for sequences.

**-c** _device_
> Video capture device (default: /dev/video0).

**-s** _WxH_
> Capture resolution (e.g., 320x240, 640x480, 720x480).

**-r** _fps_
> Frames per second for video capture.

**-t** _time_
> Recording duration in HH:MM:SS or MM:SS format.

**-f** _format_
> Output format: jpeg, ppm, pgm, mjpeg, rgb24, raw, avi.

**-F** _audio_
> Audio format: mono or stereo.

**-b** _bpp_
> Color depth in bits per pixel (15, 16, 24, or 32).

**-n** _norm_
> TV norm: ntsc, pal, or secam.

**-i** _input_
> Video input source number.

**-q**
> Quiet mode, suppress output messages.

**-h**
> Display help information.

# DESCRIPTION

**streamer** is a command-line utility for capturing still images and video from webcams, TV tuners, and other Video4Linux devices. It is part of the xawtv package and provides scriptable video capture without requiring a graphical interface.

The tool can capture single images, timed sequences of images, or continuous video recordings. Output formats include JPEG for images and MJPEG AVI for video. When capturing image sequences, numbered filenames are generated automatically if the output filename contains zeros (e.g., frame000.jpeg).

Audio capture is supported for video recordings when using compatible capture devices. The tool is useful for time-lapse photography, surveillance, and automated image capture scenarios.

# CAVEATS

Requires Video4Linux (V4L/V4L2) compatible capture device. Some distributions package streamer separately from xawtv as xawtv-tools or v4l-tools. Format support depends on hardware capabilities. For modern webcams, consider using ffmpeg which offers more format options.

# HISTORY

**streamer** was developed as part of the xawtv project, a suite of analog TV and video capture tools for Linux. It provided command-line capture functionality alongside the graphical xawtv application. The tool predates many modern capture utilities and remains useful for simple V4L-based capture tasks.

# SEE ALSO

[xawtv](/man/xawtv)(1), [ffmpeg](/man/ffmpeg)(1), [v4l2-ctl](/man/v4l2-ctl)(1), [cheese](/man/cheese)(1)
