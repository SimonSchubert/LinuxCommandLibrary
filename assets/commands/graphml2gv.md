# TLDR

**Convert GraphML to DOT**

```graphml2gv [input.graphml] -o [output.gv]```

**Output to stdout**

```graphml2gv [input.graphml]```

**Process multiple files**

```graphml2gv [file1.graphml] [file2.graphml] -o [output.gv]```

# SYNOPSIS

**graphml2gv** [_options_] [_files_]

# PARAMETERS

_FILES_
> GraphML input files.

**-o** _FILE_
> Output file name.

**-?**
> Display help information.

# DESCRIPTION

**graphml2gv** converts GraphML format graphs to Graphviz DOT format. It enables using GraphML data with Graphviz visualization tools.

The tool handles the translation between the XML-based GraphML format and the DOT language. It preserves graph structure and attributes during conversion.

graphml2gv converts GraphML to Graphviz format.

# CAVEATS

Part of Graphviz package. Some GraphML features may not have DOT equivalents. Requires valid GraphML input.

# HISTORY

graphml2gv is part of the **Graphviz** project, created at **AT&T Labs** to handle format conversions for graph visualization.

# SEE ALSO

[gv2gml](/man/gv2gml)(1), [dot](/man/dot)(1), [graphviz](/man/graphviz)(1)
