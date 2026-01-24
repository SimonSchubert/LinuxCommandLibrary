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

**sccmap** finds strongly connected components. It analyzes directed graphs.

Part of Graphviz tools. Graph decomposition.

Extracts SCCs from graph. Groups related nodes.

Statistics output available. Component sizes and counts.

Useful for large graphs. Identify structure.

# CAVEATS

Directed graphs only. DOT format input. Part of Graphviz package.

# HISTORY

**sccmap** is part of **Graphviz**, the graph visualization software developed at AT&T Labs Research.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [tred](/man/tred)(1), [ccomps](/man/ccomps)(1)
