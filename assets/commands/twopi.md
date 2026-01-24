# TLDR

**Generate a radial layout** and output as PNG

```twopi -Tpng -o [output.png] [input.dot]```

**Render to SVG format**

```twopi -Tsvg -o [output.svg] [input.dot]```

**Specify a root node** for the center

```twopi -Groot=[node_name] -Tpng -o [output.png] [input.dot]```

**Set the radial distance** between rings (in inches)

```twopi -Granksep=[1.5] -Tpng -o [output.png] [input.dot]```

**Eliminate node overlaps** using Voronoi diagrams

```twopi -Goverlap=false -Tpng -o [output.png] [input.dot]```

**Process from stdin**

```cat [graph.dot] | twopi -Tpng > [output.png]```

# SYNOPSIS

**twopi** [**-G**_name_=_value_] [**-N**_name_=_value_] [**-E**_name_=_value_] [**-T**_format_] [**-o** _outfile_] [_files_]

# PARAMETERS

**-T** _format_
> Output format: png, svg, pdf, ps, jpg, gif, and many others.

**-o** _file_
> Output file name. If omitted, output goes to stdout.

**-G**_name_=_value_
> Set graph attribute. Common attributes: root, ranksep, overlap.

**-N**_name_=_value_
> Set default node attribute.

**-E**_name_=_value_
> Set default edge attribute.

**-K** _layout_
> Specify layout engine (default: twopi).

**-V**
> Print version information.

**-?**
> Print usage information.

# DESCRIPTION

**twopi** is a Graphviz layout program that draws graphs using a radial layout algorithm. One node is chosen as the center and placed at the origin, with remaining nodes arranged on concentric circles at increasing distances based on their graph distance from the center.

Nodes at distance 1 from the center appear on the first ring, nodes at distance 2 on the second ring, and so forth. This layout is particularly effective for visualizing hierarchies, network topologies, and trees where relationships radiate from a central point.

The center node can be specified with the **root** attribute; otherwise, twopi selects a node furthest from any leaf node. The spacing between rings is controlled by **ranksep** (default 0.75 inches). Node overlaps can be resolved using the **overlap** attribute with Voronoi diagrams or scaling.

Input must be in DOT graph language format. twopi is part of the Graphviz suite alongside dot, neato, circo, fdp, and sfdp.

# CAVEATS

For large graphs, radial layouts can become cluttered as outer rings contain exponentially more nodes. The automatic center selection may not always produce optimal results; manually specifying the root node often improves layout quality. Memory usage scales with graph size.

# HISTORY

**twopi** was developed as part of **Graphviz** at **AT&T Labs Research** in the **1990s**. The radial layout algorithm is based on work by Graham Wills presented at the Graph Drawing Symposium in **1997**. Graphviz was open-sourced in **2000** and continues to be actively maintained.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [circo](/man/circo)(1), [fdp](/man/fdp)(1), [sfdp](/man/sfdp)(1)
