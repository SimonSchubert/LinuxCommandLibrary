# TAGLINE

GraphML to Graphviz DOT format converter

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
> GraphML input files. If omitted, reads from standard input.

**-o** _FILE_
> Write output to the specified file.

**-g** _gname_
> Use gname as the name of the generated graph. For multiple graphs, an integer is appended.

**-v**
> Enable verbose mode.

**-?**
> Print usage information and exit.

# DESCRIPTION

**graphml2gv** converts GraphML format graphs to Graphviz DOT format. It enables using GraphML data with Graphviz visualization tools.

The tool handles the translation between the XML-based GraphML format and the GV (formerly DOT) language. As both the graph and graphics models of GV and GraphML differ significantly, the conversion is approximate. GraphML features such as hyperedges or edges containing graphs have no GV equivalent. Currently, graphml2gv only supports basic graph topology.

# CAVEATS

Part of the Graphviz package. GraphML features like hyperedges and nested graphs are not supported. Requires valid GraphML input.

# HISTORY

graphml2gv is part of the **Graphviz** project, created at **AT&T Labs** to handle format conversions for graph visualization.

# SEE ALSO

[gv2gml](/man/gv2gml)(1), [gml2gv](/man/gml2gv)(1), [dot](/man/dot)(1), [neato](/man/neato)(1), [graphviz](/man/graphviz)(1)
