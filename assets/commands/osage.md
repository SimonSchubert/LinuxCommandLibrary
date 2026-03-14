# TAGLINE

Graphviz layout engine for clustered graphs

# TLDR

**Layout clustered graph** as PNG

```osage -Tpng [graph.gv] -o [output.png]```

**Generate SVG output**

```osage -Tsvg [graph.gv] -o [output.svg]```

**Generate PDF output**

```osage -Tpdf [graph.gv] -o [output.pdf]```

**Set graph packing mode**

```osage -Gpackmode=columns [graph.gv] -Tpng -o [output.png]```

# SYNOPSIS

**osage** [_options_] [_files_...]

# PARAMETERS

**-T** _format_
> Output format (png, svg, pdf, dot, ps, etc.)

**-o** _file_
> Output file

**-G** _attr=val_
> Set graph attribute (e.g., pack, packmode)

**-N** _attr=val_
> Set default node attribute

**-E** _attr=val_
> Set default edge attribute

**-K** _layout_
> Override layout engine

**-O**
> Automatically generate output filename based on input

**-v**
> Verbose mode

**-V**
> Print version and exit

# DESCRIPTION

**osage** is a Graphviz layout engine for clustered graphs. It recursively lays out cluster subgraphs using an array packing algorithm, treating each cluster as a rectangle to be packed. At each level, the internals of each cluster subgraph are laid out first, then clusters and nodes are positioned relative to each other.

The graph attributes **pack** and **packmode** control the layout at each level. Edges are routed after all nodes and clusters are positioned, based on the **splines** attribute.

# CAVEATS

Edges are ignored during the packing phase and only routed afterward. Best suited for graphs where the cluster structure is more important than edge routing.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [patchwork](/man/patchwork)(1), [fdp](/man/fdp)(1)

