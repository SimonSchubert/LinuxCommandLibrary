# TLDR

Capture with **different encoding** format

```rpicam-still -e png -o path/to/file.png```

Capture a **raw image**

```rpicam-still -r -o path/to/file.jpg```

Capture with **long exposure** (100 seconds)

```rpicam-still -o path/to/file.jpg --shutter 100000```

# SYNOPSIS

**rpicam-still** [_options_]

# PARAMETERS

**-e**, **--encoding** _format_
> Output format (bmp, png, rgb, yuv420)

**-r**, **--raw**
> Include raw sensor data

**-o**, **--output** _file_
> Output file path

**--shutter** _microseconds_
> Exposure time

# DESCRIPTION

**rpicam-still** captures photos with additional format options and features not available in rpicam-jpeg. It supports multiple output formats and raw sensor data capture.

This tool provides more control over image capture than the simpler rpicam-jpeg.

# CAVEATS

Raw images include DNG data alongside the main image. Some formats produce larger files than JPEG.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite using libcamera. Replaces legacy raspistill.

# SEE ALSO

[rpicam-jpeg](/man/rpicam-jpeg)(1), [rpicam-hello](/man/rpicam-hello)(1), [rpicam-vid](/man/rpicam-vid)(1)
