# TAGLINE

generates various types of graphs in DOT format

# TLDR

**Generate a star graph** with 5 vertices

```gvgen -s [5] > star.gv```

**Generate a grid graph**

```gvgen -g [3],[4] > grid.gv```

**Generate a complete graph** on 6 vertices

```gvgen -k [6] > complete.gv```

**Generate a binary tree** of height 4

```gvgen -t [4] > tree.gv```

**Generate a random graph** with 10 vertices

```gvgen -r [10],[0.3] > random.gv```

**Generate a directed cycle** and write to a file

```gvgen -d -c [8] -o [cycle.gv]```

# SYNOPSIS

**gvgen** [**-dv?**] [_-c n_] [_-C x,y_] [_-g[f] x,y_] [_-h n_] [_-k n_] [_-b x,y_] [_-B x,y_] [_-m n_] [_-M x,y_] [_-p n_] [_-r x,y_] [_-R x_] [_-s n_] [_-S n_] [_-t n_] [_-T x,y_] [_-w n_] [_-n prefix_] [_-N name_] [_-o outfile_]

# PARAMETERS

**-s** _n_
> Generate a star on n vertices.

**-g** [**f**]_x_,_y_
> Generate an x by y grid. If f is given, the grid is folded with edges attaching opposing corner vertices.

**-k** _n_
> Generate a complete graph on n vertices.

**-c** _n_
> Generate a cycle with n vertices and edges.

**-p** _n_
> Generate a path on n vertices.

**-t** _n_
> Generate a complete binary tree of height n. Use **-t** _h_,_n_ for an n-ary tree.

**-r** _x_,_y_
> Generate a random graph. The x and y give the number of vertices and the density of the edges (between 0 and 1).

**-R** _x_
> Generate a random rooted tree on x vertices.

**-h** _n_
> Generate a hypercube of degree n (2^n vertices).

**-b** _x_,_y_
> Generate a complete x by y bipartite graph.

**-C** _x_,_y_
> Generate an x by y cylinder.

**-B** _x_,_y_
> Generate an x by y ball (a cylinder with two caps).

**-m** _n_
> Generate a triangular mesh with n vertices on a side.

**-M** _x_,_y_
> Generate an x by y Moebius strip.

**-T** _x_,_y_
> Generate an x by y torus.

**-S** _n_
> Generate a Sierpinski graph of order n.

**-w** _n_
> Generate a wheel graph on n vertices.

**-d**
> Make the generated graph directed.

**-n** _prefix_
> Prepend prefix to integer node names.

**-N** _name_
> Use name as the name of the graph.

**-o** _outfile_
> Write output to the specified file instead of stdout.

**-u** _seed_
> Specify the seed for the random number generator.

**-v**
> Verbose output.

**-?**
> Print usage information.

# DESCRIPTION

**gvgen** generates a variety of simple, regularly-structured abstract graphs in DOT format. It creates standard graph structures useful for testing, visualization, and algorithm demonstrations.

The tool supports stars, grids, trees, complete graphs, cycles, paths, random graphs, hypercubes, bipartite graphs, cylinders, tori, Moebius strips, Sierpinski graphs, and more. Output is in Graphviz DOT format for visualization with layout engines.

# CAVEATS

Part of the Graphviz package. Random graphs vary each run unless a seed is specified with **-u**. Large graphs may be slow to render.

# HISTORY

gvgen was developed as part of the **Graphviz** project to provide sample graph generation for testing and demonstration.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [sfdp](/man/sfdp)(1), [gvpack](/man/gvpack)(1)
