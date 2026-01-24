# TLDR

**Compute transitive reduction** of a graph

```tred [input.dot] > [output.dot]```

**Process from stdin**

```cat [graph.dot] | tred > [reduced.dot]```

**Show verbose output** with removed edges info

```tred -v [input.dot]```

**Reduce graph before rendering** with dot

```tred [graph.dot] | dot -Tpng -o [output.png]```

# SYNOPSIS

**tred** [**-v**] [**-?**] [_files_]

# PARAMETERS

**-v**
> Verbose output. Print information about removed edges to stderr.

**-?**
> Print usage information and exit.

# DESCRIPTION

**tred** computes the transitive reduction of directed graphs. It removes edges that are implied by transitivity, simplifying the graph while preserving reachability relationships.

In a transitive reduction, if there exists a path from node A to node C through node B (A→B→C), the direct edge A→C is removed as redundant. This is particularly useful for simplifying dependency graphs, inheritance hierarchies, and other directed graphs where implied relationships clutter visualization.

The tool reads graphs in DOT format from input files or standard input, and outputs the reduced graph to standard output. Nodes and subgraphs are preserved; only redundant edges are removed. Undirected graphs are silently ignored.

tred is commonly used as a preprocessor to **dot** to reduce visual clutter in dense graph layouts.

# CAVEATS

If a graph contains cycles, its transitive reduction is not uniquely defined. In such cases, tred emits a warning. The current implementation could be faster using bitmap data structures internally.

# HISTORY

**tred** is part of the **Graphviz** project, originally developed at **AT&T Labs Research** in the **1990s**. It was created by **Stephen C. North** and **Emden R. Gansner** as part of the graph visualization toolkit. Graphviz was open-sourced in **2000** and has since become the standard tool for graph layout and visualization.

# SEE ALSO

[dot](/man/dot)(1), [acyclic](/man/acyclic)(1), [gc](/man/gc)(1), [gvpr](/man/gvpr)(1), [ccomps](/man/ccomps)(1), [sccmap](/man/sccmap)(1)
