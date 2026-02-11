# TAGLINE

Convert STL 3D meshes to GTS format

# TLDR

**Convert STL to GTS**

```stl2gts < [input.stl] > [output.gts]```

**With verbose output**

```stl2gts -v < [input.stl] > [output.gts]```

**Help**

```stl2gts --help```

# SYNOPSIS

**stl2gts** [_-v_] < _input.stl_ > _output.gts_

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**stl2gts** converts 3D mesh files from the widely-used STL (Stereolithography) format into GTS (GNU Triangulated Surface) format. STL files represent 3D surfaces as collections of triangular facets and are commonly used in CAD software, 3D printing, and computational geometry.

The GTS format is designed for efficient manipulation and analysis of triangulated surfaces. Unlike STL, GTS stores topological information about vertex and edge connectivity, enabling operations like mesh refinement, boolean operations, and surface analysis that would be difficult with raw triangle soup.

The tool reads STL data from standard input and writes GTS output to standard output, following the Unix pipeline convention. It is part of the GTS Library toolkit, which provides a collection of utilities for triangulated surface mesh processing and computational geometry.

# CAVEATS

Stdin/stdout only. Binary STL not supported. Part of gts-bin.

# HISTORY

**stl2gts** is part of the **GTS Library** (GNU Triangulated Surface Library) for mesh manipulation and analysis.

# SEE ALSO

[gts2stl](/man/gts2stl)(1), [meshlab](/man/meshlab)(1), [admesh](/man/admesh)(1)
