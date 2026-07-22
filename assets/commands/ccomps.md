# TAGLINE

decompose graphs into connected components

# TLDR

**Print components**, each as a separate graph

```ccomps -x [input.dot]```

**Write each component** to a numbered file derived from outfile

```ccomps -x -o [out.dot] [input.dot]```

**Print only the largest component**

```ccomps -z -x [input.dot]```

**Count the components**, print only counts to stderr

```ccomps -sv [input.dot]```

**Extract the component containing a specific node**

```ccomps -X [node_name] [input.dot]```

**Output components by size range** (at least 5 nodes)

```ccomps -x -X%5- [input.dot]```

# SYNOPSIS

**ccomps** [**-svnxCe?**] [**-z**] [**-X**[_#%_]_v_] [**-o** _outfile_] [_files_]

# DESCRIPTION

**ccomps** decomposes graphs into their connected components, printing the components to standard output. By default, every node ends up in some component; with **-C** the cluster subgraph structure is also used to determine connectivity.

For undirected graphs it computes connected components; for directed graphs it treats edges as undirected (weakly connected). The tool is useful for filtering disconnected subgraphs out of a graph, isolating the component containing a node of interest, or pre-processing graphs before layout with **dot**, **neato**, etc.

If no input file is given, the graph is read from standard input.

# PARAMETERS

**-s**
> Silent: print no output graph; useful with **-v** to just check connectivity.

**-x**
> Print each connected component as a separate graph (instead of embedding them as subgraphs).

**-X** _node_name_
> Print only the component containing the named node.

**-X#** _index_[**-**[_last_]]
> Print only the component(s) at the given index, or index range (last optional).

**-X%** _min_[**-**[_max_]]
> Print only the component(s) whose node count falls in the given size range.

**-z**
> Sort components by size, largest first. Only meaningful with **-x** or **-X#**.

**-C**
> Use cluster subgraphs in addition to normal edge connectivity when computing components.

**-e**
> Do not induce edges in the connected components.

**-n**
> Do not project subgraph structure: components contain only relevant nodes and edges.

**-v**
> Verbose: print counts of nodes, edges and components to stderr.

**-o** _outfile_
> Write output to _outfile_. With multiple components, files are numbered (_outfile_, _outfile_\_1, ...).

**-?**
> Print usage information.

# CAVEATS

Input must be in **DOT** format. For directed graphs only weakly connected components are computed. Memory usage scales with graph size. Node names must be unique for the **-X** _node_name_ form to work as expected. The **-X** flag is overloaded: a plain name, a **#**-prefixed index, or a **%**-prefixed size selector.

# HISTORY

**ccomps** is part of the **Graphviz** suite, originally developed at **AT&T Labs Research** starting in the **early 1990s** by **Stephen North**, **Eleftherios Koutsofios**, **Emden Gansner** and others. Graphviz was open-sourced in **2004** and continues to be actively maintained.

# INSTALL

```apt: sudo apt install graphviz```

```dnf: sudo dnf install graphviz```

```pacman: sudo pacman -S graphviz```

```apk: sudo apk add graphviz```

```zypper: sudo zypper install graphviz```

```brew: brew install graphviz```

```nix: nix profile install nixpkgs#graphviz```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [gc](/man/gc)(1), [gvpr](/man/gvpr)(1)
