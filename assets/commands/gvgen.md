# TLDR

**Generate star graph**

```gvgen -S [5] > star.gv```

**Generate grid graph**

```gvgen -g [3] [4] > grid.gv```

**Generate complete graph**

```gvgen -K [6] > complete.gv```

**Generate tree**

```gvgen -t [3] [4] > tree.gv```

**Generate random graph**

```gvgen -R [10] [20] > random.gv```

# SYNOPSIS

**gvgen** [_options_]

# PARAMETERS

**-S** _N_
> Star graph with N points.

**-g** _M_ _N_
> M x N grid graph.

**-K** _N_
> Complete graph on N nodes.

**-t** _D_ _B_
> Tree with depth D, branching B.

**-R** _N_ _E_
> Random graph with N nodes, E edges.

**-c** _N_
> Cycle graph.

**-p** _N_
> Path graph.

**-o** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**gvgen** generates various types of graphs in DOT format. It creates standard graph structures useful for testing, visualization, and algorithms.

The tool supports stars, grids, trees, complete graphs, cycles, and random graphs. Output is in Graphviz format for visualization.

gvgen creates sample graphs for Graphviz.

# CAVEATS

Part of Graphviz package. Random graphs vary each run. Large graphs may be slow to render.

# HISTORY

gvgen was developed as part of the **Graphviz** project to provide sample graph generation for testing and demonstration.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [graphviz](/man/graphviz)(1)
