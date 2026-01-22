# TLDR

**Check** if a graph is acyclic

```acyclic [graph.dot]```

**Remove** edges to make graph acyclic (print result)

```acyclic -n [graph.dot]```

Reverse edges to make graph **acyclic** (in place)

```acyclic -r [graph.dot]```

# SYNOPSIS

**acyclic** [_-nrv_] [_file_]

# DESCRIPTION

**acyclic** is a Graphviz utility that tests whether a directed graph is acyclic (contains no cycles). If cycles exist, it can either report them or modify the graph to break cycles by reversing or removing edges.

This tool is useful for preprocessing graphs before layout algorithms that require acyclic input, or for verifying dependency graphs where cycles would indicate errors.

# PARAMETERS

**-n**
> Remove edges to make the graph acyclic (print reversed edges)

**-r**
> Reverse edges to make the graph acyclic

**-v**
> Verbose mode; print cycle-breaking information

# CAVEATS

Only works with directed graphs in DOT format. Edge removal or reversal modifies the graph structure, which may not preserve intended relationships. For large graphs with many cycles, the output may significantly differ from the input.

# HISTORY

**acyclic** is part of the Graphviz project, developed at AT&T Labs Research starting in **1991**. The tool was included to support preprocessing of graphs for hierarchical layout algorithms like **dot**, which require acyclic input graphs.

# SEE ALSO

[dot](/man/dot)(1), [tred](/man/tred)(1), [gc](/man/gc)(1), [gvpr](/man/gvpr)(1)
