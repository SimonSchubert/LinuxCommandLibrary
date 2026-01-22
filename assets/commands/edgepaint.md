# TLDR

**Color graph edges**

```edgepaint [graph.dot] -o [colored.dot]```

**Color with specific** angle

```edgepaint -angle [15] [graph.dot]```

**Use specific color** scheme

```edgepaint -color_scheme [accent8] [graph.dot]```

# SYNOPSIS

**edgepaint** [_options_] [_input_] **-o** _output_

# PARAMETERS

_INPUT_
> Input DOT file.

**-o** _FILE_
> Output file.

**-angle** _N_
> Minimum angle between colors.

**-color_scheme** _NAME_
> Color scheme to use.

**-share_endpoint**
> Share colors at endpoints.

**--help**
> Display help information.

# DESCRIPTION

**edgepaint** assigns colors to edges in a graph to improve visual distinction. It's part of Graphviz and helps make complex graphs more readable by ensuring adjacent edges have different colors.

The tool uses graph coloring algorithms to minimize color similarity between edges that share nodes or cross each other. This makes edge paths easier to follow in dense graphs.

edgepaint is typically used after layout with dot or other Graphviz tools.

# CAVEATS

Input must be already laid out graph. Limited color schemes available. Very dense graphs may still be hard to read.

# HISTORY

edgepaint is part of **Graphviz**, developed at **AT&T Labs Research**. It addresses the practical problem of visual edge distinction in automatically laid out graphs.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [graphviz](/man/graphviz)(7)
