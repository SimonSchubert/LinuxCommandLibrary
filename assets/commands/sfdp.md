# TAGLINE

Scalable force-directed graph layout engine

# TLDR

**Layout graph**

```sfdp [input.dot] -o [output.png]```

**Output as SVG**

```sfdp -Tsvg [input.dot] -o [output.svg]```

**Large graph layout**

```sfdp -Goverlap=prism [input.dot] -o [output.png]```

**With custom parameters**

```sfdp -Gsize="10,10" [input.dot] -o [output.png]```

# SYNOPSIS

**sfdp** [_-T format_] [_-o file_] [_-G options_] _input_

# PARAMETERS

**-T** _FORMAT_
> Output format (png, svg, pdf).

**-o** _FILE_
> Output file.

**-G** _ATTR=VAL_
> Graph attribute.

**-N** _ATTR=VAL_
> Node attribute.

**-E** _ATTR=VAL_
> Edge attribute.

**-Goverlap** _MODE_
> Overlap removal.

# DESCRIPTION

**sfdp** is a scalable force-directed placement engine for laying out large undirected graphs. It is part of the Graphviz suite and reads graphs in DOT format, producing visual layouts suitable for graphs with thousands to tens of thousands of nodes.

The algorithm uses a multilevel approach that first coarsens the graph into progressively smaller representations, computes an initial layout on the coarsest level, then refines back through the levels. This strategy allows it to handle much larger graphs than simple force-directed methods like **neato** or **fdp**, while still producing aesthetically pleasing results that reveal community structure and clusters.

Output can be rendered in various formats including PNG, SVG, and PDF. Graph, node, and edge attributes control visual appearance through the standard Graphviz attribute system.

# CAVEATS

Memory intensive. Large graphs slow. Part of Graphviz package.

# HISTORY

**sfdp** is part of **Graphviz**, implementing a scalable force-directed placement algorithm for large graph layouts.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [fdp](/man/fdp)(1), [twopi](/man/twopi)(1)
