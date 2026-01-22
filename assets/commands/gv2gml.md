# TLDR

**Convert DOT to GML**

```gv2gml [input.gv] -o [output.gml]```

**Output to stdout**

```gv2gml [input.dot]```

**Process multiple files**

```gv2gml [file1.gv] [file2.gv] -o [output.gml]```

# SYNOPSIS

**gv2gml** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input DOT/GV files.

**-o** _FILE_
> Output GML file.

**-?**
> Display help information.

# DESCRIPTION

**gv2gml** converts Graphviz DOT format to GML (Graph Modelling Language). GML is an interchange format used by various graph analysis tools.

The tool preserves graph structure during conversion. It's useful for exporting Graphviz graphs to other applications like yEd or Gephi.

gv2gml converts Graphviz to GML format.

# CAVEATS

Part of Graphviz package. Some DOT features may not convert. One-way conversion.

# HISTORY

gv2gml is part of the **Graphviz** project, created at **AT&T Labs** for graph format conversion.

# SEE ALSO

[graphml2gv](/man/graphml2gv)(1), [dot](/man/dot)(1), [gxl2gv](/man/gxl2gv)(1)
