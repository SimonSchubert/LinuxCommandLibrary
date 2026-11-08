# TAGLINE

Capture JPEG images from Raspberry Pi camera

# TLDR

**Capture** an image and save to file (after the default 5 second preview)

```rpicam-jpeg -o path/to/file.jpg```

Capture **quickly without a preview** window

```rpicam-jpeg -n -t 1000 -o path/to/file.jpg```

Capture with **set dimensions**

```rpicam-jpeg -o path/to/file.jpg --width 1920 --height 1080```

Capture with **long exposure** and gain

```rpicam-jpeg -o path/to/file.jpg --shutter 20000 --gain 1.5```

# SYNOPSIS

**rpicam-jpeg** [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Output file path

**-t**, **--timeout** _time_
> How long the program runs before capturing (default 5sec; plain numbers are milliseconds)

**-n**, **--nopreview**
> Do not show a preview window

**--width** _pixels_
> Image width

**--height** _pixels_
> Image height

**--shutter** _time_
> Fixed exposure time (plain numbers are microseconds)

**--gain** _value_
> Sensor gain multiplier

# DESCRIPTION

**rpicam-jpeg** captures and stores JPEG images using a Raspberry Pi camera module. It provides controls for resolution, exposure, and other camera settings.

It is a deliberately small application; **rpicam-still** offers more still-capture features such as other encodings and timelapse.

# CAVEATS

Requires compatible Raspberry Pi camera module. Long exposure times may introduce noise.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite using libcamera. Formerly named **libcamera-jpeg**.

# SEE ALSO

[rpicam-still](/man/rpicam-still)(1), [rpicam-hello](/man/rpicam-hello)(1), [rpicam-vid](/man/rpicam-vid)(1)

# RESOURCES

```[Source code](https://github.com/raspberrypi/rpicam-apps)```

```[Documentation](https://www.raspberrypi.com/documentation/computers/camera_software.html)```

<!-- verified: 2026-11-08 -->
