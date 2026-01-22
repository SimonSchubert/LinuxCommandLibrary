# TLDR

**Render scene**

```manim [script.py] [SceneName]```

**Preview with low quality**

```manim -pql [script.py] [SceneName]```

**Render high quality**

```manim -pqh [script.py] [SceneName]```

**Output GIF**

```manim --format gif [script.py] [SceneName]```

**Save last frame**

```manim -s [script.py] [SceneName]```

**List scenes**

```manim [script.py]```

# SYNOPSIS

**manim** [_options_] _script_ [_scene_]

# PARAMETERS

_SCRIPT_
> Python script file.

_SCENE_
> Scene class name.

**-p**
> Preview after render.

**-q** _QUALITY_
> Quality (l, m, h, k).

**-s**
> Save last frame only.

**--format** _FMT_
> Output format (mp4, gif, webm).

**--help**
> Display help information.

# DESCRIPTION

**manim** creates mathematical animations. It renders Python-defined scenes to video.

The tool animates mathematical concepts with LaTeX support. Created for educational videos.

manim animates mathematics.

# CAVEATS

Requires FFmpeg and LaTeX. Rendering can be slow. Python knowledge needed.

# HISTORY

Manim was created by **Grant Sanderson** (3Blue1Brown) for his mathematical explanation videos on YouTube.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [pdflatex](/man/pdflatex)(1), [python](/man/python)(1)

