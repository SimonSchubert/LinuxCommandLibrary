# TAGLINE

converts Graphviz DOT format to GML

# TLDR

**Convert DOT to GML**

```gv2gml [input.gv] -o [output.gml]```

**Output to stdout**

```gv2gml [input.dot]```

**Process multiple files**

```gv2gml [file1.gv] [file2.gv] -o [output.gml]```

# SYNOPSIS

**gv2gml** [_-y_] [_-?_] [**-o** _outfile_] [_files_]

# PARAMETERS

_FILES_
> Input DOT/GV files. Reads stdin if none given.

**-o** _outfile_
> Write output to outfile instead of stdout.

**-y**
> Use yWorks.com GML attribute conventions instead of the plain GML specification.

**-?**
> Display usage information and exit.

# DESCRIPTION

**gv2gml** converts a graph specified in the DOT language to GML (Graph Modelling Language), an interchange format used by graph analysis and visualization tools such as yEd and Gephi.

It is the reverse-direction counterpart of **gml2gv**, both built from the same source and dispatching on the program name.

# CAVEATS

Does not support subgraphs or clusters. GML has no way to declare default node/edge attributes, so gv2gml repeats each attribute explicitly on every node and edge.

# HISTORY

gv2gml is part of the **Graphviz** project, created at **AT&T Labs** for graph format conversion.

# SEE ALSO

[dot](/man/dot)(1), [gml2gv](/man/gml2gv)(1), [graphml2gv](/man/graphml2gv)(1), [gxl2gv](/man/gxl2gv)(1)

# RESOURCES

```[Homepage](https://graphviz.org/)```

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Documentation](https://graphviz.org/doc/info/command.html)```

<!-- verified: 2026-07-17 -->
