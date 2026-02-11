# TAGLINE

Interactive Graphviz graph viewer

# TLDR

**Open a dot file** in the interactive viewer

```xdot [path/to/graph.dot]```

**Open with a specific filter**

```xdot -f [neato] [path/to/graph.dot]```

**Read a graph from stdin**

```[command] | xdot```

**Open with a custom window size**

```xdot -g [800x600] [path/to/graph.dot]```

**Use circo layout** for circular graphs

```xdot -f circo [path/to/graph.dot]```

**Generate and view** a graph inline

```echo "digraph { A -> B -> C }" | xdot```

# SYNOPSIS

**xdot** [_-f filter_] [_-n_] [_-g WxH_] [_file_]

# PARAMETERS

**-f** _filter_
> Use the specified Graphviz filter (dot, neato, twopi, circo, fdp, sfdp, osage, patchwork). Default is dot.

**-n**
> Assume the input is already laid out (no layout computation).

**-g** _WxH_
> Set the initial window geometry (width x height).

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**xdot** is an interactive viewer for graphs written in Graphviz's DOT language. It provides a GTK-based graphical interface for exploring graph visualizations with smooth zooming and panning capabilities.

Unlike static image exports, xdot renders graphs interactively, allowing users to zoom in on complex graphs, pan across large diagrams, and explore node relationships. The viewer supports mouse wheel zooming, click-and-drag panning, and keyboard navigation. Clicking on nodes or edges with URL attributes opens the associated links.

The tool supports all standard Graphviz layout engines through the **-f** option, making it suitable for various graph types: hierarchical (dot), undirected spring models (neato, fdp), radial (twopi), circular (circo), and clustered layouts (osage, patchwork).

Xdot can read from files or stdin, making it useful in pipelines where graphs are generated dynamically. It automatically reloads the file when changes are detected, useful during iterative graph development.

# CAVEATS

Requires a graphical display (X11 or Wayland with XWayland). Some complex DOT attributes may not render identically to static Graphviz output. Large graphs with thousands of nodes may have slower rendering performance. Not all Graphviz features are supported for interactive rendering.

# HISTORY

**xdot** was created by Jose Fonseca as a Python application using PyGTK (later PyGObject/GTK3). It was developed to address the need for interactive graph exploration that static image exports could not provide. The tool has been maintained as an open-source project and is packaged in most Linux distributions.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [twopi](/man/twopi)(1), [circo](/man/circo)(1), [fdp](/man/fdp)(1), [graphviz](/man/graphviz)(1)
