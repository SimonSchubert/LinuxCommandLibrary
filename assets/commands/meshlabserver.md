# TAGLINE

Command-line interface for MeshLab 3D mesh processing

# TLDR

**Apply filter script to mesh**

```meshlabserver -i [input.obj] -o [output.obj] -s [script.mlx]```

**Convert mesh format**

```meshlabserver -i [input.stl] -o [output.ply]```

**Apply script with log**

```meshlabserver -i [input.obj] -o [output.obj] -s [script.mlx] -l [log.txt]```

**Specify output mesh components**

```meshlabserver -i [input.obj] -o [output.ply] -om vc vn```

# SYNOPSIS

**meshlabserver** **-i** _input_ [**-o** _output_] [**-s** _script_] [**-l** _log_] [**-om** _options_]

# PARAMETERS

**-i** _file_
> Input mesh file (OBJ, STL, PLY, OFF, etc.).

**-o** _file_
> Output mesh file. Format determined by extension.

**-s** _file_
> MeshLab filter script file (.mlx), created from MeshLab GUI via Filters > Show current filter script.

**-l** _file_
> Log file for processing output.

**-om** _options_
> Output mesh components to save (e.g., vc for vertex color, vn for vertex normals, wt for wedge texcoord).

# DESCRIPTION

**meshlabserver** is the command-line (headless) interface for MeshLab. It processes 3D meshes non-interactively using filter scripts exported from the MeshLab GUI. Supports format conversion and batch mesh processing automation.

# CAVEATS

Deprecated since MeshLab 2022.02 and replaced by **PyMeshLab**, a Python library providing equivalent functionality. Filter scripts (.mlx) must be created from the MeshLab GUI.

# SEE ALSO

[meshlab](/man/meshlab)(1), [blender](/man/blender)(1)

