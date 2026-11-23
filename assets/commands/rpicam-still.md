# TAGLINE

Capture still images from Raspberry Pi camera

# TLDR

Capture an image **immediately** (no preview)

```rpicam-still -n --immediate -o path/to/file.jpg```

Capture after the default **5 second preview**

```rpicam-still -o path/to/file.jpg```

Capture with **different encoding** format

```rpicam-still -e png -o path/to/file.png```

Capture a **raw image** (DNG alongside JPEG)

```rpicam-still -r -o path/to/file.jpg```

Capture with **long exposure** in microseconds

```rpicam-still --shutter 100000 -o path/to/file.jpg```

Capture with **specific dimensions**

```rpicam-still --width 1920 --height 1080 -o path/to/file.jpg```

Capture a **timelapse** (one image every 10 seconds for 10 minutes)

```rpicam-still -t 10min --timelapse 10000 -o image%04d.jpg```

Capture when **Enter is pressed**, with autofocus just before capture

```rpicam-still -t 0 -k --autofocus-on-capture -o path/to/file.jpg```

**List** attached cameras and their sensor modes

```rpicam-still --list-cameras```

# SYNOPSIS

**rpicam-still** [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Output file path (use _%d_ for timelapse numbering, **-** for stdout).

**-e**, **--encoding** _format_
> Output format: jpg (default), png, bmp, rgb, yuv420. Overrides the output file extension.

**-r**, **--raw**
> Also save raw Bayer sensor data as a DNG file.

**-n**, **--nopreview**
> Disable the preview window.

**-t**, **--timeout** _time_
> Duration of preview before capture, in milliseconds unless a unit suffix (min, s, ms, us, ns) is given (default: 5000). 0 runs indefinitely.

**--immediate**
> Skip the preview phase and capture immediately.

**-k**, **--keypress**
> Capture when Enter is pressed or the timeout expires; **x** then Enter exits without capturing.

**--signal**
> Capture on **SIGUSR1** or when the timeout expires; **SIGUSR2** exits without capturing.

**--timelapse** _ms_
> Capture images every _ms_ milliseconds until timeout.

**--datetime**, **--timestamp**
> Name the output file after the current date/time (MMDDhhmmss) or the Unix time.

**--latest** _name_
> Maintain a symbolic link to the most recently saved file.

**--width** _px_, **--height** _px_
> Output image dimensions.

**-q**, **--quality** _1-100_
> JPEG compression quality (default: 93).

**--thumb** _w:h:q_
> Thumbnail size and quality (default 320:240:70), or none.

**--exif** _tag=value_
> Add an EXIF tag to JPEG output.

**--shutter** _microseconds_
> Manual exposure time.

**--gain** _value_
> Combined analogue and digital gain (ISO multiplier).

**--ev** _value_
> Exposure compensation in stops.

**--awb** _mode_
> Auto white balance mode (auto, incandescent, tungsten, fluorescent, indoor, daylight, cloudy, custom).

**--autofocus-mode** _mode_
> Autofocus mode: default, manual, auto, continuous (supported cameras only).

**--autofocus-on-capture**
> Run an autofocus cycle just before capturing.

**--lens-position** _dioptres_
> Fixed focus position; 0.0 is infinity.

**--hflip**, **--vflip**, **--rotation** _0|180_
> Flip or rotate the image.

**--hdr** _mode_
> HDR mode (off by default; supported cameras only).

**--camera** _index_
> Camera to use (default: 0).

**--list-cameras**
> List detected cameras and their sensor modes.

# DESCRIPTION

**rpicam-still** captures photos with additional format options and features not available in rpicam-jpeg. It supports multiple output formats and raw sensor data capture.

This tool provides more control over image capture than the simpler rpicam-jpeg, including timelapse capture, capture triggered by a keypress or signal, EXIF tagging and full control over exposure, white balance and focus.

# CAVEATS

Without **--immediate**, the camera previews for the timeout (5 seconds by default) before capturing, even with **-n**. Raw images include DNG data alongside the main image. Some formats produce larger files than JPEG. Autofocus and HDR options only work on cameras that support them (such as Camera Module 3).

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite using libcamera. Replaces legacy raspistill. The command was formerly named **libcamera-still**.

# SEE ALSO

[rpicam-jpeg](/man/rpicam-jpeg)(1), [rpicam-hello](/man/rpicam-hello)(1), [rpicam-vid](/man/rpicam-vid)(1), [rpicam-raw](/man/rpicam-raw)(1), [exiftool](/man/exiftool)(1), [dcraw](/man/dcraw)(1)

# RESOURCES

```[Source code](https://github.com/raspberrypi/rpicam-apps)```

```[Documentation](https://www.raspberrypi.com/documentation/computers/camera_software.html)```

<!-- verified: 2026-11-23 -->
