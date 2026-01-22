# TLDR

**Capture** an image and save to file

```rpicam-jpeg -o path/to/file.jpg```

Capture with **set dimensions**

```rpicam-jpeg -o path/to/file.jpg --width 1920 --height 1080```

Capture with **long exposure** and gain

```rpicam-jpeg -o path/to/file.jpg --shutter 20000 --gain 1.5```

# SYNOPSIS

**rpicam-jpeg** [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Output file path

**--width** _pixels_
> Image width

**--height** _pixels_
> Image height

**--shutter** _microseconds_
> Exposure time

**--gain** _value_
> Sensor gain multiplier

# DESCRIPTION

**rpicam-jpeg** captures and stores JPEG images using a Raspberry Pi camera module. It provides controls for resolution, exposure, and other camera settings.

The tool is optimized for quick JPEG capture with automatic processing.

# CAVEATS

Requires compatible Raspberry Pi camera module. Long exposure times may introduce noise.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite using libcamera.

# SEE ALSO

[rpicam-still](/man/rpicam-still)(1), [rpicam-hello](/man/rpicam-hello)(1), [rpicam-vid](/man/rpicam-vid)(1)
