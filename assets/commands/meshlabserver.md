# TAGLINE

Command-line interface for MeshLab 3D mesh processing

# TLDR

**Apply filter script to mesh**

```meshlabserver -i [input.obj] -o [output.obj] -s [script.mlx]```

**Convert mesh format**

```meshlabserver -i [input.stl] -o [output.ply]```

**Apply script with log**

```meshlabserver -l [log.txt] -i [input.obj] -o [output.obj] -s [script.mlx]```

**Save output with vertex colors and normals**

```meshlabserver -i [input.obj] -o [output.ply] -m vc vn```

**Process a MeshLab project file**

```meshlabserver -p [project.mlp] -s [script.mlx] -w [output_project.mlp]```

**Dump a list of all available filter functions**

```meshlabserver -d [filters.txt]```

# SYNOPSIS

**meshlabserver** [**-d** _file_] [**-l** _log_] [**-p** _project_] [**-i** _input_] [**-o** _output_ [**-l** _layer_] [**-m** _attributes_]] [**-s** _script_] [**-w** _project_ [**-x**]]

# PARAMETERS

**-i** _file_
> Input mesh file to be loaded (OBJ, STL, PLY, OFF, etc.). Can be repeated; order matters for filters that take meshes as parameters.

**-o** _file_
> Output mesh file. Format determined by extension. Can be repeated. A **-l** directly after it selects the layer to save: an index, **c** (current, the default) or **x** (last).

**-s** _file_
> MeshLab filter script file (.mlx), created from MeshLab GUI via Filters > Show current filter script. Must be in XML format.

**-l** _file_
> Log file for filter processing output. Place it before the mesh arguments, since **-l** after **-o** selects a layer.

**-p** _file_
> MeshLab project file to be loaded (.mlp, .mlb, .aln, .out, .nvm).

**-w** _file_
> Output MeshLab project file (.mlp) to be saved.

**-x**
> Used with **-w**. Overwrite 3D model files in the input project instead of creating new output files with an _out suffix.

**-d** _file_
> Dump a list of all available filtering functions to a text file.

**-m** _options_
> Space-separated mesh attributes to save for the preceding **-o**. Vertex: vc (color), vf (flags), vq (quality), vn (normals), vt (texcoord), vr (radius). Face: fc (color), ff (flags), fq (quality), fn (normals). Wedge: wc (color), wn (normals), wt (texcoord). Format: mp (polygonal), sa (ASCII).

# DESCRIPTION

**meshlabserver** is the command-line (headless) interface for MeshLab. It allows batch processing of 3D meshes non-interactively using filter scripts exported from the MeshLab GUI. It supports mesh format conversion, project file processing, and automation of mesh processing workflows.

# CAVEATS

No longer part of MeshLab: the last release containing it is 2021.05. Its replacement is **PyMeshLab**, a Python library providing equivalent functionality. Filter scripts (.mlx) must be created from the MeshLab GUI. The output mesh attribute flag is **-m**, not **-om**.

# SEE ALSO

[meshlab](/man/meshlab)(1), [blender](/man/blender)(1)

# RESOURCES

```[Source code](https://github.com/cnr-isti-vclab/meshlab)```

```[Homepage](https://www.meshlab.net)```

<!-- verified: 2026-11-09 -->
