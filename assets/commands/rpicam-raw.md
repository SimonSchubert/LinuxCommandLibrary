# TAGLINE

Capture raw sensor data from Raspberry Pi camera

# TLDR

**Capture** raw video for specific duration (milliseconds)

```rpicam-raw -t 2000 -o path/to/file.raw```

Capture with **custom dimensions** and framerate

```rpicam-raw -t 5000 --width 4056 --height 3040 -o path/to/file.raw --framerate 8```

# SYNOPSIS

**rpicam-raw** [_options_]

# PARAMETERS

**-t**, **--timeout** _ms_
> Recording duration in milliseconds

**-o**, **--output** _file_
> Output file path

**--width** _pixels_
> Video width

**--height** _pixels_
> Video height

**--framerate** _fps_
> Frames per second

# DESCRIPTION

**rpicam-raw** captures raw unprocessed video from a Raspberry Pi camera. Raw video preserves all sensor data without compression, suitable for post-processing.

Output files can be large due to the uncompressed nature of raw video.

# CAVEATS

Raw video files are very large. Ensure sufficient storage and fast media. Post-processing software required to view raw output.

# HISTORY

Part of **rpicam-apps**, the official Raspberry Pi camera application suite using libcamera.

# SEE ALSO

[rpicam-vid](/man/rpicam-vid)(1), [rpicam-still](/man/rpicam-still)(1)
