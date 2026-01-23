# TLDR

**Extract connected components** from a graph

```ccomps [input.dot] -o [output.dot]```

**Extract and number components**

```ccomps -x [input.dot]```

**Output each component** to separate file

```ccomps -X [prefix] [input.dot]```

**Output only the largest component**

```ccomps -z [input.dot]```

**Count connected components**

```ccomps -s [input.dot]```

**Extract component containing a specific node**

```ccomps -C [node_name] [input.dot]```

# SYNOPSIS

**ccomps** [_options_] [_files_]

# DESCRIPTION

**ccomps** is a Graphviz tool that decomposes graphs into their connected components. A connected component is a maximal subgraph in which any two vertices are connected by a path.

For undirected graphs, ccomps finds weakly connected components. For directed graphs, it can find either weakly connected (treating edges as undirected) or strongly connected components where every vertex is reachable from every other vertex.

The tool is useful for analyzing graph structure, extracting subgraphs, or preprocessing large graphs before layout.

# PARAMETERS

**-s**
> Silent mode, print only count of components.

**-x**
> Extract components, numbering subgraph names.

**-X** _prefix_
> Write each component to prefix_N.dot files.

**-z**
> Sort by size, output only largest component.

**-C** _node_
> Output only component containing named node.

**-n**
> Do not project subgraph structure.

**-o** _file_
> Write output to file.

**-v**
> Verbose mode.

**-?**
> Print usage information.

# CAVEATS

Input must be in DOT format. For directed graphs, default behavior finds weakly connected components. Memory usage scales with graph size. Node names must be unique for -C option to work correctly.

# HISTORY

**ccomps** is part of the **Graphviz** suite, originally developed at **AT&T Labs Research** starting in the **early 1990s**. Graphviz was created by **Stephen North**, **Eleftherios Koutsofios**, and others. The package was open-sourced in **2000**. Graphviz tools including ccomps continue to be maintained as part of the standard graph visualization toolkit.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [gc](/man/gc)(1), [gvpr](/man/gvpr)(1)
