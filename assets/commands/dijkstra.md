# TLDR

**Check Graphviz graph** for proper layout

```dijkstra [input.dot]```

**Output processed graph**

```dijkstra [input.dot] -o [output.dot]```

# SYNOPSIS

**dijkstra** [_options_] [_files_]

# PARAMETERS

**-o** _file_
> Output file.

**-d**
> Output distance matrix.

# DESCRIPTION

**dijkstra** is a Graphviz filter that calculates shortest paths in graphs using Dijkstra's algorithm. It can compute distance matrices and modify graph attributes based on path calculations.

Part of the Graphviz graph visualization suite.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [graphviz](/man/graphviz)(1)
