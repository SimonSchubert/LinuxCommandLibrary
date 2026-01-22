# TLDR

**View DOT graph** interactively

```dotty [graph.dot]```

**Open multiple graphs**

```dotty [graph1.dot] [graph2.dot]```

# SYNOPSIS

**dotty** [_options_] [_files_]

# PARAMETERS

_FILES_
> DOT files to visualize.

**-V**
> Print version.

# DESCRIPTION

**dotty** is an interactive graph viewer for the DOT language from the Graphviz package. It provides a graphical interface for viewing and navigating graph structures defined in DOT files.

The viewer allows interactive exploration of graphs including zooming, panning, and node selection. It's useful for examining complex graphs that are difficult to understand in static renderings.

dotty is built on the lefty graphics language and provides customization capabilities through its scripting interface.

# CAVEATS

Requires X11 display. Interface is dated compared to modern alternatives. Large graphs may be slow to render. Limited export capabilities compared to dot.

# HISTORY

dotty is part of **Graphviz**, developed at **AT&T Labs Research**. It provides interactive visualization capabilities complementing the command-line rendering tools in the Graphviz suite.

# SEE ALSO

[dot](/man/dot)(1), [xdot](/man/xdot)(1), [graphviz](/man/graphviz)(7)
