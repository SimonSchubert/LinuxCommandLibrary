# TAGLINE

Command-line interface for MeshLab 3D mesh processing

# TLDR

**Apply filter script to mesh**

```meshlabserver -i [input.obj] -o [output.obj] -s [script.mlx]```

**Convert mesh format**

```meshlabserver -i [input.stl] -o [output.ply]```

**Apply script with log**

```meshlabserver -i [input.obj] -o [output.obj] -s [script.mlx] -l [log.txt]```

**Save output with vertex colors and normals**

```meshlabserver -i [input.obj] -o [output.ply] -m vc vn```

**Process a MeshLab project file**

```meshlabserver -p [project.mlp] -s [script.mlx] -w [output_project.mlp]```

**Dump a list of all available filter functions**

```meshlabserver -d [filters.txt]```

# SYNOPSIS

**meshlabserver** **-i** _input_ [**-o** _output_] [**-s** _script_] [**-l** _log_] [**-m** _options_]

# PARAMETERS

**-i** _file_
> Input mesh file to be loaded (OBJ, STL, PLY, OFF, etc.).

**-o** _file_
> Output mesh file. Format determined by extension.

**-s** _file_
> MeshLab filter script file (.mlx), created from MeshLab GUI via Filters > Show current filter script. Must be in XML format.

**-l** _file_
> Log file for filter processing output.

**-p** _file_
> MeshLab project file (.mlp) to be loaded.

**-w** _file_
> Output MeshLab project file (.mlp) to be saved.

**-x**
> Used with **-w**. Overwrite 3D model files in the input project instead of creating new output files with an _out suffix.

**-d** _file_
> Dump a list of all available filtering functions to a text file.

**-m** _options_
> Mesh attributes to save. Vertex: vc (color), vf (flags), vq (quality), vn (normals), vt (texcoord), vr (radius). Face: fc (color), ff (flags), fq (quality), fn (normals). Wedge: wc (color), wn (normals), wt (texcoord). Format: mp (polygonal), sa (ASCII).

# DESCRIPTION

**meshlabserver** is the command-line (headless) interface for MeshLab. It allows batch processing of 3D meshes non-interactively using filter scripts exported from the MeshLab GUI. It supports mesh format conversion, project file processing, and automation of mesh processing workflows.

# CAVEATS

Deprecated since MeshLab 2022.02 and replaced by **PyMeshLab**, a Python library providing equivalent functionality. Filter scripts (.mlx) must be created from the MeshLab GUI. The output mesh attribute flag is **-m**, not **-om**.

# SEE ALSO

[meshlab](/man/meshlab)(1), [blender](/man/blender)(1)

