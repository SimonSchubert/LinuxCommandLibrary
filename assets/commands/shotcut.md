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
> Use GPU processing.

**--fullscreen**
> Fill the screen with the Shotcut window.

**--noupgrade**
> Hide upgrade prompt and menu item.

**--glaxnimate**
> Run Glaxnimate instead of Shotcut.

**--clear-recent**
> Clear recent files on exit.

**--appdata** _DIR_
> Specify directory for app configuration and data.

**-h**, **--help**
> Display help.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**Shotcut** is a free, open-source, cross-platform video editor that provides non-linear editing with a timeline-based workflow. It supports a wide range of audio and video formats natively through its FFmpeg backend, allowing files to be placed directly on the timeline without import or transcoding.

The editor includes a comprehensive set of video and audio filters for effects, color correction, transitions, and compositing. GPU acceleration via OpenGL is available for faster preview and rendering on supported hardware. Projects are saved in MLT XML format and can export to numerous output formats and codecs.

# CAVEATS

GPU processing varies by hardware and may not be available on all systems. Resource intensive for high-resolution or multi-track projects. Does not support command-line rendering; use **melt** for batch/scripted exports.

# HISTORY

**Shotcut** was created by **Dan Dennedy**, building on MLT framework to provide a free, open-source video editor.

# SEE ALSO

[kdenlive](/man/kdenlive)(1), [ffmpeg](/man/ffmpeg)(1), [melt](/man/melt)(1)
