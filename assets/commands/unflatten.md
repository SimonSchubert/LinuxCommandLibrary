# TAGLINE

Improve Graphviz graph aspect ratio

# TLDR

**Adjust graph layout** and write to output file

```unflatten [input.dot] -o [output.dot]```

**Stagger leaf edge lengths** between 1 and the specified limit

```unflatten -l [3] [input.dot]```

**Fan out nodes** with indegree and outdegree of 1 (requires -l)

```unflatten -f -l [3] [input.dot]```

**Form disconnected nodes** into chains of up to the specified length

```unflatten -c [5] [input.dot]```

**Pipe through dot** for improved layout

```unflatten -l [4] [input.dot] | dot -Tpng -o [output.png]```

# SYNOPSIS

**unflatten** [_-l limit_] [_-f_] [_-c len_] [_-o file_] _input_

# PARAMETERS

**-l** _len_
> Stagger the minimum length of leaf edges between 1 and _len_

**-f**
> Fan out nodes whose indegree and outdegree are both 1 (only works with -l)

**-c** _len_
> Form disconnected nodes into chains of up to _len_ nodes

**-o** _file_
> Write output to _file_ instead of stdout

# DESCRIPTION

**unflatten** is a Graphviz preprocessor that improves the aspect ratio of directed graphs by breaking up long chains of nodes. It works by staggering the nodes in chains, converting some edges to increase the width of the graph relative to its height.

The tool is designed to be used as a preprocessing step before the **dot** layout engine. When a graph has many nodes arranged in long vertical chains, dot tends to produce very tall, narrow layouts. Running unflatten first adjusts the graph structure so that dot produces a more balanced, readable result.

Options control the maximum chain length before staggering occurs and whether leaf nodes should be fanned out. The tool reads DOT format input and produces modified DOT output that can be piped directly into dot or other Graphviz layout engines.

# CAVEATS

Designed as a preprocessing step before the **dot** layout engine. The **-f** option has no effect without **-l**. Graphviz must be installed.

# HISTORY

**unflatten** is part of **Graphviz**, used to improve the aspect ratio of graphs with long chains of nodes.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [gvpr](/man/gvpr)(1)
