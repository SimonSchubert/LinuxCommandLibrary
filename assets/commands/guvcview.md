# TAGLINE

GTK+ webcam viewer and capture application

# TLDR

**Start webcam viewer**

```guvcview```

**Specify video device**

```guvcview -d [/dev/video0]```

**Request a resolution and format**

```guvcview -x [1920x1080] -f [MJPG]```

**Select the GUI toolkit**

```guvcview -g [gtk3]```

**Capture video straight to a file**

```guvcview -j [output.mkv]```

**Capture a single photo to a file**

```guvcview -i [photo.jpg] -n [1]```

# SYNOPSIS

**guvcview** [_options_]

# PARAMETERS

**-d**, **--device** _DEVICE_
> Video device to use (default: /dev/video0).

**-x**, **--resolution** _WxH_
> Request a capture resolution (e.g. 640x480).

**-f**, **--format** _FOURCC_
> Request a video format/FourCC (e.g. MJPG, YUYV).

**-F**, **--fps** _NUM[/DENOM]_
> Request a frame rate.

**-g**, **--gui** _API_
> Select the GUI toolkit: none, gtk3, or qt6.

**-r**, **--render** _API_
> Select the render API: none, sdl, or sfml.

**-m**, **--render_window** _FLAGS_
> Set render window flags (none, full, max, or WIDTHxHEIGHT).

**-a**, **--audio** _API_
> Select the audio API: none, port, or pulse.

**-k**, **--audio_device** _INDEX_
> Select the audio device index for the chosen audio API.

**-j**, **--video** _FILE_
> Filename for captured video.

**-u**, **--video_codec** _CODEC_
> Video codec to use (e.g. raw, mjpg, h264, vp80).

**-i**, **--image** _FILE_
> Filename for captured photo(s).

**-n**, **--photo_total** _N_
> Total number of photos to capture.

**-t**, **--photo_timer** _SECONDS_
> Time between captured photos.

**-p**, **--profile** _FILE_
> Load a saved control profile.

**-e**, **--exit_on_term**
> Exit the app after video or image capture ends.

**-z**, **--control_panel**
> Start in control-panel-only mode.

**-w**, **--verbosity** _LEVEL_
> Set verbosity level (default: 0).

**-v**, **--version**
> Print version information.

**-h**, **--help**
> Print help.

# DESCRIPTION

**guvcview** is a video capture and control application for UVC (USB Video Class) compatible webcams on Linux. It provides a live preview along with controls for camera settings such as brightness, contrast, exposure, and white balance, and can capture both video and still photos.

Modern versions build against **GTK3** or **Qt6** for the interface (selectable with **-g**) and support multiple render backends (SDL, SFML) and audio APIs (PortAudio, PulseAudio) for recording video with sound.

# CAVEATS

Requires a UVC-compatible camera and a V4L2-capable kernel driver. Some controls and codecs are hardware/driver dependent. Command-line flags and defaults have changed across major guvcview releases; always check `guvcview --help` for the installed version.

# HISTORY

**guvcview** was created by **Paulo Assis** in **2008** as a simple GTK+ webcam viewer for Linux using the V4L2 API. It has since gained Qt6 GUI support and multiple render/audio backends while remaining a lightweight alternative to full video-editing suites for quick webcam preview and capture.

# INSTALL

```apt: sudo apt install guvcview```

```dnf: sudo dnf install guvcview```

```pacman: sudo pacman -S guvcview```

```apk: sudo apk add guvcview```

```zypper: sudo zypper install guvcview```

```nix: nix profile install nixpkgs#guvcview```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cheese](/man/cheese)(1), [v4l2-ctl](/man/v4l2-ctl)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Homepage](https://guvcview.sourceforge.net/)```

```[Source code](https://sourceforge.net/projects/guvcview/)```

<!-- verified: 2026-07-17 -->
