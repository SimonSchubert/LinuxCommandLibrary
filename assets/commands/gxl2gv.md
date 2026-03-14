# TAGLINE

converts GXL to Graphviz DOT format

# TLDR

**Convert GXL to DOT**

```gxl2gv [input.gxl] -o [output.gv]```

**Output to stdout**

```gxl2gv [input.gxl]```

**Process multiple files**

```gxl2gv [file1.gxl] [file2.gxl] -o [output.gv]```

# SYNOPSIS

**gxl2gv** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input GXL files.

**-o** _FILE_
> Output DOT file.

**-d**
> Output directed graph.

**-?**
> Display help information.

# DESCRIPTION

**gxl2gv** converts between graphs represented in GXL (Graph eXchange Language) and in the GV language. It enables importing XML-based graph data into the Graphviz ecosystem.

Unless a conversion type is specified using a flag, gxl2gv deduces the type of conversion from the suffix of the input file: a ".gv" suffix causes conversion from GV to GXL, and a ".gxl" suffix causes conversion from GXL to GV. When input is from a pipe, the conversion type is inferred from the executable name.

GXL supports a richer graph model than GV. gxl2gv maps GXL constructs into analogous GV constructs when possible; otherwise the GXL information is stored as an attribute.

# CAVEATS

Part of Graphviz package. Requires valid GXL input. Some attributes may not convert.

# HISTORY

gxl2gv is part of the **Graphviz** project, created at **AT&T Labs** for XML-based graph interchange.

# SEE ALSO

[gv2gxl](/man/gv2gxl)(1), [graphml2gv](/man/graphml2gv)(1), [dot](/man/dot)(1)
