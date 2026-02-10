# TAGLINE

graphviz layout program for clustered graphs

# TLDR

**Layout clustered graph**

```osage -Tpng [graph.gv] -o [output.png]```

**Generate SVG output**

```osage -Tsvg [graph.gv] -o [output.svg]```

**Generate PDF output**

```osage -Tpdf [graph.gv] -o [output.pdf]```

# SYNOPSIS

**osage** [_options_] [_files_...]

# PARAMETERS

**-T** _format_
> Output format (png, svg, pdf, dot, etc.).

**-o** _file_
> Output file.

**-G** _attr=val_
> Set graph attribute.

**-N** _attr=val_
> Set node attribute.

**-E** _attr=val_
> Set edge attribute.

**-K** _layout_
> Layout engine override.

# DESCRIPTION

**osage** is a Graphviz layout program for clustered graphs. Recursively lays out clusters using array packing algorithm. Part of the Graphviz suite for visualizing hierarchically grouped nodes.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [patchwork](/man/patchwork)(1), [fdp](/man/fdp)(1)

