# TAGLINE

Graphviz circular graph layout engine

# TLDR

**Render a graph with circular layout to PNG**

```circo -Tpng [input.dot] -o [output.png]```

**Render to SVG format**

```circo -Tsvg [input.dot] -o [output.svg]```

**Render to PDF format**

```circo -Tpdf [input.dot] -o [output.pdf]```

**Read from stdin and output to stdout**

```cat [input.dot] | circo -Tpng > [output.png]```

**Display available output formats**

```circo -T?```

# SYNOPSIS

**circo** [**-T**_format_] [**-o** _outfile_] [**-K**_layout_] [**-G**_name=value_] [**-N**_name=value_] [**-E**_name=value_] [_files..._]

# DESCRIPTION

**circo** is a Graphviz layout engine that produces circular graph layouts. It identifies biconnected components and arranges nodes on circles, minimizing edge crossings by placing edges on the circle's perimeter when possible.

The tool uses a recursive radial algorithm for the block-cutpoint tree. Outerplanar components receive planar layouts. It is suitable for telecommunications networks and cyclic structures.

# PARAMETERS

**-T**_format_
> Output format: png, svg, pdf, ps, dot, json, gif, jpg, and more

**-o** _outfile_
> Write output to file instead of stdout

**-G**_name=value_
> Set graph attribute

**-N**_name=value_
> Set default node attribute

**-E**_name=value_
> Set default edge attribute

**-K**_layout_
> Override layout engine

**Circo-specific graph attributes:**

**root=**_nodename_
> Node to use as root of the layout

**mindist=**_value_
> Minimum separation between nodes (default: 1.0)

**oneblock=**_true_
> Draw entire graph around one circle

# CAVEATS

Part of the Graphviz package; all layout engines (dot, neato, circo, twopi, fdp, sfdp) share the same command-line interface and are implemented as plugins.

# HISTORY

**Circo** implements algorithms described by Six and Tollis (GD '99, ALENEX '99) and Kaufmann and Wiese (GD '02). Graphviz was originally developed at AT&T Labs Research.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [twopi](/man/twopi)(1), [fdp](/man/fdp)(1), [sfdp](/man/sfdp)(1)
