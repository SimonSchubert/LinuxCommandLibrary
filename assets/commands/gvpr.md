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

**gvpr** [_options_] _program_ [_files_]

# PARAMETERS

_PROGRAM_
> Gvpr program or expression.

_FILES_
> Input DOT files.

**-f** _FILE_
> Read program from file.

**-o** _FILE_
> Output file.

**-c**
> Check syntax only.

**-i**
> Print node info.

**-V**
> Verbose mode.

**-?**
> Display help information.

# DESCRIPTION

**gvpr** is a graph stream editor, similar to awk for graphs. It processes Graphviz graphs using a pattern-action programming language.

The tool can filter, transform, and analyze graphs. It supports node and edge selection, attribute manipulation, and graph restructuring.

# CAVEATS

Part of Graphviz package. Learning curve for programming language. Complex operations can be slow.

# HISTORY

gvpr was developed as part of **Graphviz** at **AT&T Labs** to provide AWK-like processing for graph structures.

# SEE ALSO

[dot](/man/dot)(1), [awk](/man/awk)(1), [gc](/man/gc)(1)
