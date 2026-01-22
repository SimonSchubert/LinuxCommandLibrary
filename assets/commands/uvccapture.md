# TLDR

**Capture a single image** from webcam

```uvccapture```

**Capture to a specific file**

```uvccapture -o [image.jpg]```

**Capture at specific resolution**

```uvccapture -x [1280] -y [720]```

**Capture from a specific device**

```uvccapture -d [/dev/video1]```

**Set JPEG quality**

```uvccapture -q [90]```

**Take continuous shots** every N seconds

```uvccapture -t [5] -o [image.jpg]```

**Run command after each capture**

```uvccapture -t [10] -c "[scp image.jpg user@host:]"```

**Adjust brightness and contrast**

```uvccapture -B [128] -C [64]```

# SYNOPSIS

**uvccapture** [_options_]

# PARAMETERS

**-o** _FILE_
> Output filename (default: snap.jpg)

**-d** _DEVICE_
> Video device (default: /dev/video0)

**-x** _WIDTH_
> Image width (must be supported by device)

**-y** _HEIGHT_
> Image height (must be supported by device)

**-q** _QUALITY_
> JPEG quality 0-100 (default: 95)

**-t** _SECONDS_
> Continuous capture interval (0 for single shot)

**-c** _COMMAND_
> Command to run after each capture

**-w**
> Wait for command to finish before next capture

**-s** _FRAMES_
> Frames to skip after first capture

**-r**
> Use read() instead of mmap for capture

**-m**
> Toggle to YUYV capture mode

**-v**
> Verbose output

**-B** _VALUE_
> Set brightness

**-C** _VALUE_
> Set contrast

**-S** _VALUE_
> Set saturation

**-G** _VALUE_
> Set gain

# DESCRIPTION

**uvccapture** captures still images from USB Video Class (UVC) compatible webcams. It outputs JPEG images and is designed for scripting, time-lapse photography, and automated image capture without a graphical interface.

The tool uses Video4Linux2 (V4L2) to access the camera. Resolution must be supported by the device; use **v4l2-ctl --list-formats-ext** to check available options. High resolutions (>960x720) automatically activate YUYV capture mode.

For continuous capture, use **-t** with an interval in seconds. The **-c** option runs a command after each capture, useful for uploading images or triggering other actions. Image processing beyond JPEG can be done with ImageMagick or similar tools.

# CAVEATS

User must have read/write permissions on the video device. Resolution must be natively supported by the webcam. Only JPEG output is supported; use ImageMagick for other formats. Some cameras may require warm-up frames (**-s**) for proper exposure. Depends on libjpeg library.

# HISTORY

uvccapture was developed for capturing images from UVC webcams on Linux systems. UVC (USB Video Class) is a standard for USB video devices that provides driver-free compatibility across operating systems. The tool was designed as a lightweight alternative to full webcam applications, focusing on command-line scripting and automation use cases.

# SEE ALSO

[fswebcam](/man/fswebcam)(1), [v4l2-ctl](/man/v4l2-ctl)(1), [ffmpeg](/man/ffmpeg)(1), [streamer](/man/streamer)(1)
