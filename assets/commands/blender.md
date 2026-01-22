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

**-x** _n_
> Set render extension

**-E** _engine_
> Render engine (BLENDER_EEVEE, CYCLES)

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

# SEE ALSO

[gimp](/man/gimp)(1), [inkscape](/man/inkscape)(1), [ffmpeg](/man/ffmpeg)(1)
