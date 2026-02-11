# TAGLINE

Screen recording for Wayland compositors

# TLDR

**Record** to MP4 file

```wf-recorder -f [output.mp4]```

Record with **audio**

```wf-recorder -a -f [path/to/file_with_audio.webm]```

Record **region** with slurp

```wf-recorder -g "$(slurp)"```

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
> Video codec to use

**-C** _CODEC_
> Audio codec to use

# DESCRIPTION

**wf-recorder** is a screen recording tool for Wayland compositors. It captures the screen to video files with optional audio, supporting various output formats and codecs.

Stop recording with Ctrl+C. Region selection can be done interactively with slurp.

# CAVEATS

Wayland only. Audio recording requires PipeWire or PulseAudio. Some compositors may require specific configuration for screen capture.

# SEE ALSO

[slurp](/man/slurp)(1), [grim](/man/grim)(1)
