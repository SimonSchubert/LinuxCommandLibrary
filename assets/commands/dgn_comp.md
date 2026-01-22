# TLDR

**Compile a DGN file**

```dgn_comp [input.dgn] [output]```

**Compile with verbose** output

```dgn_comp -v [input.dgn]```

**List supported options**

```dgn_comp --help```

# SYNOPSIS

**dgn_comp** [_options_] _input_ [_output_]

# PARAMETERS

_INPUT_
> DGN (MicroStation design) file to process.

_OUTPUT_
> Output file path.

**-v**, **--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**dgn_comp** is a utility for processing and compiling DGN (Design) files, the native format of Bentley MicroStation CAD software. It may be used for format validation, conversion, or preprocessing of design files.

DGN files contain 2D and 3D vector graphics data used in engineering, architecture, and GIS applications. Tools like dgn_comp facilitate working with these files in automated workflows or on systems without full CAD software.

The specific functionality depends on the implementation, as various tools with this name exist for different DGN processing tasks.

# CAVEATS

DGN format has multiple versions with varying compatibility. Some features may require licensing. Complex designs may need full CAD software for accurate processing.

# HISTORY

DGN format was developed by **Intergraph** and later maintained by **Bentley Systems** for their MicroStation software. Various open-source and third-party tools have been developed to work with DGN files outside the proprietary ecosystem.

# SEE ALSO

[ogr2ogr](/man/ogr2ogr)(1), [dwg2dxf](/man/dwg2dxf)(1)
