# TAGLINE

Improve Graphviz graph aspect ratio

# TLDR

**Adjust graph layout**

```unflatten [input.dot] -o [output.dot]```

**Set chain limit**

```unflatten -l [3] [input.dot]```

**Fan out**

```unflatten -f [input.dot]```

**Chain length**

```unflatten -c [5] [input.dot]```

# SYNOPSIS

**unflatten** [_-l limit_] [_-f_] [_-c len_] [_-o file_] _input_

# PARAMETERS

**-l** _LIMIT_
> Stagger depth.

**-f**
> Fan out leaves.

**-c** _LEN_
> Chain length.

**-o** _FILE_
> Output file.

# DESCRIPTION

**unflatten** is a Graphviz preprocessor that improves the aspect ratio of directed graphs by breaking up long chains of nodes. It works by staggering the nodes in chains, converting some edges to increase the width of the graph relative to its height.

The tool is designed to be used as a preprocessing step before the **dot** layout engine. When a graph has many nodes arranged in long vertical chains, dot tends to produce very tall, narrow layouts. Running unflatten first adjusts the graph structure so that dot produces a more balanced, readable result.

Options control the maximum chain length before staggering occurs and whether leaf nodes should be fanned out. The tool reads DOT format input and produces modified DOT output that can be piped directly into dot or other Graphviz layout engines.

# CAVEATS

Preprocessing tool. Use with dot. Graphviz required.

# HISTORY

**unflatten** is part of **Graphviz**, used to improve the aspect ratio of graphs with long chains of nodes.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [gvpr](/man/gvpr)(1)
