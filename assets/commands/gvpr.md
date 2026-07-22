# TAGLINE

graph stream editor, similar to awk for graphs

# TLDR

**Run gvpr script**

```gvpr -f [script.gvpr] [input.gv]```

**Inline program**

```gvpr 'N[color=="red"]' [input.gv]```

**Output to file**

```gvpr -o [output.gv] -f [script.gvpr] [input.gv]```

**Select nodes by attribute**

```gvpr 'N[degree>3]' [graph.gv]```

# SYNOPSIS

**gvpr** [_-icnqV?_] [**-o** _outfile_] [**-a** _args_] _'prog'_ | **-f** _progfile_ [_files_]

# PARAMETERS

_'prog'_
> Inline gvpr program text (a series of predicate-action clauses). Required unless **-f** is given.

_FILES_
> Input graph files in DOT format. Reads stdin if none given.

**-f** _progfile_
> Read the gvpr program from progfile instead of the command line.

**-o** _outfile_
> Write output to outfile instead of stdout.

**-a** _args_
> Pass a whitespace-separated argument string to the program, available as ARGV/ARGC.

**-c**
> Use the source graph as the output graph, so in-place edits are emitted.

**-i**
> Derive the output as the node-induced subgraph extension in the context of its root graph.

**-n**
> Disable graph read-ahead (affects the **$NG** variable).

**-q**
> Suppress warning messages.

**-V**
> Print version information and exit.

**-?**
> Display usage information and exit.

# DESCRIPTION

**gvpr** (formerly **gpr**) is a graph pattern scanning and processing language, similar to **awk** but for graphs instead of text. Programs consist of pattern-action clauses (**BEGIN**, **BEG_G**, **N** for nodes, **E** for edges, **END_G**, **END**) that are matched against each input graph in turn.

For each node or edge visited, gvpr evaluates the predicates in order and runs the associated action for the first (or every) match. The language provides C-like types, associative arrays, and built-in graph functions, letting programs filter, transform, restructure, or compute statistics over DOT graphs.

# CAVEATS

Part of the Graphviz package. The pattern-action language has a learning curve, and complex programs over large graphs can be slow.

# HISTORY

gvpr was developed as part of **Graphviz** at **AT&T Labs** to provide AWK-like processing for graph structures, replacing the earlier **gpr** tool.

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

[dot](/man/dot)(1), [awk](/man/awk)(1), [gc](/man/gc)(1), [nop](/man/nop)(1)

# RESOURCES

```[Homepage](https://graphviz.org/)```

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Documentation](https://graphviz.org/doc/info/command.html)```

<!-- verified: 2026-07-17 -->
