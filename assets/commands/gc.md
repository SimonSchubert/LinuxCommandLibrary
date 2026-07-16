# TAGLINE

count graph components

# TLDR

**Count** nodes and edges in a graph (the default)

```gc [graph.dot]```

**Count** connected components

```gc -c [graph.dot]```

**Count** everything: nodes, edges, connected components and clusters

```gc -a [graph.dot]```

**Count** nodes only

```gc -n [graph.dot]```

**Recurse** into subgraphs and report counts for each

```gc -r [graph.dot]```

**Read** a graph from standard input

```cat [graph.dot] | gc -a```

# SYNOPSIS

**gc** [**-necCaDUrsv?**] [_files_]

# DESCRIPTION

**gc** is a graph analogue of **wc**: it reads one or more graphs in DOT format and prints counts of their nodes, edges, connected components and clusters to standard output. With no options it reports node and edge counts. When multiple graphs are given, a total line is printed at the end.

Each input file may contain several graphs. Output is one line per graph, followed by the graph name, so results can be fed into other text tools. If no files are named, **gc** reads from standard input.

Clusters are subgraphs whose name begins with **cluster**, the same convention **dot** uses when drawing boxed groups.

# PARAMETERS

**-n**
> Count nodes.

**-e**
> Count edges.

**-c**
> Count connected components.

**-C**
> Count clusters (subgraphs whose name starts with **cluster**).

**-a**
> Count all of the above; equivalent to **-encC**.

**-r**
> Recurse into subgraphs, reporting counts for each.

**-s**
> Silent: suppress output and only set the exit status.

**-D**
> Only process directed graphs.

**-U**
> Only process undirected graphs.

**-v**
> Verbose output.

**-?**
> Print usage information.

# CAVEATS

Input must be valid **DOT** format; malformed graphs cause errors rather than counts. For directed graphs, the components counted are weakly connected components. **-D** and **-U** skip graphs of the wrong kind, so a filtered run may print nothing at all.

This command is unrelated to garbage collection. In PowerShell, **gc** is an alias for **Get-Content**, and some version control wrappers alias it to a commit shortcut, so check what is on your **PATH** before assuming.

# HISTORY

**gc** is part of the **Graphviz** suite, developed at **AT&T Labs Research** starting in the early **1990s** by **Stephen North**, **Eleftherios Koutsofios**, **Emden Gansner** and others. Graphviz was open-sourced in **2004** and remains actively maintained.

# SEE ALSO

[wc](/man/wc)(1), [acyclic](/man/acyclic)(1), [ccomps](/man/ccomps)(1), [sccmap](/man/sccmap)(1), [tred](/man/tred)(1), [gvpr](/man/gvpr)(1), [dot](/man/dot)(1)

# RESOURCES

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Homepage](https://graphviz.org/)```

```[Documentation](https://graphviz.org/docs/cli/gc/)```

<!-- verified: 2026-07-16 -->
