# TLDR

**Convert matrix market to graph**

```mm2gv [matrix.mtx] -o [graph.gv]```

**Output DOT format**

```mm2gv -T dot [matrix.mtx]```

**Undirected graph**

```mm2gv -u [matrix.mtx]```

# SYNOPSIS

**mm2gv** [_options_] _file_

# PARAMETERS

_FILE_
> Matrix Market file.

**-o** _FILE_
> Output file.

**-T** _FORMAT_
> Output format.

**-u**
> Undirected graph.

**--help**
> Display help information.

# DESCRIPTION

**mm2gv** converts Matrix Market format to Graphviz. Matrix Market is a sparse matrix format.

The tool is part of Graphviz. It enables visualization of sparse matrices as graphs.

mm2gv converts matrices to graphs.

# CAVEATS

Part of Graphviz. Matrix Market format only. For sparse matrices.

# HISTORY

mm2gv is part of **Graphviz** for converting Matrix Market sparse matrices to graph format.

# SEE ALSO

[dot](/man/dot)(1), [gvpr](/man/gvpr)(1), [neato](/man/neato)(1)

