# TAGLINE

Find strongly connected components in Graphviz graphs

# TLDR

**Find strongly connected components**

```sccmap [graph.dot]```

**Output to file**

```sccmap -o [output.dot] [graph.dot]```

**Show statistics**

```sccmap -v [graph.dot]```

**Silent mode**

```sccmap -s [graph.dot]```

# SYNOPSIS

**sccmap** [_-o file_] [_-v_] [_-s_] [_options_] _files_

# PARAMETERS

**-o** _FILE_
> Output file.

**-v**
> Verbose statistics.

**-s**
> Silent mode.

**-S** _N_
> Minimum component size.

**-d**
> Output as subgraphs.

# DESCRIPTION

**sccmap** decomposes directed graphs into their strongly connected components (SCCs), where each SCC is a maximal set of nodes in which every node is reachable from every other node. It reads DOT format graphs and outputs each component as a separate subgraph.

With the **-v** flag, it reports statistics including the number and sizes of components, which is useful for understanding the structure of large directed graphs. Part of the Graphviz graph visualization package.

# CAVEATS

Directed graphs only. DOT format input. Part of Graphviz package.

# HISTORY

**sccmap** is part of **Graphviz**, the graph visualization software developed at AT&T Labs Research.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [tred](/man/tred)(1), [ccomps](/man/ccomps)(1)
