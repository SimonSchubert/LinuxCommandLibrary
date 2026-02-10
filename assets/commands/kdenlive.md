# TAGLINE

non-linear video editor for KDE

# TLDR

**Start Kdenlive**

```kdenlive```

**Open project**

```kdenlive [project.kdenlive]```

**Render from command line**

```kdenlive_render [project.kdenlive]```

# SYNOPSIS

**kdenlive** [_options_] [_file_]

# PARAMETERS

_file_
> Project file to open.

**--config** _file_
> Use alternative config.

**--mlt-log**
> MLT debug output.

**--help**
> Show help.

# DESCRIPTION

**Kdenlive** is a non-linear video editor for KDE. It provides multi-track editing, effects, transitions, and supports a wide range of video formats through FFmpeg and MLT.

Kdenlive offers professional features like keyframing, color correction, audio mixing, and titling. It's suitable for both amateur and professional video production.

# FEATURES

- Multi-track timeline editing
- Video and audio effects
- Transitions and compositing
- Keyframe animation
- Proxy editing for performance
- Color correction tools
- Audio mixing
- Titler

# KEYBOARD SHORTCUTS

```
Space       Play/Pause
J/K/L       Shuttle control
I/O         Set in/out points
V           Selection tool
X           Razor tool
S           Split clip
```

# CAVEATS

Requires KDE libraries. Resource-intensive for 4K editing. Proxy clips recommended for performance. Stability varies by version.

# HISTORY

Kdenlive was started by **Jason Wood** in **2002** and has been continuously developed by the KDE community. It became one of the most capable open-source video editors on Linux.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [melt](/man/melt)(1), [openshot](/man/openshot)(1)
