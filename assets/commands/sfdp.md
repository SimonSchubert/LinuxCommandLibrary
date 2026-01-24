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

**sfdp** layouts large graphs. It's scalable force-directed placement.

Designed for large graphs. Thousands of nodes.

Multilevel approach. Coarsening then refining.

Handles clusters well. Community structure.

Part of Graphviz suite. DOT format input.

# CAVEATS

Memory intensive. Large graphs slow. Part of Graphviz package.

# HISTORY

**sfdp** is part of **Graphviz**, implementing a scalable force-directed placement algorithm for large graph layouts.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [fdp](/man/fdp)(1), [twopi](/man/twopi)(1)
