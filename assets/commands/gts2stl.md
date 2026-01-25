# TLDR

**Convert GTS to STL**

```gts2stl < [input.gts] > [output.stl]```

**Convert with verbose output**

```gts2stl -v < [input.gts] > [output.stl]```

# SYNOPSIS

**gts2stl** [_options_] < _input.gts_ > _output.stl_

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**-h**, **--help**
> Display help.

# DESCRIPTION

**gts2stl** converts GTS (GNU Triangulated Surface) files to STL (STereoLithography) format. GTS is a library for 3D surface mesh operations, and this tool exports meshes to the widely-used STL format.

STL files are commonly used for 3D printing and CAD applications. The conversion preserves the triangular mesh structure.

# GTS FORMAT

GTS files contain:
- Vertex count, edge count, face count
- Vertex coordinates
- Edge definitions (vertex pairs)
- Face definitions (edge triplets)

# CAVEATS

Reads from stdin, writes to stdout. Large meshes may take time. GTS format is less common than STL. Part of GTS library package.

# HISTORY

gts2stl is part of the **GTS Library** (GNU Triangulated Surface), developed for computational geometry operations. The library provides tools for surface mesh manipulation, boolean operations, and format conversion.

# SEE ALSO

[stl2gts](/man/stl2gts)(1), [meshlab](/man/meshlab)(1), [openscad](/man/openscad)(1)
