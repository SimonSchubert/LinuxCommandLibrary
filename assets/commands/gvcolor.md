# TAGLINE

graphviz filter that colors nodes in a ranked directed graph

# TLDR

**Color a graph by rank**

```dot -Tcanon [graph.gv] | gvcolor | dot -Tpng -o [output.png]```

**Color and output to file**

```dot -Tcanon [graph.gv] | gvcolor > [colored.gv]```

# SYNOPSIS

**gvcolor** [_file_]

# DESCRIPTION

**gvcolor** is a Graphviz filter that colors nodes in a ranked directed graph. It takes a graph processed by **dot** in canonical format and assigns colors based on node rank/depth. Nodes at the same rank receive similar colors, creating a visual gradient that shows the flow structure. Typically used in a pipeline between dot processing stages.

# CAVEATS

Input must be in dot canonical format (-Tcanon or -Tdot). Works only with directed graphs that have been laid out by dot.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [gvpack](/man/gvpack)(1)

