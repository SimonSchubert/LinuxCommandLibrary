# TAGLINE

Simple graph editor and viewer for Graphviz

# TLDR

**Open gvedit**

```gvedit```

**Open a graph file**

```gvedit [graph.gv]```

**Open multiple graph files**

```gvedit [file1.gv] [file2.gv]```

**Open with verbose output**

```gvedit -v [graph.gv]```

# SYNOPSIS

**gvedit** [**-v**] [**-s**] [**-?**] [_file_ ...]

# PARAMETERS

**-s**, **--scale-input-by-72**
> Scale node position coordinates from points to inches. Useful when layout algorithms (fdp, neato) receive input with coordinates in points.

**-v**, **--verbose**
> Enable verbose mode for additional output.

**-?**, **-h**, **--help**
> Display usage information and exit.

# DESCRIPTION

**gvedit** is a simple graph editor and viewer that is part of the Graphviz package. It provides a GUI for creating, viewing, editing, and processing DOT language graph files. Multiple graphs can be open simultaneously, each displayed in its own text window. Features include instant previewing, attribute editing via dialogs, and saving graph settings for future use.

# CAVEATS

Built with Qt, so it is only available when Graphviz is compiled with Qt support.

# HISTORY

Written by **Arif Bilgin** and **Emden R. Gansner** at AT&T Research, the original home of Graphviz.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [fdp](/man/fdp)(1), [dotty](/man/dotty)(1), [xdot](/man/xdot)(1)

# RESOURCES

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Homepage](https://graphviz.org/)```

```[Documentation](https://graphviz.org/documentation/)```

<!-- verified: 2026-11-09 -->
