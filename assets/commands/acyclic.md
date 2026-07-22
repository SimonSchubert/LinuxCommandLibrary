# TAGLINE

make a directed graph acyclic

# TLDR

**Output** a copy of the graph with enough edges reversed to make it acyclic

```acyclic [graph.dot]```

**Write** the acyclic result to a file

```acyclic -o [output.dot] [graph.dot]```

**Test** only whether the graph is acyclic (no output, check exit status)

```acyclic -nv [graph.dot]```

# SYNOPSIS

**acyclic** [_-nv?_] [**-o** _outfile_] [_file_]

# DESCRIPTION

**acyclic** is a Graphviz filter that takes a directed graph as input and outputs a copy of the graph with sufficient edges reversed to make the graph acyclic. Each reversed edge inherits all of the attributes of the original edge. By default the program reads from stdin and writes to stdout; an optional file argument specifies where the input graph is stored.

This tool is useful for preprocessing graphs before layout algorithms that require acyclic input, or for verifying dependency graphs where cycles would indicate errors. The exit status reports whether the input was acyclic, contained a cycle, or was undirected.

# PARAMETERS

**-n**
> Produce no output; the return value indicates whether the graph is acyclic.

**-v**
> Print information about whether the file is acyclic, has a cycle, or is undirected.

**-o** _outfile_
> Write output to the specified file instead of stdout.

**-?**
> Print usage information.

# RETURN CODES

**acyclic** returns **0** if the graph is acyclic, **1** if the graph has a cycle, **2** if the graph is undirected, and **255** if there are any errors.

# CAVEATS

Only works with directed graphs in DOT format. acyclic makes a graph acyclic by reversing edges, never by removing them. If the graph is strict and contains a cycle of length 2, the attributes of the reversed edge are lost. Some edge attributes are non-symmetric (referring to either the head or tail node) and are not switched when an edge is reversed.

# HISTORY

**acyclic** is part of the Graphviz project, developed at AT&T Labs Research starting in **1991**. The tool was included to support preprocessing of graphs for hierarchical layout algorithms like **dot**, which require acyclic input graphs.

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

[dot](/man/dot)(1), [tred](/man/tred)(1), [gc](/man/gc)(1), [gvpr](/man/gvpr)(1), [gvcolor](/man/gvcolor)(1), [ccomps](/man/ccomps)(1), [sccmap](/man/sccmap)(1)

# RESOURCES

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Homepage](https://graphviz.org/)```

```[Documentation](https://graphviz.org/docs/cli/acyclic/)```

<!-- verified: 2026-06-10 -->
