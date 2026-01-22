# TLDR

**Generate graph from** DOT file

```fdp -Tpng [graph.dot] -o [output.png]```

**Output SVG format**

```fdp -Tsvg [graph.dot] -o [output.svg]```

**Process from stdin**

```echo 'graph { a -- b }' | fdp -Tpng -o [output.png]```

**Set graph attributes**

```fdp -Gsize="10,10" -Tpng [graph.dot] -o [output.png]```

# SYNOPSIS

**fdp** [_options_] [_files_]

# PARAMETERS

_FILES_
> DOT graph files to process.

**-T** _FORMAT_
> Output format: png, svg, pdf, ps, etc.

**-o** _FILE_
> Output file.

**-G** _ATTR=VALUE_
> Set graph attribute.

**-N** _ATTR=VALUE_
> Set node attribute.

**-E** _ATTR=VALUE_
> Set edge attribute.

**-K** _LAYOUT_
> Override layout engine.

**--help**
> Display help information.

# DESCRIPTION

**fdp** is a Graphviz layout engine for drawing undirected graphs using a force-directed placement algorithm. It positions nodes by simulating physical forces between connected and unconnected nodes.

The spring model algorithm treats edges as springs and nodes as charged particles. It iteratively adjusts positions until reaching equilibrium, producing aesthetically pleasing layouts for many graph types.

fdp is suited for undirected graphs where node clustering and edge lengths should reflect graph structure.

# CAVEATS

May not converge for very large graphs. Random initial placement means non-deterministic results. Better for undirected graphs than directed.

# HISTORY

fdp is part of **Graphviz**, the graph visualization software from AT&T Labs. It implements force-directed placement algorithms developed for graph drawing research, providing an alternative to dot's hierarchical layout.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [sfdp](/man/sfdp)(1)
