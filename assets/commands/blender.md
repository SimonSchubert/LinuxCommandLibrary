# TAGLINE

3D creation suite for modeling, animation, and rendering

# TLDR

**Start** Blender GUI

```blender```

**Open** file

```blender [model.blend]```

**Render** in background

```blender -b [scene.blend] -a```

**Render** specific frame

```blender -b [scene.blend] -f [10]```

**Execute** Python script

```blender --python [script.py]```

# SYNOPSIS

**blender** [_options_] [_file_]

# DESCRIPTION

**blender** is a free and open-source 3D creation suite. It supports the entire 3D pipeline: modeling, rigging, animation, simulation, rendering, compositing, motion tracking, and video editing.

The software is used for creating animated films, visual effects, games, and 3D printed models.

# PARAMETERS

**-b**, **--background**
> Run in background (no GUI)

**-a**, **--render-anim**
> Render animation

**-f**, **--render-frame** _n_
> Render specific frame

**-s** _n_ **-e** _n_
> Set start and end frames

**-o** _path_
> Set render output path

**--python** _file_
> Execute Python script

**--python-expr** _expr_
> Execute Python expression

**-x** _0|1_
> Add the file format extension to render output names (use-extension)

**-E** _engine_
> Render engine: CYCLES, BLENDER_EEVEE, or BLENDER_WORKBENCH (run `blender -E help` to list)

**-P** _file_
> Run the given Python script file (same as --python)

**--factory-startup**
> Skip reading the user config and startup file for a clean session

**--version**
> Print the Blender version and exit

# BACKGROUND RENDERING

```bash
# Render animation
blender -b scene.blend -a

# Render frames 1-100
blender -b scene.blend -s 1 -e 100 -a

# Render single frame to PNG
blender -b scene.blend -o //output_#### -f 1

# Use Cycles engine
blender -b scene.blend -E CYCLES -a
```

# PYTHON SCRIPTING

```python
# script.py
import bpy

# Create cube
bpy.ops.mesh.primitive_cube_add()

# Render
bpy.ops.render.render(write_still=True)
```

# CAVEATS

Heavy resource usage. Learning curve is steep. Background rendering requires all dependencies. GPU rendering needs compatible drivers. Python API version-specific.

# HISTORY

**Blender** was originally created by Ton Roosendaal in **1995** as in-house software, open-sourced in **2002** under GPL and has since become one of the most popular 3D creation tools.

Note that order matters: arguments are evaluated left to right, so the .blend file must be given before the render flags that act on it.

# SEE ALSO

[gimp](/man/gimp)(1), [inkscape](/man/inkscape)(1), [krita](/man/krita)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://projects.blender.org/blender/blender)```

```[Homepage](https://www.blender.org/)```

```[Documentation](https://docs.blender.org/manual/en/latest/advanced/command_line/index.html)```

<!-- verified: 2026-06-19 -->
