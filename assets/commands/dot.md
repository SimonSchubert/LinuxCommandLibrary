# TAGLINE

hierarchical directed graph renderer

# TLDR

**Render graph to** PNG image

```dot -Tpng [graph.dot] -o [output.png]```

**Render to SVG**

```dot -Tsvg [graph.dot] -o [output.svg]```

**Render to PDF**

```dot -Tpdf [graph.dot] -o [output.pdf]```

**Render from stdin**

```echo "digraph { A -> B }" | dot -Tpng -o [output.png]```

**Use specific layout** engine

```dot -Kneato [graph.dot] -Tpng -o [output.png]```

**Render with custom** DPI

```dot -Gdpi=[300] -Tpng [graph.dot] -o [output.png]```

# SYNOPSIS

**dot** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input DOT files to process.

**-T**_FORMAT_
> Output format: png, svg, pdf, ps, etc.

**-o** _FILE_
> Output file name.

**-K**_ENGINE_
> Layout engine: dot, neato, fdp, circo, twopi.

**-G**_NAME=VALUE_
> Set graph attribute.

**-N**_NAME=VALUE_
> Set default node attribute.

**-E**_NAME=VALUE_
> Set default edge attribute.

**-V**
> Print version.

# DESCRIPTION

**dot** is the primary program for rendering directed graphs from Graphviz. It reads graph descriptions in the DOT language and produces visual representations in various output formats.

The DOT layout engine arranges nodes hierarchically, making it ideal for directed graphs like flowcharts, dependency diagrams, and state machines. Alternative engines (neato, fdp, circo) provide different layout algorithms.

dot supports extensive customization through graph, node, and edge attributes controlling colors, shapes, fonts, and positioning.

# CAVEATS

Complex graphs may require manual positioning hints. Some output formats need additional libraries. Very large graphs may be slow to render or produce cluttered output.

# HISTORY

dot is part of **Graphviz**, originally developed at **AT&T Labs Research** starting in **1991**. Graphviz was released as open source in **2000** and remains the standard tool for graph visualization.

# SEE ALSO

[neato](/man/neato)(1), [circo](/man/circo)(1), [fdp](/man/fdp)(1), [graphviz](/man/graphviz)(7)
