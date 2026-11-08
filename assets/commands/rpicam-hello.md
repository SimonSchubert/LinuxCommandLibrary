# TAGLINE

Display Raspberry Pi camera preview

# TLDR

Display camera preview for **5 seconds** (default)

```rpicam-hello```

Display camera preview for **specific time** (milliseconds)

```rpicam-hello -t 10000```

Run the preview **until interrupted**

```rpicam-hello -t 0```

**List** attached cameras

```rpicam-hello --list-cameras```

Use a **second camera** in fullscreen

```rpicam-hello --camera 1 -f```

Use **custom tuning** file for camera sensor

```rpicam-hello --tuning-file /usr/share/libcamera/ipa/rpi/path/to/config.json```

# SYNOPSIS

**rpicam-hello** [_options_]

# PARAMETERS

**-t**, **--timeout** _ms_
> Run time, in milliseconds if no unit is given (default: 5sec); 0 runs indefinitely

**--list-cameras**
> List available cameras

**--camera** _index_
> Camera to use (default: 0)

**-n**, **--nopreview**
> Do not show a preview window

**-f**, **--fullscreen**
> Use a fullscreen preview window

**-p**, **--preview** _x,y,w,h_
> Set the preview window dimensions

**--hflip**, **--vflip**
> Flip the image horizontally or vertically

**--rotation** _0|180_
> Rotate the image

**-c**, **--config** _file_
> Read options from a file

**--info-text** _format_
> Set the information string on the titlebar

**--tuning-file** _file_
> Camera sensor tuning configuration

# DESCRIPTION

**rpicam-hello** displays a live camera preview from a Raspberry Pi camera module. It's the simplest way to verify camera functionality and view the camera output. It previews for five seconds by default.

The tool uses libcamera for modern camera support on Raspberry Pi.

# CAVEATS

Requires a compatible Raspberry Pi camera module. Display output requires a working graphical environment or framebuffer.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite replacing the legacy raspistill/raspivid tools. The command was formerly named **libcamera-hello**.

# SEE ALSO

[rpicam-still](/man/rpicam-still)(1), [rpicam-vid](/man/rpicam-vid)(1), [rpicam-jpeg](/man/rpicam-jpeg)(1)

# RESOURCES

```[Source code](https://github.com/raspberrypi/rpicam-apps)```

```[Documentation](https://www.raspberrypi.com/documentation/computers/camera_software.html)```

<!-- verified: 2026-11-08 -->
