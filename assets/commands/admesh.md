# TLDR

**Display information** about an STL file

```admesh [path/to/model.stl]```

**Repair and output** a fixed STL file

```admesh --write-binary-stl=[output.stl] [input.stl]```

**Convert STL to ASCII format**

```admesh --write-ascii-stl=[output.stl] [input.stl]```

**Fix all defects** in an STL file

```admesh --fill-holes --normal-directions --normal-values [input.stl] --write-binary-stl=[output.stl]```

**Scale a model** by a factor

```admesh --scale=[2.0] [input.stl] --write-binary-stl=[output.stl]```

**Translate a model** along axes

```admesh --translate=[10,20,30] [input.stl] --write-binary-stl=[output.stl]```

**Rotate around the X axis**

```admesh --x-rotate=[90] [input.stl] --write-binary-stl=[output.stl]```

# SYNOPSIS

**admesh** [_options_] _input.stl_

# PARAMETERS

**--write-binary-stl** _file_
> Output repaired mesh in binary STL format.

**--write-ascii-stl** _file_
> Output repaired mesh in ASCII STL format.

**--fill-holes**
> Fill holes in the mesh by adding triangles.

**--normal-directions**
> Fix normals to point outward consistently.

**--normal-values**
> Recalculate normal vectors for all facets.

**--exact**
> Only check for perfectly matched edges.

**--nearby**
> Find and connect nearby facets.

**--remove-unconnected**
> Remove facets that cannot be connected.

**--scale** _factor_
> Scale the model by the given factor.

**--translate** _x,y,z_
> Move the model by the specified offset.

**--x-rotate**, **--y-rotate**, **--z-rotate** _angle_
> Rotate model around the specified axis (in degrees).

**--merge** _file_
> Merge another STL file into the input.

**-v**, **--verbose**
> Display detailed processing information.

# DESCRIPTION

**ADMesh** is a tool for processing and repairing STL (stereolithography) files used in 3D printing and CAD applications. It diagnoses and fixes common mesh problems including gaps, holes, inverted normals, and disconnected facets that would cause printing failures.

When run without output options, ADMesh analyzes the input file and reports statistics including facet count, volume, surface area, and detected errors. The repair algorithms can automatically fix most mesh issues, making it essential for preparing models for 3D printing.

ADMesh supports both binary and ASCII STL formats and can convert between them. It also provides transformation operations for scaling, rotating, and translating models without requiring a full CAD application.

# CAVEATS

ADMesh processes only STL files; other 3D formats require conversion first. Very complex repairs may alter the original geometry. The **--exact** and **--nearby** algorithms may produce different results depending on mesh quality. Large files in ASCII format are significantly slower to process than binary.

# HISTORY

ADMesh was originally developed by **Anthony D. Martin** in the **mid-1990s** to repair STL files for rapid prototyping machines. It was open-sourced and has been maintained by the community since. The tool gained renewed popularity with the rise of consumer 3D printing in the **2010s** and is now commonly used alongside slicing software in FDM printing workflows.

# SEE ALSO

[meshlab](/man/meshlab)(1), [openscad](/man/openscad)(1), [blender](/man/blender)(1), [slic3r](/man/slic3r)(1)
