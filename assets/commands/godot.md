# TLDR

**Start Godot editor**

```godot```

**Open project**

```godot --path [project-dir]```

**Run project**

```godot --path [project-dir] --main-pack [game.pck]```

**Export project**

```godot --headless --export-release "[preset]" [output]```

**Run script**

```godot --script [script.gd]```

# SYNOPSIS

**godot** [_options_] [_scene_]

# PARAMETERS

_SCENE_
> Scene file to open.

**--path** _DIR_
> Project directory.

**--editor**, **-e**
> Start editor mode.

**--headless**
> No window mode.

**--export-release** _PRESET_
> Export with preset.

**--script** _SCRIPT_
> Run script.

**--help**
> Display help information.

# DESCRIPTION

**godot** is the Godot game engine editor and runtime. It provides a complete game development environment with 2D/3D rendering, physics, scripting, and export capabilities.

The engine uses GDScript, C#, or C++ for game logic. It supports export to desktop, mobile, and web platforms. The editor is itself built with Godot.

godot provides open-source game development.

# CAVEATS

Resource-intensive for 3D. GDScript has learning curve. Export templates needed for platforms.

# HISTORY

Godot was created by **Juan Linietsky** and **Ariel Manzur**, open-sourced in **2014**, becoming a popular free game engine.

# SEE ALSO

[unity](/man/unity)(1), [blender](/man/blender)(1)
