# TLDR

**Capture image**

```fswebcam [image.jpg]```

**Capture from specific device**

```fswebcam -d [/dev/video0] [image.jpg]```

**Set resolution**

```fswebcam -r [1280x720] [image.jpg]```

**Remove banner**

```fswebcam --no-banner [image.jpg]```

**Add timestamp**

```fswebcam --timestamp "%Y-%m-%d %H:%M" [image.jpg]```

**Set frame count for better quality**

```fswebcam -F [10] -S [5] [image.jpg]```

# SYNOPSIS

**fswebcam** [_options_] _filename_

# PARAMETERS

**-d**, **--device** _dev_
> Video device (default /dev/video0).

**-r**, **--resolution** _WxH_
> Capture resolution.

**-F**, **--frames** _n_
> Capture n frames.

**-S**, **--skip** _n_
> Skip n frames before capture.

**--no-banner**
> Remove info banner.

**--timestamp** _format_
> Add timestamp overlay.

**--title** _text_
> Set banner title.

**--subtitle** _text_
> Set banner subtitle.

**-q**, **--quiet**
> Suppress output.

**--png** _level_
> Save as PNG with compression.

**--jpeg** _quality_
> JPEG quality (0-100).

# DESCRIPTION

**fswebcam** is a command-line webcam capture utility. It captures images from V4L2 (Video4Linux) devices and saves them as JPEG or PNG files.

The tool is useful for timelapse photography, security camera snapshots, and automated image capture. It supports overlays, timestamps, and various image adjustments.

# EXAMPLES

```bash
# Timelapse capture every minute
while true; do
  fswebcam -r 1920x1080 --no-banner "$(date +%Y%m%d_%H%M%S).jpg"
  sleep 60
done
```

# CAVEATS

Requires V4L2 compatible webcam. Initial frames may be dark (use -S to skip). Resolution must be supported by camera. Some cameras need time to adjust exposure.

# HISTORY

fswebcam was written by **Philip Heron** as a simple command-line tool for capturing webcam images on Linux. It's designed for scripting and automation rather than interactive use.

# SEE ALSO

[v4l2-ctl](/man/v4l2-ctl)(1), [ffmpeg](/man/ffmpeg)(1), [motion](/man/motion)(1)
