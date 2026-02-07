# TAGLINE

graph cluster layout tool

# TLDR

**Generate a cluster layout** from a graph

```cluster [input.dot] -o [output.dot]```

**Cluster with specific algorithm**

```cluster -C [algorithm] [input.dot]```

# SYNOPSIS

**cluster** [_options_] [_files_]

# DESCRIPTION

**cluster** is a graph layout tool from the Graphviz package that identifies and highlights clusters (communities or groups) within graph structures. It reads graphs in DOT format and annotates them with cluster information.

The tool analyzes the connectivity of a graph to detect natural groupings of nodes. These groupings are then represented as subgraph clusters in the output, which can be further processed by other Graphviz layout engines like dot or neato for visualization.

It is part of the Graphviz suite alongside dot, neato, fdp, sfdp, twopi, and circo, each providing different layout algorithms for graph visualization.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [graphviz](/man/graphviz)(1)
