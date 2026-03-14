# TAGLINE

converts Graphviz DOT format to GXL

# TLDR

**Convert DOT to GXL**

```gv2gxl [input.gv] -o [output.gxl]```

**Output to stdout**

```gv2gxl [input.dot]```

**Process multiple files**

```gv2gxl [file1.gv] [file2.gv] -o [output.gxl]```

# SYNOPSIS

**gv2gxl** [**-gd?**] [**-o** _outfile_] [_files_]

# PARAMETERS

**-g**
> Force input to be treated as GV format and generate GXL output, ignoring file extension

**-d**
> Force input to be treated as GXL format and generate GV output, ignoring file extension

**-o** _outfile_
> Write output to the specified file instead of stdout

**-?**
> Display usage information and exit

# DESCRIPTION

**gv2gxl** converts between graphs represented in GXL (Graph eXchange Language) and Graphviz GV/DOT format. GXL is an XML-based format for graph interchange.

Unless a conversion type is specified with **-g** or **-d**, the tool deduces the conversion direction from the input file suffix: a ".gv" suffix converts from GV to GXL, and a ".gxl" suffix converts from GXL to GV. When input is from a pipe with no flags, the conversion direction is determined by the executable name: **gv2gxl** converts from GV to GXL.

The commands **dot2gxl**, **gv2gxl**, and **gxl2dot** are aliases of **gxl2gv**.

# CAVEATS

The conversion can only handle one graph per GXL file. Applying gxl2gv followed by gv2gxl is semantically equivalent to the identity operator.

# HISTORY

gv2gxl is part of the **Graphviz** project, created at **AT&T Labs** for XML-based graph interchange.

# SEE ALSO

[gxl2gv](/man/gxl2gv)(1), [gv2gml](/man/gv2gml)(1), [dot](/man/dot)(1)
