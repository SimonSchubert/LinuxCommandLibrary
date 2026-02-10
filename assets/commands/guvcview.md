# TAGLINE

GTK+ webcam viewer and capture application

# TLDR

**Start webcam viewer**

```guvcview```

**Specify video device**

```guvcview -d /dev/video0```

**Set resolution**

```guvcview --resolution=[1920x1080]```

**Start with audio device**

```guvcview -a [hw:0,0]```

**Capture to file**

```guvcview -n [output.mkv]```

# SYNOPSIS

**guvcview** [_options_]

# PARAMETERS

**-d**, **--device** _DEV_
> Video device.

**-r**, **--resolution** _WxH_
> Video resolution.

**-f**, **--format** _FMT_
> Video format.

**-a**, **--audio** _DEV_
> Audio device.

**-n**, **--video** _FILE_
> Video output file.

**-t**, **--photo** _FILE_
> Photo output file.

**--help**
> Display help information.

# DESCRIPTION

**guvcview** is a GTK+ webcam viewer and capture application. It works with UVC (USB Video Class) compatible webcams and provides controls for camera settings.

The application supports video recording in various formats and photo capture. It exposes hardware controls like brightness, contrast, and exposure.

# CAVEATS

UVC compatible cameras only. GTK dependencies. Some features driver-dependent.

# HISTORY

guvcview was created by **Paulo Assis** as a simple webcam application for Linux using the V4L2 API.

# SEE ALSO

[cheese](/man/cheese)(1), [v4l2-ctl](/man/v4l2-ctl)(1), [ffmpeg](/man/ffmpeg)(1)
