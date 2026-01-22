# TLDR

**Convert GML to DOT**

```gml2gv [input.gml] -o [output.gv]```

**Convert to stdout**

```gml2gv [input.gml]```

# SYNOPSIS

**gml2gv** [_options_] [_files_]

# PARAMETERS

_FILES_
> GML input files.

**-o** _FILE_
> Output file.

**-?**
> Display help.

# DESCRIPTION

**gml2gv** converts graphs from GML (Graph Modelling Language) format to DOT format used by Graphviz. It enables using GML graphs with Graphviz visualization tools.

GML is a portable format for graph description. The converter preserves graph structure for rendering with dot, neato, or other Graphviz layout engines.

gml2gv bridges GML and Graphviz ecosystems.

# CAVEATS

Part of Graphviz. Some GML features may not have DOT equivalents. Check attribute preservation.

# HISTORY

gml2gv is part of **Graphviz**, providing format conversion between common graph description languages.

# SEE ALSO

[dot](/man/dot)(1), [gv2gml](/man/gv2gml)(1), [graphml2gv](/man/graphml2gv)(1)
