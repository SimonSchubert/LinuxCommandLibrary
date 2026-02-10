# TAGLINE

open-source system for processing and editing 3D triangular meshes

# TLDR

**Start MeshLab GUI**

```meshlab```

**Open mesh file**

```meshlab [model.stl]```

**Convert mesh format**

```meshlabserver -i [input.obj] -o [output.stl]```

**Apply filter script**

```meshlabserver -i [input.ply] -o [output.ply] -s [filters.mlx]```

**Batch process files**

```meshlabserver -i [input.stl] -o [output.stl] -s [script.mlx]```

# SYNOPSIS

**meshlab** [_files_...]

**meshlabserver** -i _input_ -o _output_ [_options_]

# PARAMETERS

**-i** _file_
> Input mesh file.

**-o** _file_
> Output mesh file.

**-s** _script_
> Filter script (.mlx).

**-l** _file_
> Log file.

**-om** _mask_
> Output mask options.

# DESCRIPTION

**MeshLab** is an open-source system for processing and editing 3D triangular meshes. It provides tools for cleaning, healing, inspecting, rendering, and converting meshes.

meshlabserver is the command-line version for batch processing.

# SUPPORTED FORMATS

```
Input:  STL, OBJ, PLY, OFF, 3DS, PTX, PTS
Output: STL, OBJ, PLY, OFF, DXF, U3D
```

# FILTER CAPABILITIES

```
- Mesh cleaning and repair
- Simplification
- Smoothing
- Subdivision
- Boolean operations
- Measurement
```

# CAVEATS

Large meshes need significant RAM. Some filters require manifold meshes. Filter scripts created in GUI.

# HISTORY

MeshLab was developed at the **Visual Computing Lab** of ISTI-CNR, starting in **2005** under the leadership of **Paolo Cignoni**.

# SEE ALSO

[blender](/man/blender)(1), [openscad](/man/openscad)(1), [freecad](/man/freecad)(1)
