# TLDR

**Bundle edges in graph**

```mingle -o [output.gv] [input.gv]```

**Set edge compatibility**

```mingle -c [0.8] [input.gv]```

**Set step size**

```mingle -k [4] [input.gv]```

**Output format**

```mingle -T [png] -o [output.png] [input.gv]```

# SYNOPSIS

**mingle** [_options_] _file_

# PARAMETERS

_FILE_
> Input graph file.

**-o** _FILE_
> Output file.

**-c** _VALUE_
> Edge compatibility threshold.

**-k** _STEPS_
> Number of iterations.

**-T** _FORMAT_
> Output format.

**--help**
> Display help information.

# DESCRIPTION

**mingle** bundles edges in graphs. It reduces clutter in dense graph visualizations.

The tool is part of Graphviz. It groups similar edges for cleaner display.

mingle bundles graph edges.

# CAVEATS

Part of Graphviz. For dense graphs. May hide individual edges.

# HISTORY

mingle is part of **Graphviz** for edge bundling in graph visualizations.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [sfdp](/man/sfdp)(1)

