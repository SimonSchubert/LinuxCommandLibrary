# TAGLINE

Capture still images from Raspberry Pi camera

# TLDR

Capture an image **immediately** (no preview)

```rpicam-still -n -o path/to/file.jpg```

Capture with **different encoding** format

```rpicam-still -e png -o path/to/file.png```

Capture a **raw image** (DNG alongside JPEG)

```rpicam-still -r -o path/to/file.jpg```

Capture with **long exposure** in microseconds

```rpicam-still --shutter 100000 -o path/to/file.jpg```

Capture with **specific dimensions**

```rpicam-still --width 1920 --height 1080 -o path/to/file.jpg```

Capture a **timelapse** (one image every 10 seconds for 10 minutes)

```rpicam-still -t 600000 --timelapse 10000 -o image%04d.jpg```

# SYNOPSIS

**rpicam-still** [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Output file path (use _%d_ for timelapse numbering).

**-e**, **--encoding** _format_
> Output format (jpg, png, bmp, rgb, yuv420).

**-r**, **--raw**
> Also save raw Bayer sensor data as a DNG file.

**-n**, **--nopreview**
> Disable the preview window.

**-t**, **--timeout** _ms_
> Duration of preview before capture in milliseconds (default: 5000).

**--immediate**
> Skip the preview phase and capture immediately.

**--timelapse** _ms_
> Capture images every _ms_ milliseconds until timeout.

**--width** _px_, **--height** _px_
> Output image dimensions.

**-q**, **--quality** _0-100_
> JPEG compression quality.

**--shutter** _microseconds_
> Manual exposure time.

**--gain** _value_
> Analog gain (ISO multiplier).

**--awb** _mode_
> Auto white balance mode (auto, incandescent, tungsten, fluorescent, indoor, daylight, cloudy).

# DESCRIPTION

**rpicam-still** captures photos with additional format options and features not available in rpicam-jpeg. It supports multiple output formats and raw sensor data capture.

This tool provides more control over image capture than the simpler rpicam-jpeg.

# CAVEATS

Raw images include DNG data alongside the main image. Some formats produce larger files than JPEG.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite using libcamera. Replaces legacy raspistill.

# SEE ALSO

[rpicam-jpeg](/man/rpicam-jpeg)(1), [rpicam-hello](/man/rpicam-hello)(1), [rpicam-vid](/man/rpicam-vid)(1)
