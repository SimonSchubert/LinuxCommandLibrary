# TAGLINE

Display Raspberry Pi camera preview

# TLDR

Display camera preview for **specific time** (milliseconds)

```rpicam-hello -t 5000```

Use **custom tuning** file for camera sensor

```rpicam-hello --tuning-file /usr/share/libcamera/ipa/rpi/path/to/config.json```

# SYNOPSIS

**rpicam-hello** [_options_]

# PARAMETERS

**-t**, **--timeout** _ms_
> Preview duration in milliseconds

**--tuning-file** _file_
> Camera sensor tuning configuration

# DESCRIPTION

**rpicam-hello** displays a live camera preview from a Raspberry Pi camera module. It's the simplest way to verify camera functionality and view the camera output.

The tool uses libcamera for modern camera support on Raspberry Pi.

# CAVEATS

Requires a compatible Raspberry Pi camera module. Display output requires a working graphical environment or framebuffer.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite replacing the legacy raspistill/raspivid tools.

# SEE ALSO

[rpicam-still](/man/rpicam-still)(1), [rpicam-vid](/man/rpicam-vid)(1), [rpicam-jpeg](/man/rpicam-jpeg)(1)
