# TAGLINE

Screen recording for Wayland compositors

# TLDR

**Record** to MP4 file

```wf-recorder -f [output.mp4]```

Record with **audio**

```wf-recorder -a -f [path/to/file_with_audio.webm]```

Record **region** selected with slurp

```wf-recorder -g "$(slurp)"```

Record specific **output** (monitor)

```wf-recorder -o [DP-1] -f [output.mp4]```

Record using a specific **codec**

```wf-recorder -c h264_vaapi -f [output.mp4]```

Record with custom **framerate**

```wf-recorder -r [30] -f [output.mp4]```

# SYNOPSIS

**wf-recorder** [_OPTIONS_]

# PARAMETERS

**-f, --file** _PATH_
> Output file path

**-a, --audio**
> Include audio in recording

**-g, --geometry** _WxH+X+Y_
> Record specified region

**-c** _CODEC_
> Video codec to use (e.g., h264_vaapi, libx264)

**-C** _CODEC_
> Audio codec to use

**-o**, **--output** _NAME_
> Record specific Wayland output (monitor)

**-r**, **--framerate** _FPS_
> Set recording framerate

**-d**, **--device** _PATH_
> DRM device for hardware encoding

**-p** _KEY=VALUE_
> Pass codec-specific parameters (e.g., -p crf=20)

**-F** _FILTER_
> FFmpeg filter string (e.g., scale=1280:720)

# DESCRIPTION

**wf-recorder** is a screen recording tool for Wayland compositors that use the wlroots library (e.g., Sway, Hyprland). It captures the screen to video files with optional audio, supporting various output formats and codecs via FFmpeg.

Stop recording with Ctrl+C or by sending SIGINT. Region selection can be done interactively with **slurp**. Hardware-accelerated encoding is supported through VAAPI codecs.

# CAVEATS

Wayland only. Audio recording requires PipeWire or PulseAudio. Some compositors may require specific configuration for screen capture.

# SEE ALSO

[slurp](/man/slurp)(1), [grim](/man/grim)(1), [ffmpeg](/man/ffmpeg)(1)
