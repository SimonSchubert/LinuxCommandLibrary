# TAGLINE

renders OpenShot projects

# TLDR

**Render project**

```openshot-render [project.osp] [output.mp4]```

**Render with profile**

```openshot-render -p [profile] [project.osp] [output.mp4]```

**Render specific range**

```openshot-render -s [start] -e [end] [project.osp] [output.mp4]```

# SYNOPSIS

**openshot-render** [_options_] _project_ _output_

# PARAMETERS

_PROJECT_
> OpenShot project file.

_OUTPUT_
> Output video file.

**-p** _PROFILE_
> Export profile.

**-s** _START_
> Start frame.

**-e** _END_
> End frame.

**--help**
> Display help information.

# DESCRIPTION

**openshot-render** renders OpenShot projects. Command-line export utility.

The tool processes projects without GUI. Batch rendering support.

# CAVEATS

Requires valid OpenShot project. Part of OpenShot suite.

# HISTORY

openshot-render provides **command-line rendering** for OpenShot projects.

# SEE ALSO

[openshot](/man/openshot)(1), [ffmpeg](/man/ffmpeg)(1)

