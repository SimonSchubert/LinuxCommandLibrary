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

**stl2gts** converts STL to GTS. It transforms mesh formats.

STL is common 3D format. Triangulated surfaces.

GTS is GNU Triangulated Surface. Analysis format.

Reads from stdin. Writes to stdout.

Part of GTS library. Mesh processing.

# CAVEATS

Stdin/stdout only. Binary STL not supported. Part of gts-bin.

# HISTORY

**stl2gts** is part of the **GTS Library** (GNU Triangulated Surface Library) for mesh manipulation and analysis.

# SEE ALSO

[gts2stl](/man/gts2stl)(1), [meshlab](/man/meshlab)(1), [admesh](/man/admesh)(1)
