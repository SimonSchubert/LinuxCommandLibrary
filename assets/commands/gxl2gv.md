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

**gxl2gv** converts GXL (Graph eXchange Language) to Graphviz DOT format. It enables importing XML-based graph data into the Graphviz ecosystem.

The tool translates GXL's XML representation to DOT syntax. It's the inverse of gv2gxl for format interchange.

gxl2gv converts GXL to Graphviz format.

# CAVEATS

Part of Graphviz package. Requires valid GXL input. Some attributes may not convert.

# HISTORY

gxl2gv is part of the **Graphviz** project, created at **AT&T Labs** for XML-based graph interchange.

# SEE ALSO

[gv2gxl](/man/gv2gxl)(1), [graphml2gv](/man/graphml2gv)(1), [dot](/man/dot)(1)
