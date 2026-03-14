# TAGLINE

pretty-print graph file in canonical DOT format

# TLDR

**Pretty-print a graph file**

```nop [graph.gv]```

**Check DOT syntax** without producing output

```nop -p [graph.gv]```

**Pretty-print from stdin**

```cat [graph.gv] | nop```

# SYNOPSIS

**nop** [**-p?**] [_files_...]

# PARAMETERS

_FILES_
> One or more DOT graph files to process. Reads from stdin if none given.

**-p**
> Produce no output; only check the input for valid DOT syntax.

**-?**
> Print usage information.

# DESCRIPTION

**nop** reads a stream of graphs in DOT format and prints each in pretty-printed (canonical) format on stdout. If no files are given, it reads from stdin.

The tool is part of the Graphviz package and is useful for normalizing DOT files or validating graph syntax.

# CAVEATS

Part of the Graphviz package. Only processes DOT graph language files. Does not perform any layout computation.

# HISTORY

nop is part of **Graphviz**, the open-source graph visualization software originally developed at **AT&T Labs Research**.

# SEE ALSO

[acyclic](/man/acyclic)(1), [gvpr](/man/gvpr)(1), [gvcolor](/man/gvcolor)(1), [ccomps](/man/ccomps)(1), [sccmap](/man/sccmap)(1), [tred](/man/tred)(1)
