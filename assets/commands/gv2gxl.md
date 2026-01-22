# TLDR

**Convert DOT to GXL**

```gv2gxl [input.gv] -o [output.gxl]```

**Output to stdout**

```gv2gxl [input.dot]```

**Process multiple files**

```gv2gxl [file1.gv] [file2.gv] -o [output.gxl]```

# SYNOPSIS

**gv2gxl** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input DOT/GV files.

**-o** _FILE_
> Output GXL file.

**-d**
> Output directed graph.

**-?**
> Display help information.

# DESCRIPTION

**gv2gxl** converts Graphviz DOT format to GXL (Graph eXchange Language). GXL is an XML-based format for graph interchange.

The tool translates graph structure to XML representation. It's useful for processing graphs with XML tools or exchanging with other graph systems.

gv2gxl converts Graphviz to GXL format.

# CAVEATS

Part of Graphviz package. XML output can be verbose. Some attributes may not convert.

# HISTORY

gv2gxl is part of the **Graphviz** project, created at **AT&T Labs** for XML-based graph interchange.

# SEE ALSO

[gxl2gv](/man/gxl2gv)(1), [gv2gml](/man/gv2gml)(1), [dot](/man/dot)(1)
