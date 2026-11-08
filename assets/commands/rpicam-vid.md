# TAGLINE

Record video from Raspberry Pi camera

# TLDR

**Capture** a 10 second video

```rpicam-vid -t 10000 -o path/to/file.h264```

Record directly to an **MP4** file

```rpicam-vid -t 10000 --codec libav -o path/to/file.mp4```

Record at **1080p 30fps** without a preview

```rpicam-vid -n -t 10000 --width 1920 --height 1080 --framerate 30 -o path/to/file.h264```

**Stream** over TCP until interrupted

```rpicam-vid -t 0 --inline --listen -o tcp://0.0.0.0:8888```

**Pipe** the encoded video to another program

```rpicam-vid -t 0 -n -o - | ffmpeg -i - [output.mkv]```

# SYNOPSIS

**rpicam-vid** [_options_]

# PARAMETERS

**-t**, **--timeout** _time_
> Recording duration (default 5sec; plain numbers are milliseconds; 0 runs indefinitely)

**-o**, **--output** _file_
> Output file, **-** for stdout, or a network URL

**-n**, **--nopreview**
> Do not show a preview window

**--width** _pixels_, **--height** _pixels_
> Video dimensions

**--framerate** _fps_
> Frames per second

**--codec** _name_
> Encoder: h264 (default), libav, mjpeg or yuv420

**--libav-format** _format_
> libav container format; deduced from the filename when blank

**-b**, **--bitrate** _rate_
> Video bitrate (plain numbers are bits per second)

**--inline**
> Repeat the H.264 PPS/SPS headers with every I frame, needed for streaming

**-l**, **--listen**
> Wait for an incoming client connection before streaming

**--segment** _ms_
> Split the recording into files of approximately this many milliseconds

# DESCRIPTION

**rpicam-vid** captures encoded video using a Raspberry Pi camera. By default it produces H.264 encoded video, suitable for direct playback or further processing.

The tool supports various output formats and encoding options for different use cases.

# CAVEATS

The default h264 codec writes a bare H.264 stream with no container, even if the output name ends in .mp4. Use **--codec libav** for MP4 or other containers, or remux afterwards with ffmpeg.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite using libcamera. Formerly named **libcamera-vid**; replaces the legacy **raspivid**.

# SEE ALSO

[rpicam-raw](/man/rpicam-raw)(1), [rpicam-still](/man/rpicam-still)(1), [vlc](/man/vlc)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/raspberrypi/rpicam-apps)```

```[Documentation](https://www.raspberrypi.com/documentation/computers/camera_software.html)```

<!-- verified: 2026-11-08 -->
