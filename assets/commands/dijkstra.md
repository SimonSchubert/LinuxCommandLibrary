# TAGLINE

shortest path graph algorithm filter

# TLDR

**Compute shortest path from a source node in a graph**

```dijkstra -p [source_node] [input.dot]```

**Output distance matrix for all pairs of nodes**

```dijkstra -d [input.dot]```

**Write processed graph to output file**

```dijkstra [input.dot] -o [output.dot]```

**Compute shortest paths and output to file**

```dijkstra -p [source_node] -o [output.dot] [input.dot]```

# SYNOPSIS

**dijkstra** [_options_] [_files_]

# PARAMETERS

**-o** _file_
> Output file.

**-p** _node_
> Set source node for shortest path computation.

**-d**
> Output distance matrix.

# DESCRIPTION

**dijkstra** is a specialized Graphviz filter implementing Dijkstra's shortest path algorithm for graph analysis. It reads graph descriptions in DOT format, computes shortest paths between nodes, and outputs modified graphs with calculated distances or path information.

The tool can calculate distance matrices showing the shortest path length between all pairs of nodes in a graph. It modifies graph attributes to reflect path calculations, which can then be used by other Graphviz layout tools for visualization.

This utility is part of the Graphviz suite and is primarily used for network analysis, routing problems, and graph algorithm research. It processes graphs with weighted edges and can output results in various formats compatible with other Graphviz tools.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [sfdp](/man/sfdp)(1)
