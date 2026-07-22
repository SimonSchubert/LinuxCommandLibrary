# TAGLINE

Render OpenShot projects from the command line

# TLDR

**Render** an OpenShot project to a video file

```openshot-render [project.osp] [output.mp4]```

**Render with an export profile** (e.g. HD 1080p 30fps)

```openshot-render -p "[HD 1080p 30 fps]" [project.osp] [output.mp4]```

**Render a specific frame range**

```openshot-render -s [1] -e [300] [project.osp] [output.mp4]```

**Render with a custom video codec**

```openshot-render -v [libx264] -b [8000000] [project.osp] [output.mp4]```

# SYNOPSIS

**openshot-render** [_options_] _project_ _output_

# PARAMETERS

_PROJECT_
> Path to an existing OpenShot project file (.osp).

_OUTPUT_
> Path to the output video file. Container is selected from the file extension.

**-p** _PROFILE_
> Export profile name (must match an installed OpenShot profile).

**-s** _START_
> First frame to include in the export.

**-e** _END_
> Last frame to include in the export.

**-v** _CODEC_
> Video codec passed through to FFmpeg (e.g. libx264, libvpx).

**-a** _CODEC_
> Audio codec.

**-b** _BITRATE_
> Video bitrate in bits per second.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**openshot-render** is a command-line front-end to OpenShot's libopenshot rendering engine. It allows headless export of OpenShot project files (.osp) to video files without launching the GUI, which is useful for automated batch rendering, render farms, and CI pipelines.

The tool reads the project's timeline, applies effects and transitions, and uses FFmpeg under the hood to encode the final video. Profile names and codecs must match those available in the OpenShot installation.

# CAVEATS

The .osp project file references absolute paths to media; missing source files will fail the render. GPU-accelerated encoders depend on the FFmpeg build linked against libopenshot. Profile names are case-sensitive.

# HISTORY

**openshot-render** is provided by the OpenShot project for command-line export and batch processing. It uses the same rendering engine as the OpenShot Qt GUI.

# INSTALL

```dnf: sudo dnf install openshot```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[openshot](/man/openshot)(1), [ffmpeg](/man/ffmpeg)(1), [melt](/man/melt)(1)
