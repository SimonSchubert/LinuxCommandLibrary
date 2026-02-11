# TAGLINE

Free cross-platform video editor

# TLDR

**Open Shotcut**

```shotcut```

**Open project**

```shotcut [project.mlt]```

**Open video file**

```shotcut [video.mp4]```

**GPU processing**

```shotcut --gpu```

**Full screen**

```shotcut --fullscreen```

# SYNOPSIS

**shotcut** [_--gpu_] [_--fullscreen_] [_options_] [_file_]

# PARAMETERS

**--gpu**
> Enable GPU processing.

**--fullscreen**
> Start fullscreen.

**--noupgrade**
> Disable upgrade check.

**--appdata** _DIR_
> Data directory.

**--help**
> Show help.

# DESCRIPTION

**Shotcut** is a free, open-source, cross-platform video editor that provides non-linear editing with a timeline-based workflow. It supports a wide range of audio and video formats natively through its FFmpeg backend, allowing files to be placed directly on the timeline without import or transcoding.

The editor includes a comprehensive set of video and audio filters for effects, color correction, transitions, and compositing. GPU acceleration via OpenGL is available for faster preview and rendering on supported hardware. Projects are saved in MLT XML format and can export to numerous output formats and codecs.

# CAVEATS

Learning curve moderate. GPU varies by hardware. Resource intensive.

# HISTORY

**Shotcut** was created by **Dan Dennedy**, building on MLT framework to provide a free, open-source video editor.

# SEE ALSO

[kdenlive](/man/kdenlive)(1), [ffmpeg](/man/ffmpeg)(1), [melt](/man/melt)(1)
