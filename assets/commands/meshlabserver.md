# TLDR

**Apply filter script to mesh**

```meshlabserver -i [input.obj] -o [output.obj] -s [script.mlx]```

**Convert mesh format**

```meshlabserver -i [input.stl] -o [output.ply]```

**Apply script with log**

```meshlabserver -i [input.obj] -o [output.obj] -s [script.mlx] -l [log.txt]```

# SYNOPSIS

**meshlabserver** [_options_]

# PARAMETERS

**-i** _file_
> Input mesh file.

**-o** _file_
> Output mesh file.

**-s** _file_
> Filter script file (.mlx).

**-l** _file_
> Log file.

**-om** _options_
> Output mesh options.

# DESCRIPTION

**meshlabserver** is the command-line interface for MeshLab. Processes 3D meshes non-interactively using filter scripts. Supports format conversion and mesh processing automation.

# SEE ALSO

[meshlab](/man/meshlab)(1), [blender](/man/blender)(1)

